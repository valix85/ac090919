package it.nextre.academy.basi.gestionefile;

import it.nextre.academy.myutils.DummyData;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class Zippatore {

    public static void main(String[] args) {
        //C:\Users\Valerio\Desktop\dummyFile
        Path destination = Paths.get(
                System.getenv("SystemDrive"),
                "Users", "Valerio", "Desktop", "dummyFile");
        creaDummyFile(destination, 15, "___", "test", "txt");

        //creo lista di file che iniziano con "___"
        File[] files = destination.toFile().listFiles(f->f.getName().startsWith("___"));
        Arrays.asList(files).stream().forEach(System.out::println);

        zippa(Arrays.asList(files), destination, "archive");


    }//end main

    private static void creaDummyFile(Path folder, int qta, String prefix, String filename, String ext) {
        if (!folder.toFile().canWrite()) {
            System.out.println("Non ho i permessi per creare i file");
            return;
        }
        for (int i = 0; i < qta; i++) {
            String dummyText = "username: "+DummyData.getEmail()+"\n"+"password: "+DummyData.getPassword(8);
            String tmpFilename = prefix + filename + i + "." + ext;
            Path tmpPath = folder.resolve(Paths.get(tmpFilename));
            File tmpFile = new File(tmpPath.toUri());
            try (FileWriter fwTmp = new FileWriter(tmpFile)) {
                fwTmp.write(dummyText);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }




    private static File zippa(List<File> files, Path destination, String filename){
        if (files.size()<=0){return null;}

        Path outputPath = destination.resolve(Paths.get(filename+".zip"));
        File outputFile = outputPath.toFile();
        System.out.println(outputFile.getAbsolutePath());



        try(ZipOutputStream zipper = new ZipOutputStream(new FileOutputStream(outputFile.getAbsolutePath()))) {
            for(File file : files){
                ZipEntry entry = new ZipEntry(file.getName()); //nome dentro allo zip
                zipper.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file.getAbsolutePath());
                byte[] bytes = new byte[4096];
                int bytesRead;
                while ((bytesRead = fis.read(bytes)) != -1) {
                    zipper.write(bytes, 0, bytesRead);
                }
                fis.close(); //!importantissimo
                if(file.delete()){
                    System.out.println("Cancellato il file:\n\t"+file.getAbsolutePath());
                }else{
                    System.out.println("NON POSSO CANCELLARE il file:\n\t"+file.getAbsolutePath());
                };
            }
            return outputFile;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}//end class

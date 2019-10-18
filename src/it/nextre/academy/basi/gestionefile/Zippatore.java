package it.nextre.academy.basi.gestionefile;

import it.nextre.academy.myutils.DummyData;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

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

}//end class

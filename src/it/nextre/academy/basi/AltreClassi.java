package it.nextre.academy.basi;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class AltreClassi {

    public static void main(String[] args) {

        System.out.println();
        //System.exit(404);
        //System.gc();
        //System.currentTimeMillis();
        //System.runFinalization();
        //System.out.println(System.getenv());

        Properties props = System.getProperties();
        Set keys = props.keySet();
        for(Object k:keys){
            System.out.println(k+" = "+props.get(k));
            System.out.println("---------------");
        }

        System.out.println("#######################");
        System.out.println("#######################");
        System.out.println("#######################");
        System.out.println("#######################");
        System.out.println("#######################");


        Map<String,String> envs = System.getenv();
        Set<String> envKeys = envs.keySet();
        for(String envKey: envKeys){
            System.out.println(envKey + " = " +envs.get(envKey));
        }



        Runtime run = Runtime.getRuntime();

        System.out.println(run.freeMemory());
        System.out.println(run.totalMemory());
        System.out.println(run.totalMemory()+run.freeMemory());
        System.out.println(run.maxMemory());
        try {
            //run.exec("calc.exe");
            run.exec("java --version");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /* Get a list of all filesystem roots on this system */
        File[] roots = File.listRoots();

        /* For each filesystem root, print some info */
        for (File root : roots) {
            System.out.println("\nFile system root: " + root.getAbsolutePath());
            System.out.println("Total space (bytes): " + getSize(root.getTotalSpace()));
            System.out.println("Free space (bytes): " + getSize(root.getFreeSpace()));
            System.out.println("Usable space (bytes): " + getSize(root.getUsableSpace()));
            break;
        }



        //System.out.println("Usable space (bytes): " + getSize(1024L*1024*1024*1024));
        //System.out.println("Size : " + getSizeV2(2));

        /*
        try {
            System.out.println(WindowsSystemInformation.get());
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        System.out.println("###".repeat(10));
        System.out.println("###".repeat(10));
        System.out.println("###".repeat(10));
        System.out.println("###".repeat(10));

        getInfo();


        Umano u1 = Umano.getRandomUmano();

        Method[] metodi = u1.getClass().getMethods();
        for (Method m:metodi){
            System.out.println(m.getName());

        }



    }//end main



    public static void getInfo() {
        Runtime run = Runtime.getRuntime();
        Map<String,String> envs = System.getenv();
        Properties props = System.getProperties();
        System.out.println();
        System.out.println("La memoria massima per Java è: " + getSize(run.maxMemory()));
        System.out.println("Memoria di sistema\n\t\tin uso dalla JVM: " + getSize(run.totalMemory()) + "\n\t\tlibera nella JVM: " + getSize(run.freeMemory()));
        System.out.println("L'username dell'utente corrente è: " + props.getProperty("user.name"));
        System.out.println("La lingua del sistema è: " + props.getProperty("user.language") + "_" + props.getProperty("user.country"));
        System.out.println("L'utente corrente sta utilizzando: " + props.getProperty("os.name") + " Versione: " + props.getProperty("os.version"));
        System.out.println("L'utente sta lavorando sul computer: " + envs.get("USERDOMAIN_ROAMINGPROFILE"));
        System.out.println("L'utente sta usando Java in versione: " + props.getProperty("java.version"));
        System.out.println("JVM version: " + props.getProperty("java.vm.version") + " di " + props.getProperty("java.vm.specification.vendor"));
        System.out.println("JVM: " + props.getProperty("java.vm.name") );
        System.out.println("JRE: " + props.getProperty("java.runtime.version") );
        System.out.println("JAVA_HOME: " + envs.get("JAVA_HOME"));
    }



    public static String getSize(long size) {
        String s = "";

        double kb = size / 1024;
        double mb = kb / 1024;
        double gb = mb / 1024;
        double tb = gb / 1024;
        if(size < 1024) {
            s = size + " Bytes";
        } else if(size >= 1024L && size < (1024L * 1024)) {
            s =  String.format("%.2f", kb) + " KB";
        } else if(size >= (1024L * 1024) && size < (1024L * 1024 * 1024)) {
            s = String.format("%.2f", mb) + " MB";
        } else if(size >= (1024L * 1024 * 1024) && size < (1024L * 1024 * 1024 * 1024)) {
            s = String.format("%.2f", gb) + " GB";
        } else if(size >= (1024L * 1024 * 1024 * 1024)) {
            s = String.format("%.2f", tb) + " TB";
        }
        return s;
    }

    public static String getSizeV2(long diskSpaceUsed)
    {
        if (diskSpaceUsed <= 0)
            return "0";

        final String[] units = new String[] { "B", "KiB", "MiB", "GiB", "TiB" };
        int digitGroups = (int) (Math.log10(diskSpaceUsed) / Math.log10(1024));
        return new DecimalFormat("#,##0.#").format(diskSpaceUsed / Math.pow(1024, digitGroups)) + " " + units[digitGroups];
    }

}//end class


class WindowsSystemInformation
{
    public static String get() throws IOException
    {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("systeminfo");
        BufferedReader systemInformationReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

        StringBuilder stringBuilder = new StringBuilder();
        String line;

        while ((line = systemInformationReader.readLine()) != null)
        {
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}
package it.nextre.academy.files;

import it.nextre.academy.myutils.DummyData;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CsvMain {
    public static final int N_DATA_EXAMPLE = 100;
    public static void main(String[] args) {
        DataExample d1 = DataExample.getRandomDataExample();
        //System.out.println(d1);
        //d1.setCognome("De, Lucca");

        StringWriter sw = new StringWriter();
        try (CSVPrinter csvPrinter = new CSVPrinter(sw, CSVFormat.DEFAULT.withHeader("id", "nome", "cognome", "email"));
        ) {
            for (int i = 0; i < N_DATA_EXAMPLE; i++) {
                d1 = DataExample.getRandomDataExample();
                csvPrinter.printRecord(d1.getId(),d1.getNome(), d1.getCognome(), d1.getEmail());
                csvPrinter.flush();
            }//end for
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(sw.toString()); //DEBUG STAMPA IN CONSOLE
        //scrivo su file csv
        try (FileWriter fw = new FileWriter("data-example.csv");) {
            fw.write(sw.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //rileggo dal file csv e metto in una lista...
        List<DataExample> dataFromCSV = new ArrayList<>();
        try (CSVParser csvParser = new CSVParser(
                new FileReader("data-example.csv"),
                CSVFormat.DEFAULT.withFirstRecordAsHeader()); ){
            for (CSVRecord record : csvParser){
                //System.out.println(record);
                DataExample tmp = new DataExample(
                        Integer.parseInt(record.get("id")),
                        record.get("nome"),
                        record.get("cognome"),
                        record.get("email")
                );
                dataFromCSV.add(tmp);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

        dataFromCSV.stream()
                .filter(e->e.getEmail().endsWith("@hotmail.it"))
                .forEach(System.out::println);


    }//end main
}//end class

class DataExample {
    static AtomicInteger contatore = new AtomicInteger(0);
    int id;
    String nome;
    String cognome;
    String email;

    public DataExample(int id, String nome, String cognome, String email) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DataExample{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static DataExample getRandomDataExample(){
        return new DataExample(
                contatore.addAndGet(1),
                DummyData.getName(),
                DummyData.getSurname(),
                DummyData.getEmail()
        );
    }
}
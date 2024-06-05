
package Tema8.Ejemplos.FicherosCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bladiaju
 */
public class LecturaCSV {
    
    public static CSVParser parser = new CSVParserBuilder().withSeparator(';').withIgnoreQuotations(true).build();
    
    
    //Lectura linea a linea con Parser
    public static void lecturaLineaParser(Reader reader) throws IOException, CsvValidationException{
        try (CSVReader csvreader = new CSVReaderBuilder(reader).withCSVParser(parser).withSkipLines(1).build()){
            String [] linea; //Cada linea leida del fichero CSV
            while((linea = csvreader.readNext()) != null){
                System.out.println(linea[0] + " --> " + linea[1]);
            }
            
        }
    }
    
    
    //Lectura linea a linea sin Parser
    public static void lecturaLinea(Reader reader)throws IOException, CsvValidationException{
        try (CSVReader csvreader = new CSVReader(reader)){
            String [] linea; //Cada linea leida del fichero CSV
            while((linea = csvreader.readNext()) != null){
                System.out.println(linea[0] + " --> " + linea[1]);
            }
            
        }
    }
    //Lectura completa con Parser
    public static void lecturaCompleataParser(Reader reader)throws IOException, CsvException{
        try (CSVReader csvreader = new CSVReaderBuilder(reader).withCSVParser(parser).withSkipLines(1).build()){
            List <String []>  todo = csvreader.readAll(); //Cada linea leida del fichero CSV
            for(String [] linea : todo){
                System.out.println(linea[0] + " --> " + linea[1]);
            } 
        }
    }
    
    //Lectura completa sin Parser
    public static void lecturaCompleata (Reader reader)throws IOException, CsvException{
        try (CSVReader csvreader = new CSVReader(reader)){
            List <String []>  todo = csvreader.readAll(); //Cada linea leida del fichero CSV
            for(String [] linea : todo){
                System.out.println(linea[0] + " --> " + linea[1]);
            } 
        }
    }
    
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new FileReader(".\\src\\main\\java\\Tema8\\Ejemplos\\FicherosCSV\\Ficheros\\DatosCSV.csv"))){
            System.out.println("Lecturas CSV linea a linea con Parser");
            System.out.println("-------------------------------------");
            lecturaLineaParser(br);
            System.out.println("Lecturas CSV completa con Parser");
            System.out.println("-------------------------------------");
            lecturaCompleataParser(br);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 1");
        } catch (IOException ex){
            System.out.println("Error 2");
        } catch (CsvValidationException ex){
            System.out.println("Error 3");
        } catch (CsvException ex) {
            System.out.println("Error 4");
        }
    }
    
}


package Tema8.Ejemplos.FicherosCSV;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;
import com.opencsv.ICSVWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author bladiaju
 */
public class FicheroEscritura {
    
    public static void CSVCompleto(List <String []> texto)throws IOException{
        try (CSVWriter cw = new CSVWriter( new FileWriter(".\\src\\main\\java\\Tema8\\Ejemplos\\FicherosCSV\\Ficheros\\DatosCSV2.csv" , true))){
            cw.writeAll(texto);
        }
    }
    
    public static void CSVLineaALinea(List <String []> texto)throws IOException{
        try (ICSVWriter cw = new CSVWriterBuilder(
            new FileWriter("./Ficheros/DatosCSV2.csv" , true)).withQuoteChar(CSVWriter.NO_QUOTE_CHARACTER).withSeparator(';').withLineEnd(CSVWriter.DEFAULT_LINE_END).build()){
            String [] linea = {"id", "Alumno", "nota"};
            cw.writeNext(linea);
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(".\\src\\main\\java\\Tema8\\Ejemplos\\FicherosCSV\\Ficheros\\DatosCSV.csv"))){
            //CSVCompleto(br.lines());
        }
    }
    
}

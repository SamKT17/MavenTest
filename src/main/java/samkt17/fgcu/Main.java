package samkt17.fgcu;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) throws IOException, CsvException {

    Reader read = Files.newBufferedReader(Paths.get("src/Data/SEOExample.csv"));
    CSVReader csvr = new CSVReader(read);

    String[] fileInfo;
    while((fileInfo = csvr.readNext()) != null) {
      System.out.print(fileInfo[0] + " ");
      System.out.print(fileInfo[1] + " ");
      System.out.print(fileInfo[2] + " ");
      System.out.print(fileInfo[3] + " ");
      System.out.print(fileInfo[4] + " ");
      System.out.print(fileInfo[5] + " ");
      System.out.print(fileInfo[6] + " ");
      System.out.print(fileInfo[7] + " ");
      System.out.print(fileInfo[8] + " ");
      System.out.print(fileInfo[9] + "\n");
      System.out.println("====================================");
    }
  }
}
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVHandler {
    public void saveDataToCSV(AppData appData, String filePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath), ';')) {
            writer.writeNext(appData.getHeader());
            for (int[] row : appData.getData()) {
                String[] rowAsString = new String[row.length];
                for (int i = 0; i < row.length; i++) {
                    rowAsString[i] = String.valueOf(row[i]);
                }
                writer.writeNext(rowAsString);
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
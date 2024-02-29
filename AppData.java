import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class AppData {
    public class AppData {
        private String[] header;
        private int[][] data;

    }
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
}

public class CSVHandler {
    public AppData loadDataFromCSV(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath), ';')) {
            List<String[]> rows = reader.readAll();
            String[] header = rows.get(0);
            int[][] data = new int[rows.size() - 1][header.length];

            for (int i = 1; i < rows.size(); i++) {
                String[] row = rows.get(i);
                for (int j = 0; j < row.length; j++) {
                    data[i - 1][j] = Integer.parseInt(row[j]);
                }
            }

            return new AppData(header, data);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

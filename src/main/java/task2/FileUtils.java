package task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileUtils {

    public static ArrayList<String> readFile(String filePath) throws FileNotFoundException {
    	ArrayList<String> expressions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                expressions.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return expressions;
    }
    }
  
    


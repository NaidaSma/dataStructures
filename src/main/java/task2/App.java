package task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void Main(String[] args) throws FileNotFoundException {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the app!");
        System.out.println("How would you like to enter expressions? (1 for manual input, 2 for file input)");
        int inputMethod = scanner.nextInt();
        ArrayList<Double> results = new ArrayList<>();
        if (inputMethod == 1) {
            scanner.nextLine(); 
            System.out.println("Please enter an expression to evaluate:");
            String expression = scanner.nextLine();
            double result = Algorithm.calculate(expression);
            results.add(result);
        } else if (inputMethod == 2) {
            System.out.println("Please enter the path to the file containing the expressions:");
            String filePath = scanner.nextLine();
            results = Algorithm.calculateFromFile(filePath);
        } else {
            System.out.println("Invalid input method selected.");
            return;
        }
        System.out.println("Result:");
        for (double result : results) {
            System.out.println(result);
        }
    }
            
 }



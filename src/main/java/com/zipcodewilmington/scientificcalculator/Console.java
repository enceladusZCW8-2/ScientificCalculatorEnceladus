package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }
    //static MainApplication blah = new MainApplication();
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt); //+ String.format("%10.1f", blah.display));
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = Integer.parseInt(scanner.nextLine());
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double userInput = Double.parseDouble(scanner.nextLine());
        return userInput;
    }
}

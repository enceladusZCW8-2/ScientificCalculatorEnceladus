package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);


    }
    public double getSine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    public double getCosine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.cos(radians);
    }

    public double getTangent(double degrees) {
        double radians = Math.toRadians(degrees);
        DecimalFormat df = new DecimalFormat("##.########");
        return Double.parseDouble(df.format(Math.tan(radians)));
    }

    public double getAsine(double degrees) {
        double radians = Math.toRadians(degrees);
        DecimalFormat df = new DecimalFormat("##.########");
        return Double.parseDouble(df.format(Math.asin(radians)));
    }
}

package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to my calculator!");
        boolean exit = false;
        double display = 0;
        DecimalFormat df = new DecimalFormat("##.#######");
        double output = 0;
        double num1D = 0;
        String num1S = "";
        double num2D = 0;
        String num2S = "";
        while (!exit) {
            System.out.println("Display: " + df.format(display));
            System.out.print("Number: ");
            num1S = in.nextLine();

            //num1D = Double.parseDouble(num1S);

            System.out.print("Operand: ");
            String o = in.nextLine();
            if (!o.equals("cos") && !o.equals("sin") && !o.equals("square")) {
                System.out.print("Number: ");
                num2S = in.nextLine();
                num2D = Double.parseDouble(num2S);
            }
            output = interperetOperand(num1D, num2D, o);

            display = output;
            if (num1S.equals("exit")) {
                break;
            }
        }
    }

    private static Double interperetOperand(double num1, double num2, String o) {
        double result = 0;
        if (o.equals("+")) {
            result = sumTotal(num1, num2);
        }
        if (o.equals("square")) {
            result = square(num1);
        }

        return result;
    }
    private static double sumTotal(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
    private static double square(double num1) {
        double square = num1 * num1;
        return square;

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a integer", i);
        //Console.println("The user input %s as a d", d);


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

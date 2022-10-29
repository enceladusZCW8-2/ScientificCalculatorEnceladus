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

    }
    public double sumTotal(int num1,int num2)
    {
        return(num1 + num2);
    }
    public double multiTotal(int num1, int num2) {
        return (num1 * num2);
    }
    public double subTotal(int num1, int num2) {
        return (num1 - num2);
    }
    public double diviTotal(int num1, int num2) {
        return (num1 / num2);
    }
    public double squareTotal(int num1) {
        return(Math.sqrt(num1));
    }
    public double expoTotal(int num1, int num2) {
        return(Math.pow(num1, num2));
    }

    public double inverse(double num1) {
        String nums = (String) String.format ("3%.2f", (1 /num1));
        Double newNum = Double.parseDouble(nums);
        return (1/ num1);
    }


}

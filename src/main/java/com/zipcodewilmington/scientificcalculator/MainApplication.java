package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    DecimalFormat df = new DecimalFormat("##.########");
    public void main(String[] args) {
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

    private Double interperetOperand(double num1, double num2, String o) {
        double result = 0;
        if (o.equals("+")) {
            result = sumTotal(num1, num2);
        }
        if (o.equals("square")) {
            result = squareTotal(num1);
        }

        return result;
    }

    public double sumTotal(double num1,double num2)
    {
        return Double.parseDouble(df.format(num1 + num2));
    }
    public double multiTotal(double num1, double num2) {
        return (num1 * num2);
    }
    public double subTotal(double num1, double num2) {
        return (num1 - num2);
    }
    public double diviTotal(double num1,double num2) {
        return (num1 / num2);
    }
    public double squareTotal(double num1) {
        return(Math.pow(num1, 2));
    }

    public double sqrtTotal(double num1) {
        return(Math.sqrt(num1));
    }
    public double expoTotal(double num1, double num2) {
        return(Math.pow(num1, num2));
    }

    public double inverse(double num1) {
        String nums = (String) String.format ("3%.2f", (1 /num1));
        Double newNum = Double.parseDouble(nums);
        return (1/ num1);
    }
    public static double getSine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }

    public double getCosine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Math.cos(radians);
    }

    public double getTangent(double degrees) {
        double radians = Math.toRadians(degrees);
        return Double.parseDouble(df.format(Math.tan(radians)));
    }

    public double getAsine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Double.parseDouble(df.format(Math.asin(radians)));
    }

    public double getAcosine(double degrees) {
        double radians = Math.toRadians(degrees);
        return Double.parseDouble(df.format(Math.acos(radians)));
    }

    public double getAtangent(double degrees) {
        double radians = Math.toRadians(degrees);
        return Double.parseDouble(df.format(Math.atan(radians)));
    }

    public double getLog(double x) {
        return Double.parseDouble(df.format(Math.log10(x)));
    }

    public double getInverseLog(double x) {
        return Double.parseDouble((df.format(Math.pow(10, x))));
    }

    public double getNaturalLog(double x) {
        return Double.parseDouble(df.format(Math.log(x)));
    }

    public double getInverseNaturalLog(double x ) {
        return Double.parseDouble(df.format(Math.exp(x)));
    }

    public double getBillTotalWithTip(double bill, double tipPercent) {
        double tip = bill * tipPercent;
        double total = bill + tip;
        return total;
    }
}

package com.zipcodewilmington.scientificcalculator;

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

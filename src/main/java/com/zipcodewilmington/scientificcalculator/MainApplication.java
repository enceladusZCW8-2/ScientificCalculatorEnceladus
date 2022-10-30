package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    //establish global variables
    static DecimalFormat df = new DecimalFormat("##.#######");
    static Scanner in = new Scanner(System.in);
    static boolean exit = false;
    static double display = 0;
    static double memory = 0;
    static double num1 = 0;
    static double num2 = 0;
    static String mainMenu = "0";
    static String basicMenu = "0";
    static String trigMenu = "0";
    static boolean degrees = true;
    
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator!");
        //open while loop, calculator runs until user prompts it to
        while (!exit) {
            display = Double.parseDouble(df.format(display));
            //first menu
            if (mainMenu.equals("0")) {
                //main menu 0 - display menu and prompt for choice
                mainMenu = Console.getStringInput("Main Menu\n1. Basic Functions\n2. Trig  Functions\n9. Exit\n+ Change Polarity\nCLR Clear Display\nM+ Store Display\nMC Clear Memory\nMRC Recall Memory\nDisplay " + display);
            }
            //Basic Menu
            if (mainMenu.equals("1")) {
                //basic math functions
                basicMenu = Console.getStringInput("Basic Functions\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Square\n6. Square Root\n7. Exponent\n8. Inverse\n9. Back\n+ Change Polarity\nCLR Clear Display\nM+ Store Display\nMC Clear Memory\nMRC Recall Memory\nDisplay " + display);
                //add
                if (basicMenu.equals("1")) {
                    double[] nums = new double[2];
                    nums = getTwoInput();
                    num1 = nums[0];
                    num2 = nums[1];
                    display = sumTotal(num1, num2);
                }
                //subtract
                else if (basicMenu.equals("2")) {
                    if (display > 0) {
                        System.out.println("Number 1: " + display);
                        num1 = display;
                    } else {
                        num1 = Console.getDoubleInput("First number: ");
                    }
                    num2 = Console.getDoubleInput("Second number: ");
                    display = subTotal(num1, num2);
                }
                //multiply
                else if (basicMenu.equals("3")) {
                    double[] nums = new double[2];
                    nums = getTwoInput();
                    num1 = nums[0];
                    num2 = nums[1];
                    display = multiTotal(num1, num2);
                }
                //divide
                else if (basicMenu.equals("4")) {
                    double[] nums = new double[2];
                    nums = getTwoInput();
                    num1 = nums[0];
                    num2 = nums[1];
                    if (num2 == 0) {
                        System.out.println("Err");
                        num2 = getOneInput();
                    }
                    display = diviTotal(num1, num2);
                }
                //sqaure
                else if (basicMenu.equals("5")) {
                    num1 = getOneInput();
                    display = squareTotal(num1);
                }
                //sqrt
                else if (basicMenu.equals("6")) {
                    num1 = getOneInput();
                    display = sqrtTotal(num1);
                }
                //exponent
                else if (basicMenu.equals("7")) {
                    double[] nums = new double[2];
                    nums = getTwoInput();
                    num1 = nums[0];
                    num2 = nums[1];
                    display = expoTotal(num1, num2);
                }
                //inverse
                else if (basicMenu.equals("8")) {
                    num1 = getOneInput();
                    display = inverse(num1);
                }
                //return to main menu
                else if (basicMenu.equals("9")) {
                    mainMenu = "0";
                }
                else if (basicMenu.equalsIgnoreCase("CLR")) {
                    display = 0;
                }
                //change polartiy
                else if (basicMenu.equals("+")) {
                    if (display!=0) {
                        display = -display;
                    }
                }
                //Add to memory
                else if (basicMenu.equalsIgnoreCase("M+")) {
                    memory = display;
                }
                //clear memory
                else if (basicMenu.equalsIgnoreCase("MC")) {
                    memory = 0;
                }
                //recall memory
                else if (basicMenu.equalsIgnoreCase("MRC")) {
                    display = memory;
                }
                //catch input not recognized
                else {
                    System.out.println("That is not a valid input.");
                    mainMenu = "1";
                }
            }

            //trig functions
            else if (mainMenu.equals("2")) {
                //basic math functions
                trigMenu = Console.getStringInput("Trig Functions\n1. Sine\n2. Cosine\n3. Tangent\n4. Inverse Sine\n5. Inverse Cosine\n6. Inverse Tangent\n9. Back\n+ Change Polarity\nCLR Clear Display\nM+ Store Display\nMC Clear Memory\nMRC Recall Memory\nDisplay " + display);
                //add
                if (trigMenu.equals("1")) {
                    double num1 = 0;
                    num1 = getOneInput();
                    display = getSine(num1);
                }
                else if (trigMenu.equals("2")) {
                    double num1 = 0;
                    num1 = getOneInput();
                    display = getCosine(num1);
                }
                else if (trigMenu.equals("3")) {
                    double num1 = 0;
                    num1 = getOneInput();
                    display = getTangent(num1);
                }
                else if (trigMenu.equals("4")) {
                    double num1 = 0;
                    num1 = getOneInput();
                    display = getAsine(num1);
                }
                else if (trigMenu.equals("5")) {
                    double num1 = 0;
                    num1 = getOneInput();
                    /*ADD COS-1*/
                    display = (num1);
                }
                else if (trigMenu.equals("6")) {
                    double num1 = 0;
                    num1 = getOneInput();
                    /*ADD COTAN*/
                    display = (num1);
                }
                //return to main menu
                else if (trigMenu.equals("9")) {
                    mainMenu = "0";
                }
                //change polartiy
                else if (trigMenu.equals("+")) {
                    if (display!=0) {
                        display = -display;
                    }
                }
                //clear display
                else if (trigMenu.equalsIgnoreCase("CLR")) {
                    display = 0;
                }
                //Add to memory
                else if (trigMenu.equalsIgnoreCase("M+")) {
                    memory = display;
                }
                //clear memory
                else if (trigMenu.equalsIgnoreCase("MC")) {
                    memory = 0;
                }
                //recall memory
                else if (trigMenu.equalsIgnoreCase("MRC")) {
                    display = memory;
                }
                //catch input not recognized
                else {
                    System.out.println("That is not a valid input.");
                    trigMenu = "1";
                }
            }

            //exit calculator, closes while loop
            else if (mainMenu.equals("9")) {
                exit=true;
            }
            //change polartiy
            else if (mainMenu.equals("+")) {
                if (display!=0) {
                    display = -display;
                }
            }
            else if (mainMenu.equalsIgnoreCase("CLR")) {
                display = 0;
            }
            else if (mainMenu.equalsIgnoreCase("M+")) {
                memory = display;
            }
            //clear memory
            else if (mainMenu.equalsIgnoreCase("MC")) {
                memory = 0;
            }
            //recall memory
            else if (mainMenu.equalsIgnoreCase("MRC")) {
                display = memory;
            }
            else {
                System.out.println("That is not a valid input");
                mainMenu = "0";
            }
        }
        System.out.println("Goodbye.");
    }

    //method to get two inputs
    public static double[] getTwoInput () {
        double[] inputs = new double[2];
        //uses display as num1 if not zero
        if (display != 0) {
            System.out.println("Number 1: " + display);
            inputs[0] = display;
        } else {
            inputs[0] = Console.getDoubleInput("First number: ");
        }

        inputs[1] = Console.getDoubleInput("Second number: ");
        return inputs;
    }
    //get single input
    public static double getOneInput () {
        double inputs = 0;
        if (display != 0) {
            System.out.println("Number 1: " + display);
            inputs = display;
        } else {
            inputs = Console.getDoubleInput("Number: ");
        }
        return inputs;
    }
    public static double sumTotal(double num1,double num2) {
        return Double.parseDouble(df.format(num1 + num2));
    }
    public static double multiTotal(double num1, double num2) {
        return (num1 * num2);
    }
    public static double subTotal(double num1, double num2) {
        return (num1 - num2);
    }
    public static double diviTotal(double num1,double num2) {
        return (num1 / num2);
    }
    public static double squareTotal(double num1) {
        return(Math.pow(num1, 2));
    }
    public static double sqrtTotal(double num1) {
        return(Math.sqrt(num1));
    }
    public static double expoTotal(double num1, double num2) {
        return(Math.pow(num1, num2));
    }
    public static double inverse(double num1) {
        String nums = (String) String.format ("3%.2f", (1 /num1));
        Double newNum = Double.parseDouble(nums);
        num1 = Console.getDoubleInput("Number: ");
        return (1/ num1);
    }
    public double factorial(double num1) {
        if (num1 == 0)
        return 1;
    else
        return (num1 + factorial(num1 - 1));
    }
    public double remainderTotal(double num1, double num2) {
        double remainder = num1%num2;
        return remainder;
    }

    public static double getSine(double degrees) {
        double radians = Math.toRadians(degrees);
        DecimalFormat df = new DecimalFormat("##.#######");
        return Math.sin(radians);
    }

    public static double getCosine(double degrees) {
        double radians = Math.toRadians(degrees);
        DecimalFormat df = new DecimalFormat("##.########");
        return Math.cos(radians);
    }

    public static double getTangent(double degrees) {
        double radians = Math.toRadians(degrees);
        return Double.parseDouble(df.format(Math.tan(radians)));
    }

    public static double getAsine(double degrees) {
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

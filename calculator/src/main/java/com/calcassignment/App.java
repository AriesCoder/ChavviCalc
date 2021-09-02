package com.calcassignment;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        float numberA = 0;
        float numberB = 0;
        
        addValue(numberA, numberB);
        
        while (true){
            Scanner input = new Scanner(System.in);
            String command = input.nextLine();

            //quit the program
            if (command.equals("q")) {
                System.out.println("Thank for using Chavvi Calc");
                break;
            }
            switch (command){
                case "a":
                    System.out.printf("Enter a number: ");
                    String number = input.nextLine();

                    //check if the number is validation
                    if (numberValidation(number)) {
                        numberA = Float.parseFloat(number);
                        addValue(numberA, numberB);
                    } else {
                        System.out.println("Error: Unknow command");
                        addValue(numberA, numberB);
                    }

                    break;
                case "b":
                    System.out.printf("Enter a number: ");
                    number = input.nextLine();
                    
                    //check if the number is validation
                    if (numberValidation(number)){
                        numberB = Float.parseFloat(number);
                        addValue(numberA, numberB);
                    }else{
                        System.out.println("Error: Unknow command");
                        addValue(numberA, numberB);
                    }

                    break;
                
                }
            }
        

    }

    private static boolean numberValidation(String number) {
        try {
            Float.parseFloat(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
        
            
    

    private static void addValue(float a, float b){
       
        String value = String.format("A = %.3f            B = %.3f", a, b);

        System.out.println("----------------------------------------");
        System.out.println("Chavvi Calc");
        System.out.println("----------------------------------------");
        System.out.println(value);
        System.out.println("----------------------------------------");
        System.out.println("a      Enter a value for A");
        System.out.println("b      Enter a value for B");
        System.out.println("+      Add");
        System.out.println("-      Subtract");
        System.out.println("*      Multiply");
        System.out.println("/      Divide");
        System.out.println("c      Clear");
        System.out.println("q      Quit");
        System.out.println("----------------------------------------");
        System.out.printf("Enter a command: ");
        }
    }

    


package com.calcassignment;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        //String[] arr = {"a", "b", "+", "-", "*", "/", "c", "q"};
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
            }else{
                addValue(numberA, numberB);
            }
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

    


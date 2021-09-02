package com.calcassignment;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        String[] arr = {"a", "b", "+", "-", "*", "/", "c", "q"};
        
        addValue(0, 0);
        String command = input.nextLine();

    }
    

    private static void addValue(float a, float b){
        String str = String.format("A = %.3f            B = %.3f", a, b);

        System.out.println("----------------------------------------");
        System.out.println("Chavvi Calc");
        System.out.println("----------------------------------------");
        System.out.println(str);
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

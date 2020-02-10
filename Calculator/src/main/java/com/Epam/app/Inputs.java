package com.Epam.app;

import java.util.Scanner;

public class Inputs {
	Scanner sc = new Scanner(System.in);
	public double[] getnumbers() 
    {
        System.out.println("--CALCULATOR--");
        System.out.println("ADDITION SUBTRACTION DIVISION MULTIPLICATION");
        System.out.println("Enter two numbers:");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double arr[] = {number1, number2};
        return arr;

    }

    public String getoperand() 
    {
        System.out.println("Enter operand(+, *, /, -)");
        String op = sc.next();
        return op;
    }
}

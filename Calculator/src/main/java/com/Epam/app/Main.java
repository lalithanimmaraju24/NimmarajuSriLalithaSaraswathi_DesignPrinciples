package com.Epam.app;
import java.util.Scanner;
public class Main 
{  static  boolean a = true;
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
       while(a)
        {   Inputs i = new Inputs();
             double array[] = i.getnumbers();
             String op = i.getoperand();
        	 double c = Operation.getResult(array[0],array[1],op);
        	 System.out.println(array[0]+" "+op+" "+array[1]+" = "+ c);
        	 System.out.println("Do You want to Continue(Y|N)");
        	 String d = sc.next();
        	 if(d.equals("N"))
        	 {
        		 a = false;
        		 System.out.println("Program Exited");
        	 }
       }
        }
}

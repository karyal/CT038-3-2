/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BasicIO {
    public static void main(String []args){
        //Basic IO
        
        //import java.util.Scanner
        //Input
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any String : ");
        String str1 = sc.nextLine(); //Read value
      
        //Output
        System.out.println("Str1 : "+str1);
        */
        
        /*
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("ID  : "+id);
        */
        
        //declare
        int num1, num2, num3;
        //input
        System.out.print("Enter first no : ");
        num1 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter second no : ");
        num2 = Integer.parseInt(new Scanner(System.in).nextLine());
        //process
        num3 = num1 + num2;
        //output
        System.out.print("SUM : "+num3);
        
        
        
        
        
        
        
        
        
    }
}

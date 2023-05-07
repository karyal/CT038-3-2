/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Dell
 */
public class IfStatements {
    public static void main(String []args){
        /*
        //1. if else statement
        int num1=5;
        if(num1==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Not Zero");
        }
        */
        
        //2. else if statement
        /*
        int num1 = 0;
        if(num1==0){
            System.out.println("Zero");
        }
        else if(num1==1){
            System.out.println("One");
        }
        else{
            System.out.println("Others");
        }
        */
        //nested if
        
        int num1, num2, num3;
        num1=4;
        num2=3;
        num3=2;
        if(num1>num2)
            if(num1>num3)
                System.out.println(num1);
        
        if((num1>num2) && (num1>num3)){
            System.out.println(num1);
        }
        
        switch(num1){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Others");
        }
    }
}

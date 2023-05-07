package week2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class Operators {
    public static void main(String []args){
        //Assignment
        int x = 20; //simple assignment
        System.out.println(x);
        int y = x = 100;//multiple assignment
        System.out.println(x+", "+y);
        y+=5;//short-hand assignment
        System.out.println(y);
        
        //Arithmetic oprators
        int a,b,c; //multiple variable declare
        a=8;
        b=3;
        c=a+b; 
        System.out.println(c);
        c=a-b;
        System.out.println(c);
        c=a*b;
        System.out.println(c);
        c=a/b;
        System.out.println(c);
        c=a%b;
        System.out.println(c);
        c = (int) Math.pow(2,5); //type cast
        System.out.println(c);
        c = (int) Math.sqrt(49); //type cast
        System.out.println(c);
        
        //Relational Operators
        a=35;
        b=35;
        boolean result=(a>b);
        System.out.println(result);
        result=(a>=b);
        System.out.println(result);
        result=(a<b);
        System.out.println(result);
        result=(a<=b);
        System.out.println(result);
        result=(a!=b);
        System.out.println(result);
        
        //Logical Operators
        // (10==10) -> Condition -> boolean
        // (10!=10) -> Condition -> boolean
        // result from two or more than two conditions
        
        // Logical operators
        boolean result2 = (20==20) && (20==40);
        System.out.println(result2);
        result2 = (20==20) || (20==40);
        System.out.println(result2);
        result2 = !(20==20);
        System.out.println(result2);
        
        //Conditional operator
        a=50;
        b=20;
        c= (a>b)?a:b; //if else statement
        System.out.println(c);
        
        //Others
        // [], {}, (), ., ;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Dell
 */
public class TypeConversionCast {
    public static void main(String []args){
        //Type Conversion
        String tmpStr = "123";
        int num1 = Integer.parseInt(tmpStr);
        num1 = 5678;
        tmpStr = Integer.toString(num1); 
        System.out.println(tmpStr);
        
        //Type Casting
        //Numeric to Numeric
        int num2 = 3456;
        double num3 = num2; //int to double
        System.out.println(num3);
        
        num2 = (int) num3; //double to int
        
        //Basic type to Object
        int num4 = 567;
        Object obj1 =  num4;
        int num5 = (int) obj1; //Casting
        System.out.println(num5);
        
        
        
        
        
        
        
        
        
        
    }
}






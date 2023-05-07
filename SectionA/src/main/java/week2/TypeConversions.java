/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Dell
 */
public class TypeConversions {
    public static void main(String []args){
        //Type Conversion
        //String to Numeric
        String str1 = "12345.6789";
        double dn = Double.parseDouble(str1); //Type Conversion
        //byte bn = Byte.parseByte(str1); //
        byte bn = (byte) dn; //Type Casting
        System.out.println(bn);
        
        //Numeric to String
        
        //Type Casting
        //Widenning
        //Narrowing
        
    }
}
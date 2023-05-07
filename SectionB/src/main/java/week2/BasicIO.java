/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;
//Scanner
import java.util.Scanner;

/**
 *
 * @author Dell
 */

public class BasicIO {
    public static void main(String []args){
        //i -> input from keyboard
        String tmp=null;
        System.out.print("Enter any string : ");
        tmp = new Scanner(System.in).nextLine();
        
        //o -> output on standard output device
        System.out.println("String : "+tmp);
    }
}
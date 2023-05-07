/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author Dell
 */
public class ReturnTest {
    public static void main(String []args){
       int num1=9;
       int num2=3;
       int num3 = new MyLibrary().sum(num1, num2);
       System.out.println(num3);
       
       num3 = new MyLibrary().sum(39, 2);
       System.out.println(num3);
       
       num3 = MyLibrary.sum(3, 4, 5);
       System.out.println(num3);
       
    }
}

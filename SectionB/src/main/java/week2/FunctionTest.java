/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Dell
 */
public class FunctionTest {
    public static void main(String []args){
        MyFunctions mf = new MyFunctions();
        int result = mf.sum(2, 3);
        System.out.println(result);
        
        int result2 = MyFunctions.avg(5, 4);
        System.out.println(result2);
        
    }
}

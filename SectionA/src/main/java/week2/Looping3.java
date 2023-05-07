/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Dell
 */
public class Looping3 {
    public static void main(String []args){
        //1
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        
        //2
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
        
        //3
        for(int i=1; i<=10; i++){
            for(int j=1; j<=5; j++){
                System.out.println(j);
            }
        }
        //4
        for(int i=1; i<=10; i++){
            if(i==5)
                break;
            System.out.println(i);
        }
        //5.
        for(int i=1; i<=10; i++){
            if(i==5)
                continue;
            System.out.println(i);
        }
    }
}
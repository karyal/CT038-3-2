package week2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class IfStatements {
    public static void main(String []args){
        
        //1. if statement
        int x=5;
        if(x==0){
            System.out.println("Zero");
        }
        
        //2. if else statement
        x = 2;
        if(x==0){
            System.out.println("zero");
        }
        else{
            System.out.println("not zero");
        }
        //3. else...if statement
        x = 0;
        if(x==0){
            System.out.println("Zero");
        }
        else if(x==1){
            System.out.println("One");
        }
        else{
            System.out.println("Others");
        }
        //4. Nested if
        if(10>5)
            if(10>6)
                System.out.println(10);
        
        //5. if with multiple conditions
        if((10>5) && (10>6)){
            System.out.println(10);
        }
        
        
        
    }
}

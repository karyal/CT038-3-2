/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;
import models.Class1;
import models.Student;

/**
 *
 * @author Dell
 */
public class Test1 {
  public static void main(String []args){
      int num1;//variable -> memory allocation automatically -> assign default value
      Class1 c1;//object -> memory allocation manually -> manually assign default value
      num1 = 10;
      c1 = new Class1(); //new -> allocate memory, 
                        // Class1() -> default value
      c1.num1=90;
      c1.num2=7;
      c1.num3=c1.num1+c1.num2;
      
      System.out.println(num1);
      System.out.println(c1.num1);
      System.out.println(c1.num2);
      System.out.println(c1.num3);
      
      Student s1; //decalre
      s1 = new Student(); //allocate and default
      s1.sid=2;
      s1.name="Raj Thapa";
      s1.section='A';
      s1.course="BScIT";
      
      System.out.println(s1.sid);
      System.out.println(s1.name);
      System.out.println(s1.section);
      System.out.println(s1.course);
      
      
  }  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import models.Person;
import mylibs.PersonController;

public class PersonTest {
    public static void main(String []args){
        Person obj1 = new Person();
        Person obj2;
        obj1.pid=1;
        PersonController pc = new PersonController();
        obj2=pc.f1(obj1);
        System.out.println(obj2.pid);
        
    }
}

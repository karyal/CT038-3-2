package week4;
import models.Class2;
public class Class2Test {
    public static void main(String []args){
        Class2 obj21;
        obj21=new Class2(); //call default constructor
        obj21.setNum1(5); //num1 is not public
        obj21.setNum2(4);
        obj21.setNum3(6);
        System.out.println(obj21.getNum1());
        System.out.println(obj21.getNum2());
        System.out.println(obj21.getNum3());
        System.out.println(obj21); //call toString()
    }
}
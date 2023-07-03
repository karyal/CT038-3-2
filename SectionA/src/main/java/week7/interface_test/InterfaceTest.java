package week7.interface_test;

public class InterfaceTest {
    public static void main(String []args){
        int x = Inf1.NUM1;
        System.out.println(x);
        //Inf1.NUM1=76; //cannot assign a value to final variable NUM1
        int y = Inf2.NUM2;
        System.out.println(y);
        
        int z = Inf3.NUM1;
        System.out.println(z);
        z = Inf3.NUM2;
        System.out.println(z);
        z = Inf3.NUM3;
        System.out.println(z);
    }
}
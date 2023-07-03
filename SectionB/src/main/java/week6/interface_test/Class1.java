
package week6.interface_test;

public class Class1 implements Inf1, Inf2{
    public static void main(String[] args) {
        System.out.println(Inf1.NUM1);
        System.out.println(Inf2.NUM1);
        System.out.println(Inf2.NUM2);
    }
}

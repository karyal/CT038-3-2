
package week6.interface_test;

public class Class3 implements Inf3{
    @Override
    public void f1(){
        System.out.println(Inf3.NUM1);
        Inf3.f2();
    }
}

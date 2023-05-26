
package week5;

public class Class4 implements Inf1{
    @Override
    public void doSum(int num1, int num2){
        System.out.println(num1+num2);
    }
    @Override
    public void doSub(int num1, int num2){
        if(num1>=num2)
            System.out.println(num1-num2);
        else
            System.out.println(num2-num1);
    }
}

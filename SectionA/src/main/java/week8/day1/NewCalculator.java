package week8.day1;
public class NewCalculator extends Calculator{
    public NewCalculator(){
        super();//call parent class -> def ctor
    }
    public NewCalculator(int num1, int num2){
        super(num1, num2);
    }
    @Override
    public void sum(){
        super.sum();
    }
}
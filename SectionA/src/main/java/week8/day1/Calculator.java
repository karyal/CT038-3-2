package week8.day1;

public class Calculator {
    private int num1;
    private int num2;
    private int num3;
    public Calculator(){
        this.num1=0;
        this.num2=0;
        this.num3=0;
    }
    public Calculator(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
        this.num3=0;
    }
    public void sum(){
        this.num3=this.num1+this.num2;
    }
}
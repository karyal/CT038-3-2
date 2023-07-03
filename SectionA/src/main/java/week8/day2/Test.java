package week8.day2;

public class Test {
    public static void main(String[] args) {
        int num1=81;
        int num2=3;
        int num3 = num1+num2;
        //System.out.println(num3);//84
        
        //Example-2
        num1=10; //user input
        num2=0; //user input
        num3=num1/num2; //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //System.out.println(num3);//2
        
        //Handle Runtime Exception
        //decalre
        try{
            //input, processing, output
        }
        catch(Exception ex){
            //exception message
        }
        finally{
            //exit//end
        }
    }
}

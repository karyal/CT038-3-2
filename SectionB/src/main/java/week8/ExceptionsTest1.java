package week8;
import java.util.Scanner;

public class ExceptionsTest1 {
    public static void main(String[] args) {
        int num1, num2, num3;
        try{
            System.out.print("Enter first no : ");
            num1 = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.print("Enter second no : ");
            num2 = Integer.parseInt(new Scanner(System.in).nextLine());
            num3=num1/num2;
            System.out.print("Result : "+num3);
        }
        catch(NumberFormatException nfe){
            System.out.print("Error1 : "+nfe);
        }
        catch(ArithmeticException ae){
            System.out.print("Error2 : "+ae);
        }
        catch(Exception ex){
            System.out.print("Error3 : "+ex);
        }
    }
}

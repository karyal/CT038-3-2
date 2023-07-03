package week9;
import java.util.Scanner;
public class Test {
    public static void main(String []args){
        int num1;
        int num2;
        int num3;
        try{
            System.out.print("Enter first no : ");
            num1 = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.print("Enter second no : ");
            num2 = Integer.parseInt(new Scanner(System.in).nextLine());
            if(num1<1 || num2 <1){
                throw new LowRange("Number in low range");
            }
            if(num1>100 || num2>100){
                throw new HighRange("Number in high range");
            }
            num3=num1/num2;
            System.out.println("Result : "+num3);
        }
        catch(NumberFormatException nfe){
            System.out.println("Error1 : "+nfe.getMessage());
        }
        catch(LowRange le){
            System.out.println("Error2 : "+le.getMessage());
        }
        catch(HighRange le){
            System.out.println("Error3 : "+le.getMessage());
        }
        catch(ArithmeticException ae){
            System.out.println("Error3 : "+ae.getMessage());
        }
    }
}
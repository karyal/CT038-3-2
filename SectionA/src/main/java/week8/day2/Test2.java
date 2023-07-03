package week8.day2;
import java.util.Scanner;
public class Test2 {
    public static void main(String []args){
        //decalre
        int num1, num2, num3;
        try{
            System.out.print("Enter first no : ");
            num1 = Integer.parseInt(new Scanner(System.in).nextLine());
            System.out.print("Enter second no : ");
            num2 = Integer.parseInt(new Scanner(System.in).nextLine());
            num3 = num1/num2;
            System.out.print("Result : "+num3);
        }
        catch(Exception ex){
            System.out.print("Error  : "+ex);
        }
        finally{
            System.out.print("Bye!");
        }
        
    }
}

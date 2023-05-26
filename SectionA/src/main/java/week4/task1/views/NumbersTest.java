/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.task1.views;
import week4.task1.models.Numbers;
import week4.task1.controllers.NumberController;
import java.util.Scanner;
public class NumbersTest {
    public static void main(String[] args) {
        int n1, n2;
        System.out.print("Enter first no : ");
        n1 = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.print("Enter second no : ");
        n2 = Integer.parseInt(new Scanner(System.in).nextLine());
        Numbers nums = new Numbers();
        nums.num1 = n1;
        nums.num2 = n2;
        nums = new NumberController().sum(nums);
        System.out.println("SUM : " + nums.num3);
    }
}

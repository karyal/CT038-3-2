package week4.task1.controllers;
import week4.task1.models.Numbers;

public class NumberController {
  public Numbers sum(Numbers numbers) {
      numbers.num3=numbers.num1+numbers.num2;
      return numbers;
  } 
}

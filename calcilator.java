import java.util.Scanner;

public class calcilator {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter first number: ");
     int num1 = input.nextInt();
     System.out.println("Enter second number: ");
      int num2 = input.nextInt();
      System.out.println("Enter an operator (+, -, *, /): ");
      char operator = input.next().charAt(0);
      double result;
      switch (operator) {
        case '+':
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result);
          break;
        case '-':
        result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);
          break;
        case '*':
        result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);
          break;
        case '/':
        if (num2 != 0) {
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result);
        } else {
          System.out.println("Error: Division by zero is not allowed.");
          return;
          }
        default:
        System.out.println("Error: Invalid operator.");
          return;
          }
      input.close();
      System.out.println("Calculation completed successfully.");




    




  }
  
}

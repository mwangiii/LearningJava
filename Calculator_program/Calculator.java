import java.util.Scanner;

public class Calculator{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    // Take input from user till user does not press X or x
    while(true){
      //take the operator as input
      System.out.println("Enter the operator");
      char op = in.next().trim().charAt(0);
      System.out.println();
      if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
        // input two numbers
        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println();

        // Declare the result variable
        int ans = 0;

        if (op == '+'){
          ans = num1 + num2;
        }
        if (op == '-'){
          ans = num1 - num2;
        }
        if (op == '*'){
          ans = num1 * num2;
        }
        if (op == '/'){
          if(num2 != 0){
            ans = num1 / num2;
          }
        }
        if (op == '%'){
          ans = num1 % num2;
        }
        System.out.println(ans);
      }else if (op == 'x' || op == 'X'){
        break;
      }else{
        System.out.println("Invalid operation!");
      }
    }
  }
}
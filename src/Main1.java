import java.util.Scanner;

public class Main1 {
	public static void main(String[] args)
	  {
		  char Opt;
		  int num1,num2,sum;
		  
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Pick your operator: (+) (-) (*) or (/):");
		  Opt = input.next().charAt(0);
		  
		  System.out.println("Enter The First Number:");
		  num1 = input.nextInt();
		  
		  System.out.println("Enter The Second Number:");
		  num2= input.nextInt();
		  
		  switch (Opt) {
		  case '+': 
			  sum = num1 + num2;
			  System.out.println("The Sum of two numbers is " + sum);
			  break;
		  
		  case '-': 
			  sum = num1 - num2;
			  System.out.println("The Subtraction of two numbers is " + sum);
			  break;
		  case '*':
			  sum = num1 * num2;
			  System.out.println("The Multiplication of two numbers is " + sum);
			  break;
		  case '/':
			  sum = num1 / num2;
			  System.out.println("The Division of two numbers is " + sum);
			  break;
		  default:
			  System.out.println("Invalid Operator!");
		  }
		  input.close();
	  }
}

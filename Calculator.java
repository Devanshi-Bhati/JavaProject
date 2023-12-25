import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
			double num1, num2;
			int n;
			Scanner obj = new Scanner(System.in);
		do {
			System.out.println("***************************");
			System.out.println("You can do the following:");
			System.out.println("1. Addition\n2. Subtraction\n3.Multiplication\n4.Division\n0.Exit");
			System.out.println("***************************");
			System.out.println("Enter your choice:");
			n = obj.nextInt();
			switch (n) {
			case 1: System.out.println("Enter first number:");
						 num1 = obj.nextDouble();
						 System.out.println("Enter second number:");
						 num2 = obj.nextDouble(); 
						 System.out.println("Addition of given numbers is:");
						 System.out.println(num1+num2);
			            break;
			case 2:System.out.println("Enter first number:");
						 num1 = obj.nextDouble();
						 System.out.println("Enter second number:");
						 num2 = obj.nextDouble();
						 System.out.println("Subtraction of given numbers is:");
						 System.out.println(num1-num2);
						 break;
			case 3:System.out.println("Enter first number:");
						 num1 = obj.nextDouble();
						 System.out.println("Enter second number:");
						 num2 = obj.nextDouble(); 
						 System.out.println("Multiplication of given numbers is:");
						 System.out.println(num1*num2);
						break;
			case 4:System.out.println("Enter first number:");
						num1 = obj.nextDouble();
						System.out.println("Enter second number:");
						 num2 = obj.nextDouble(); 
						if(num2 != 0) { 
						System.out.println("Division of given numbers is:");
						System.out.println(num1/num2);
						break;
		             	}
			            else {
			        	System.out.println("Division not possible");
				        break;
		            	}
			case 0:System.out.println("Thanks for visiting!"); 
						 break;
			default : System.out.println("Enter a valid choice");
			}
		}while(n != 0);
		obj.close();
	}

}

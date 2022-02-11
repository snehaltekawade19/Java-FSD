package assignments;
import java.util.Scanner;

public class Calculator {
	public int addition(int num1, int num2)
	{
		return num1+num2;
	}
	
	public int substraction(int num1, int num2)
	{
		return num1-num2;
	}
	
	public int multiplication(int num1, int num2)
	{
		return num1*num2;
	}
	
	public int division(int num1, int num2)
	{
		return num1/num2;
	}
	
	public int modulo(int num1, int num2)
	{
		return num1%num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter First Number: ");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Number: ");
			int num2 = sc.nextInt();
			System.out.println("Which operation would you like to perform(1/2/3/4/5):");
			System.out.println("1.Addition(+)");
			System.out.println("2.Substraction(-)");
			System.out.println("3.Multiplication(*)");
			System.out.println("4.Division(/)");
			System.out.println("5.Modulo(%)");
			int op = sc.nextInt();
			Calculator cal = new Calculator();
			if(op == 1)
			{
				System.out.println("Addition is: "+cal.addition(num1, num2));
			}
			else if(op == 2)
			{
				System.out.println("Substraction is: "+cal.substraction(num1, num2));
			}
			else if(op == 3)
			{
				System.out.println("Multiplication is: "+cal.multiplication(num1, num2));
			}
			else if(op == 4)
			{
				System.out.println("Division is: "+cal.division(num1, num2));
			}
			else if(op == 5)
			{
				System.out.println("Modulo is: "+cal.modulo(num1, num2));
			}
			else
			{
				System.out.println("Invalid Input");
			}
			System.out.println("Would you like to continue?(1 for YES, 2 for NO): ") ;
			int cont = sc.nextInt();
			if(cont == 2)
			{
				break;
			}
		}	
	}
}

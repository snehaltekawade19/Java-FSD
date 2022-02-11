package practice;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		//IndexOutofBound Exception
		int array[]= {5,6,34,8,9};
		
		try
		{
			int val = array[5];
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Exception occured "+e);
		}
		
		//Null Pointer Exception
		String name=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email");
		String email=sc.next();
		try
		{
		if(name.equals(email))
			System.out.println("User Authenticated");
		else
			System.out.println("Not valid user");
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception Occured "+e);
		}
		
		//Arithemetic Exception
		int num1 = 17;
		int num2 = 0;
		
		try
		{
			int result = num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured "+e);
		}

	}

}

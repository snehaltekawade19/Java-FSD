ttpackage trycatchdemo;

import java.util.Scanner;

public class Test {
	public static void passwordValidate(String pwd) throws PasswordNotValidException
	{
		if(pwd.length()<8)
		{
			throw new PasswordNotValidException("Password not valid coz its less than 8");
		}
		else
		{
			System.out.println("Password is Valid");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String pwd = sc.next();
		try
		{
			passwordValidate(pwd);
		}
		catch(PasswordNotValidException e)
		{
			System.out.println("Exception occured "+e);
		}
		finally
		{
			sc.close();
			System.out.println("Scanner closed");
		}
	}
}

package practice;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		int arr2[][] = new int[3][3];
		int resultarr[][] = new int[3][3];
		int result[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		for(int row=0; row<arr[0].length; row++)
		{
			for(int col=0; col<arr[1].length; col++)
			{
				System.out.println("Enter element for "+row+" "+col+": ");
				arr[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0; row<arr2[0].length; row++)
		{
			for(int col=0; col<arr2[1].length; col++)
			{
				System.out.println("Enter element for "+row+" "+col+": ");
				arr2[row][col]=sc.nextInt();
			}
		}
		System.out.println("Adding both Matrices");
		for(int row=0; row<arr[0].length; row++)
		{
			for(int col=0; col<arr[1].length; col++)
			{
				resultarr[row][col] = arr[row][col] + arr2[row][col];
			}
		}
		for(int row=0; row<resultarr[0].length; row++)
		{
			for(int col=0; col<resultarr[1].length; col++)
			{
				System.out.println(resultarr[row][col]+"\t");
			}
			System.out.println();
		}
		

	}

}

package practice;

import java.util.Scanner;

public class ArraysTypes {

	public static void main(String[] args) {
		
		//Single Dimension Array
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter the "+ i + " element of array: ");
			int val = sc.nextInt();
			arr[i] = val;
		}
		System.out.println("Array Elements are: ");
		for(int i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Element at 1st index is "+arr[1]);
		System.out.println("Element at 3rd index is "+arr[3]);
		
		//Multi-Dimensional Array
		int[][] arr2 = new int[3][3];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Enter the "+ i +" "+ j +" element of array: ");
				int val = sc.nextInt();
				arr2[i][j] = val;
			}
		}
		System.out.println("Elements of MultiDimensional Array are: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

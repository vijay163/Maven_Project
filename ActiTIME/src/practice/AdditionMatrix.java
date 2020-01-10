package practice;

import java.util.Scanner;

public class AdditionMatrix
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Matrix Size:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		System.out.println("Enter the Matrix Elements :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Matrix is:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(i==j)
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}

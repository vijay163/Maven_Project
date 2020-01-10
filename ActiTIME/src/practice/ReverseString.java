package practice;

import java.util.Scanner;

public class ReverseString
{
	public static String reverse(String s)
	{
		String n="";
		for(int i=s.length()-1;i>=0;i--)
		{
			n=n+s.charAt(i);
		}
		//System.out.println(n);
		return n;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:::");
		String s = sc.nextLine();
	String	arr[]=s.split(" ");
	String rev="";
	for(int i=0;i<arr.length;i++)
	{
		rev=rev+reverse(arr[i])+" ";
	}
	System.out.println(rev);
		
	}

}

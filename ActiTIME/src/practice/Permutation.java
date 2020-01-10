package practice;

import java.util.Scanner;

public class Permutation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();
		int len = str.length();
		int l = factorial(len);
		System.out.println("Factorial of the String****"+l);
		stringArr(str,"");
		
	
	}
	public static int factorial(int length)
	{
		int result=1;
		for(int i=1;i<=length;i++)
		{
			result=result*i;
			
		}
		return result;
	}
	public static void stringArr(String str1,String str2)
	{
		if(str1.length()==0)
		{
			System.out.println(str2+" ");
			
		}
		for(int i=0;i<str1.length();i++)
		{
			char ch = str1.charAt(i);
			String str3 = str1.substring(0,i)+str1.substring(i+1);
			stringArr(str3,str2+ch);
		}
	}
}

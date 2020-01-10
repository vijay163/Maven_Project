package practice;

import java.util.Scanner;

public class Reverse
{
	public static void value(String s)
	{
		int value =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='u')
				++value;
			else if(s.charAt(i)=='d')
				--value;
		}
		System.out.println(value);
	}
	public static void main(String[] args)
	{
		System.out.println("Enter UD character:::");
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		value(s);
		System.out.println(s);
		System.out.println("Enter the character ::");
		String add = sc.next();
		String n=s+add;
		value(n);
		
		
	}

}

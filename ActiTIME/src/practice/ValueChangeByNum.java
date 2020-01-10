package practice;

import java.util.Scanner;

public class ValueChangeByNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String::");
		String s = sc.nextLine();
		int value=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				value+=1;
			}
			else if(ch>='0'&&ch<='9')
		  {
			  value+=2;
		  }
		
		
		}
		System.out.println(value);
		
	}

}

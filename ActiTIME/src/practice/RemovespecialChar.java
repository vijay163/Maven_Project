package practice;

import java.util.Scanner;

public class RemovespecialChar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:::");
		String s = sc.nextLine();
	    String spec=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9'))
			{
			 spec=spec+ch;
			}
		/*	else
			{
	         spec= spec+ch;
			}
		*/}
		System.out.println("After Removing Special character:::");
		System.out.println(spec);
		
	}

}

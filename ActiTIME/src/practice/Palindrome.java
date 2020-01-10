package practice;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the palindrome String::");
		String s = sc.nextLine();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			 char ch = s.charAt(i);
			rev = rev+ch;
		}
			if(rev.equals(s))
			{
				System.out.println("its a Palindrome:::");
			}
			else 
			{
				System.out.println("its a Not Palindrome::");
			}
			
		}
		
	}


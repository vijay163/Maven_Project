package practice;

import java.util.Scanner;

public class P6 
{
	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String::");
			String s = sc.nextLine();
			int a_count=0;
			int n_count=0;
		   for(int j=0;j<s.length();j++)
		   {
			  char ch = s.charAt(j);
			   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			   {
				   a_count++;
			   }
			   else if(ch>='0'&&ch<='9')
			   {
				  n_count++;
			   }
		   }
		   System.out.println(s.length());
		   System.out.println("NUmber of alphabits are::"+a_count);
		   System.out.println("Number of numerics are::"+n_count);
		   
		
		}

	}




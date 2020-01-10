package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortWords 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***Enter the String into Array ****");
		String str = sc.nextLine().toLowerCase();
		ArrayList<String> ls = toArrayOfWords(str);
		Collections.sort(ls);
		System.out.println("****After Sorting the String****");
		for(String i:ls)
		{
		System.out.println(i);	
		}		
	}
	public static ArrayList<String> toArrayOfWords(String s)
	{
		ArrayList<String> a = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			String str=" ";
			int start=i;
			while(i<s.length()&&s.charAt(i)!=' ')
			{
				i++;
			}
			int end=i-1;
			if(start<=end)
			{
				for(int j=start;j<=end;j++)
				{
				str=str+s.charAt(j);
				}
				a.add(str);
			}
		
		}
		return a;
	}

}

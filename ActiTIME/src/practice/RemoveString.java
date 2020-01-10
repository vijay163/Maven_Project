package practice;

import java.util.Scanner;

public class RemoveString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String::");
		String s = sc.nextLine();
		String l = remove(s);
		System.out.println(l);
		
	}
public static String remove(String s)
{
	String n="";
    String com="hello";
  char ch[]=s.toCharArray();
  char ch2[]=com.toCharArray();
  for(int i=0;i<ch.length;i++)
  {
	  int count=0;
	  for(int j=0;j<ch2.length;j++)
	  {
		  if(ch[i]==ch2[j])
			  count++;
	  }
	  if(count==0)
		  n=n+ch[i];
  }

	return n;
}
}

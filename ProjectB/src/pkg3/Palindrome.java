package pkg3;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
	    int number; 
		Scanner s=new Scanner (System.in);
		System.out.println("Enter any number to check");
		number=s.nextInt();
		int sum=0;
		int oldnumber=number;
		while (number>0)
		{
			int r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
if (oldnumber==sum)
{
	System.out.println(oldnumber+ " is a palindrome number");
	}
else 
{
	System.out.println(oldnumber+ " is not a palindrome number");
}
}
}

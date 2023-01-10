package pkg3;

import java.util.Scanner;

public class Prime1 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a number to check");
		n=s.nextInt();
		
		int i;
		int half=n/2;
		int temp=0;
		for(i=2;i<=half;i++)
		{
			if(n%i==0)
			{
				System.out.println("It is not a prime number");
				temp++;
				break;
				
			}
		}
		{
			if(temp==0)
			{System.out.println("It is a prime number");
		    }
		}
		
	}

}

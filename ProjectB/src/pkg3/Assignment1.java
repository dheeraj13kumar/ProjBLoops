package pkg3;

import java.util.Scanner;

public class Assignment1
{
	public static void main(String[] args) 
	{
		
        System.out.println("Please enter value of x1");
		Scanner q=new Scanner(System.in);
		int x1=q.nextInt();
		System.out.println("Please enter value of x2");
		int x2=q.nextInt();
		int a;
		a=x1*x2;
		System.out.println("Multi result " +a);
		
		System.out.println("Please enter value of x3");
		Scanner w=new Scanner(System.in);
		int x3=w.nextInt();
	    int b;
		b=a+x3;
		System.out.println("Add result " +b);
		
		System.out.println("Please enter value of x4");
		Scanner e=new Scanner(System.in);
		int x4=e.nextInt();
	    int c;
		c=b-x4;
		System.out.println("Sub result " +c);
		
		System.out.println("Please enter value of x5");
		Scanner r=new Scanner(System.in);
		int x5=r.nextInt();
	    int d;
		d=c+x5;
		System.out.println("Add result " +d);
		
		System.out.println("Please enter value of x6");
		Scanner t=new Scanner(System.in);
		float x6=t.nextFloat();
	    float f;
		f=d/x6;
		System.out.println("Div/Final result " +f);
	}
		
	}


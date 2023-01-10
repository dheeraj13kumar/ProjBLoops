package pkg3;

import java.util.Scanner;

public class Assignment 
{
		public int sum(int x1, int x2)
		{
			int a;
			a=x1+x2;
			System.out.println("Sum result is " +a);
			return a;
		}
		public int sub(int x1, int x2)
		{
			int b;
			b=x1-x2;
			System.out.println("Sub result is " +b);
			return b;
		}	
		public int multi(int x1, int x2)
		{
			int c;
			c=x1*x2;
			System.out.println("Multi result is " +c);
			return c;
		}
		public void div(float x1, float x2)
		{
			float d;
			d=x1/x2;
			System.out.println("Div/Final result is " +d);
		}
		public static void main(String[] args) 
		{
			System.out.println("Enter Values");
			Scanner s=new Scanner(System.in);
			int x1=s.nextInt();
			int x2=s.nextInt();
			int x3=s.nextInt();
			int x4=s.nextInt();
			int x5=s.nextInt();
			int x6=s.nextInt();
			Assignment ref=new Assignment();
			int sum=ref.sum(x1, x2);
			int sub=ref.sub(sum, x3);
			int multi=ref.multi(sub, x4);
			int sub1=ref.sub(multi, x5);
			ref.div(sub1, x6);
			}
		}

	


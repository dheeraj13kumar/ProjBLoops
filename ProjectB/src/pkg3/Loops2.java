package pkg3;

public class Loops2 
{
	public static void main(String[] args) 
	{
		for (int i=1; i<=5; i++)   // for row
		{
			for (int j=5; j>=i; j--) // for column
			{
				System.out.print("*");   // 1 star
			}
				System.out.println();   // next line
		}
		
	}

}
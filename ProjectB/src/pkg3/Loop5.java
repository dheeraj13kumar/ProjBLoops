package pkg3;

public class Loop5 
{
	public static void main(String[] args) 
	{
		
		for (int i=1; i<=5; i++)   // for row
		{
			for (int j=5; j>=i; j--)  // for space
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)  // for star
			{
				System.out.print("*");
			}
				System.out.println();  // next line
		}
		
	}

}

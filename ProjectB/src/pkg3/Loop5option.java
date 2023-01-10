package pkg3;

public class Loop5option 
{
	public static void main(String[] args) 
	{
		int row=5;
		for (int i=1; i<=row; i++)   // for row
		{
			for (int j=1; j<=row-i; j++)  // for space
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

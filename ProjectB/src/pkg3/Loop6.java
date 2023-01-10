package pkg3;

public class Loop6 
{
	public static void main(String[] args) 
	{
		
		for (int i=1; i<=5; i++)   // for row
		{
			for (int j=5; j>=i; j--)  // for space
			{
				System.out.print(" ");
			}
				
				for(int k=1; k<=i; k++)
				{
					System.out.print("*"); 	// for star
				}
				for(int l=2; l<=i; l++)
				{
					System.out.print("*"); 	// for star
				}
		
				System.out.println();  // next line
		}
		
	}
}



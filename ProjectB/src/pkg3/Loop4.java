package pkg3;

public class Loop4 
{
	public static void main(String[] args) 
	{
		int b=1;
		for (int i=1; i<=4; i++)   // for row
		{
			for (int j=1; j<=i; j++)  // for column
			{
				System.out.print(+b);
				b++;
			}
				System.out.println();  // next line
		}
		
	}

}

package pkg4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteDataInARangeTXT
{
	public void WriteInARange() throws IOException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter initial row & end row");
		int initial=s.nextInt();
		int end=s.nextInt();
		System.out.println("Enter data to be printed");
		String a=s.next();
		File f=new File("C:\\Users\\Dheeraj\\Desktop\\TextFileCopy.txt");  // establish connection
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		for(int i=1;i<=end;i++) 
		{
		   if((i>=initial)&&(i<=end))    
		    {
		      bw.write(a);  // write user data
		    }
		   bw.newLine(); 
		 }
		   bw.close();
	}
	public static void main(String[] args) throws IOException
	{
		WriteDataInARangeTXT wr=new WriteDataInARangeTXT();
		wr.WriteInARange();
	}
}

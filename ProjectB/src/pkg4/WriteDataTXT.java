package pkg4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataTXT 
{
	public void WriteData() throws IOException
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter rowcount");
	int a=s.nextInt();
	File f=new File("C:\\Users\\Dheeraj\\Desktop\\TextFileCopy.txt");  // establish connection
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	
	for(int i=1; i<=a; i++)
	{
	bw.write("Hello everyone");
	bw.newLine();
	}
	bw.close();     //for saving and closing file
    }

public static void main(String[] args) throws IOException
{
	WriteDataTXT wr=new WriteDataTXT();
	wr.WriteData();
}
}
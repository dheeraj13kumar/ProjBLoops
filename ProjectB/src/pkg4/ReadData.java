package pkg4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData
{
	
	
public static void main(String[] args) throws IOException 
{
	File f=new File("../ProjectB/Textfile.txt");
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	int line=0;
	String s;
	while((s=b.readLine())!=null)
	{
		line=line+1;
		int particularLine=2;
		if(line==particularLine)
		 {
			 System.out.println(s); 
		 }
		
	}
}
	
}
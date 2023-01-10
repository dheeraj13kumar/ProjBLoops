package pkg4;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFile 
{
public static void main(String[] args) throws IOException
{
	File f=new File("../ProjectB/Textfile.txt");
	FileReader fr=new FileReader(f);
	int a;
	while((a=fr.read())!=-1)
	{
		System.out.println((char)a);
	}
}
	
}
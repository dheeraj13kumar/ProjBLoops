package pkg4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataAppend 
{
public static void main(String[] args) throws IOException 
{
	File f=new File("C:\\Users\\Dheeraj\\Desktop\\TextFile.txt");  // establish connection
	FileWriter fw=new FileWriter(f, true);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.newLine();  // to write in next line
	bw.write("3) Have a nice day");
	bw.newLine();  // to write in next line
	bw.write("4) Goodbye");
	bw.close();     //for saving and closing file
}
}

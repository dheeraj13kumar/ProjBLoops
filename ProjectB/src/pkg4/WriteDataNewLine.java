package pkg4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataNewLine 
{
public static void main(String[] args) throws IOException 
{
	File f=new File("C:\\Users\\Dheeraj\\Desktop\\TextFile.txt");  // establish connection
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write("1) Hello everyone");
	bw.newLine();   // to write in next line
	bw.write("2) My name is Dheeraj");
	bw.close();     //for saving and closing file
}
}

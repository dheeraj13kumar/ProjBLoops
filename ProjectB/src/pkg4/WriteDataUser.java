package pkg4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataUser 
{
public static void main(String[] args) throws IOException 
{
	File f=new File("C:\\Users\\Dheeraj\\Desktop\\TextFile.txt");  // establish connection
	FileWriter fw=new FileWriter(f);
	fw.write("1) Hello everyone");
	fw.close();     //for saving and closing file
}
}

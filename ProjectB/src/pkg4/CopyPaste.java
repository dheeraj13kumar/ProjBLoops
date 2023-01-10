package pkg4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyPaste
{
	public void copypaste() throws IOException
	{
File f1=new File("C:\\Users\\Dheeraj\\Desktop\\TextFile.txt");
File f2=new File("C:\\Users\\Dheeraj\\Desktop\\TextFileCopy.txt");
FileReader fr=new FileReader(f1);
FileWriter fw=new FileWriter(f2);
BufferedReader br=new BufferedReader(fr);
BufferedWriter bw=new BufferedWriter(fw);
String sourceData=null;
while((sourceData=br.readLine())!=null)
{
	bw.write(sourceData);
	bw.newLine();
}
br.close();
bw.close();
    }
         public static void main(String[] args) throws IOException 
			{
			CopyPaste obj=new CopyPaste();
			obj.copypaste();	
			System.out.println("Data copied");
	        }
}

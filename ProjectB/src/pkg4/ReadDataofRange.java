package pkg4;

	import java.io.BufferedReader;
	import java.io.File;
    import java.io.FileReader;
	import java.io.IOException;

	public class ReadDataofRange
	{
		
		public void ReadRange(int initial,int end) throws IOException
		{	
		File f=new File("../ProjectB/Textfile.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		int line=0;
		String s;
		while((s=b.readLine())!=null)
		{
			line=line+1;
			if((line>=initial)&&(line<=end))
			 {
				 System.out.println(s); 
			 }
			
		}
	}
		public static void main(String[] args) throws IOException 
		{
			ReadDataofRange r=new ReadDataofRange();
			r.ReadRange(2, 3);
		}
	}

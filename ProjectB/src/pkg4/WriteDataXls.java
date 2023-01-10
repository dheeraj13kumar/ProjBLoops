package pkg4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteDataXls
{
	public void WriteData() throws IOException, RowsExceededException, WriteException
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter row and Column");
	int rowcount=s.nextInt();
	int columncount=s.nextInt();
	
		File f=new File("../ProjectB/Write file.xls");
		 WritableWorkbook wk=Workbook.createWorkbook(f);
		 WritableSheet ws=wk.createSheet("Sheet0", 0);
		
	    for(int i=0;i<rowcount;i++)     // loop for rows	  	
		{
	    	for(int j=0;j<columncount;j++) // loop for columns
	    	{
	    		Label L=new Label(j,i,"Hello");
	    		ws.addCell(L);	
		    }
	    }
	    wk.write();  // for saving the file
	    wk.close(); // for closing the file
	}
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException  
	{
		WriteDataXls Write=new WriteDataXls();
		Write.WriteData();
	}
}
	




	




  
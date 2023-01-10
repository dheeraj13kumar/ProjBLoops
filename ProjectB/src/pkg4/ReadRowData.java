package pkg4;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadRowData 
{
	public void ReadData(int row) throws BiffException, IOException 
	{
		File f=new File("../ProjectB/Read file.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();   //will give the no of rows
		int c=ws.getColumns();  //will give the no of columns
	    for(int i=row;i<=row;i++)     // loop for rows	  	
		{
	    	for(int j=0;j<c;j++) // loop for columns
	    	{
		        Cell c1=ws.getCell(j,i);
				System.out.println(c1.getContents());	
		    }
	    }
	 }
	public static void main(String[] args) throws BiffException, IOException 
	{
		ReadRowData ReadRow=new ReadRowData();
		ReadRow.ReadData(2);
	}
}
	




	




  
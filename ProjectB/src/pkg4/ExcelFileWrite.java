package pkg4;


import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFileWrite 
{
public static void main(String[] args) throws IOException, RowsExceededException, WriteException
{
	File f=new File("../ProjectB/Write file.xls");
    WritableWorkbook wk=Workbook.createWorkbook(f);
    WritableSheet ws=wk.createSheet("Sheet0", 0);
    
    for(int i=0; i<5; i++)   //loop for rows
    {
    	for(int j=0; j<5; j++) //loop for columns
    	{
    		Label L=new Label(i, j, "Dheer"); 
    		ws.addCell(L);
    		
    	}
    }
  wk.write();  // for saving the file
  wk.close();   // for closing the file
}
}

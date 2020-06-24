package training;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelParser {

	public static String[][] getData(String filepath) throws Exception {
		//Load the Excel File
		File objFile=new File(filepath);
		Workbook objWB=Workbook.getWorkbook(objFile);
		Sheet objSheet=objWB.getSheet("Sheet1");

		//Get the rows & Columns
		int rows,cols;
		rows=objSheet.getRows();
		cols=objSheet.getColumns();
		System.out.println(rows+"----"+cols);
		//define and assign mydata error
		String[][] myData=new String[rows][cols];
		

		//Read the data and store in an array
		for(int row_i=0;row_i<rows;row_i++){
			for(int col_i=0;col_i<cols;col_i++){
				//give cell
				Cell objCell=objSheet.getCell(col_i, row_i);
				//get content of each cell
				myData[row_i][col_i]=objCell.getContents();
				//Printing
				System.out.println("Data at ["+row_i+"]["+col_i+"]="+myData[row_i][col_i]);
			}
		}
		//will return a string 2D array
		return myData;
	}

}

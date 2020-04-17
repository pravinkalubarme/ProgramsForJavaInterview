package Demo.Pattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file = new FileInputStream("C:\\Users\\pravi\\Desktop\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
		
			XSSFSheet sheet = workbook.getSheetAt(i);
			Iterator<Row> rows = sheet.iterator();
			Row firstRow = rows.next();
			System.out.println("Row no: "+firstRow.getRowNum());
			
			Iterator<Cell> cells = firstRow.cellIterator();
			int column=1;
			while (cells.hasNext()) {
				Cell cell = cells.next();
				int col;
				if (cell.getStringCellValue().equals("TestCase")) 
				{
				    col=cell.getColumnIndex();
					System.out.println("Index of desired column is: "+col);	
					column=col;
					System.out.println(column);
				}			
			}
			
			int noOfRows=sheet.getLastRowNum();
			System.out.println(noOfRows);
			
			for (int j = 0; j <= noOfRows; j++) 
			{
				String content=sheet.getRow(j).getCell(column).getStringCellValue();
				if (content.equals("Purchase")) 
				{
					for (int k = 1; k <= 3; k++) {
						System.out.println(sheet.getRow(j).getCell(k).getStringCellValue());
					}
				}
			}
		}
	}
}
}
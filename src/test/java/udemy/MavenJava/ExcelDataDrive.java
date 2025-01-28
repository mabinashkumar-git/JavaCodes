package udemy.MavenJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDrive {
	
	public ArrayList<String> getDataFromExcel(String TestCaseName) throws IOException {
		
		ArrayList<String> array = new ArrayList<>();

		/*FileInputStream is a class in java which creates a object "fis" which has access to read file from the location*/
		FileInputStream fis = new FileInputStream("F:\\Selenium\\UdemyWorkspace\\SDET\\src\\test\\resources\\TestData\\Demosheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet;
		
		int noOfSheets = workbook.getNumberOfSheets();
		for(int i=0; i<noOfSheets; i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase("DemoSheet1")) {
				sheet = workbook.getSheetAt(i);
				
				/* Identify Test Case column by scanning the entire first row*/
				Iterator<Row> totalrows = sheet.iterator(); // This code traverses through all rows in sheet
				Row rows = totalrows.next();
				
				Iterator<Cell> ce = rows.cellIterator();
				
				int k=0;
				int columnIndex = 0;
				while(ce.hasNext()) {
					Cell ceValue = ce.next();
					String TestCase_HeaderValue = ceValue.getStringCellValue();
					System.out.println("Cell value at "+i+"th cell is :"+ceValue.getStringCellValue());
					if(TestCase_HeaderValue.equalsIgnoreCase("TestCases")) {
						
						/* Provides the index of the column in which value is found */
						 columnIndex = k; 
						System.out.println("Index of the column in which value is found is :" + columnIndex + "\n");
						break;
					}
					k++;
				}
				
				/* After column is identified, now scan the rows of identified column to detect the Test case*/
				while(totalrows.hasNext()) {
					Row row = totalrows.next();
					String TestCase_Name = row.getCell(columnIndex).getStringCellValue();
					if(TestCase_Name.equalsIgnoreCase(TestCaseName)) {
						System.out.println(" Matched");
						
						/* After the TC been identified from the row, now scan all the cells of this row */
						Iterator<Cell> r = row.cellIterator();
						
						while(r.hasNext()) {
							Cell c = r.next();
							
							/* Provides the index of the column in which value is found */
							 columnIndex = k; 
							
							if(c.getCellType() == CellType.STRING) {
								String cellValue = c.getStringCellValue();
								System.out.println("Values for TC :"+ TestCase_Name + " found at cell[" + columnIndex + "] is : "+cellValue);
								
								/* Add cellValue to Array */
								array.add(cellValue);
							}
							else {
								double cellValue = c.getNumericCellValue();
								System.out.println("Values for TC :"+ TestCase_Name + " found at cell[" + columnIndex + "] is : "+cellValue);
								
								/* Add cellValue to Array after converting it from double to String */
								array.add(NumberToTextConverter.toText(cellValue));
//								array.add(cellValue);
							}
							k++;
						}
					}
				}
				
			}
			
		}
		return array;
	}

	public static void main(String args[]) throws IOException {
		ExcelDataDrive exceldatadrive = new ExcelDataDrive();
		ArrayList data = exceldatadrive.getDataFromExcel("Create Profile");
//		System.out.println(data.get(0));
//		System.out.println(data.get(1));
//		System.out.println(data.get(2));
	}
}

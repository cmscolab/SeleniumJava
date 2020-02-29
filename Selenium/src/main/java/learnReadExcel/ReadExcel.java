package learnReadExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	@SuppressWarnings("resource")
	public  String[][] readExcel(String fileName) throws InvalidFormatException, IOException{
		File fis = new File("./data/"+fileName+".xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
		int count = sheet1.getLastRowNum();
		int cellcount = sheet1.getRow(0).getLastCellNum();
		String[][] data = new String[count][cellcount];
		//System.out.println(count);
		for (int i = 1; i <= count; i++) {
			XSSFRow row = sheet1.getRow(i);
			//System.out.println(cellcount);
			XSSFCell cell;
			for (int j = 0; j <cellcount; j++) {
				cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				//System.out.println(cell.getStringCellValue());
			}
			//System.out.println(i);
			//System.out.println(cell.getStringCellValue());
		}
		return data;
		
	}
}

package readexcelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_Data {
	final String excelData="./TestData/TestData.xlsx";
	public void readExcelData() throws Throwable {
		FileInputStream data=new FileInputStream(excelData);
		XSSFWorkbook workbook= new XSSFWorkbook(data);
		XSSFSheet sheet=workbook.getSheet("testData");
		Iterator<Row> rowiterator=sheet.iterator();
		rowiterator.next();
		List<String> list=new ArrayList<String>();
		while(rowiterator.hasNext()) {
			list.add(rowiterator.next().getCell(0).getStringCellValue());
			System.out.println(list);
			
		}
		
		
		
	}

}

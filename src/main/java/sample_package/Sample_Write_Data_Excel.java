package sample_package;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic_UtilityOrLib.IconstantUtility;

public class Sample_Write_Data_Excel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(IconstantUtility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(9).createCell(1).setCellValue("IronMan");
		FileOutputStream fos=new FileOutputStream(IconstantUtility.excelpath);
		book.write(fos);
	}

}

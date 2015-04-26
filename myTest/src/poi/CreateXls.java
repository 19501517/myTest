package poi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateXls {
	
	public boolean createClsFile(List<Student> list){
		String fileType = "xls";
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("学生表");
		HSSFRow row = sheet.createRow(0);
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		HSSFCell cell = row.createCell(0);
		cell.setCellValue("姓名");
		cell.setCellStyle(style);
		
		cell = row.createCell(1);
		cell.setCellValue("学号");
		cell.setCellStyle(style);
		
		cell = row.createCell(2);
		cell.setCellValue("年龄");
		cell.setCellStyle(style);
		
		cell = row.createCell(3);
		cell.setCellValue("时间");
		cell.setCellStyle(style);
		
		for(int i=0; i<list.size(); i++){
			row = sheet.createRow(i+1);
			Student stu = list.get(i);
			
			row.createCell(0).setCellValue(stu.getName());
			row.createCell(1).setCellValue(stu.getId());
			row.createCell(2).setCellValue(stu.getAge());
			row.createCell(3).setCellValue(new SimpleDateFormat("yyyy-mm-dd").format(new Date()));
		}
		
		try{
			FileOutputStream fout = new FileOutputStream("E:/students" + fileType);
			wb.write(fout);
			fout.close();
			return true;
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return false;
	}
}

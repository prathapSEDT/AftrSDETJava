package com.readexcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcel {
    public static void main(String[] args) throws IOException {
        File f=new File("src/main/resources/TestData/Testdata.xlsx");
        FileInputStream fis=new FileInputStream(f);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        int totalRowCount=sheet.getLastRowNum();
        int colCount=sheet.getRow(0).getLastCellNum();
        for(int r=1;r<=totalRowCount;r++){
            for(int c=0;c<=colCount-1;c++){
               switch( sheet.getRow(r).getCell(c).getCellType()){
                   case STRING:
                       System.out.println(sheet.getRow(r).getCell(c).getStringCellValue());
                       break;
                   case NUMERIC:
                       System.out.println(sheet.getRow(r).getCell(c).getNumericCellValue());
                       break;
               }
            }
        }


    }
}

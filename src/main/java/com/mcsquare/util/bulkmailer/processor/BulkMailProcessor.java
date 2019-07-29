package com.mcsquare.util.bulkmailer.processor;

import com.mcsquare.util.bulkmailer.service.BulkMailSender;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

@Service
public class BulkMailProcessor {

    @Autowired
    private BulkMailSender bulkMailSender;

    public void processor() {
        try {
            FileInputStream file = new FileInputStream(new File("EmailList.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            //skip firstRow
            rowIterator.next();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                String firstName;
                String toEmail;

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getColumnIndex()) {
                        case 0:
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;
                        case 1:
                            System.out.print(cell.getStringCellValue() + "t");
                            break;
                        case 2:
                            System.out.print(cell.getStringCellValue() + "t");
                            //toEmail = cell.
                            break;
                    }
                }
                System.out.println();
                //bulkMailSender.sendSimpleMessage(, , );
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

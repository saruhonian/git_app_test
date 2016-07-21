import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Tmp {
    public static void main(String[] args) {
        File downloadXlsxFile = new File("g:\\tmp\\Pomoch.xls");
        // File downloadXlsxFile = new File("Pomoch.xls").getAbsoluteFile();
        HSSFWorkbook myExcelBook = null;
        try {
            myExcelBook = new HSSFWorkbook(new FileInputStream(downloadXlsxFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        HSSFSheet myExelSheet = myExcelBook.getSheet("Sheet1");
        for (int i = 1; i <= myExelSheet.getLastRowNum(); i++) {
            HSSFRow rowExcel = myExelSheet.getRow(i);
            int tmp = myExelSheet.getLastRowNum();
            String st = String.valueOf(rowExcel.getCell(2));

            System.out.println(i + ") " + st);
        }
    }
}

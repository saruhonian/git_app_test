import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.w3c.dom.Node;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    public static int readExcel(int intAttrCorrIdentifyCode, int intAttrCorrAccountNo) throws IOException {
        int result;
        File downloadXlsxFile = new File("g:\\tmp\\Pomoch.xls");
        // File downloadXlsxFile = new File("Pomoch.xls").getAbsoluteFile();
        HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(downloadXlsxFile));
        HSSFSheet myExelSheet = myExcelBook.getSheet("Sheet1");
        HSSFRow rowExcel2 = myExelSheet.getRow(2);
        HSSFRow rowExcel3 = myExelSheet.getRow(3);
        HSSFRow rowExcel4 = myExelSheet.getRow(4);
        HSSFRow rowExcel5 = myExelSheet.getRow(5);

        switch (intAttrCorrIdentifyCode) {
            case 000000000:
                for (int i = 1; i <= myExelSheet.getLastRowNum(); i++) {
                    if (intAttrCorrAccountNo == Integer.valueOf(String.valueOf(rowExcel3.getCell(i)))) {
                        result =
                        return intAttrCorrAccountNo;
                        break;
                    }
                }
            case 14360570:


        }

    }
}

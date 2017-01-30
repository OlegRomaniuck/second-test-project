package property.tools;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class Tool_Tests_Data {
    public ArrayList<String> getTestData(String fileName) {
        String filePath = "tests/TEST_DATA/" + fileName;

        ArrayList<String> dataList = new ArrayList<String>();
        try {
            FileInputStream file = new FileInputStream(new File(filePath));

            //Iterate through each rows from first sheet number 0
            Iterator<Row> rowIterator = new HSSFWorkbook(file).getSheetAt(0).iterator();

            // Get Cell # 1 for each Row and put it to List
            while (rowIterator.hasNext()) {
                dataList.add(rowIterator.next().getCell(1).toString());
            }

            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    // DATA_Form_Login
    public ArrayList<String> get_DATA_Form_Login() {
        return getTestData("Data_Form_Login.xlsx");
    }

    // DATA_Form_Registration
    public ArrayList<String> get_DATA_Form_Registration() {
        return getTestData("Data_Form_Registration.xlsx");
    }

}

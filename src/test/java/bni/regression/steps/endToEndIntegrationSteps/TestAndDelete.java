package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.ReadPDFReader;
import bni.regression.libraries.common.ReadWriteExcel;
import bni.regression.libraries.db.DbConnect;
import cucumber.api.java.en.Given;

public class TestAndDelete {
    ReadWriteExcel readWriteExcel = new ReadWriteExcel();
    DbConnect dbConnect = new DbConnect();
    ReadPDFReader readPDFReader = new ReadPDFReader();
    @Given("test and delete")
    public void test_and_delete() throws Exception {
        //readWriteExcel.setExcelFile("src/test/resources/inputFiles/testInput.xlsx");
        //boolean setFlag = readWriteExcel.deleteCellData("src/test/resources/inputFiles/testInput.xlsx", "addVisitor", 0);
       // Integer recordcount = dbConnect.queryRecordCount("select * from bni.country;");
        String[][] sqlResult = dbConnect.queryAndRetrieveRecords("select * from bni.country;");
        for (int i = 0; i < 200; i++) {
            for(int j = 0; j < 5; j++) {
               System.out.println(sqlResult[i][j]);
            }
        }
        //System.out.println(count[0] + " and " + count[1]);
    }
}

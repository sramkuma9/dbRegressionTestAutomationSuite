package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.ReadWriteExcel;
import cucumber.api.java.en.Given;

public class TestAndDelete {
    ReadWriteExcel readWriteExcel = new ReadWriteExcel();
    @Given("test and delete")
    public void test_and_delete() throws Exception {
        readWriteExcel.setExcelFile("src/test/resources/inputFiles/testInput.xlsx");
        boolean setFlag = readWriteExcel.deleteCellData("src/test/resources/inputFiles/testInput.xlsx", "addVisitor", 0);
    }
}

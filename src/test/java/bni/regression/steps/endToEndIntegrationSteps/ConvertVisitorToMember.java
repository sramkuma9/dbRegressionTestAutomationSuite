package bni.regression.steps.endToEndIntegrationSteps;

import bni.regression.libraries.common.ReadWriteExcel;
import cucumber.api.java.en.Given;

public class ConvertVisitorToMember {
    ReadWriteExcel readWriteExcel = new ReadWriteExcel();

    @Given("test the convert visitor")
    public void test_the_convert_visitor() throws Exception{
        readWriteExcel.setExcelFile("/home/ajay/IdeaProjects/dbRegressionTestSuite/src/test/resources/inputFiles/testInput.xlsx");
        boolean setFlag = readWriteExcel.setCellData("/home/ajay/IdeaProjects/dbRegressionTestSuite/src/test/resources/inputFiles/testInput.xlsx","addVisitor", 1,2, "ajay.rsin@gmail.com");
        String emailId = readWriteExcel.getCellData("addVisitor", 1,2);
        System.out.println(emailId);
    }
}

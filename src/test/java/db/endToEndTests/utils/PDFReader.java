package db.endToEndTests.utils;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFReader {
    private String pdfText;
    private ReadPropertyFile readPropertyFile = new ReadPropertyFile();

    public String readPDF() throws IOException
    {
        PDDocument document = PDDocument.load(new File(readPropertyFile.loadAndReadPropertyFile("pdfFilePath")));
        if (!document.isEncrypted()) {
            PDFTextStripper stripper = new PDFTextStripper();
            pdfText = stripper.getText(document);
        }
        document.close();
        return pdfText;
    }
}
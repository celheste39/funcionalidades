package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;


    public class PDFTextExtractor {
        public static void main(String[] args) throws IOException {
            System.out.println(readParaFromPDF("Paz y Salvo.pdf",1, "01", "88"));
            //Enter FilePath, Page Number, StartsWith, EndsWith
        }
        public static String readParaFromPDF(String pdfPath, int pageNo, String strStartIndentifier, String strEndIdentifier) {
            String returnString = "";
            try {
                PDDocument document = PDDocument.load(new File(pdfPath));
                document.getClass();
                if (!document.isEncrypted()) {
                    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                    stripper.setSortByPosition(true);
                    PDFTextStripper tStripper = new PDFTextStripper();
                    tStripper.setStartPage(pageNo);
                    tStripper.setEndPage(pageNo);
                    String pdfFileInText = tStripper.getText(document);
                    String strStart = strStartIndentifier;
                    String strEnd = strEndIdentifier;
                    int startInddex = pdfFileInText.indexOf(strStart);
                    int endInddex = pdfFileInText.indexOf(strEnd);
                    returnString = pdfFileInText.substring(startInddex, endInddex) + strEnd;
                }
            } catch (Exception e) {
                returnString = "No ParaGraph Found";
            }
            return returnString;
        }
}

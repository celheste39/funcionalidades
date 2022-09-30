package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

import static org.example.PDFMk2.getPageCount;

//xpath //td[(text()='9' and (@class='othermonth')=false and(@class='othermonth selected')=false and(@class='othermonth today')=false and(@class='othermonth weekend')=false  )]


public class LeerPDF {
    public static void main(String[] args) {

        PDDocument pdDocument = null;
        try {

            pdDocument = PDDocument.load(new File("Paz y Salvo.pdf"));

            PDFTextStripper pdfStripper = new PDFTextStripper();

            pdfStripper.setStartPage(1);
            pdfStripper.setEndPage(5);
            String parsedText = pdfStripper.getText(pdDocument);



            int numberOfPages = getPageCount(pdDocument);

            System.out.println("The total number of pages "+numberOfPages);
            System.out.println(parsedText);



        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (pdDocument != null) {
                try {
                    pdDocument.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
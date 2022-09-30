package org.example;

import java.io.IOException;

public class AbrirDescarga {
    public static void main(String[] args) {
        String homePath = System.getProperty("user.home");
        String PATH_PDF = homePath + "\\Downloads\\";
        System.out.println("url:" + PATH_PDF);
        System.out.println(PATH_PDF + "myDocument.excel");
        System.out.println(PATH_PDF + "myDocument.pdf");

    }
}
package org.TextToPdf;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class TextToPDF{
	  public static void main(String arg[]){
		    try{
		      InputStreamReader in= new InputStreamReader(System.in);
		      BufferedReader bin= new BufferedReader(in);
		      System.out.println("Enter some text and press Enter key:");
		        String text=bin.readLine();
		        Document document = new Document(PageSize.A4, 36, 72, 108, 180);
		        PdfWriter.getInstance(document,new FileOutputStream("C:/Users/Dheeraj.Kumar/Desktop/pdfFile.pdf"));
		        document.open();
		        document.add(new Paragraph(text));
		        System.out.println("Text is inserted into pdf file");
		        document.close();
		    }catch(Exception e){}
		  }
		} 
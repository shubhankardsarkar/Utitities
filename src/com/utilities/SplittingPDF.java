package com.utilities;
import org.apache.pdfbox.multipdf.Splitter; 
import org.apache.pdfbox.pdmodel.PDDocument;  

import java.io.File; 
import java.io.IOException; 

import java.util.List; 
import java.util.Iterator;  

public class SplittingPDF { 
   public static void main(String[] args) throws IOException { 
      
      //Loading an existing PDF document 
      File file = new File("C:\\Users\\502565961\\Downloads\\MyFlat-SaleDeed.pdf"); 
      PDDocument doc = PDDocument.load(file); 

      //Instantiating Splitter class 
      Splitter splitter = new Splitter(); 
      
      //splitting the pages of a PDF document 
      List<PDDocument> Pages = splitter.split(doc); 

      //Creating an iterator 
      Iterator<PDDocument> iterator = Pages.listIterator();         

      //Saving each page as an individual document 
      int i = 1; 
      
      while(iterator.hasNext()){ 
         PDDocument pd = iterator.next(); 
         pd.save("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\"+ i++ +".pdf");             
      } 
      System.out.println("PDF splitted");     
   } 
}
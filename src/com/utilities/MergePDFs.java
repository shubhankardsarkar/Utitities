package com.utilities;
import org.apache.pdfbox.multipdf.PDFMergerUtility; 
import java.io.File; 
import java.io.IOException;
public class MergePDFs {
   public static void main(String[] args) throws IOException {
		  File file1 = new File("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\SaleDeed.pdf");
		  File file2 = new File("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\139.pdf");
		  File file3 = new File("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\140.pdf");
	      File file4 = new File("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\141.pdf");       
	      File file5 = new File("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\143.pdf");   
	      File file6 = new File("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\145.pdf");      
	      File file7 = new File("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\147.pdf");   
	      File file8 = new File("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\148.pdf");       
		
      
      
      //Instantiating PDFMergerUtility class
      PDFMergerUtility PDFmerger = new PDFMergerUtility();
		
      //Setting the destination file
      PDFmerger.setDestinationFileName("C:\\Users\\502565961\\Documents\\MyDocs\\MyFlat-SaleDeed\\SaleDeed-new.pdf");
		
      //adding the source files

      PDFmerger.addSource(file1);
      PDFmerger.addSource(file2);
      PDFmerger.addSource(file3);
      PDFmerger.addSource(file4);
      PDFmerger.addSource(file5);
      PDFmerger.addSource(file6);
      PDFmerger.addSource(file7);
      PDFmerger.addSource(file8);
      
      //Merging the two documents
      PDFmerger.mergeDocuments();
      System.out.println("Documents merged");
   }
}
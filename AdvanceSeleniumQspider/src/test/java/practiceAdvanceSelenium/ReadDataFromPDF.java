package practiceAdvanceSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadDataFromPDF {

	public static void main(String[] args) throws Throwable {
		
		File file = new File("./src/test/resources/Resume Banti kumar Naukri.pdf");
		PDDocument doc = PDDocument.load(file);
		int page = doc.getNumberOfPages();
		
		System.out.println(page);
		
		PDFTextStripper pdfData = new PDFTextStripper();
		String data = pdfData.getText(doc);
		System.out.println(data);
	}

}

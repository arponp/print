package print;

import java.net.URI;
import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
		try { 
			File testPDF = new File("test.pdf");
			URI uri = new URI("http://localhost:631/printers/Brother_MFC_J775DW");
			IppPrinter p = new IppPrinter(uri);
			p.printJob(testPDF);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

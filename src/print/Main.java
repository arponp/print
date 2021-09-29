package print;

import java.io.*;
import java.net.URI;


public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("test.pdf");
		URI destination = new URI("ipp://sunrise.intellinum.com/ipp/printer");
		boolean printStatus = printFile(file,destination);
		System.out.println(printStatus);
		
	}
	
	public static boolean printFile(File f, URI u) {
		return false;
	}

}

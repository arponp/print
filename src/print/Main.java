package print;

import java.io.File;
import java.net.URI;


public class Main {

	public static void main(String[] args) throws Exception {
		File f = new File("test.pdf");
		URI u = new URI("http://localhost:631/printers/Brother_MFC_J775DW");
		Print p  = new Print(f,u);
		p.print();
	}

}

package print;

import java.awt.Desktop;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("test.pdf");
		System.out.println(file);
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

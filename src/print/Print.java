package print;

import java.net.URI;
import java.io.File;
import java.io.IOException;

public class Print {
	private File file;
	private URI uri;
	
	public Print(File f, URI u) {
		file = f;
		uri = u;
	}
	
	// getters
	
	public File getFile() {
		return file;
	}
	
	public URI getURI() {
		return uri;
	}
	
	// setters
	
	public void setFile(File f) {
		file = f;
	}
	
	public void setURI(URI u) {
		uri = u;
	}
	
	// methods
	
	public boolean print() {
		try { 
			IppPrinter printer = new IppPrinter(uri);
			printer.printJob(file);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}

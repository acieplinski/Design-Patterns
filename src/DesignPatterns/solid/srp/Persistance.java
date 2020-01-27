package DesignPatterns.solid.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Persistance {

	public void saveToFile(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
		if (overwrite || new File(filename).exists()) {
			try (PrintStream out = new PrintStream(filename)) {
				out.println(journal.toString());
			}
		}
	}
}

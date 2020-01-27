package DesignPatterns.solid.srp;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		Journal j = new Journal();
		j.addEntry("I cried today");
		j.addEntry("I ate a bug");
		System.out.println(j);

		Persistance p = new Persistance();
		String filename = new File("journal.txt").getAbsolutePath();
		p.saveToFile(j, filename, true);
		Runtime.getRuntime().exec("notepad.exe " + filename);
	}
}

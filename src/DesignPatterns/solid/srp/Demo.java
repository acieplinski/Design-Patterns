package DesignPatterns.solid.srp;

public class Demo {

	public static void main(String[] args) {
		Journal j = new Journal();
		j.addEntry("I cried today");
		j.addEntry("I ate a bug");
		System.out.println(j);
	}
}

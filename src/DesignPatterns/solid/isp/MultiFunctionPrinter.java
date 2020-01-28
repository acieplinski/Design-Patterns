package DesignPatterns.solid.isp;

public class MultiFunctionPrinter implements Machine {

	private Printer printer;
	private Scanner scanner;

	public MultiFunctionPrinter(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}

	@Override
	public void print(Document d) {
		printer.print(d);
	}

	@Override
	public void scan(Document d) {
		scanner.scan(d);
	}
}

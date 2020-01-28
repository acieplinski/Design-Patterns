package DesignPatterns.solid.isp;

public class OldFashionedPrinter implements Machine {

	@Override
	public void print(Document d) {
		//
	}

	@Override
	public void fax(Document d) throws Exception {
		// what to do here?
		throw new Exception();
	}

	@Override
	public void scan(Document d) {
		// what to do here?
	}
}

package DesignPatterns.solid.lsp;

public class Square extends Rectangle {

	public Square(int size) {
		super();
		width = height = size;
	}

	public Square() {
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}
}

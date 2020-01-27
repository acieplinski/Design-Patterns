package DesignPatterns.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {
	public Stream<Product> filterByColor(List<Product> products, Color color) {
		return products.stream().filter(product -> product.getColor() == color);
	}

	public Stream<Product> filterBySize(List<Product> products, Size size) {
		return products.stream().filter(product -> product.getSize() == size);
	}

	public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {
		return products.stream().filter(product -> product.getSize() == size && product.getColor() == color);
	}
}

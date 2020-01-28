package DesignPatterns.solid.dip;

import java.util.List;

// high-level module
public class Research {
	public Research(RelationshipBrowser browser) {
		List<Person> children = browser.findAllChildrenOf("John");
		for (Person child : children) {
			System.out.println("John has a child called " + child.name);
		}
	}
}

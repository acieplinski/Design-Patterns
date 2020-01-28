package DesignPatterns.solid.dip;

import java.util.List;
import org.javatuples.Triplet;

// high-level module
public class Research {
	public Research(Relationships relationships) {
		List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
		relations
			.stream()
			.filter(x -> x.getValue0().name.equals("John") && x.getValue1() == Relationship.PARENT)
			.forEach(ch -> System.out.println("John has a child called " + ch.getValue2().name));
	}
}

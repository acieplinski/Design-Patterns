package DesignPatterns.solid.dip;

import java.util.ArrayList;
import java.util.List;
import org.javatuples.Triplet;

// low-level module - just keeps the data
public class Relationships {

	private List<Triplet<Person, Relationship, Person>> relations = new ArrayList<>();

	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}

	public void addParentAndChild(Person parent, Person child) {
		relations.add(new Triplet<>(parent, Relationship.PARENT, child));
		relations.add(new Triplet<>(child, Relationship.CHILD, parent));
	}
}

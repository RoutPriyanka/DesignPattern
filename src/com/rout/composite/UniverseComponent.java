package com.rout.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class UniverseComponent {

	public String getName() {
		throw new UnsupportedOperationException();
	}

	public String getType() {
		throw new UnsupportedOperationException();
	}

	public UniverseComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public void addChild(UniverseComponent universeComponent) {
		throw new UnsupportedOperationException();
	}

	public void removeChild(UniverseComponent universeComponent) {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}
}

class Star extends UniverseComponent {

	private String name;
	private String type;

	public Star(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public void print() {
		System.out.println(this.type + " = " + this.name);
	}
}

class StarCollection extends UniverseComponent {

	private String name;
	private String type;
	private List<UniverseComponent> universeComponents;

	public StarCollection(String name, String type) {
		this.name = name;
		this.type = type;
		this.universeComponents = new ArrayList<>();
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public UniverseComponent getChild(int i) {
		return universeComponents.get(i);
	}

	public void addChild(UniverseComponent component) {
		universeComponents.add(component);
	}

	public void removeChild(UniverseComponent component) {
		universeComponents.remove(component);
	}

	public void print() {
		System.out.println(this.type + " = " + this.name);
		for (UniverseComponent component : this.universeComponents) {
			component.print();
		}
	}
}


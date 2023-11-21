package com.rout.composite;

public class Main {
	public static void main(String[] args) {

		UniverseComponent universe = new StarCollection("The whole universe", "UNIVERSE");
		UniverseComponent milkway = new StarCollection("Milky way", "GALAXY");
		UniverseComponent andromeda = new StarCollection("Andromeda", "GALAXY");
		UniverseComponent canisMajor = new StarCollection("Canis Major", "CONSTELLATION");
		UniverseComponent sirius = new Star("Sirius", "STAR");
		UniverseComponent sun = new Star("Sun", "STAR");
		UniverseComponent mirach = new Star("Mirach", "STAR");
		UniverseComponent alpheratz = new Star("Alpheratz", "STAR");

		universe.addChild(milkway);
		universe.addChild(andromeda);
		milkway.addChild(canisMajor);
		canisMajor.addChild(sirius);
		milkway.addChild(sun);
		andromeda.addChild(mirach);
		andromeda.addChild(alpheratz);

		universe.print();
	}
}

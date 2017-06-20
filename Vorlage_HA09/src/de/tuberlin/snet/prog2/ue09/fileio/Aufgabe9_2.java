package de.tuberlin.snet.prog2.ue09.fileio;

import java.util.stream.Stream;

public class Aufgabe9_2 {
	public static void main(String[] args) {
		
		//Ursprung
//		Stream.of("d2", "a2", "b1", "b3", "c","a6")
//		.map(s -> {
//			System.out.println("map: "+s);
//			return s.toUpperCase();
//		}).filter(s -> {
//			System.out.println("filter: "+s);
//			return s.startsWith("A");
//		}).limit(2)
//		.forEach(s -> System.out.println("forEach: "+s));
		
		//Reihenfolge
		reihenfolge();
		
		
		//Sortieren
		sortieren();
	}
	
	public static void reihenfolge() {
		
		Stream.of("d2", "a2", "b1", "b3", "c","a6")
		.filter(s -> {
			System.out.println("filter: "+s);
			return s.startsWith("a");
		}).map(s -> {
			System.out.println("map: "+s);
			return s.toUpperCase();
		}).limit(2)
		.forEach(s -> System.out.println("forEach: "+s));
	}
	
	public static void sortieren() {
		
		Stream.of("d2", "a2", "b1", "b3", "c","a6")
		.sorted()
		.filter(s -> {
			System.out.println("filter: "+s);
			return s.startsWith("a");
		}).map(s -> {
			System.out.println("map: "+s);
			return s.toUpperCase();
		}).limit(2)
		.forEach(s -> System.out.println("forEach: "+s));
	}
}

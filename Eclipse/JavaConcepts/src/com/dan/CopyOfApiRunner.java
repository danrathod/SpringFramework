package com.dan;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
	public static void main(String[] args) {
		System.out.println("Test copyOf API");

		List<String> names = new ArrayList<String>();
		names.add("Dan");
		names.add("Kajal");
		names.add("Jonh");
		names.add("Virat");
//		names.add(null);
		

		CopyOfApiRunner cp = new CopyOfApiRunner();
		List<String> newNames = cp.testCopyOfMethod(names);
		names.add("Danny");
		System.out.println(names);
		System.out.println(newNames);

		//List.of method creates unmodifiable list using fix/know values
		List<String> names2 = List.of("Virat", "Virat", "Virat", "Virat");
		names2.add("Dan");
		System.out.println(names2);
	}

	private List<String> testCopyOfMethod(List<String> names) {
		//List.copyOf method creates unmodifiable list using dynamic list
		List<String> newNames = List.copyOf(names);
		return newNames;
	}
}

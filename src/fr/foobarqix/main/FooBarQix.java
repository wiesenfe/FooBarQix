package fr.foobarqix.main;

import java.util.stream.IntStream;

public class FooBarQix {

	public static void main(String[] args) {
		IFooBarQix fbq = new FooBarQixParam();
		IntStream
			.range(1, 101)
			.mapToObj(fbq::doFooBarQix)
			.forEach(System.out::println);
		}
}

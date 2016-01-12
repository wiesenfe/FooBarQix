package fr.foobarqix.main;

public interface IFooBarQix {
	
	/**
	 * <b>Apply the FooBarQix rule to a number.</b><br>
	 * 
	 * <br>
     *
	 *	- if the number is divisible by 3 or contains 3, replace 3 by "Foo"; <br>
	 *	- if the number is divisible by 5 or contains 5, replace 5 by "Bar"; <br>
	 *	- if the number is devisible by 7 or contains 7, replace 7 by "Qix". <br>
	 *	- Example: 1 2 FooFoo 4 BarBar Foo QixQix 8 Foo Bar<br>
	 *
	 *  <br>
	 *	
	 *	More details:<br>
	 *	
	 *	divisors have high precedence, ex: 51 -> FooBar<br>
	 *	the content is analysed in the order they appear, ex: 53 -> BarFoo<br>
	 *	13 contains 3 so we print "Foo"<br>
	 *	15 is divisible by 3 and 5 and contains 5, so we print “FooBarBar”<br>
	 *	33 contains 3 two times and is divisible by 3, so we print “FooFooFoo”<br>
	 * 
	 * 
	 * 
	 * @param number The number to fooBarQix
	 * @return The String representation of the number according to the rule
	 */
	public String doFooBarQix(int number);

}

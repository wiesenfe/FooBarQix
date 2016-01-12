package fr.foobarqix.main;

public class FooBarQixStraightForward implements IFooBarQix {

	@Override
	public String doFooBarQix(int number) {
		String result1 = "";		
		if ( number % 3 == 0 ) result1 += "Foo" ;
		if ( number % 5 == 0 ) result1 += "Bar" ;
		if ( number % 7 == 0 ) result1 += "Qix" ;		
		for ( char c : String.valueOf(number).toCharArray() ){
			if (c == '3'){
				result1 += "Foo";
			}
			else if ( c == '5'){
				result1 += "Bar";
			}
			else if ( c == '7'){
				result1 += "Qix";
			}			
		}		
		return result1.length() == 0 ? String.valueOf(number) : result1;
	}
}

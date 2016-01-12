package fr.foobarqix.main;


public class FooBarQixParam implements IFooBarQix {	
	private static String[]  MOTS = {"","","","Foo","","Bar","","Qix","",""};	
	private StringBuilder sb = new StringBuilder();
		
	@Override
	public String doFooBarQix(int number) {
		sb.setLength(0);		
		doDivision( number );
		doReplace( number );			
		return sb.length() == 0 ? String.valueOf(number) : sb.toString();
	}
	
	private void doReplace(int number){
		for ( char c : String.valueOf(number).toCharArray() ){
			for (  int i = 0 ; i < 10; i++ ){
				if ( !MOTS[i].isEmpty() && Character.getNumericValue(c) == i ) 
					sb.append( MOTS[i] );					
			}			
		}	
	}
	
	private void doDivision(int number){		
		for (  int i = 0 ; i < 10; i++ ){			
			if ( !MOTS[i].isEmpty() && number % i == 0 ) sb.append( MOTS[i] );
		}
	}
}

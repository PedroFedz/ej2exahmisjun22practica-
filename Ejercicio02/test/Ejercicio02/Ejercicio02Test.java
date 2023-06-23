package Ejercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Ejercicio02Test {
	
	
	@ParameterizedTest
	@CsvSource({
	    "31, 0, 1203, false",
	    "31, 13, 1203, false",
	    "0, 1, 1203, false",
	    "32, 1, 1203, false",
	    "12, 1, 1203, true",
	    "32, 1, 1203, false",
	    
	    "0, 3, 1203, false",
	    "32, 3, 1203, false",
	    "0, 5, 1203, false",
	    "32, 5, 1203, false",
	    "0, 7, 1203, false",
	    "32, 7, 1203, false",
	    "0, 8, 1203, false",
	    "32, 8, 1203, false",
	    "0, 10, 1203, false",
	    "32, 10, 1203, false",
	    "0, 12, 1203, false",
	    "32, 12, 1203, false",
	    
	    "0, 4, 1203, false",
	    "33, 4, 1203, false",
	    "0, 6, 1203, false",
	    "33, 6, 1203, false",
	    "0, 9, 1203, false",
	    "33, 9, 1203, false",
	    "0, 11, 1203, false",
	    "33, 11, 1203, false",
	    
	    
	    "29, 2, 1203, false",
	    "-1, 2, 1203, false"
	})
	void testTotal(int day, int month, int year, boolean esperado) {
		Ejercicio02 ej2 = new Ejercicio02();
		
		assertEquals(esperado, ej2.isDateCorrect(day, month, year));
	}
	

}

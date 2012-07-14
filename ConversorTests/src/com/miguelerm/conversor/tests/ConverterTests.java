package com.miguelerm.conversor.tests;

import com.miguelerm.conversor.Converter;
import com.miguelerm.conversor.models.Conversion;

import junit.framework.TestCase;

public class ConverterTests extends TestCase {

	public void test_Convert_WithNullConvertion_ThrowIllegalArgumentException() {
		
		//Arrange
		double value = 100;
		Conversion convertion = null;
		Exception exception = null;
		
		//Act
		try {
			Converter.Convert(convertion, value);
		} catch (IllegalArgumentException e) {
			exception = e;
		} catch (Exception e) {
			fail("Se esperaba un IAE pero ocurrio otro tipo de excepcion. " + e.toString());
		}
		
		//Assert
		assertNotNull(exception);
		assertEquals(exception.getMessage(), "El parámetro 'convertion' no puede ser nulo.");
	}
	
}

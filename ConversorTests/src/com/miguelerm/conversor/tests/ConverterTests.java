package com.miguelerm.conversor.tests;

import java.util.HashMap;
import java.util.Map;

import com.miguelerm.conversor.Converter;
import com.miguelerm.conversor.models.Conversion;
import com.miguelerm.conversor.models.MeasurementUnit;
import junit.framework.TestCase;

public class ConverterTests extends TestCase {

	private final Map<String, Conversion> conversions = new HashMap<String, Conversion>();
	
	protected void setUp() {

		
		MeasurementUnit kilometers = new MeasurementUnit("Kilometros");
		MeasurementUnit meters = new MeasurementUnit("Kilometros");
		
		this.conversions.put("metersToKilometers", new Conversion().from(meters).to(kilometers).use("x*1000"));
		
	}
	
	public void test_Convert_WithNullConversion_ThrowIllegalArgumentException() {
		
		//Arrange
		double value = 100;
		Conversion conversion = null;
		Exception exception = null;
		
		//Act
		try {
			Converter.Convert(conversion, value);
		} catch (IllegalArgumentException e) {
			exception = e;
		} catch (Exception e) {
			fail("Se esperaba un IAE pero ocurrio otro tipo de excepcion. " + e.toString());
		}
		
		//Assert
		assertNotNull(exception);
		assertEquals(exception.getMessage(), "El parámetro 'conversion' no puede ser nulo.");
	}
	
	public void test_Convert_OneKilometer_ReturnOneTousandMeters() {
		
		//Arrange
		double value = 1;
		Conversion conversion = this.conversions.get("metersToKilometers");
				
		//Act
		double result = Converter.Convert(conversion, value);
		
		//Assert
		assertEquals(1000, result);
		
	}
	
}

package com.miguelerm.conversor.models.tests;

import com.miguelerm.conversor.models.Conversion;
import com.miguelerm.conversor.models.MeasurementUnit;

import junit.framework.TestCase;

public class ConversionTests extends TestCase {

	public void test_FluentApi_SetSourceUnit() {
		
		//Arrange
		MeasurementUnit kilometers = new MeasurementUnit();
		
		//Act
		Conversion conversion = new Conversion().from(kilometers);
		
		//Assert
		assertSame(kilometers, conversion.getSourceUnit());
		
	}
	
	public void test_FluentApi_SetDestinationUnit() {
		
		//Arrange
		MeasurementUnit meters = new MeasurementUnit();
		
		//Act
		Conversion conversion = new Conversion().to(meters);
		
		//Assert
		assertSame(meters, conversion.getDestinationUnit());
		
	}
	
	public void test_FluentApi_SetFormula() {
		
		//Arrange
		String formula = "x*1000"; 
		
		//Act
		Conversion conversion = new Conversion().use(formula);
		
		//Assert
		assertEquals(formula, conversion.getFormula());
		
	}

	public void test_FluentApi_SetSourceAndDestinationUnit() {
		
		//Arrange
		MeasurementUnit kilometers = new MeasurementUnit();
		MeasurementUnit meters = new MeasurementUnit();
		String formula = "x*1000";
		
		//Act
		Conversion conversion = new Conversion().from(meters).to(kilometers).use(formula);
		
		//Assert
		assertSame(meters, conversion.getSourceUnit());
		assertSame(kilometers, conversion.getDestinationUnit());
		assertEquals(formula, conversion.getFormula());
		assertNotSame(conversion.getSourceUnit(), conversion.getDestinationUnit());
		
	}
	
}

package com.miguelerm.conversor;

import com.miguelerm.conversor.models.Conversion;

import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;


/** 
 * Clase que posee la habilidad de convertir valores en otras unidades de medida.
 *  
 * @author miguelerm
 *
 */
public class Converter {

	
	
	/**
	 * Convierte un valor de una unidad de medida a su equivalente en otra unidad
	 * de medida, en base a un sistema de conversión dado. 
	 * 
	 * @param conversion sistema de conversión que se utilizará.
	 * @param value      valor que se desea convertir a otra unidad de medida.
	 * @return           
	 */
	public static double Convert(Conversion conversion, double value)
	{
		
		if (conversion == null)
			throw new IllegalArgumentException("El parámetro 'conversion' no puede ser nulo.");
		
		String formula = conversion.getFormula(); 
		
		double result = 0;
		
		try {
			result = new ExpressionBuilder(formula).withVariable("x", value).build().calculate();
		} catch (UnknownFunctionException e) {
			result = 0;
		} catch (UnparsableExpressionException e) {
			result = 0;
		}
		
		return result;
		
	}
	
}

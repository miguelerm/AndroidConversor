package com.miguelerm.conversor;

import com.miguelerm.conversor.models.Conversion;


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
	 * @param convertion sistema de conversión que se utilizará.
	 * @param value      valor que se desea convertir a otra unidad de medida.
	 * @return           
	 */
	public static double Convert(Conversion convertion, double value)
	{
		
		if (convertion == null)
			throw new IllegalArgumentException("El parámetro 'convertion' no puede ser nulo.");
		
		
		
		return 0;
		
	}
	
}

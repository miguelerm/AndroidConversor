package com.miguelerm.conversor.models;

/**
 * Modelo que define la estructura de un sistema de conversion. 
 * 
 * @author miguelerm
 *
 */
public class Conversion {

	
	private int id;
	private MeasurementUnit sourceUnit;
	private MeasurementUnit destinationUnit;
	private String formula;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public MeasurementUnit getSourceUnit() {
		return sourceUnit;
	}
	
	public void setSourceUnit(MeasurementUnit sourceUnit) {
		this.sourceUnit = sourceUnit;
	}
	
	public MeasurementUnit getDestinationUnit() {
		return destinationUnit;
	}
	
	public void setDestinationUnit(MeasurementUnit destinationUnit) {
		this.destinationUnit = destinationUnit;
	}
	
	public String getFormula() {
		return formula;
	}
	
	public void setFormula(String formula) {
		this.formula = formula;
	}

	// *************************************************************
	// *                       Fluent Api                          *
	// *************************************************************
	
	/**
	 * FluentApi: Asigna un valor a la unidad de medida origen del sistema de conversión.
	 * 
	 * @param sourceUnit Unidad de medida que sera el origen del sistema de conversión.
	 * @return           Retorna la instancia que está siendo modificada.
	 */
	public Conversion from(MeasurementUnit sourceUnit) {
		this.setSourceUnit(sourceUnit);
		return this;
	}

	/**
	 * FlientApi: Asigna un valor a la unidad de medida destino del sistema de conversión.
	 * 
	 * @param destinationUnit Unidad de medida que será el destino del sistema de conversión.
	 * @return                Retorna la instancia que está siendo modificada.
	 */
	public Conversion to(MeasurementUnit destinationUnit) {
		this.setDestinationUnit(destinationUnit);
		return this;
	}

	/**
	 * FluentApi: Asigna un valor a la formula del sistema de conversión.
	 * 
	 * @param formula Cadena de caracteres que corresponde a la formula matemática.
	 * @return        Retorna la instancia que está siendo modificada.
	 */
	public Conversion use(String formula) {
		this.setFormula(formula);
		return this;
	}

	
}

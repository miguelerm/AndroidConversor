package com.miguelerm.conversor.models;


/**
 * Modelo que define la estructura de una unidad de medida.
 * 
 * @author miguelerm
 *
 */
public class MeasurementUnit {

	private int id;
	private String name;
	private MeasurementUnitType type;
	private boolean visible;
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public MeasurementUnitType getType() {
		return type;
	}
	
	public void setType(MeasurementUnitType type) {
		this.type = type;
	}	
	
}

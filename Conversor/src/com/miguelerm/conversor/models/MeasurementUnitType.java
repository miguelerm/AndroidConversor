package com.miguelerm.conversor.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Modelo que define el tipo de unidad de medida (longitud, temperatura, peso, etc.).
 * 
 * @author miguelerm
 *
 */
public class MeasurementUnitType {

	private int id;
	private String name;
	private ArrayList<MeasurementUnit> units;
	private boolean visible;
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public MeasurementUnitType() {
		this.units = new ArrayList<MeasurementUnit>();
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
	
	public List<MeasurementUnit> getUnits() {
		return Collections.unmodifiableList(this.units);
	}
	
}

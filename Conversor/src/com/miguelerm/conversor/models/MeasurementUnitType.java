package com.miguelerm.conversor.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Modelo que define el tipo de unidad de medida (longitud, temperatura, peso, etc.).
 * 
 * @author miguelerm
 *
 */
public class MeasurementUnitType {

	private int id;
	private String name;
	private Collection<MeasurementUnit> units;
	private boolean visible;
	
	
	
	public MeasurementUnitType(String name) {
		this.name = name;
		this.units = new ArrayList<MeasurementUnit>();
	}

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
	
	public Collection<MeasurementUnit> getUnits() {
		return Collections.unmodifiableCollection(this.units);
	}

	public void addMeasurementUnit(MeasurementUnit measurementUnit) {
		measurementUnit.setType(this);
		this.units.add(measurementUnit);
	}
	
	public MeasurementUnitType include(MeasurementUnit measurementUnit) {
		this.addMeasurementUnit(measurementUnit);
		return this;
	}
		
}

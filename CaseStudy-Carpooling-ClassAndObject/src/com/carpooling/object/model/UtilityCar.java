package com.carpooling.object.model;

public class UtilityCar extends Car {
	private boolean rearCoolingVents;

	public UtilityCar() {
	}

	public UtilityCar(long id, String name, boolean rearCoolingVents) {
		// super(id, name);
		this.rearCoolingVents = rearCoolingVents;
	}

	public boolean isRearCoolingVents() {
		return rearCoolingVents;
	}

	public void setRearCoolingVents(boolean rearCoolingVents) {
		this.rearCoolingVents = rearCoolingVents;
	}

	@Override
	public String toString() {
		return "UtilityCar [rearCoolingVents=" + rearCoolingVents + "]";
	}

}

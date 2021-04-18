package com.carpooling.object.model;

public class Sedan extends Car {
	private boolean absEnable;
	private int bootSpace;

	public Sedan() {
	}

	public Sedan(long id, String name, boolean absEnable, int bootSpace) {
		//super(id, name);
		this.absEnable = absEnable;
		this.bootSpace = bootSpace;
	}

	public boolean isAbsEnable() {
		return absEnable;
	}

	public void setAbsEnable(boolean absEnable) {
		this.absEnable = absEnable;
	}

	public int getBootSpace() {
		return bootSpace;
	}

	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}

	@Override
	public String toString() {
		return "Sedan [absEnable=" + absEnable + ", bootSpace=" + bootSpace + "]";
	}

}

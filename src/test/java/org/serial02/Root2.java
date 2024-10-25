package org.serial02;

import java.util.List;

public class Root2 {
	
	private String id;
	private String type;
	private String name;
	private double ppu;
	private Batters batter;
	private List<Topping>topping;
	
	public String getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public String getName() {
		return name;
	} 
	public double getPpu() {
		return ppu;
	}
	public Batters getBatter() {
		return batter;
	}
	public List<Topping> getTopping() {
		return topping;
	}
	public Root2(String id, String type, String name, double ppu, Batters batter, List<Topping> topping) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
		this.batter = batter;
		this.topping = topping;
	}
	
	
	
	
	

}

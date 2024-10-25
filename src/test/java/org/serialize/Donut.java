package org.serialize;

import java.util.List;

public class Donut {
	private String id;
	private String type;
	private String name;
	private double ppu;
	private Batters batters;
	private List<Topping> topping;

	// Constructor
	public Donut(String id, String type, String name, double ppu, Batters batters, List<Topping> topping) {
		this.id = id;
		this.type = type;
		this.name = name;
		this.ppu = ppu;
		this.batters = batters;
		this.topping = topping;
	}

	// Getters
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

	public Batters getBatters() {
		return batters;
	}

	public List<Topping> getTopping() {
		return topping;
	}
}

package org.deserialize;

import java.util.List;

public class Root2{
    private String id;
    private String type;
    private String name;
    private double ppu;
    private BatterWrapper batter; // Batter is wrapped inside an object
    private List<Topping> topping;

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPpu() {
        return ppu;
    }

    public void setPpu(double ppu) {
        this.ppu = ppu;
    }

    public BatterWrapper getBatter() {
        return batter;
    }

    public void setBatter(BatterWrapper batter) {
        this.batter = batter;
    }

    public List<Topping> getTopping() {
        return topping;
    }

    public void setTopping(List<Topping> topping) {
        this.topping = topping;
    }
}
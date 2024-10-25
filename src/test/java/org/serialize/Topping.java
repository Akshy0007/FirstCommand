package org.serialize;

public class Topping {
    private String id;
    private String type;

    // Constructor
    public Topping(String id, String type) {
        this.id = id;
        this.type = type;
    }

    // Getters
    public String getId() { return id; }
    public String getType() { return type; }
}

package org.serialize;

public class Batter {
    private String id;
    private String type;

    // Constructor
    public Batter(String id, String type) {
        this.id = id;
        this.type = type;
    }

    // Getters
    public String getId() { return id; }
    public String getType() { return type; }
}

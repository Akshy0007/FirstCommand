package org.serialize;

import java.util.List;

public class Batters  {
    private List<Batter> batter;

    // Constructor
    public Batters(List<Batter> batter) {
        this.batter = batter;
    }

    // Getters
    public List<Batter> getBatter() { return batter; }
}


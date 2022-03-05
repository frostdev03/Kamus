package com.frostdev.sukamus.model;

import java.io.Serializable;

public class ModelKamus implements Serializable {

    private int id;
    private String kata;
    private String deskripsi;

    public ModelKamus(String kata, String deskripsi) {
        this.kata = kata;
        this.deskripsi = deskripsi;
    }

    public int getId() {
        return id;
    }

    public String getKata() {
        return kata;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}

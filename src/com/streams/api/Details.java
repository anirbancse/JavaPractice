package com.streams.api;

import java.util.List;

public class Details {

    private List<String> parts;

    public Details(List<String> parts) {
        this.parts = parts;
    }


    @Override
    public String toString() {
        return "Details{" +
                "parts=" + parts +
                '}';
    }

    public List<String> getParts() {
        return parts;
    }
}

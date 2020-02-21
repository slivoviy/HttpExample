package com.example.httpexample.domain.user;

public class Geo {
    private final double lat;
    private final double lng;

    public Geo(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}

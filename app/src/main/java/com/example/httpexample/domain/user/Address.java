package com.example.httpexample.domain.user;

public class Address {
    private final String street;
    private final String suite;
    private final String city;
    private final String zipCode;
    private final Geo geo;

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Geo getGeo() {
        return geo;
    }

    public Address(String street, String suite, String city, String zipCode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipCode = zipCode;
        this.geo = geo;
    }
}

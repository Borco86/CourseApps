package com.example.rent.databinding;

/**
 * Created by RENT on 2017-02-22.
 */

public class AboutMe {

    private String name="Tomasz";
    private String surname = "Borejko";
    private String street = "Warszawska 1";
    private String zipCode = "00-000";
    private String city = "Warszawa";
    private String url = "http://paradoks.net.pl/image_files/text/28593/bf61f027dce5e4b28cc1f82cbe3076b0.jpg";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

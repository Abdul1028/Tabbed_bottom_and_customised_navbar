package com.example.assignment2;

public class Offers {
    private String offer_name;
    private String offer_type;
    private int offer_img;

    public Offers() {

    }

    public String getOffer_name() {
        return offer_name;
    }

    public void setOffer_name(String offer_name) {
        this.offer_name = offer_name;
    }

    public String getOffer_type() {
        return offer_type;
    }

    public void setOffer_type(String offer_type) {
        this.offer_type = offer_type;
    }

    public int getOffer_img() {
        return offer_img;
    }

    public void setOffer_img(int offer_img) {
        this.offer_img = offer_img;
    }

    public Offers(String offer_name, String offer_type, int offer_img) {
        this.offer_name = offer_name;
        this.offer_type = offer_type;
        this.offer_img = offer_img;

    }
}

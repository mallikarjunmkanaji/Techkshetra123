package com.techkshetrainfo.techkshetrainfo;

public class Client {

    private String name;
    private int photo;

    public Client() {

    }

    public Client(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    //Getter

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    //setter


    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

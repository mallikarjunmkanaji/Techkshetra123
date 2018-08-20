package com.techkshetrainfo.techkshetrainfo;

public class Service {

    private String sname;
    private int sphoto;

    public Service() {

    }

    public Service(String sname, int sphoto) {
        this.sname = sname;
        this.sphoto = sphoto;
    }

    //Getter


    public String getSname() {
        return sname;
    }

    public int getSphoto() {
        return sphoto;
    }

    //Setter


    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSphoto(int sphoto) {
        this.sphoto = sphoto;
    }
}

package com.hulukeji.forlife.Beans;

public class Course {
    private int imagine;
    private String information;

    public Course(int imagine,String information){
        setImagine(imagine);
        setInformation(information);
    }

    public int getImagine() {
        return imagine;
    }

    public void setImagine(int imagine) {
        this.imagine = imagine;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
    //private String src;
    //private int Cid;
}

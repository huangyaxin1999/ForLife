package com.hulukeji.forlife.Beans;

public class Video {
    private int imagine;
    private String information;
    //private String src;
    //private int Vid;




    public Video(int imagine, String information)
    {
        setImagine(imagine);
        setInformation(information);
        //setSrc(src);
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
/*
    public String getSrc() {
        return src;
    }
    public void setSrc(String src) {
        this.src = src;
    }
    public int getVid() {
        return Vid;
    }
    public void setVid(int vid) {
        Vid = vid;}

*/

}


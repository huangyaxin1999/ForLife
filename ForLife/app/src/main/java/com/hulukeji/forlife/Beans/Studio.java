package com.hulukeji.forlife.Beans;

public class Studio {
    //工作室自己的id
    //private int STDid;
    //关联的课程商店
    //private int shopid;
    // 关联的工作空间
    //private int workspceid;
    //关联的详细信息
   // private int ifmid;

    private int imagine;
    private String name;
    public Studio(int imagine,String name){
        setImagine(imagine);
        setName(name);
    }

    public int getImagine() {
        return imagine;
    }

    public void setImagine(int imagine) {
        this.imagine = imagine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

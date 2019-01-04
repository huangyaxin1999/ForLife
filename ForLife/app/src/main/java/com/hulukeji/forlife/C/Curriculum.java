package com.hulukeji.forlife.C;

import java.lang.Class;
import java.util.ArrayList;

public class Curriculum {
    private String curriculumName;
    private  int curriculumRank;
    private  Boolean isNew;
    private Boolean isBoutique;
    private int cpicture1;
    private int cpicture2;
    private int tpicture;
    private String tname;
    private String tBriefing;
    private String cBriefing;
    private ArrayList<Class> classes;
    private int classQuantity;
    private String difficulty;
    private ArrayList<Comment> comments;
    private int price;

    public Curriculum(String curriculumName, int cpicture2) {
        this.curriculumName = curriculumName;
        this.cpicture2 = cpicture2;
    }

    public Curriculum(int tpicture, String tname, String tBriefing, String cBriefing, int classQuantity, String difficulty) {
        this.tpicture = tpicture;
        this.tname = tname;
        this.tBriefing = tBriefing;
        this.cBriefing = cBriefing;
        this.classQuantity = classQuantity;
        this.difficulty = difficulty;
    }

    public Curriculum(String curriculumName, int curriculumRank, Boolean isNew, Boolean isBoutique, int cpicture1, int cpicture2, int tpicture, String tname, String tBriefing, String cBriefing, ArrayList<Class> classes, int classQuantity, String difficulty, ArrayList<Comment> comments, int price) {
        this.curriculumName = curriculumName;
        this.curriculumRank = curriculumRank;
        this.isNew = isNew;
        this.isBoutique = isBoutique;
        this.cpicture1 = cpicture1;
        this.cpicture2 = cpicture2;
        this.tpicture = tpicture;
        this.tname = tname;
        this.tBriefing = tBriefing;
        this.cBriefing = cBriefing;
        this.classes = classes;
        this.classQuantity = classQuantity;
        this.difficulty = difficulty;
        this.comments = comments;
        this.price = price;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }

    public int getCurriculumRank() {
        return curriculumRank;
    }

    public void setCurriculumRank(int curriculumRank) {
        this.curriculumRank = curriculumRank;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Boolean getBoutique() {
        return isBoutique;
    }

    public void setBoutique(Boolean boutique) {
        isBoutique = boutique;
    }

    public int getCpicture1() {
        return cpicture1;
    }

    public void setCpicture1(int cpicture1) {
        this.cpicture1 = cpicture1;
    }

    public int getCpicture2() {
        return cpicture2;
    }

    public void setCpicture2(int cpicture2) {
        this.cpicture2 = cpicture2;
    }

    public int getTpicture() {
        return tpicture;
    }

    public void setTpicture(int tpicture) {
        this.tpicture = tpicture;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String gettBriefing() {
        return tBriefing;
    }

    public void settBriefing(String tBriefing) {
        this.tBriefing = tBriefing;
    }

    public String getcBriefing() {
        return cBriefing;
    }

    public void setcBriefing(String cBriefing) {
        this.cBriefing = cBriefing;
    }

    public ArrayList getClasses() {
        return classes;
    }


    public int getClassQuantity() {
        return classQuantity;
    }

    public void setClassQuantity(int classQuantity) {
        this.classQuantity = classQuantity;
    }

    public ArrayList getComments() {
        return comments;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }
}

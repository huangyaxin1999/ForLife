package com.hulukeji.forlife.C;

import android.net.Uri;


public class Class {
    private Uri uri;
    private Boolean canTry;
    private String className;
    private String classTime;
    private int classPicture;

    public Class(Uri uri, Boolean canTry, String className, String classTime, int classPicture) {
        this.uri = uri;
        this.canTry = canTry;
        this.className = className;
        this.classTime = classTime;
        this.classPicture = classPicture;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public Boolean getCanTry() {
        return canTry;
    }

    public void setCanTry(Boolean canTry) {
        this.canTry = canTry;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public int getClassPicture() {
        return classPicture;
    }

    public void setClassPicture(int classPicture) {
        this.classPicture = classPicture;
    }
}

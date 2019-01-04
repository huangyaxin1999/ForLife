package com.hulukeji.forlife.C;

public class Work {
    private String workname;
    private int count;
    private  int workPicture;
    private Video video;

    public Work(String workname, int count, int workPicture) {
        this.workname = workname;
        this.count = count;
        this.workPicture = workPicture;
    }

    public Work(String workname, int count, int workPicture, Video video) {
        this.workname = workname;
        this.count = count;
        this.workPicture = workPicture;
        this.video = video;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWorkPicture() {
        return workPicture;
    }

    public void setWorkPicture(int workPicture) {
        this.workPicture = workPicture;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}

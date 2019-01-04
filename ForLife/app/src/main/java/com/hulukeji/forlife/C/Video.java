package com.hulukeji.forlife.C;

import java.nio.file.Path;
import java.util.ArrayList;

public class Video {
    private Path path;
    private int videoPicture;
    private String vBriefing;
    private User author;
    private Boolean isLoved;
    private ArrayList<Comment> comments;
    private ArrayList<Work> works;

    public Video(Path path, int videoPicture, String vBriefing, User author, Boolean isLoved, ArrayList<Comment> comments, ArrayList<Work> works) {
        this.path = path;
        this.videoPicture = videoPicture;
        this.vBriefing = vBriefing;
        this.author = author;
        this.isLoved = isLoved;
        this.comments = comments;
        this.works = works;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public int getVideoPicture() {
        return videoPicture;
    }

    public void setVideoPicture(int videoPicture) {
        this.videoPicture = videoPicture;
    }

    public String getvBriefing() {
        return vBriefing;
    }

    public void setvBriefing(String vBriefing) {
        this.vBriefing = vBriefing;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Boolean getLoved() {
        return isLoved;
    }

    public void setLoved(Boolean loved) {
        isLoved = loved;
    }

    public ArrayList getComments() {
        return comments;
    }

    public void setComments(ArrayList comments) {
        this.comments = comments;
    }

    public ArrayList getWorks() {
        return works;
    }

    public void setWorks(ArrayList works) {
        this.works = works;
    }
}

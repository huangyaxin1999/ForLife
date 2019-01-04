package com.hulukeji.forlife.C;

import java.util.ArrayList;

public class User {
    private final int userId;
    private int balance;
    private int head;
    private String userName;
    private int loceCount;
    private int fansCount;
    private int followCount;
    private boolean isFollowed;
    private ArrayList<Work> works;
    private ArrayList<Work> history;
    private String message;
    private ArrayList<Curriculum> classes;
    private ArrayList<User>follows;

    public User(int userId, int head, String userName) {
        this.userId = userId;
        this.head = head;
        this.userName = userName;
    }

    public User(int userId,int head, String userName, int loceCount, int fansCount, int followCount, boolean isFollowed, ArrayList<Work> works, String message) {
        this.userId=userId;
        this.head = head;
        this.userName = userName;
        this.loceCount = loceCount;
        this.fansCount = fansCount;
        this.followCount = followCount;
        this.isFollowed = isFollowed;
        this.works = works;
        this.message = message;
    }

    public User(int userId, int balance, int head, String userName, int loceCount, int fansCount, int followCount, boolean isFollowed, ArrayList<Work> works, ArrayList<Work> history, String message, ArrayList<Curriculum> classes, ArrayList<User> follows) {
        this.userId = userId;
        this.balance = balance;
        this.head = head;
        this.userName = userName;
        this.loceCount = loceCount;
        this.fansCount = fansCount;
        this.followCount = followCount;
        this.isFollowed = isFollowed;
        this.works = works;
        this.history = history;
        this.message = message;
        this.classes = classes;
        this.follows = follows;
    }

    public int getUserId() {
        return userId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getLoceCount() {
        return loceCount;
    }

    public void setLoceCount(int loceCount) {
        this.loceCount = loceCount;
    }

    public int getFansCount() {
        return fansCount;
    }

    public void setFansCount(int fansCount) {
        this.fansCount = fansCount;
    }

    public int getFollowCount() {
        return followCount;
    }

    public void setFollowCount(int followCount) {
        this.followCount = followCount;
    }

    public boolean isFollowed() {
        return isFollowed;
    }

    public void setFollowed(boolean followed) {
        isFollowed = followed;
    }

    public ArrayList getWorks() {
        return works;
    }


    public ArrayList getHistory() {
        return history;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList getClasses() {
        return classes;
    }


    public void setWorks(ArrayList<Work> works) {
        this.works = works;
    }

    public void setHistory(ArrayList<Work> history) {
        this.history = history;
    }

    public void setClasses(ArrayList<Curriculum> classes) {
        this.classes = classes;
    }

    public ArrayList<User> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<User> follows) {
        this.follows = follows;
    }
}

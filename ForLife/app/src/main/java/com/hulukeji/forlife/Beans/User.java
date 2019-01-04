package com.hulukeji.forlife.Beans;



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
    private String message;

    public User(int userId, int head, String userName) {
        this.userId = userId;
        this.head = head;
        this.userName = userName;
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

}


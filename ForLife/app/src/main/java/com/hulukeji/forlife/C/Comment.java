package com.hulukeji.forlife.C;

public class Comment {
    private User user;
    private String content;
    private int love;

    public Comment(User user, String content, int love) {
        this.user = user;
        this.content = content;
        this.love = love;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}

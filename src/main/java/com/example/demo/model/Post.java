package com.example.demo.model;

import java.util.Date;

public class Post {
    private final String text;
    private Integer likes=0;
    private Date creationDate;

    private Long id;

    public Post(Long id,String text,Date creationDate){
        this.id = id;
        this.text=text;
        this.creationDate = creationDate;
    }

    public Long getId() {return id;}

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes){this.likes=likes;}

    public Date getCreationDate() {return creationDate;}

    @Override
    public String toString() {
        return super.toString();
    }
}

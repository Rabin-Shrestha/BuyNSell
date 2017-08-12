package edu.mum.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by prasannabajracharya on 8/11/17.
 */
public class Comment {
    @Id
    private String id;
    private String content;
    private Date commentedOn;

    public Comment(){}

    public Comment(String content, Date commentedOn) {
        this.content = content;
        this.commentedOn = commentedOn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCommentedOn() {
        return commentedOn;
    }

    public void setCommentedOn(Date commentedOn) {
        this.commentedOn = commentedOn;
    }
}

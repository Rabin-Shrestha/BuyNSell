package edu.mum.domain;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by prasannabajracharya on 8/11/17.
 */
public class Post {
    @Id
    private String id;
    private String title;
    private String category;
    private Date postedOn;
    private String description;
    private String photoURL;
    private String userId;

    public Post() {
    }

    public Post(String title, String category, Date postedOn, String description, String photoURL) {
        this.title = title;
        this.category = category;
        this.postedOn = postedOn;
        this.description = description;
        this.photoURL = photoURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", postedOn=" + postedOn +
                ", description='" + description + '\'' +
                ", photoURL='" + photoURL + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}

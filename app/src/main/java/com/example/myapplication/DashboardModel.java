package com.example.myapplication;

public class DashboardModel {
    int profile_image, postImage;
    String userName, about, like, Comment, Share;

    public DashboardModel(int profile_image, int postImage, String userName, String about, String like, String comment, String share) {
        this.profile_image = profile_image;
        this.postImage = postImage;
        this.userName = userName;
        this.about = about;
        this.like = like;
        Comment = comment;
        Share = share;
    }

    public int getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(int profile_image) {
        this.profile_image = profile_image;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getShare() {
        return Share;
    }

    public void setShare(String share) {
        Share = share;
    }
}

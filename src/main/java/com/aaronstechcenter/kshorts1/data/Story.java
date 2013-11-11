/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aaronstechcenter.kshorts1.data;

/**
 *
 * @author aploetz
 */
public class Story {
    private Long storyID;
    private Long authorID;
    private String fileName;
    private Integer price;
    private String languageRating;
    private String adultContent;
    private String approvedFlag;
    private String firstLine;
    private String publishDate;
    private String uploadDate;
    private String title;
    private Integer pages;
    private Integer wordCount;
    private String category;
    private String mood;
    private Long publisherID;
    private Integer uploadFee;
    private String status;
    private String statusReason;

    public Long getStoryID() {
        return storyID;
    }

    public void setStoryID(Long storyID) {
        this.storyID = storyID;
    }

    public Long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Long authorID) {
        this.authorID = authorID;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getLanguageRating() {
        return languageRating;
    }

    public void setLanguageRating(String languageRating) {
        this.languageRating = languageRating;
    }

    public String getAdultContent() {
        return adultContent;
    }

    public void setAdultContent(String adultContent) {
        this.adultContent = adultContent;
    }

    public String getApprovedFlag() {
        return approvedFlag;
    }

    public void setApprovedFlag(String approvedFlag) {
        this.approvedFlag = approvedFlag;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Long getPublisherID() {
        return publisherID;
    }

    public void setPublisherID(Long publisherID) {
        this.publisherID = publisherID;
    }

    public Integer getUploadFee() {
        return uploadFee;
    }

    public void setUploadFee(Integer uploadFee) {
        this.uploadFee = uploadFee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }
}

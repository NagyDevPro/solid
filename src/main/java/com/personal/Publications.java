package com.personal;

public class Publications {

    private String title;
    private String author;
    private String publisher;
    private PublicationType type;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public PublicationType getType() {
        return type;
    }

    public void setType(PublicationType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void updatePrice(double price) {
        this.price = price;
    }


}

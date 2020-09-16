package com.company;

public class Book {
    private String author;
    private String name;
    private int year;
    private String publisher;
    private int length;
    public void SetAuthor(String a) {
        this.author=a;
    }
    public void SetName(String a) {
        this.name=a;
    }
    public void SetYear(int a) {
        this.year=a;
    }
    public void SetPublisher(String a) {
        this.publisher=a;
    }
    public void SetLength(int a) {
        this.length=a;
    }
    public String GetAuthor() {
        return author;
    }
    public String GetName() {
        return name;
    }
    public int GetYear() {
        return year;
    }
    public String GetPublisher() {
        return publisher;
    }
    public float SetLength() {
        return length;
    }
    public String ToStr() {
        return ("Author: "+author+", name: "+name+", year: "+year+", publisher: "+publisher+"length: "+
                length+" pages");
    }
}

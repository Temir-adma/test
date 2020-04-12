package com.example.anarbek.test;

public class Event {

    private final String name;
    private final String date;

    private String comment;

    public Event(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String  getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }
}

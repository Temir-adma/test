package com.example.anarbek.test;



public class Record {
    public String title;
    public String date;
    public int id;

    public static final String TYPE_DEF="unknown";
    public static final String TYPE_EVENT="event";
    public static final String TYPE_INFO="info";
    public  String type;

    public Record(String title, String date ) {
        this.title = title;
        this.date = date;

    }



}

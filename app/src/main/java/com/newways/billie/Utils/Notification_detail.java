package com.newways.billie.Utils;

public class Notification_detail {

    public Notification_detail(){

    }

    String title,date;

    public Notification_detail(String title, String date){
        this.title=title;
        this.date=date;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}

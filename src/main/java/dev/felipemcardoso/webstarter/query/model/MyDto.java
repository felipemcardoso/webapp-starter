package dev.felipemcardoso.webstarter.query.model;

import java.util.Date;

public class MyDto {

    private int id;

    private String field;

    private Date myDate;

    public MyDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Date getMyDate() {
        return myDate;
    }

    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }
}

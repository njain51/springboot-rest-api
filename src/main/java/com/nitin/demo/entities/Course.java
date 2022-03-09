package com.nitin.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course
{
    @Id
    private long id;

    private String title;
    private String Desc;

    public Course() {
        super();
    }

    public Course(long id, String title, String desc) {
        this.id = id;
        Desc = desc;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

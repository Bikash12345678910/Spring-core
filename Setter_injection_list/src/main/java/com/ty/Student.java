package com.ty;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<String>Subjectname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjectname() {
        return Subjectname;
    }

    public void setSubjectname(List<String> subjectname) {
        Subjectname = subjectname;
    }
}

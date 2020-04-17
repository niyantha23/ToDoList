package com.example.todolist;

public class ToDo {
    private int Id;
    private String work;
    private String dueDate;

    public ToDo(String work, String dueDate) {
        this.work = work;
        this.dueDate = dueDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}

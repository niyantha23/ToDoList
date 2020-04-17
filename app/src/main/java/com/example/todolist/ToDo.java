package com.example.todolist;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ToDo {


    @PrimaryKey(autoGenerate = true)
    private int Id;
    @ColumnInfo(name = "work")
    private String work;
    @ColumnInfo(name = "due_date")
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

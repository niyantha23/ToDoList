package com.example.todolist;
import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {ToDo.class},version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract  WorkDao workDao();
}

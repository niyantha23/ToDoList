package com.example.todolist;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
@Dao
public interface WorkDao {
@Query("SELECT * FROM todo")
    List<ToDo> getToDo();
@Insert
    void InsertAll(ToDo... toDos );

}

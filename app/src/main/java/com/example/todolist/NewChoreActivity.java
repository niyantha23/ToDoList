package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NewChoreActivity extends AppCompatActivity {
    EditText work,dueDate;
    FloatingActionButton newWorkAddButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_chore);
        work=findViewById(R.id.work);
        dueDate=findViewById(R.id.due_date);
        newWorkAddButton=findViewById(R.id.floatingActionButton);
        final AppDataBase dB= Room.databaseBuilder(getApplicationContext(),AppDataBase.class,"Production")
                .allowMainThreadQueries()
                .build();
        newWorkAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String workText=work.getText().toString();
                String dueDateText=dueDate.getText().toString();
                ToDo toDo=new ToDo(workText,dueDateText);
                      dB.workDao().InsertAll(toDo);
                      startActivity(new Intent(NewChoreActivity.this,MainActivity.class));
            }
        });
    }
    }

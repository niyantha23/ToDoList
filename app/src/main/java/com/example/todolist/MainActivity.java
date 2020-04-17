package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton add;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    ArrayList<ToDo> work;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        work=new ArrayList<ToDo>();
        for (int i = 0; i < 10; i++) {
            ToDo toDo=new ToDo("Take doggo for walk","Today");
            work.add(toDo);
        }

         recyclerView=findViewById(R.id.recycler_view);
         add = findViewById(R.id.fab);
         recyclerView.setLayoutManager(new LinearLayoutManager(this));
         adapter=new toDoAdapter(work);
         recyclerView.setAdapter(adapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NewChoreActivity.class));



            }


        });
    }


}
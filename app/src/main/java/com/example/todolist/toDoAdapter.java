package com.example.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import java.util.List;

class toDoAdapter extends RecyclerView.Adapter<toDoAdapter.ViewHolder>{

    private List<ToDo> work;

    public toDoAdapter(List<ToDo> work) {
        this.work = work;
    }
    @NonNull
    @Override
    public toDoAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.to_do_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull toDoAdapter.ViewHolder holder, int position) {

        holder.work.setText(work.get(position).getWork());
        holder.due.setText("Due:\t"+work.get(position).getDueDate());



    }
    @Override
    public int getItemCount() {
        return work.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView work,due;
        CheckBox check;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            work=itemView.findViewById(R.id.work);
            due=itemView.findViewById(R.id.due_date);
            check=itemView.findViewById(R.id.checkbox);

        }
    }
}

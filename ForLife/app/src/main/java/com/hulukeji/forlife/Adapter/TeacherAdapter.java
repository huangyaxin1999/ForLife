package com.hulukeji.forlife.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.hulukeji.forlife.Beans.User;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class TeacherAdapter extends RecyclerView.Adapter<TeacherAdapter.TeacherViewHolder> {
    private List<User> teachers = new ArrayList<>();
    private String[] information;
    private Context context;

    public TeacherAdapter(Context context, List<User> teachers,String[] information){
        this.context = context;
        this.teachers = teachers;
        this.information = information;
    }
    @NonNull
    @Override

    public TeacherAdapter.TeacherViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new
                TeacherViewHolder(LayoutInflater.from(context).inflate(R.layout.item_teacher,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull TeacherAdapter.TeacherViewHolder viewHolder, int i) {
        viewHolder.Teacher_informaion.setText(information[i]);
        viewHolder.imageView.setImageResource(teachers.get(i).getHead());
        viewHolder.Teacher_name.setText(teachers.get(i).getUserName());


    }

    @Override
    public int getItemCount() {
        return teachers.size();
    }


    class TeacherViewHolder extends RecyclerView.ViewHolder {
        private TextView Teacher_name;
        private ImageView imageView;
        private TextView Teacher_informaion;


        public TeacherViewHolder(@NonNull View itemView) {
            super(itemView);
            Teacher_name = itemView.findViewById(R.id.teacher_name);
            imageView = itemView.findViewById(R.id.teacher_cover);
            Teacher_informaion = itemView.findViewById(R.id.teacher_information);

        }
    }
}

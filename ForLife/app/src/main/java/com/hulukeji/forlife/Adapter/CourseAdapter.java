package com.hulukeji.forlife.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hulukeji.forlife.Beans.Course;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.courseViewHolder> {
    private List<Course> Courses = new ArrayList<>();
    private Context context;

    public CourseAdapter(Context context, List<Course> Courses){
        this.context = context;
        this.Courses = Courses;
    }
    @NonNull
    @Override

    public CourseAdapter.courseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new
                courseViewHolder(LayoutInflater.from(context).inflate(R.layout.item_course,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.courseViewHolder viewHolder, int i) {
           viewHolder.course_name.setText(Courses.get(i).getInformation());
           viewHolder.imageView.setImageResource(Courses.get(i).getImagine());



    }

    @Override
    public int getItemCount() {
        return Courses.size();
    }


     class courseViewHolder extends RecyclerView.ViewHolder {
        private TextView course_name;
        private ImageView imageView;
       // private TextView course_author;


         public courseViewHolder(@NonNull View itemView) {
             super(itemView);
             course_name = itemView.findViewById(R.id.course_name);
             //course_author = itemView.findViewById(R.id.course_author);
             imageView = itemView.findViewById(R.id.course_cover);
             //itemView.setBackground();

         }
     }
}

package com.hulukeji.forlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.*;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.hulukeji.forlife.Adapter.CourseAdapter;
import com.hulukeji.forlife.Beans.Course;
import com.hulukeji.forlife.Course.CourseActivity;
import com.hulukeji.forlife.Listener.MyItemOP;
import com.hulukeji.forlife.Studio.Studio_Activity;

import java.util.ArrayList;
import java.util.List;

public class AITFragment extends Fragment {
    private RecyclerView RVallteach;
    private CourseAdapter courseAdapter;
    //private GridLayoutManager gridLayoutManager;
    private LinearLayoutManager linearLayoutManager;
    private List<Course> courses= new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_course,container,false);
        //准备数据
        Course course1 = new Course(R.drawable.flare,"托马斯系列教程");
        Course course2 = new Course(R.drawable.cork,"踢月腿系列教程");
        Course course3 = new Course(R.drawable.corkspin,"踢月转体系列教程");
        Course course4 = new Course(R.drawable.uprocks1,"uprocks系列教程");
        courses.add(course1);courses.add(course2);courses.add(course3);courses.add(course4);
        //findView
        RVallteach = view.findViewById(R.id.course_recyclerview);
        courseAdapter = new CourseAdapter(view.getContext(),courses);
        //gridLayoutManager = new GridLayoutManager(view.getContext(),2);
        linearLayoutManager = new LinearLayoutManager(view.getContext());
        //setAdapter
        RVallteach.setLayoutManager(linearLayoutManager);
        RVallteach.setAdapter(courseAdapter);
        //绑定监听器
        MyItemOP op = new MyItemOP(view.getContext(), RVallteach, new MyItemOP.OnItemClickListener() {
            @Override
            protected void onItemClick(View view, int position) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(),CourseActivity.class);
                startActivity(intent);
            }

            @Override
            protected void onItemLongClick(View view, int position) {

            }
        });
        //添加此监听器
        RVallteach.addOnItemTouchListener(op);



        return view;
    }
}

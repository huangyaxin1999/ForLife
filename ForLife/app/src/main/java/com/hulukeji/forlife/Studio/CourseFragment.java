package com.hulukeji.forlife.Studio;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.hulukeji.forlife.Adapter.CourseAdapter;
import com.hulukeji.forlife.Beans.Course;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class CourseFragment extends Fragment {
        private TextView bigtitle;
        private List<Course> courses = new ArrayList<>();
        private RecyclerView RVcourse;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_course,container,false);
        //准备数据
        Course course1 = new Course(R.drawable.flare,"托马斯系列教程");
        Course course2 = new Course(R.drawable.cork,"踢月腿系列教程");
        Course course3 = new Course(R.drawable.corkspin,"踢月转体系列教程");
        Course course4 = new Course(R.drawable.uprocks1,"uprocks系列教程");
        courses.add(course1);courses.add(course2);courses.add(course3);courses.add(course4);
        //findView
        bigtitle = view.findViewById(R.id.course_title);
        RVcourse = view.findViewById(R.id.course_recyclerview);
        CourseAdapter thisAdapter = new CourseAdapter(view.getContext(),courses);
        LinearLayoutManager thisManager = new LinearLayoutManager(view.getContext());
        //set
        bigtitle.setText("Forlife舞蹈工作室课程列表");
        RVcourse.setLayoutManager(thisManager);
        RVcourse.setAdapter(thisAdapter);



        return view;
    }
}

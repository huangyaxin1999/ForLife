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

import com.hulukeji.forlife.Adapter.TeacherAdapter;
import com.hulukeji.forlife.Beans.User;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class InformationFragment extends Fragment {
    private List<User> teachers = new ArrayList<>();
    private RecyclerView RVinformation;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_information,container,false);
        //准备数据
        User teacher1 = new User(1,R.drawable.liuyuhao,"刘宇豪");
        User teacher2 = new User(2,R.drawable.liuyuhao,"刘宇豪2号");
        User teacher3 = new User(3,R.drawable.liuyuhao,"刘宇豪3号");
        User teacher4 = new User(4,R.drawable.liuyuhao,"刘宇豪4号");
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);
        String[] information = {"一轮游实力导师","垃圾一个","跳了两年狗屁不会","舞蹈历程描述"};
        //findView
        RVinformation = view.findViewById(R.id.rv_information);
        LinearLayoutManager thismanager = new LinearLayoutManager(view.getContext());
        TeacherAdapter thisadapter = new TeacherAdapter(view.getContext(),teachers,information);
        //set
        RVinformation.setLayoutManager(thismanager);
        RVinformation.setAdapter(thisadapter);


        return view;
    }
}

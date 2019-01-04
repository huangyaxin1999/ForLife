package com.hulukeji.forlife;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.hulukeji.forlife.Adapter.HomePageAdapter;
import com.hulukeji.forlife.Listener.MyItemOP;
import com.hulukeji.forlife.Studio.Studio_Activity;

import java.util.ArrayList;
import java.util.List;

public class HomePageFragment extends Fragment {
    private RecyclerView RVhome;
    private HomePageAdapter HPadapter;
    private LinearLayoutManager HPllmanager;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_page,container,false);
        //准备数据
        List<String> list = new ArrayList<>();
        String s1 = "ForLife工作室";
        String s2 = "ForLife工作室";
        String s3 = "ForLife工作室";
        String s4 = "ForLife工作室";
        String s5 = "ForLife工作室";
        String s6 = "ForLife工作室";
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);




        RVhome = view.findViewById(R.id.news_recyclerview);
        HPllmanager = new LinearLayoutManager(view.getContext());
        HPadapter = new HomePageAdapter(view.getContext(),list);

        RVhome.setLayoutManager(HPllmanager);
        RVhome.setAdapter(HPadapter);


        //绑定监听器
        MyItemOP op = new MyItemOP(view.getContext(), RVhome, new MyItemOP.OnItemClickListener() {
            @Override
            protected void onItemClick(View view, int position) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(),Studio_Activity.class);
                startActivity(intent);
            }

            @Override
            protected void onItemLongClick(View view, int position) {

            }
        });
        //添加此监听器
        RVhome.addOnItemTouchListener(op);



        return view;
    }

}
package com.hulukeji.forlife;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.*;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hulukeji.forlife.Adapter.CourseAdapter;
import com.hulukeji.forlife.Adapter.ProjiectAdapter;
import com.hulukeji.forlife.Adapter.VideoAdapter;
import com.hulukeji.forlife.Beans.Course;
import com.hulukeji.forlife.Beans.Video;

import java.util.ArrayList;
import java.util.List;

public class ProjiectFragment extends Fragment {
    private RecyclerView RVprojiect;
    private List<Video> videos = new ArrayList<>();
   


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_projiect,container,false);
        //准备数据


        Video video1 = new Video(R.drawable.flare,"托马斯");
        Video video2 = new Video(R.drawable.cork,"踢月腿");
        Video video3 = new Video(R.drawable.corkspin,"踢月转体");
        Video video4 = new Video(R.drawable.uprocks1,"uprocks");
        videos.add(video1);
        videos.add(video2);
        videos.add(video3);
        videos.add(video4);

        //findView
        RVprojiect = view.findViewById(R.id.rv_pro);
        

        //set
        //RVprojiect.setLayoutManager(new GridLayoutManager(getContext(),2));
        //RVprojiect.setAdapter(new ProjiectAdapter(getContext(),videos));
        RVprojiect.setLayoutManager(new GridLayoutManager(view.getContext(),2));
        RVprojiect.setAdapter(new VideoAdapter(view.getContext(),videos));




        return view;
    }
}

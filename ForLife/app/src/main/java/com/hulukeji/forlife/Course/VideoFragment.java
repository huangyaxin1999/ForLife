package com.hulukeji.forlife.Course;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;

import com.hulukeji.forlife.Adapter.VideoAdapter;
import com.hulukeji.forlife.Beans.Video;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class VideoFragment extends Fragment {
    private List<Video> videosv = new ArrayList<>();
    private RecyclerView RVideo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_video,null);
        //准备数据
        Video video1 = new Video(R.drawable.flare,"托马斯");
        Video video2 = new Video(R.drawable.cork,"踢月腿");
        Video video3 = new Video(R.drawable.corkspin,"踢月转体");
        Video video4 = new Video(R.drawable.uprocks1,"uprocks");
        videosv.add(video1);videosv.add(video2);videosv.add(video3);videosv.add(video4);
        //findView
        RVideo = view.findViewById(R.id.rvideo);
        VideoAdapter myadapter = new VideoAdapter(view.getContext(),videosv);
        GridLayoutManager mylayoutmannager = new GridLayoutManager(view.getContext(),2);
        //set
        RVideo.setLayoutManager(mylayoutmannager);
        RVideo.setAdapter(myadapter);



        return view;
    }
}

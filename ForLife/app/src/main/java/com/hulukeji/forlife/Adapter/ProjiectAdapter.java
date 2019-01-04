package com.hulukeji.forlife.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hulukeji.forlife.Beans.Video;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class ProjiectAdapter extends RecyclerView.Adapter<ProjiectAdapter.prjiectViewHolder> {
    private List<Video> videos = new ArrayList<>();
    private Context context;

    public ProjiectAdapter(Context context, List<Video> video){
        this.context = context;
        this.videos = video;
    }
    @NonNull
    @Override

    public ProjiectAdapter.prjiectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new
                prjiectViewHolder(LayoutInflater.from(context).inflate(R.layout.item_video,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProjiectAdapter.prjiectViewHolder viewHolder, int i) {
        viewHolder.videoname.setText(videos.get(i).getInformation());
        viewHolder.cover.setImageResource(videos.get(i).getImagine());



    }

    @Override
    public int getItemCount() {
        return videos.size();
    }


    class prjiectViewHolder extends RecyclerView.ViewHolder {
        private TextView videoname;
        private ImageView cover;


        public prjiectViewHolder(@NonNull View itemView) {
            super(itemView);
            videoname = itemView.findViewById(R.id.video_name);
            cover = itemView.findViewById(R.id.video_cover);

        }
    }
}

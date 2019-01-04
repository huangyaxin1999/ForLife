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

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {
    private List<Video> Videos = new ArrayList<>();
    private Context context;

    public VideoAdapter(Context context, List<Video> Videos){
        this.context = context;
        this.Videos = Videos;
    }
    @NonNull
    @Override

    public VideoAdapter.VideoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new
                VideoViewHolder(LayoutInflater.from(context).inflate(R.layout.item_video,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VideoAdapter.VideoViewHolder viewHolder, int i) {
        viewHolder.Video_name.setText(Videos.get(i).getInformation());
        viewHolder.imageView.setImageResource(Videos.get(i).getImagine());



    }

    @Override
    public int getItemCount() {
        return Videos.size();
    }


    class VideoViewHolder extends RecyclerView.ViewHolder {
        private TextView Video_name;
        private ImageView imageView;
        // private TextView Video_author;


        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            Video_name = itemView.findViewById(R.id.video_name);
            //Video_author = itemView.findViewById(R.id.Video_author);
            imageView = itemView.findViewById(R.id.video_cover);
            //itemView.setBackground();

        }
    }
}

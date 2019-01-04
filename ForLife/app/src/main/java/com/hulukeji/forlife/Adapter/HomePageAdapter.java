package com.hulukeji.forlife.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hulukeji.forlife.R;

import java.util.List;

public class HomePageAdapter extends RecyclerView.Adapter<HomePageAdapter.HpViewHolder> {
    private Context mContext;
    private List<String> list;

    public HomePageAdapter(Context context,List<String> list){
        this.mContext = context;
        this.list = list;
    }
    @NonNull
    @Override
    public HomePageAdapter.HpViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return
                new HpViewHolder(LayoutInflater.
                        from(mContext).inflate(R.layout.item_studio,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomePageAdapter.HpViewHolder viewHolder, int i) {
        viewHolder.textView.setText(list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class HpViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;

        public HpViewHolder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.studio_name);

        }
    }
}

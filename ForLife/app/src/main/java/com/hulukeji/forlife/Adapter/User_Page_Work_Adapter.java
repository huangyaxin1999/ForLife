package com.hulukeji.forlife.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.hulukeji.forlife.C.Work;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class User_Page_Work_Adapter extends BaseAdapter {
    private Context context;
    private int itemLayout;
    private List<Work> works = new ArrayList<Work>();

    public User_Page_Work_Adapter(Context context, int itemLayout, List<Work> works) {
        this.context = context;
        this.itemLayout = itemLayout;
        this.works = works;
    }

    @Override
    public int getCount() {
        return works.size();
    }

    @Override
    public Object getItem(int position) {
        return works.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (null == convertView){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(itemLayout,null);
        }

        ImageView workPicture=convertView.findViewById(R.id.workPicture_user_page_work);
        TextView workname=convertView.findViewById(R.id.workname_user_page_work);
        TextView count=convertView.findViewById(R.id.count_user_page_work);
        workPicture.setImageResource(works.get(position).getWorkPicture());
        workname.setText(works.get(position).getWorkname());
        count.setText(works.get(position).getCount()+"");

        return convertView;
    }
}

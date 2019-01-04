package com.hulukeji.forlife.Adapter;



import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.hulukeji.forlife.Beans.Comment;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class CommentAdapter extends BaseAdapter {
    private Context context;
    private int itemLayout;
    private List<Comment> comments = new ArrayList<Comment>();
    private Boolean isloved=false;

    public CommentAdapter() {
    }

    public CommentAdapter(Context context, int itemLayout, List<Comment> comments) {
        this.context = context;
        this.itemLayout = itemLayout;
        this.comments = comments;
    }
    @Override
    public int getCount() {
        return comments.size();
    }

    @Override
    public Object getItem(int position) {
        return comments.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (null == convertView){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(itemLayout,null);
        }
        TextView textView1=convertView.findViewById(R.id.t1_comment_fragment_item);
        TextView textView2=convertView.findViewById(R.id.t2_comment_fragment_item);
        TextView textView3=convertView.findViewById(R.id.t3_comment_fragment_item);
        ImageView imageView=convertView.findViewById(R.id.i_comment_fragment_item);
        textView1.setText(comments.get(position).getUser().getUserName());
        textView2.setText(comments.get(position).getContent());
        textView3.setText(comments.get(position).getLove()+"");
        imageView.setBackgroundResource(R.drawable.zero);
        //imageView.setImageResource(comments.get(position).getUser().getHead());

        final ImageView imageView2=convertView.findViewById(R.id.i2_comment_fragment_item);
        imageView2.setImageResource(R.drawable.dianzan1);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isloved){
                    int love2=comments.get(position).getLove();
                    love2++;
                    comments.get(position).setLove(love2);
                    imageView2.setImageResource(R.drawable.dianzan1);
                    isloved=true;
                }
                else {
                    int love2=comments.get(position).getLove();
                    love2--;
                    comments.get(position).setLove(love2);
                    imageView2.setImageResource(R.drawable.dianzan2);
                    isloved=false;
                }
                notifyDataSetChanged();
            }
        });
        return convertView;
    }
}

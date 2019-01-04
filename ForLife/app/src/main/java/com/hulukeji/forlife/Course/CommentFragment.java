package com.hulukeji.forlife.Course;

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
import android.widget.LinearLayout;
import android.widget.ListView;

import com.hulukeji.forlife.Adapter.CommentAdapter;
import com.hulukeji.forlife.Beans.Comment;
import com.hulukeji.forlife.Beans.User;
import com.hulukeji.forlife.R;

import java.util.ArrayList;
import java.util.List;

public class CommentFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_comment,null);

        User user=new User(0,R.color.colorAccent,"课时");
        ArrayList<Comment>comments=new ArrayList<Comment>();
        Comment comment1=new Comment(user,"课时介绍1",5);
        Comment comment2=new Comment(user,"课时介绍2",9);
        Comment comment3=new Comment(user,"课时介绍3",7);
        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);

        ListView listView=view.findViewById(R.id.lv_comment_fragment);
        CommentAdapter comment_fragment_adapter=new CommentAdapter(this.getContext(),
                R.layout.item_comment,
                comments
        );
        listView.setAdapter(comment_fragment_adapter);


        return view;
    }
}

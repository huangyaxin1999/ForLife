package com.hulukeji.forlife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import com.hulukeji.forlife.Adapter.User_Page_Work_Adapter;
import com.hulukeji.forlife.C.User;
import com.hulukeji.forlife.C.Work;

import java.util.ArrayList;

public class UserPageActivity extends AppCompatActivity {

    private User user;
    private  Button love;
    private TextView fansCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_page);

        ArrayList<Work>workArrayList=new ArrayList<Work>();
        Work work1=new Work("作品一",0,R.drawable.cork);
        Work work2=new Work("作品二",5,R.drawable.flare);
        Work work3=new Work("作品三",90,R.drawable.cork);
        Work work4=new Work("作品四",5,R.drawable.flare);
        workArrayList.add(work1);
        workArrayList.add(work2);
        workArrayList.add(work3);
        workArrayList.add(work4);

        user=new User(0,R.color.colorPrimaryDark,"用户名",5,6,7,false,workArrayList,"用户个人简介");
        love=findViewById(R.id.love_user_page);
        fansCount=findViewById(R.id.fansCount_user_page);
        ImageView userPicture=findViewById(R.id.userPicture_user_page);
        TextView loveCount=findViewById(R.id.loveCount_user_page);
        TextView followCount=findViewById(R.id.followCount_user_page);
        TextView username=findViewById(R.id.username_user_page);
        TextView userMassage=findViewById(R.id.userMassage_user_page);
        TextView workCount=findViewById(R.id.workCount_user_page);
        ListView works=findViewById(R.id.works_user_page);

        //userPicture.setImageResource(user.getHead());
        userPicture.setBackgroundResource(R.drawable.liuyuhao);
        loveCount.setText(user.getLoceCount()+"");
        fansCount.setText(user.getFansCount()+"");
        followCount.setText(user.getFollowCount()+"");
        username.setText(user.getUserName());
        userMassage.setText(user.getMessage());
        workCount.setText(user.getWorks().size()+"");

        love.setBackgroundResource(R.color.colorPrimary);
        if (user.isFollowed()){
            love.setBackgroundResource(R.color.colorAccent);
        }
        else {love.setBackgroundResource(R.color.colorPrimary);}


        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int fans=user.getFansCount();
                Log.e("fans",fans+"");
                if (!user.isFollowed()){
                    love.setBackgroundResource(R.color.colorAccent);
                    user.setFollowed(true);
                    fans++;
                    user.setFansCount(fans);
                }
                else {
                    love.setBackgroundResource(R.color.colorPrimary);
                    user.setFollowed(false);
                    fans--;
                    user.setFansCount(fans);
                }
                TextView loveCount=findViewById(R.id.loveCount_user_page);
                loveCount.setText(fans+"");
            }
        });

        LinearLayout worklist=findViewById(R.id.worklist_user_page);
        ViewGroup.LayoutParams params=worklist.getLayoutParams();
        int a=user.getWorks().size()*300;
        params.height=a;

        User_Page_Work_Adapter user_page_work_adapter=new User_Page_Work_Adapter(
                this,
                R.layout.user_page_work,
                user.getWorks()
        );
        works.setAdapter(user_page_work_adapter);

        works.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}

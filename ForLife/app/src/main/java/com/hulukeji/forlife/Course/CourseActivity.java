package com.hulukeji.forlife.Course;

import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.hulukeji.forlife.AITFragment;
import com.hulukeji.forlife.Beans.Course;
import com.hulukeji.forlife.HomePageFragment;
import com.hulukeji.forlife.MineFragment;
import com.hulukeji.forlife.ProjiectFragment;
import com.hulukeji.forlife.R;

public class CourseActivity extends AppCompatActivity {
    private Course course;
    private String mFragmentTags[] = {"介绍","视频列表","评论"};
    private Class mFragment[] =
            {DirectionFragment.class,VideoFragment.class,CommentFragment.class};
    private FragmentTabHost myTabhost;

    private void initTabHost(){
        //获取FragmentTabHost对象
        myTabhost = findViewById(android.R.id.tabhost);
        //初始化
        myTabhost.setup(this,getSupportFragmentManager(),android.R.id.tabhost);
        //去掉划线
        myTabhost.getTabWidget().setDividerDrawable(null);
        //创建选项卡并添加
        for(int i=0;i<mFragment.length;i++){
            // 对Tab按钮添加标记和图片，getTextView(i)方法是获取了一个标签项
            TabHost.TabSpec tabSpec = myTabhost
                    .newTabSpec(mFragmentTags[i]).setIndicator(mFragmentTags[i]);
            // 添加Fragment
            myTabhost.addTab(tabSpec, mFragment[i], null);

        }
        myTabhost.setCurrentTab(0);

    }




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        course = new Course(R.drawable.flare,"托马斯系列教程");
        //findView
        ImageView imageView=findViewById(R.id.courseac_cover);
        TextView textView=findViewById(R.id.courseac_name);
        //set
        imageView.setImageResource(course.getImagine());
        textView.setText(course.getInformation());

        initTabHost();


    }
}

package com.hulukeji.forlife;

import android.os.Build;
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

public class MainActivity extends AppCompatActivity {
    private int[] mImages = {R.drawable.sy,R.drawable.kc,R.drawable.zp,R.drawable.me};
    private String mFragmentTags[] = {"首页","教学","交流","我的"};
    private Class mFragment[] =
            {HomePageFragment.class,AITFragment.class,ProjiectFragment.class,MineFragment.class};
    private FragmentTabHost myTabhost;




    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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
                    .newTabSpec(mFragmentTags[i]).setIndicator(getTextView(i));
            // 添加Fragment
            myTabhost.addTab(tabSpec, mFragment[i], null);

        }
        myTabhost.setCurrentTab(0);

    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private View getTextView(int index){
        View view = getLayoutInflater().inflate(R.layout.item_tab, null);
        TextView textView = view.findViewById(R.id.txt_tab_pic);
        ImageView imageView = view.findViewById(R.id.tab_imagine);
        textView.setText(mFragmentTags[index]);
        imageView.setImageResource(mImages[index]);

        return view;
    }



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTabHost();
        myTabhost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Toast.makeText(getApplicationContext(),tabId,Toast.LENGTH_SHORT).show();
                System.out.println("FFFFFuck");
            }
        });
    }

}

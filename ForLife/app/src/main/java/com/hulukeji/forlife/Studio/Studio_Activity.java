package com.hulukeji.forlife.Studio;

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

import com.hulukeji.forlife.AITFragment;
import com.hulukeji.forlife.HomePageFragment;
import com.hulukeji.forlife.MineFragment;
import com.hulukeji.forlife.ProjiectFragment;
import com.hulukeji.forlife.R;

public class Studio_Activity extends AppCompatActivity {

    private int[] mImages = {R.drawable.kc,R.drawable.zp,R.drawable.me};
    private String mFragmentTags[] = {"教学","作品","信息"};
    private Class mFragment[] =
            {CourseFragment.class, com.hulukeji.forlife.Studio.ProjiectFragment.class,InformationFragment.class};
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
                Log.e("sxwwcqwcwqcqwcqw", "onItemClick: cwwcewcwecwe");
                System.out.println("cdscadcavvFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFuck");
            }
        });
    }
}

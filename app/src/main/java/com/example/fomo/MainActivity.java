package com.example.fomo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    ImageView imv1,imv2,imv3,imv4,imv5;
    TextView centertext1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setAttributes(attrs);

        imv1=(ImageView)findViewById(R.id.imv1);
        imv2=(ImageView)findViewById(R.id.imv2);
        imv3=(ImageView)findViewById(R.id.imv3);
        imv4=(ImageView)findViewById(R.id.imv4);
        imv5=(ImageView)findViewById(R.id.imv5);
        centertext1=(TextView)findViewById(R.id.centertext1);



//        viewPager = (ViewPager) findViewById(R.id.viewPager);
//        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
//        adapter = new TabAdapter(getSupportFragmentManager());
//        adapter.addFragment(new Tab1Fragment(), "Tab 1");
//        adapter.addFragment(new Tab2Fragment(), "Tab 2");
//        adapter.addFragment(new Tab3Fragment(), "Tab 3");
//        viewPager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(viewPager);
    }

    public void changeview1(View v){
        imv1.setImageResource(R.drawable.ic_home_on);
//        Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_LONG).show();
        imv2.setImageResource(R.drawable.ic_charting_off);
        imv3.setImageResource(R.drawable.ic_search_off);
        imv4.setImageResource(R.drawable.ic_flag_off);
        imv5.setImageResource(R.drawable.ic_user_off);

        centertext1.setText("Tab1 ");
    }
    public void changeview2(View v){
        imv2.setImageResource(R.drawable.ic_charting_on);
//        Toast.makeText(MainActivity.this,"charting",Toast.LENGTH_LONG).show();
        imv1.setImageResource(R.drawable.ic_home_off);
        imv3.setImageResource(R.drawable.ic_search_off);
        imv4.setImageResource(R.drawable.ic_flag_off);
        imv5.setImageResource(R.drawable.ic_user_off);

        centertext1.setText("Tab22 ");
    }
    public void changeview3(View v){
        imv3.setImageResource(R.drawable.ic_search_on);
//        Toast.makeText(MainActivity.this,"search",Toast.LENGTH_LONG).show();
        imv1.setImageResource(R.drawable.ic_home_off);
        imv2.setImageResource(R.drawable.ic_charting_off);
        imv4.setImageResource(R.drawable.ic_flag_off);
        imv5.setImageResource(R.drawable.ic_user_off);

        centertext1.setText("Tab333 ");
    }
    public void changeview4(View v){
        imv4.setImageResource(R.drawable.ic_flag_on);
//        Toast.makeText(MainActivity.this,"flag",Toast.LENGTH_LONG).show();
        imv1.setImageResource(R.drawable.ic_home_off);
        imv2.setImageResource(R.drawable.ic_charting_off);
        imv3.setImageResource(R.drawable.ic_search_off);
        imv5.setImageResource(R.drawable.ic_user_off);

        centertext1.setText("Tab444 ");
    }
    public void changeview5(View v){
        imv5.setImageResource(R.drawable.ic_user_on);
//        Toast.makeText(MainActivity.this,"user",Toast.LENGTH_LONG).show();
        imv2.setImageResource(R.drawable.ic_charting_off);
        imv3.setImageResource(R.drawable.ic_search_off);
        imv4.setImageResource(R.drawable.ic_flag_off);
        imv1.setImageResource(R.drawable.ic_home_off);

        centertext1.setText("Tab555 ");
    }
}
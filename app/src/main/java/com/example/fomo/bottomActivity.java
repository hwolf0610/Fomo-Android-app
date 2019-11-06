package com.example.fomo;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class bottomActivity extends AppCompatActivity {
    ImageView imv1,imv2,imv3,imv4,imv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainbottom);
         imv1=(ImageView)findViewById(R.id.imv1);
         imv2=(ImageView)findViewById(R.id.imv2);
         imv3=(ImageView)findViewById(R.id.imv3);
         imv4=(ImageView)findViewById(R.id.imv4);
         imv5=(ImageView)findViewById(R.id.imv5);

    }
    public void changeview1(View v){
        imv1.setBackgroundResource(R.drawable.ic_home_on);
        Toast.makeText(bottomActivity.this,"Home",Toast.LENGTH_LONG).show();
        imv2.setBackgroundResource(R.drawable.ic_charting_off);
        imv3.setBackgroundResource(R.drawable.ic_search_off);
        imv4.setBackgroundResource(R.drawable.ic_flag_off);
        imv5.setBackgroundResource(R.drawable.ic_user_off);
    }
    public void changeview2(View v){
        imv2.setBackgroundResource(R.drawable.ic_charting_on);
        Toast.makeText(bottomActivity.this,"charting",Toast.LENGTH_LONG).show();
        imv1.setBackgroundResource(R.drawable.ic_home_off);
        imv3.setBackgroundResource(R.drawable.ic_search_off);
        imv4.setBackgroundResource(R.drawable.ic_flag_off);
        imv5.setBackgroundResource(R.drawable.ic_user_off);
    }
    public void changeview3(View v){
        imv3.setBackgroundResource(R.drawable.ic_search_on);
        Toast.makeText(bottomActivity.this,"search",Toast.LENGTH_LONG).show();
        imv1.setBackgroundResource(R.drawable.ic_home_off);
        imv2.setBackgroundResource(R.drawable.ic_charting_off);
        imv4.setBackgroundResource(R.drawable.ic_flag_off);
        imv5.setBackgroundResource(R.drawable.ic_user_off);
    }
    public void changeview4(View v){
        imv4.setBackgroundResource(R.drawable.ic_flag_on);
        Toast.makeText(bottomActivity.this,"flag",Toast.LENGTH_LONG).show();
        imv1.setBackgroundResource(R.drawable.ic_home_off);
        imv2.setBackgroundResource(R.drawable.ic_charting_off);
        imv3.setBackgroundResource(R.drawable.ic_search_off);
        imv5.setBackgroundResource(R.drawable.ic_user_off);
    }
    public void changeview5(View v){
        imv5.setBackgroundResource(R.drawable.ic_user_on);
        Toast.makeText(bottomActivity.this,"user",Toast.LENGTH_LONG).show();
        imv2.setBackgroundResource(R.drawable.ic_charting_off);
        imv3.setBackgroundResource(R.drawable.ic_search_off);
        imv4.setBackgroundResource(R.drawable.ic_flag_off);
        imv1.setBackgroundResource(R.drawable.ic_home_off);
    }
}


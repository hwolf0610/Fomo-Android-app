package com.example.fomo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class launcherActivity extends AppCompatActivity {
    AnimationDrawable rocketAnimation;
    int i=0;
    TextView flow_text_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luncher);

        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setAttributes(attrs);

    LayoutInflater inflater =(LayoutInflater) launcherActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);// or (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View viewMyLayout = inflater.inflate(R.layout.activity_signup, null);
     flow_text_1 = (TextView) viewMyLayout.findViewById(R.id.flow_text_1);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));
        viewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View page, float position) {
                // do transformation here
                Animation a = AnimationUtils.loadAnimation(launcherActivity.this, R.anim.fade_in);
                 a.reset();
//                 switch (i){
//                     case 0:
//                         flow_text_1.setText("asd111");
//                         break;
//                     case 1:
//                         flow_text_1.setText("asd222");
//                         break;
//                     case 2:
//                         flow_text_1.setText("asd333");
//                         break;
//                     case 3:
//                         flow_text_1.setText("asd444");
//                         break;
//
//                 }

                 if(i==3){i=0;}else{i++;}
                viewPager.clearAnimation();
                viewPager.startAnimation(a);

            }
        });
//        viewPager.orientation = viewPager.ORIENTATION_VERTICAL;

        ImageView image_slide1=(ImageView)findViewById(R.id.slide_image1);
        ImageView image_slide2=(ImageView)findViewById(R.id.slide_image2);
        ImageView image_slide3=(ImageView)findViewById(R.id.slide_image3);
        ImageView image_slide4=(ImageView)findViewById(R.id.slide_image4);
        int kee=viewPager.getNextFocusDownId();
        switch(kee){
            case 1:
                image_slide1.setImageResource(R.drawable.ic_slide_on);
                image_slide2.setImageResource(R.drawable.ic_slide_off);
                image_slide3.setImageResource(R.drawable.ic_slide_off);
                image_slide4.setImageResource(R.drawable.ic_slide_off);
                viewPager.clearOnPageChangeListeners();
            break;
            case 2:
                image_slide2.setImageResource(R.drawable.ic_slide_on);
                image_slide1.setImageResource(R.drawable.ic_slide_off);
                image_slide3.setImageResource(R.drawable.ic_slide_off);
                image_slide4.setImageResource(R.drawable.ic_slide_off);
                viewPager.clearOnPageChangeListeners();
                break;
            case 3:
                image_slide3.setImageResource(R.drawable.ic_slide_on);
                image_slide2.setImageResource(R.drawable.ic_slide_off);
                image_slide1.setImageResource(R.drawable.ic_slide_off);
                image_slide4.setImageResource(R.drawable.ic_slide_off);
                viewPager.clearOnPageChangeListeners();
                break;
            case 4:
                image_slide4.setImageResource(R.drawable.ic_slide_on);
                image_slide2.setImageResource(R.drawable.ic_slide_off);
                image_slide3.setImageResource(R.drawable.ic_slide_off);
                image_slide1.setImageResource(R.drawable.ic_slide_off);
                viewPager.clearOnPageChangeListeners();
                break;
            default:
                image_slide1.setImageResource(R.drawable.ic_slide_on);
                image_slide2.setImageResource(R.drawable.ic_slide_off);
                image_slide3.setImageResource(R.drawable.ic_slide_off);
                image_slide4.setImageResource(R.drawable.ic_slide_off);
                viewPager.clearOnPageChangeListeners();
                break;


        }




//        TextView tv1=(TextView)findViewById(R.id.textView);
//        Animation a = AnimationUtils.loadAnimation(this, R.anim.fade_in);
//        a.reset();
//            tv1.clearAnimation();
//            tv1.startAnimation(a);



    }
    public void gosignup(View v){
        Intent i= new Intent(launcherActivity.this, Signupactivity.class);
        startActivity(i);
    }
    public void gosignin(View v){
        Intent i= new Intent(launcherActivity.this, loginActivity.class);
        startActivity(i);
    }
}

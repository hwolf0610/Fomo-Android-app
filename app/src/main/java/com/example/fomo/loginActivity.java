package com.example.fomo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setAttributes(attrs);

        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
    }
    public void showtoast(View v){
        Toast.makeText(loginActivity.this,"Back to Login",Toast.LENGTH_LONG).show();
    }
    public void gomain(View v){
        Intent i=new Intent(loginActivity.this,MainActivity.class);
        startActivity(i);
//        if (username.getText().toString().matches(password.getText().toString())){
//
//        }else{
//            Toast.makeText(loginActivity.this,"Password is incorrect!!!",Toast.LENGTH_LONG).show();
//        }
    }
}


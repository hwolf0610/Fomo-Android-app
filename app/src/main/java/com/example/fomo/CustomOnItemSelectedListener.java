package com.example.fomo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;

public class CustomOnItemSelectedListener implements OnItemSelectedListener {
    Context con;
    public CustomOnItemSelectedListener(Context content){
        con=content;
    }
//    LayoutInflater inflater =(LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);// or (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    View viewMyLayout = inflater.inflate(R.layout.activity_signup, null);
//     Spinner spinner1 = (Spinner) viewMyLayout.findViewById(R.id.spinner1);

    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id) {
//        spinner1.setPrompt(parent.getItemAtPosition(pos).toString());
        Toast.makeText(parent.getContext(),
                "OnItemSelectedListener : " + parent.getItemAtPosition(pos).toString(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

}

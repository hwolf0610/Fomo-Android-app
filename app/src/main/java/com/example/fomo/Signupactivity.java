package com.example.fomo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Signupactivity  extends Activity {
    ImageView iv1;
    private Spinner spinner1, spinner2;
    private Button btnSubmit;

    String json_string;
    JSONObject jsonObj;
    JSONArray jsonArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        WindowManager.LayoutParams attrs = getWindow().getAttributes();
        attrs.flags |= WindowManager.LayoutParams.FLAG_FULLSCREEN;
        getWindow().setAttributes(attrs);
//
//        json_string= loadJSONFromAsset();
//        ArrayList<String> messages = new ArrayList<String>();
//        {
//            try {
//                jsonObj =new JSONObject(json_string);
//                jsonArray =jsonObj.getJSONArray("formules");
//                String formule,url;
//                for (int i = 0; i < jsonArray.length(); i++){
//                    JSONObject jObj = jsonArray.getJSONObject(i);
//                    formule= jObj.getString("formule");
//                    messages.add(formule);
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//        }
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, messages);

//        Spinner spinner = (Spinner)findViewById(R.id.spinner1);
//        spinner.setAdapter(adapter);



        iv1=(ImageView)findViewById(R.id.imageview1);
//        ListView categoriesL = (ListView)findViewById(R.id.listFormulas);
//        ArrayList<HashMap<String, String>> formList = new ArrayList<HashMap<String, String>>();
//        Context context = null;
//        try {
//            String jsonLocation = AssetJSONFile("industry.json", context);
//            JSONObject formArray = (new JSONObject()).getJSONObject("formules");
//            String formule = formArray.getString("formule");
//            String url = formArray.getString("url");
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }

    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("industry.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
    public static String AssetJSONFile (String filename, Context context) throws IOException {
        AssetManager manager = context.getAssets();
        InputStream file = manager.open(filename);
        byte[] formArray = new byte[file.available()];
        file.read(formArray);
        file.close();

        return new String(formArray);
    }



    public void goback(View v){
        finish();
    }
    public void gogallery(View v){
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,1);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == 1) {
            iv1.setImageBitmap(getPicture(data.getData()));
        }
    }

    public Bitmap getPicture(Uri selectedImage) {
        String[] filePathColumn = { MediaStore.Images.Media.DATA };
        Cursor cursor = Signupactivity.this.getContentResolver().query(selectedImage, filePathColumn, null, null, null);
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
        String picturePath = cursor.getString(columnIndex);
        cursor.close();
        return BitmapFactory.decodeFile(picturePath);
    }

}

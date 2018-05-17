package com.neo.landtwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toMyFirst(View view) {
        Log.e("SSSSSSSS","=======toMyFirst========");
        Intent intent = new Intent();
        intent.putExtra("Value1","第1111个参数");
        intent.setClassName(MainActivity.this, "com.neo.firstlibrary.MainFirstActivity");
        startActivity(intent);
    }
}

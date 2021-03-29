package com.example.toastylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    Button success,error,warning,info;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        success=findViewById(R.id.success);
        error=findViewById(R.id.error);
        warning=findViewById(R.id.warning);
        info=findViewById(R.id.info);

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(MainActivity.this,"Success",Toasty.LENGTH_SHORT).show();
            }
        });

        error.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.error(MainActivity.this,"This is Error",Toasty.LENGTH_SHORT).show();
            }
        });


        warning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.warning(MainActivity.this,"This is Warning",Toasty.LENGTH_SHORT).show();
            }
        });


        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.info(MainActivity.this,"Some Info for you",Toasty.LENGTH_SHORT).show();
            }
        });

    }
}
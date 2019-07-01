package com.mini.minifinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
public class SecondActivity extends AppCompatActivity {
    public Button btnVerify;
    public void init(){
        btnVerify= (Button)findViewById(R.id.btnVerify);
        btnVerify.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent i = new Intent(SecondActivity.this,Captcha.class);
                startActivity(i);
            }
        });

    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }
}

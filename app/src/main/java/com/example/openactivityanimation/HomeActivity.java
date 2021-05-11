package com.example.openactivityanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViewById(R.id.b1).setOnClickListener(this);
        findViewById(R.id.b2).setOnClickListener(this);
        findViewById(R.id.b3).setOnClickListener(this);
        findViewById(R.id.b4).setOnClickListener(this);
    }

    private void openActivity() {
        startActivity(new Intent(HomeActivity.this,MainActivity.class));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.b1:
                openActivity();
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.b2:
                openActivity();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.b3:
                openActivity();
                overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
                break;
            case R.id.b4:
                openActivity();
                overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_top);
                break;
        }

    }
}
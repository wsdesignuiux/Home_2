package com.example.wolfsoft3.home_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home_2 extends AppCompatActivity {

    ImageView back_arror;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_2);

        back_arror = findViewById(R.id.back_arror);
        back_arror.setVisibility(View.GONE);
        text = findViewById(R.id.text);
        text.setVisibility(View.GONE);
    }
}

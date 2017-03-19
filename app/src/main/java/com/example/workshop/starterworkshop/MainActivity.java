package com.example.workshop.starterworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView tvDate;
    public TextView tvGit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Date date = new Date();

        tvDate = (TextView) findViewById(R.id.date);
        tvDate.setText(date.toString());
        tvGit = (TextView) findViewById(R.id.git);
        tvGit.setText('workshop vcs');
    }
}

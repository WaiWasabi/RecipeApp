package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InitialPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initialpage);


    }

    public void sendSurvey (View view){
        Intent intent = new Intent(this,SurveyActivity.class);
        startActivity(intent);
    }
}
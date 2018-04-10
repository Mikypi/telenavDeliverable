package com.example.michaeliverson.deliverable.Display.ViewPresenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.michaeliverson.deliverable.R;

import javax.inject.Inject;

public class DisplayView extends AppCompatActivity implements DisplayContract.View {

    @Inject DisplayPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void setupDagger() {

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}

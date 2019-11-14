package com.yaroshevich.fishcollector.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.navigation.AppNavigator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppNavigator.getInstance(this);
    }
}

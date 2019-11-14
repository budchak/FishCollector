package com.yaroshevich.fishcollector.navigation;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.yaroshevich.fishcollector.R;

public class AppNavigator {


    private static AppNavigator navigator;
    private NavController controller;


    private AppNavigator(Context context) {
        controller = Navigation.findNavController((Activity) context, R.id.nav_host_fragment);
    }

    public static AppNavigator getInstance(Context context) {
        if (context == null) {
            return navigator;
        } else {
            navigator = new AppNavigator(context);
            return navigator;
        }
    }

    public void onBackPressed(){
        if (controller !=null){
            switch (controller.getCurrentDestination().getId()){

            }
        }else {
            Log.e("APP NAVIGATOR", "controller is null");
        }

    }


    public void navigateToDetailScreen(int id) {

    }






}

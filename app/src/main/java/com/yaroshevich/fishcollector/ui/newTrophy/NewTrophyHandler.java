package com.yaroshevich.fishcollector.ui.newTrophy;

import android.view.View;

import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.navigation.AppNavigator;

public class NewTrophyHandler {

    private AppNavigator navigator;

    public NewTrophyHandler(AppNavigator navigator) {
        this.navigator = navigator;
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.name_card_view:
                break;

            case R.id.weight_card_view:
                navigator.navigateWeightDialog();
                break;
            case R.id.place_card_view:
                navigator.navigatePlaceDialog();
                break;
            case R.id.date_card_view:
                navigator.navigateDateDialog();
                break;
            default:
                navigator.navigateDateDialog();
                break;
        }

    }
}

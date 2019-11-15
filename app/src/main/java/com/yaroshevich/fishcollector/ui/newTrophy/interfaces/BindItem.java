package com.yaroshevich.fishcollector.ui.newTrophy.interfaces;

import android.net.Uri;

public interface BindItem {
    int getItemType();
    void setPosition(int position);
    int getCurrentPosition();
    void setImage(Uri uri);
}

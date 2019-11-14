package com.yaroshevich.fishcollector.viewHolder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BaseViewHolder<O> extends RecyclerView.ViewHolder {

    protected View view;

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
    }

    public void bind(O o){

    }

}

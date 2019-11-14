package com.yaroshevich.fishcollector.viewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.model.RecentUpdate;

public class RecentActionHolder extends BaseViewHolder<RecentUpdate> {

    TextView textView;

    public RecentActionHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
    }

    @Override
    public void bind(RecentUpdate o) {
        super.bind(o);
        textView.setText(o.getType());
    }
}

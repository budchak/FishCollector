package com.yaroshevich.fishcollector.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.listener.RecyclerViewClickListener;
import com.yaroshevich.fishcollector.model.RecentUpdate;
import com.yaroshevich.fishcollector.viewHolder.BaseViewHolder;
import com.yaroshevich.fishcollector.viewHolder.RecentActionHolder;

import java.util.List;

public class RecentActionsAdapter extends BaseAdapter<RecentUpdate> {

    RecyclerViewClickListener clickListener;


    public RecentActionsAdapter(List<RecentUpdate> item) {
        super(item);
    }


    public void setClickListener(RecyclerViewClickListener listener){
        clickListener = listener;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (this.list.size() == 0) {
            view = inflater.inflate(R.layout.holder_update_empy, parent, false);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onItemClick(0);
                }
            });
            return new RecentActionHolder(view);
        } else {
            view = inflater.inflate(R.layout.holder_update, parent, false);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onItemClick(0);
                }
            });
            return new RecentActionHolder(view);
        }

    }



    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        if (list.size() > 0) {
            holder.bind(list.get(position));

        }
    }

    @Override
    public int getItemCount() {
        int count = super.getItemCount();
        if (count == 0) {
            return 1;
        }
        return count;
    }
}

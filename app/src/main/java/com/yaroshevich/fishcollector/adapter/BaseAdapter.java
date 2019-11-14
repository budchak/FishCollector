package com.yaroshevich.fishcollector.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.viewHolder.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<O> extends RecyclerView.Adapter<BaseViewHolder> {

    List<O> list;

    public BaseAdapter(List<O> item) {
        if (item == null) {
            list = createEmptyElementList();
        } else {
            list = item;
        }

    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.holder_update, parent);
        return new BaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {

        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public void add(O element) {
        list.add(element);
        notifyDataSetChanged();
    }

    private List<O> createEmptyElementList() {
        return new ArrayList<>();
    }
}

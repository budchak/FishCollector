package com.yaroshevich.fishcollector.ui.newTrophy.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.ui.base.BaseDialog;


public class PlaceDialogFragment extends BaseDialog {


    private AutoCompleteTextView name;

    public PlaceDialogFragment() {
       // trophy = App.getInstance().getListComponent().getTrophy();
    }

    @Override
    protected View createView() {

        final String[] places = {"Лань", "Цна", "Припять", "Неман",
                "Немига", "Свислачь"};

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View customLayout = inflater.inflate(R.layout.dialog_add_places, null);
        name = customLayout.findViewById(R.id.autoCompleteTextView);

        name = customLayout.findViewById(R.id.autoCompleteTextView);
        name.setAdapter(new ArrayAdapter<>(customLayout.getContext(),
                android.R.layout.simple_dropdown_item_1line, places));
        return customLayout;
    }

    @Override
    protected String createTitle() {
        return "Выберите место поимки";
    }

    @Override
    protected void onPositiveClick() {
        //trophy.setPlace(new PlaceImpl(name.getText().toString()));
    }

    @Override
    protected void onNegativeClick() {

    }


    public interface WieghtDialogListener {
        void onPositiveClick();
        void onNegativeClick();
    }

}

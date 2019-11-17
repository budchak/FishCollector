package com.yaroshevich.fishcollector.ui.newTrophy.dialog;

import android.view.View;
import android.widget.DatePicker;

import com.yaroshevich.fishcollector.App;
import com.yaroshevich.fishcollector.R;
import com.yaroshevich.fishcollector.model.Trophy;
import com.yaroshevich.fishcollector.ui.base.BaseDialog;
import java.util.Calendar;

public class DateDialogFragment extends BaseDialog {

    private int Year, Month, Day;
    private Calendar calendar;

    DatePicker datePickerDialog;

    private Trophy trophy;

    public DateDialogFragment() {
       // trophy = App.getInstance().getListComponent().getTrophy();
    }

    @Override
    protected View createView() {

        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_add_date, null);

        calendar = Calendar.getInstance();

        Year = calendar.get(Calendar.YEAR);
        Month = calendar.get(Calendar.MONTH);
        Day = calendar.get(Calendar.DAY_OF_MONTH);
        datePickerDialog = view.findViewById(R.id.date_picker);
        datePickerDialog.init(Year, Month, Day, null);
        return view;
    }

    @Override
    protected String createTitle() {
        return "its time begin";
    }

    @Override
    protected void onPositiveClick() {
        String date = (datePickerDialog.getDayOfMonth() + " " + datePickerDialog.getMonth() + " " + datePickerDialog.getYear());
        //trophy.setDate(date);
    }

    @Override
    protected void onNegativeClick() {

    }


}

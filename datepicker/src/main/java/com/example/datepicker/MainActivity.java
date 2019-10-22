package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int year,month,day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatePicker datePicker=findViewById(R.id.dp);
        Calendar calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        day=calendar.get(Calendar.DAY_OF_MONTH);
        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
//                MainActivity.this.year=i;
//                MainActivity.this.month=i1;
//                MainActivity.this.day=i2;
                show(i,i1,i2);
            }
        });
    }
    private void show(int year,int month,int day)
    {
        Toast.makeText(MainActivity.this,year+"年"+(month+1)+"月"+day+"日",Toast.LENGTH_SHORT).show();
    }
}

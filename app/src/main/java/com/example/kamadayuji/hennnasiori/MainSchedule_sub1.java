package com.example.kamadayuji.hennnasiori;
import java.util.Calendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import static android.R.id.button1;

public class MainSchedule_sub1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_schedule_sub1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        EditText travel_name = (EditText) findViewById(R.id.travel_name);
        Button datePicker_button1 = (Button)findViewById(R.id.datePicker_button1);
        Button datePicker_button2 = (Button)findViewById(R.id.datePicker_button2);

        travel_name.setOnClickListener(this);
        datePicker_button1.setOnClickListener(this);
        datePicker_button2.setOnClickListener(this);

        final TextView datePicker_txt = (TextView) findViewById(R.id.datePicker);
        datePicker_txt.setFocusable(false);

        final TextView datePicker_end_txt = (TextView) findViewById(R.id.datePicker_end);
        datePicker_end_txt.setFocusable(false);



    }


    @Override
    public void onClick(View v) {
        // ボタン1が押された場合
        if (v.getId() == R.id.datePicker_button1) {
            final TextView datePicker_txt = (TextView) findViewById(R.id.datePicker);
            datePicker_txt.setFocusable(false);

            Toast.makeText(this, "イベント開始日を選択してください", Toast.LENGTH_LONG).show();
            // 現在の日付を取得
            final Calendar calendar = Calendar.getInstance();
            int year  = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day   = calendar.get(Calendar.DAY_OF_MONTH);

            // 日付選択ダイアログの生成
            DatePickerDialog datePicker = new DatePickerDialog(
                    this,
                    new DatePickerDialog.OnDateSetListener() {

                        public void onDateSet(DatePicker view,
                                              int year, int monthOfYear, int dayOfMonth) {
                            // 「設定」ボタンクリック時の処理
                            datePicker_txt.setText(String.format("%d / %02d / %02d", year, monthOfYear, dayOfMonth));
                            datePicker_txt.setTextColor(Color.BLACK);


                        }
                    },
                    year, month, day);




            // 表示
            datePicker.show();


            // ボタン2が押された場合
        } else if (v.getId() == R.id.datePicker_button2) {
            Toast.makeText(this, "イベント終了日を選択してください", Toast.LENGTH_LONG).show();
            final TextView datePicker_end_txt = (TextView) findViewById(R.id.datePicker_end);



            // 現在の日付を取得
            final Calendar calendar_end = Calendar.getInstance();
            int year_end  = calendar_end.get(Calendar.YEAR);
            int month_end = calendar_end.get(Calendar.MONTH);
            int day_end   = calendar_end.get(Calendar.DAY_OF_MONTH);

            // 日付選択ダイアログの生成
            DatePickerDialog datePicker_end = new DatePickerDialog(
                    this,
                    new DatePickerDialog.OnDateSetListener() {

                        public void onDateSet(DatePicker view,
                                              int year, int monthOfYear, int dayOfMonth) {
                            // 「設定」ボタンクリック時の処理
                            datePicker_end_txt.setText(String.format("%d / %02d / %02d", year, monthOfYear, dayOfMonth));
                            datePicker_end_txt.setTextColor(Color.BLACK);

                        }
                    },
                    year_end, month_end, day_end);

            // 表示
            datePicker_end.show();

        } else if (v.getId() == R.id.travel_name){
            final TextView travel_name = (TextView) findViewById(R.id.travel_name);
            travel_name.setTextColor(Color.BLACK);
        }




    }









}





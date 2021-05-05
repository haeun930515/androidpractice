package com.example.checkboxtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox chk_red, chk_blue, chk_green;
    private TextView tv_result;
    private Button btn_result;

    private Spinner spinner;
    private TextView sp_result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        sp_result = (TextView) findViewById(R.id.sp_result);

        chk_red = findViewById(R.id.chk_red);
        chk_blue = findViewById(R.id.chk_blue);
        chk_green = findViewById(R.id.chk_green);
        tv_result = findViewById(R.id.tv_result);
        btn_result = findViewById(R.id.btn_result);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sp_result.setText(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn_result.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String str_result = ""; // String 값 초기화
                if(chk_red.isChecked()){
                    str_result += chk_red.getText().toString();
                }
                if(chk_blue.isChecked()){
                    str_result += chk_blue.getText().toString();
                }
                if(chk_green.isChecked()){
                    str_result += chk_green.getText().toString();
                }

                tv_result.setText(str_result);

            }
        });


    }
}
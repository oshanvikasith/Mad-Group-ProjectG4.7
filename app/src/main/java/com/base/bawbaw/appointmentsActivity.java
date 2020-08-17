package com.base.bawbaw;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class appointmentsActivity extends AppCompatActivity {

    Button btn;
    Button btn1;
    Button btn2;
    LinearLayout listview1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointmentlist);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    protected void onResume() {

        super.onResume();
        btn=findViewById(R.id.aptlist1);
        btn1=findViewById(R.id.aptlist2);

        listview1=(LinearLayout) findViewById(R.id.apptlstid1);

        listview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(appointmentsActivity.this,addAppointmentActivity.class);
                startActivity(intent);


            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(appointmentsActivity.this,addAppointmentActivity.class);
                startActivity(intent);


            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(appointmentsActivity.this,viewStatsActivity.class);
                startActivity(intent);


            }
        });





    }





}
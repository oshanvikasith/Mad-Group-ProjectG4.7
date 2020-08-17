package com.base.bawbaw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Vaccines1 extends AppCompatActivity {

    FloatingActionButton btn1;
    Button vbtn1, vbtn2, vbtn3, vbtn4;
    ImageButton vibtn1, vibtn2, vibtn3, vibtn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines1);
    }

    protected void onResume() {

        super.onResume();
        btn1 = findViewById(R.id.vacFloatingActionButton);

        vbtn1 = findViewById(R.id.vacbtn1);
        vbtn2 = findViewById(R.id.vacbtn2);
        vbtn3 = findViewById(R.id.vacbtn3);
        vbtn4 = findViewById(R.id.vacbtn3);

        vibtn1 = findViewById(R.id.vacCalendarBtn1);
        vibtn2 = findViewById(R.id.vacCalendarBtn2);
        vibtn3 = findViewById(R.id.vacCalendarBtn3);
        vibtn4 = findViewById(R.id.vacCalendarBtn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vaccines1.this, vaccines2.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Loading page...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);

            }
        });

        vbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vaccines1.this, vaccines4.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Loading content...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            }
        });

        vbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vaccines1.this, vaccines4.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Loading content...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            }
        });

        vbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vaccines1.this, vaccines4.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Loading content...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            }
        });

        vbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vaccines1.this, vaccines4.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Loading content...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            }
        });

        vibtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vaccines1.this, Vaccines3.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Please wait...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            }
        });

        vibtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vaccines1.this, Vaccines3.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Please wait...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            }
        });

        vibtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vaccines1.this, Vaccines3.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Please wait...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            }
        });

        vibtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Vaccines1.this, Vaccines3.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Please wait...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
            }
        });

    }
}
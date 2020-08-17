package com.base.bawbaw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class addvetActivity extends AppCompatActivity {

    Button savebtn;
    Button deletebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vet);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    protected void onResume() {
        super.onResume();
        savebtn = findViewById(R.id.vetbutton1);
        deletebtn = findViewById(R.id.vetdlt);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence message = "Details will be updated";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);

                toast.show();
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);

            }
        });


        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addvetActivity.this, vetListActivity.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Details will be deleted";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);

                toast.show();
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);


            }
        });



        }
    }

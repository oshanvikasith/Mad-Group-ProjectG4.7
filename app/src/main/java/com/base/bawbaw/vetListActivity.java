package com.base.bawbaw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class vetListActivity extends AppCompatActivity {


    Button btn1;
    Button btn2;
    LinearLayout layout1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vet_list);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    protected void onResume() {
        super.onResume();
        layout1=(LinearLayout)findViewById(R.id.vetlistid1);
        btn1=findViewById(R.id.vetlistbtn1);


        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(vetListActivity.this, addvetActivity.class);
                startActivity(intent);



            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(vetListActivity.this, addvetActivity.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Add Vet";

                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);

                toast.show();
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);

            }
        });





    }


}
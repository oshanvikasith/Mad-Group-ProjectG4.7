package com.base.bawbaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ExpenView extends AppCompatActivity {

    private TextView D1,D2,D3,D4,D5,P1,P2,P3,P4,P5;
    private Button editButton, deleteButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expen_view);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // 1st line
        D1 = findViewById(R.id.textView12);
        P1 = findViewById(R.id.textView17);

        String DES1 = getIntent().getStringExtra("Add one");
        String PRI1 = getIntent().getStringExtra("price one");

        D1.setText(DES1);
        P1.setText(PRI1);

        // 2nd line
        D2 = findViewById(R.id.textView11);
        P2 = findViewById(R.id.textView5);

        String DES2 = getIntent().getStringExtra("Add two");
        String PRI2 = getIntent().getStringExtra("price two");

        D2.setText(DES2);
        P2.setText(PRI2);

        // 3rd line
        D3 = findViewById(R.id.textView13);
        P3 = findViewById(R.id.textView16);

        String DES3 = getIntent().getStringExtra("Add three");
        String PRI3 = getIntent().getStringExtra("price three");

        D3.setText(DES3);
        P3.setText(PRI3);

        // Edit button
        editButton = (Button)findViewById(R.id.button2);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence message = "You clicked Edit";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

            }
        });

        // Delete button
        deleteButton = (Button)findViewById(R.id.button3);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence message = "Data has been deleted";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

            }
        });




    }
}
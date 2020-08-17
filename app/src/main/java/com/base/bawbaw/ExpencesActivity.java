package com.base.bawbaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExpencesActivity extends AppCompatActivity {

    private Button buttonSaveAndCal;
    private EditText d1,d2,d3,d4,d5,p1,p2,p3,p4,p5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expences);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        d1 = findViewById(R.id.editTextTextPersonName3);
        p1 = findViewById(R.id.editTextTextPersonName2);
        d2 = findViewById(R.id.editTextTextPersonName4);
        p2 = findViewById(R.id.editTextTextPersonName8);
        d3 = findViewById(R.id.editTextTextPersonName5);
        p3 = findViewById(R.id.editTextTextPersonName10);
        d4 = findViewById(R.id.editTextTextPersonName6);
        p4 = findViewById(R.id.editTextTextPersonName11);
        d5 = findViewById(R.id.editTextTextPersonName7);
        p5 = findViewById(R.id.editTextTextPersonName12);

        buttonSaveAndCal = (Button)findViewById(R.id.button);
        buttonSaveAndCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String des1 = d1.getText().toString();
                String pri1 = p1.getText().toString();

                String des2 = d2.getText().toString();
                String pri2 = p2.getText().toString();

                String des3 = d3.getText().toString();
                String pri3 = p3.getText().toString();

                Intent intent = new Intent(ExpencesActivity.this, ExpenView.class);
                intent.putExtra("Add one", des1);
                intent.putExtra("price one", pri1);
                intent.putExtra("Add two", des2);
                intent.putExtra("price two",pri2);
                intent.putExtra("Add three",des3);
                intent.putExtra("price three", pri3);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Data saved and calculated";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();


            }
        });


    }
}

package com.base.bawbaw;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class vaccines5 extends AppCompatActivity {

    ImageButton vacBack1;
    Button saveVac, cancelVac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccines5);

        vacBack1= findViewById(R.id.vacBackBtn);
        saveVac= findViewById(R.id.vacSaveBtn);
        cancelVac= findViewById(R.id.vacCancelBtn);

        vacBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(vaccines5.this);

                builder.setTitle("Alert!");
                builder.setMessage("The changes you made will not be saved. Are you sure you want to cancel modification?");
                builder.setCancelable(true);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        vaccines5.this.finish();

                        Intent intent = new Intent(getApplicationContext(), Vaccines1.class);
                        startActivity(intent);

                        Context context = getApplicationContext();
                        CharSequence message = "Action suspended...";

                        int duration = Toast.LENGTH_SHORT;
                        Toast toast1 = Toast.makeText(context, message, duration);

                        toast1.show();
                        toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();

                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        saveVac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Vaccines1.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Saved successfully..";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);

            }
        });

        cancelVac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Vaccines1.class);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Cancelled...";

                int duration = Toast.LENGTH_SHORT;
                Toast toast1 = Toast.makeText(context, message, duration);

                toast1.show();
                toast1.setGravity(Gravity.BOTTOM | Gravity.CENTER, 0, 0);

            }
        });
        
    }
}
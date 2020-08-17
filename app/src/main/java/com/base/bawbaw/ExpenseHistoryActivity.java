package com.base.bawbaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExpenseHistoryActivity extends AppCompatActivity {

    private Button viewTable;
    private Button deleteTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_history);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewTable =  (Button)findViewById(R.id.button13);
        viewTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openActivityHistoryView();


                Context context = getApplicationContext();
                CharSequence message = "Table Opened";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

            }

            private void openActivityHistoryView() {
                Intent intent = new Intent(getApplicationContext(), History_view.class);
                startActivity(intent);
            }
        });

        deleteTable = (Button)findViewById(R.id.button14);
        deleteTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence message = "Table has been deleted";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

            }
        });



    }
}


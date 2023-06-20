package com.example.madrassaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dailyTasks extends AppCompatActivity {

    EditText editTextRollNo,editTextSabaq, editTextSabaqi,editTextManzil;
    Button buttonSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_tasks);

        editTextRollNo =findViewById(R.id.editTextRollno);
        editTextSabaq =findViewById(R.id.editTextSabaq);
        editTextSabaqi =findViewById(R.id.editTextSabaqi);
        editTextManzil =findViewById(R.id.editTextManzil);
        buttonSave =findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rollNo = editTextRollNo.getText().toString().trim();
                String sabaq = editTextSabaq.getText().toString().trim();
                String sabaqi = editTextSabaqi.getText().toString().trim();
                String manzil = editTextManzil.getText().toString().trim();

                if (rollNo.isEmpty() || sabaq.isEmpty() || sabaqi.isEmpty() || manzil.isEmpty()) {
                    Toast.makeText(dailyTasks.this, "Please enter all the tasks", Toast.LENGTH_SHORT).show();
                } else {
                    TaskRecords taskRecords = new TaskRecords(rollNo, sabaq, sabaqi, manzil);
                    DBHelper dbHelper = new DBHelper(dailyTasks.this);

                    dbHelper.addTaskRecord(taskRecords);
                    Toast.makeText(dailyTasks.this, "Tasks saved successfully", Toast.LENGTH_SHORT).show();

                    finish();
                }
            }
        });
    }
}
package com.example.madrassaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class studentDetails extends AppCompatActivity {

    EditText editTextrollNo,editTextname,editTextage,editTextClass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        editTextrollNo = findViewById(R.id.editTextRollno);
        editTextname = findViewById(R.id.editTextName);
        editTextage = findViewById(R.id.editTextAge);
        editTextClass = findViewById(R.id.editTextClass);

        button = findViewById(R.id.buttonSave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rollNo = editTextrollNo.getText().toString();
                String name = editTextname.getText().toString();
                String age = editTextage.getText().toString();
                String Class = editTextClass.getText().toString();

                Student student = new Student(rollNo,name,age,Class);
                DBHelper dbHelper = new DBHelper(studentDetails.this);
                dbHelper.insertStudent(student);

                Toast.makeText(studentDetails.this, "Student details saved successfully", Toast.LENGTH_SHORT).show();

                finish();
            }
        });
    }
}
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
                String rollNo = editTextrollNo.getText().toString().trim();
                String name = editTextname.getText().toString().trim();
                String age = editTextage.getText().toString().trim();
                String className = editTextClass.getText().toString().trim();

                if (rollNo.isEmpty() || name.isEmpty() || age.isEmpty() || className.isEmpty()) {
                    Toast.makeText(studentDetails.this, "Please enter all the details", Toast.LENGTH_SHORT).show();
                } else {
                    Student student = new Student(name, age, className, rollNo);
                    DBHelper dbHelper = new DBHelper(studentDetails.this);
                    dbHelper.insertStudent(student);

                    Toast.makeText(studentDetails.this, "Student details saved successfully", Toast.LENGTH_SHORT).show();

                    finish();
                }
            }
        });
    }
}
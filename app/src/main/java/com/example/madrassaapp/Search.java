package com.example.madrassaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;


public class Search extends AppCompatActivity {

    private Button searchButton;
    private EditText editTextRollno;

    RecyclerView recyclerView;
    ArrayList<String> rollNo,name,age,Class,sabaq,sabaqi,manzil;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchButton = findViewById(R.id.buttonSearch);
        editTextRollno = findViewById(R.id.editTextRollno);

        dbHelper = new DBHelper(Search.this);
        rollNo = new ArrayList<>();
        name = new ArrayList<>();
        age = new ArrayList<>();
        Class = new ArrayList<>();
        sabaq = new ArrayList<>();
        sabaqi = new ArrayList<>();
        manzil = new ArrayList<>();


        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rollNum = editTextRollno.getText().toString();
                displayStudentRecords(rollNum);
            }
        });
    }

    void displayStudentRecords(String rollNum){
        Cursor cursor = dbHelper.getStudentAndTaskRecords(rollNum);
        if (cursor.getCount()==0){
            Toast.makeText(this,"No record Found",Toast.LENGTH_SHORT).show();
        }
        else {
            while(cursor.moveToNext()){
                rollNo.add(cursor.getString(0));
                name.add(cursor.getString(1));
                age.add(cursor.getString(2));
                Class.add(cursor.getString(3));
                sabaq.add(cursor.getString(4));
                sabaqi.add(cursor.getString(5));
                manzil.add(cursor.getString(6));
            }
        }
    }
}
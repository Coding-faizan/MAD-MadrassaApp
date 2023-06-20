package com.example.madrassaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Search extends AppCompatActivity {

    private Button searchButton;
    private EditText editTextRollno;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchButton = findViewById(R.id.buttonSearch);
        editTextRollno = findViewById(R.id.editTextRollno);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rollNum = editTextRollno.getText().toString();
                Intent intent =new Intent(Search.this,SearchResult.class);
                intent.putExtra("RollNo",rollNum);
                startActivity(intent);
            }
        });
    }
}
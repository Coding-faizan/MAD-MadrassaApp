package com.example.madrassaapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "madrassa.db";
    private static final String TABLE_STUDENTS = "students";
    private static final String TABLE_TASK_RECORDS = "taskrecords";

    //commoncolumn
    private static final String COLUMN_ROLLNO = "rollNo";
    //studentColumns
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_AGE = "age";
    private static final String COLUMN_CLASS = "class";

    //taskColumns
    private static final String COLUMN_TASK_TYPE = "task_type";
    private static final String COLUMN_TASK_DETAILS = "task_details";

    private static final String CREATE_TABLE_STUDENTS = "CREATE TABLE " + TABLE_STUDENTS + "("
            + COLUMN_ROLLNO + " TEXT PRIMARY KEY ,"
            + COLUMN_NAME + " TEXT,"
            + COLUMN_AGE + " INTEGER,"
            + COLUMN_CLASS + " TEXT"
            + ")";

    // Create taskRecords table query
    private static final String CREATE_TABLE_TASK_RECORDS = "CREATE TABLE " + TABLE_TASK_RECORDS + "("
            + COLUMN_TASK_TYPE + " TEXT,"
            + COLUMN_TASK_DETAILS + " TEXT,"
            + "FOREIGN KEY(" + COLUMN_ROLLNO + ") REFERENCES " + TABLE_STUDENTS + "(" + COLUMN_ROLLNO + ")"
            + ")";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create tables
        db.execSQL(CREATE_TABLE_STUDENTS);
        //db.execSQL(CREATE_TABLE_TASK_RECORDS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TASK_RECORDS);
        //db.execSQL("DROP TABLE IF EXISTS " + TABLE_STUDENTS);

        // Create new tables
        onCreate(db);
    }

    public void insertStudent(Student student) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_ROLLNO,student.getRollNo());
        values.put(COLUMN_NAME, student.getName());
        values.put(COLUMN_AGE, student.getAge());
        values.put(COLUMN_CLASS, student.getclass());

        db.insert(TABLE_STUDENTS, null, values);
        db.close();
    }

}

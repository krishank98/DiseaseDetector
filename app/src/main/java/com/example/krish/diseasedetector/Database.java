package com.example.krish.diseasedetector;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public  class Database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="Student.db";
    public static final String TABLE_NAME="Student_table";
    public static final String COL_1="username";
    public static final String COL_2="password";
    public static final String COL_3="age";
    public static final String COL_4="gender";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + COL_1 + " TEXT PRIMARY KEY," + COL_2 + " TEXT,"
                +COL_3+ " TEXT," +COL_4+" TEXT"+ ")";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);

    }

    public void addUser(String name,String pass,String age,String gender){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_1, name);
        values.put(COL_2, pass);
        values.put(COL_3, age);
        values.put(COL_4, gender);

        db.insert(TABLE_NAME,null,values);

        db.close();
    }
    public boolean checkData(User user) {

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME,
                new String[]{COL_1,COL_2},
                COL_1 + "=?",
                new String[]{user.userName},
                null, null, null);

        if (cursor != null && cursor.moveToFirst()&& cursor.getCount()>0) {

            User user1 = new User(cursor.getString(0), cursor.getString(1));


           if (user.password.equalsIgnoreCase(user1.password)) {
                return true;
            }
        }


        return false;
    }

}



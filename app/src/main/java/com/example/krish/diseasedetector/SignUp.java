package com.example.krish.diseasedetector;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by krish on 22-04-2018.lol
 */

public class SignUp extends AppCompatActivity {
   Database database=new Database(this);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        Button submit = (Button) findViewById(R.id.button5);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 EditText name = (EditText) findViewById(R.id.editText3);
                 String name_1=name.getText().toString();
                 EditText  pass = (EditText) findViewById(R.id.editText4);
                 String pass_1=pass.getText().toString();
                 EditText age=findViewById(R.id.editText5);
                 String age_1=age.getText().toString();
                 String gender="male";
                database.addUser(name_1,pass_1,age_1,gender);

            }
        });
    }
}

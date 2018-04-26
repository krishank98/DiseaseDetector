package com.example.krish.diseasedetector;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by krish on 22-04-2018.
 */

public class StartLogin extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(view.getContext(),Login.class);
//                view.getContext().startActivity(intent);
            }
        });
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_1=new Intent(view.getContext(),SignUp.class);
                view.getContext().startActivity(intent_1);
            }
        });
//        Button button6=findViewById(R.id.button6);
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent2=new Intent(view.getContext(),Start1.class);
//                view.getContext().startActivity(intent2);
//            }
//        });

        TextView textView=findViewById(R.id.textView20);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(view.getContext(),Initiliaze.class);
                view.getContext().startActivity(intent2);
            }
        });
    }
}


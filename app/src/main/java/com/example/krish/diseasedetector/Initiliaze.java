package com.example.krish.diseasedetector;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by krish on 26-04-2018.
 */

public class Initiliaze extends AppCompatActivity {
     String age="";
    String gender="";
    public User_profile user_profile;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.initialize);

        Spinner spinner5 = findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(Initiliaze.this, R.array.age, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);

        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), adapterView.getItemIdAtPosition(i) + "selected", Toast.LENGTH_LONG).show();
                gender = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup2);
//        radioGroup.clearCheck();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    Toast.makeText(Initiliaze.this, rb.getText(), Toast.LENGTH_SHORT).show();
                    age = rb.getText().toString();
                }

            }
        });

        Button button6 = findViewById(R.id.button4);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText user_name=findViewById(R.id.editText);

                String username= user_name.getText().toString();

                Intent intent2 = new Intent(view.getContext(), Start1.class);
                view.getContext().startActivity(intent2);
                user_profile=new User_profile(username,age,gender);
            }
        });
    }
}






//    public void onClear(View v) {
//        /* Clears all selected radio buttons to default */
//        radioGroup.clearCheck();
//    }
//
//    public void onSubmit(View v) {
//        RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
//        Toast.makeText(Initiliaze.this, rb.getText(), Toast.LENGTH_SHORT).show();


//}



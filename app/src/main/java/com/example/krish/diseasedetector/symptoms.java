package com.example.krish.diseasedetector;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class symptoms extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms);

       Spinner spinner2 = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter =ArrayAdapter.createFromResource(this,R.array.symptoms_name,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);




       final Spinner spinner3 = findViewById(R.id.spinner3);


//        Spinner spinner4 = findViewById(R.id.spinner4);
//        ArrayAdapter<CharSequence> adapter4 =ArrayAdapter.createFromResource(this,R.array.symptoms_name,android.R.layout.simple_spinner_item);
//        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner4.setAdapter(adapter4);

        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), adapterView.getItemIdAtPosition(i) + "selected", Toast.LENGTH_LONG).show();
                if (i == 0) {
                    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(symptoms.this, R.array.type_of_headache, android.R.layout.simple_spinner_item);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner3.setAdapter(adapter3);
                    spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            Toast.makeText(getBaseContext(), adapterView.getItemIdAtPosition(i) + "selected", Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                }else if(i==1){
                    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(symptoms.this, R.array.type_of_pain, android.R.layout.simple_spinner_item);
                    adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner3.setAdapter(adapter3);
                    spinner3.setOnItemSelectedListener(new OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            Toast.makeText(getBaseContext(), adapterView.getItemIdAtPosition(i) + "selected", Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }});



//        spinner4.setOnItemSelectedListener(new OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getBaseContext(),adapterView.getItemIdAtPosition(i)+"selected",Toast.LENGTH_LONG).show();
//
//            }
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
    }



}
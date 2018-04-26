package com.example.krish.diseasedetector;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by krish on 22-04-2018.
 */

//public class Login extends AppCompatActivity {
//   Database db=new Database(this);
//
//   @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.loginactivity1);
//       final TextView textView=(TextView)findViewById(R.id.textView18);
//        final SqliteHelper sqliteHelper =new SqliteHelper(this);

//        Button button4=(Button)findViewById(R.id.button4);
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                EditText username = (EditText) findViewById(R.id.editText);
//                EditText password=(EditText)findViewById(R.id.editText2);
//                String username_1=username.toString();
//                String pasword_1=password.toString();

//               sqliteHelper.addUser(new User("1","kk","kk","kk"));
//               textView.setText("success");
//              boolean result=  db.checkData(new User(username_1,pasword_1));
//                if (result){
//
//                    textView.setText("successfull");
//                }else {
//                     textView.setText("unsuccesfull");

//                }
//            }
//        });
//            }
//        }
//   }
//}
//   }

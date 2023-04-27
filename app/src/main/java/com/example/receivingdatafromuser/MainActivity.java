package com.example.receivingdatafromuser;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_name;
    Button submit_btn;
    TextView result_tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_name = findViewById(R.id.name_edt);
        submit_btn = findViewById(R.id.submit_information_btn);
        result_tv = findViewById(R.id.result_tv);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Now, to receive data from EditText, we will receive it in a String.
                String name = edt_name.getText().toString();

                //Print the result on result_tv.
                result_tv.setText("Result : "+name);

            }
        });

    }
}
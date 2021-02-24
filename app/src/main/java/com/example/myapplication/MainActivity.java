package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends  AppCompatActivity {

    EditText editTxtName ;
    Button button3 ;
    TextView txtName;
    @Override
    protected void  onCreate( Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTxtName=(EditText)findViewById(R.id.editTxtName);
        button3=(Button)findViewById(R.id.button3);
        txtName=(TextView)findViewById(R.id.txtName);


        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){String name =editTxtName.getText().toString();
                txtName.setText(" hi "+name);}




        });
    }}

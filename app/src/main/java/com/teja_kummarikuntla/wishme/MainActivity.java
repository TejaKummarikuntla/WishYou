package com.teja_kummarikuntla.wishme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void clicked(View view){

        EditText myName = (EditText) findViewById(R.id.edtName);
        Toast.makeText(this, "Hello "+myName.getText().toString(), Toast.LENGTH_SHORT).show();



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

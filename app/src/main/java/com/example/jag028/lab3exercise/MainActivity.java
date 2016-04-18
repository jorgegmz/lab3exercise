package com.example.jag028.lab3exercise;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.test.UiThreadTest;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @UiThreadTest
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @UiThreadTest
    public int sum(int x, int y){
        return x+y;
    }

    @UiThreadTest
    public void onAddClick(View a){
        if(a.getId() == R.id.button){
            EditText a1 = (EditText)findViewById(R.id.TFnumber1);
            EditText a2 = (EditText)findViewById(R.id.TFnumber2);

            int num1 = 0;
            int num2 = 0;
            int result = 0;

            num1 = Integer.parseInt(a1.getText().toString());
            num2 = Integer.parseInt(a2.getText().toString());

            result = sum(num1,num2);

            TextView t = (TextView)findViewById(R.id.TVresult);
            t.setText("" + result);

        }
    }

}

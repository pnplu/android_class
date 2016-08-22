package com.plupasit.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello onCreate", Toast.LENGTH_SHORT).show();
        TextView tv = (TextView)findViewById(R.id.TV01);
        tv.setText("OMG");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "Hello onPause", Toast.LENGTH_SHORT).show();
    }

    public void calculate (View v)
    {
        EditText et_01 = (EditText)findViewById(R.id.ET01);
        EditText et_02 = (EditText)findViewById(R.id.ET02);

        double n1 = Double.parseDouble(et_01.getText().toString());
        double n2 = Double.parseDouble(et_02.getText().toString());
        double result = n1+n2;

        TextView tv = (TextView)findViewById(R.id.TV01);
        tv.setText(""+result);
    }
}

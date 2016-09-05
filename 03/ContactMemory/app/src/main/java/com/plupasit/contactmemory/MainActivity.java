package com.plupasit.contactmemory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //Check Request code
        if(requestCode == 5)
        {
            // Check ResultCode
            if (resultCode == RESULT_OK) {
                //1. Get data from intent object
                String name = data.getStringExtra("NAME");
                String tel = data.getStringExtra("TEL");

                //2. Reference TextView
                TextView tv = (TextView) findViewById(R.id.TV01);

                //3. Set text to TextView
                tv.setText("Result : " + name + " : " + tel);
            }
        }
    }

    public void onClickAddContact(View v)
    {
        // 1.Create Intent, Where to go
        Intent dointent = new Intent(this, AddDataActivity.class);

        // 2.Start Activity
        startActivityForResult(dointent, 5);
    }
}

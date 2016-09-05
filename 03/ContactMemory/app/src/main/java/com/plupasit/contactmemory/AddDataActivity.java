package com.plupasit.contactmemory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddata);
    }

    public void onClickAddToMain(View v)
    {
        //1. Get Data from EditText
        EditText name_edt = (EditText)findViewById(R.id.EDTName);
        EditText tel_edt = (EditText)findViewById(R.id.EDTTel);

        //2. Convert Text to String
        String name = name_edt.getText().toString();
        String tel = tel_edt.getText().toString();

        //3. Create Intent
        Intent dointent2 = new Intent();

        //4. Put data to Intent Object
        dointent2.putExtra("NAME", name);
        dointent2.putExtra("TEL", tel);

        //5. Send Intent to result
        setResult(RESULT_OK,dointent2);

        //6. Finish and Close this Activity
        finish();

    }
}

package com.plupasit.wksp02_13560220;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class PayData220 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }
    public void onClickPayMoney (View v)
    {
        EditText add_name = (EditText)findViewById(R.id.EDTNameYourPay);
        EditText add_pay = (EditText)findViewById(R.id.EDTPay);

        String name_pays = add_name.getText().toString();
        double add_pays = Double.parseDouble(add_pay.getText().toString());

        Intent doIntent3 = new Intent();

        doIntent3.putExtra("NAMES", name_pays);
        doIntent3.putExtra("PAYS", add_pays);

        setResult(RESULT_OK, doIntent3);
        finish();
    }
}

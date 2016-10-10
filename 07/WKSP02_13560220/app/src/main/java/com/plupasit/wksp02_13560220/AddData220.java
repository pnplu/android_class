package com.plupasit.wksp02_13560220;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddData220 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_addmoney);
    }
    public void onClickAddMoney (View v)
    {
        EditText add_money = (EditText)findViewById(R.id.EDTAddMoney);

        double moneys = Double.parseDouble(add_money.getText().toString());

        Intent doIntent2 = new Intent();

        doIntent2.putExtra("MONEYS", moneys);

        setResult(RESULT_OK, doIntent2);
        finish();
    }
}

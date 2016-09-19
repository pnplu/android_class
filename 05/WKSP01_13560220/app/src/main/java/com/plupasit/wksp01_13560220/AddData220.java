package com.plupasit.wksp01_13560220;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddData220 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddata);
    }
    public void onClickAddToMain (View v)
    {
        EditText food_name = (EditText)findViewById(R.id.ETFood);
        EditText qualtity_n = (EditText)findViewById(R.id.ETQualtity);
        EditText calorie_n = (EditText)findViewById(R.id.ETCalorie);

        String foodn = food_name.getText().toString();
        int qualtityn = Integer.parseInt(qualtity_n.getText().toString());
        double calorien = Double.parseDouble(calorie_n.getText().toString());

        Intent doIntern2 = new Intent();

        doIntern2.putExtra("FOOD", foodn);
        doIntern2.putExtra("QUALITUTY", qualtityn);
        doIntern2.putExtra("CALORIE", calorien);

        setResult(RESULT_OK, doIntern2);
        finish();
    }
}

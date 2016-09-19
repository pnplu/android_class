package com.plupasit.wksp01_13560220;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.plupasit.wksp01_13560220.Adapter.Adapter220;
import com.plupasit.wksp01_13560220.DataModel.DataModel220;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataModel220> dataset;
    private Adapter220 adapter;
    private double total;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 5){
            if(resultCode == RESULT_OK){
                String foodname = data.getStringExtra("FOOD");
                int qualtityname = data.getIntExtra("QUALITUTY", -1);
                double caloriename = data.getDoubleExtra("CALORIE", -1);

                dataset.add(new DataModel220(foodname, qualtityname, caloriename));
                adapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataset = new ArrayList<DataModel220>();
        adapter = new Adapter220(dataset);

        RecyclerView rcy = (RecyclerView)findViewById(R.id.RCVData);
        rcy.setLayoutManager(new LinearLayoutManager(this));
        rcy.setAdapter(adapter);



    }

    public void onClickAddContact(View v)
    {
        Intent doIntent= new Intent(this, AddData220.class);
        startActivityForResult(doIntent, 5);
    }
}

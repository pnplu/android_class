package com.plupasit.wksp02_13560220;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.plupasit.wksp02_13560220.Adapter.Adapter220;
import com.plupasit.wksp02_13560220.DataModel.Datamodel220;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Datamodel220> dataset;
    private Adapter220 adapter;
    private double total;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 5){
            if(resultCode == RESULT_OK){
                double add_money = data.getDoubleExtra("MONEYS", -1);

                dataset.add(new Datamodel220(add_money));
                total = total+add_money;
                TextView total_tv = (TextView)findViewById(R.id.TVMoney);
                total_tv.setText(""+total);

                adapter.notifyDataSetChanged();
            }
        }
        else if(requestCode == 10){
            if(resultCode == RESULT_OK){
                double pay_money = data.getDoubleExtra("PAYS", -1);
                String name_pay = data.getStringExtra("NAMES");

                dataset.add(new Datamodel220(pay_money, name_pay));
                total = total-pay_money;
                TextView total_tv = (TextView)findViewById(R.id.TVMoney);
                total_tv.setText(""+total);

                adapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataset = new ArrayList<Datamodel220>();
        adapter = new Adapter220(dataset);

        RecyclerView rcy = (RecyclerView)findViewById(R.id.RCVData);
        rcy.setLayoutManager(new LinearLayoutManager(this));
        rcy.setAdapter(adapter);

        ServerConnector connector = new ServerConnector();
        String result = connector.connect("index.php",true);

        //Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        TextView tv = (TextView)findViewById(R.id.TVTopic);
        tv.setText(result);
    }
    public void onClickAddMoney2(View v)
    {
        Intent doIntent = new Intent(this, AddData220.class);
        startActivityForResult(doIntent,5);
    }
    public void onClickPayMoney2(View v)
    {
        Intent doIntent = new Intent(this, PayData220.class);
        startActivityForResult(doIntent,10);
    }
}

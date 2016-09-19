package com.plupasit.contactmemory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.plupasit.contactmemory.Adapter.ContactAdapter;
import com.plupasit.contactmemory.Model.ContactModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 1. Data List
    private ArrayList<ContactModel> dataset;
    // 2. Init Adapter
    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 3. New Data List
        dataset = new ArrayList<ContactModel>();

        // 4. New Adapter
        adapter = new ContactAdapter(dataset);

        // 5. Call RecylerView
        RecyclerView rcy = (RecyclerView)findViewById(R.id.RCVData);

        // 6. Set Adapter
        rcy.setLayoutManager(new LinearLayoutManager(this));
        rcy.setAdapter(adapter);
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

                // Add to Data List
                dataset.add(new ContactModel(name, tel));

                // Update Adapter
                adapter.notifyDataSetChanged();

                //2. Reference TextView  ra
                //TextView tv = (TextView) findViewById(R.id.TV01);

                //3. Set text to TextView
                //tv.setText("Result : " + name + " : " + tel);
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

package com.plupasit.wksp02_13560220;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.plupasit.wksp02_13560220.DataModel.EntityModel;

/**
 * Created by pnplu on 11/21/2016 AD.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClickSignIn(View v)
    {
        EditText username_edt = (EditText) findViewById(R.id.EDTUsername);
        EditText password_edt = (EditText) findViewById(R.id.EDTPassword);

        EntityModel entity = new EntityModel();

        ///Assign Date to EntityModel object
        entity.getValues().put("login_username",username_edt.getText().toString());
        entity.getValues().put("login_password",password_edt.getText().toString());

        ///Create ServerConnector object
        ServerConnector connector = new ServerConnector();

        ///Connect web page with EntityModel object
        String stringresult = connector.connect("getusersignin.php",true,entity);

        Toast.makeText(this,stringresult,Toast.LENGTH_SHORT).show();

        ///Get JSON
    }

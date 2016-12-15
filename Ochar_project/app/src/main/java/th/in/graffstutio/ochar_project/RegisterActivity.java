package th.in.graffstutio.ochar_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText EDTUser = (EditText) findViewById(R.id.EDTUsernameRegis);
        final EditText EDTPass = (EditText) findViewById(R.id.EDTPasswordRegis);
        final EditText EDTMail = (EditText) findViewById(R.id.EDTEmailRegis);

        final Button BTNRegis = (Button) findViewById(R.id.BTNRegister);
    }
}

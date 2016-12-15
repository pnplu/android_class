package th.in.graffstutio.ochar_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        final EditText EDTUsername = (EditText) findViewById(R.id.EDTUsernameShow);
        final EditText EDTEmail = (EditText) findViewById(R.id.EDTEmailShow);
    }
}

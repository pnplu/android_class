package th.in.graffstutio.ochar_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText EDTUsernameLog = (EditText) findViewById(R.id.EDTUsername);
        final EditText EDTPasswordLog = (EditText) findViewById(R.id.EDTPassword);
        final Button BTNLogins = (Button) findViewById(R.id.BTNLogin);
        final Button BTNToRegis = (Button) findViewById(R.id.BTNToRegister);

        BTNToRegis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                MainActivity.this.startActivity(registerIntent);
            }
        });
    }
}

package th.in.graffstutio.ochar_r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddfoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfood);
    }

    public void toProfile(View view) {
        Button to_profile = (Button) findViewById(R.id.BTNAddfood);
        Intent intent2 = new Intent(AddfoodActivity.this, ProfileActivity.class);
        startActivity(intent2);
    }
}

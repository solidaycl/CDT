package cdt.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        final Button mainButton = findViewById(R.id.mainButton_id);
        mainButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this, MainActivity.class));
            }
        });

        final Button nickNameButton = findViewById(R.id.accountButton_id);
        nickNameButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this, SignInActivity.class));



            }
        });

    }
}

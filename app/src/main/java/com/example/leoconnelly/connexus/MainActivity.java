package com.example.leoconnelly.connexus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton FindCareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FindCareButton = (findViewById(R.id.find_care_button));

        FindCareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFindCare();
            }
        });

        /*
        GetStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearchActivity();
            }
        });
         */

    }

    public void openFindCare () {
       Intent mainActivityToFindCare = new Intent (this, HealthCenterListActivity.class);
        startActivity(mainActivityToFindCare);
    }

}

package com.techkshetrainfo.techkshetrainfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class DigitalMarketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_market);
        Toolbar toolbar=findViewById(R.id.digital_tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Digital Marketing");
        toolbar.setNavigationIcon(R.drawable.ic_tool_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });

        Button contact=findViewById(R.id.digi_contact_id);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DigitalMarketActivity.this,ContactUsActivity.class));
            }
        });
    }
}

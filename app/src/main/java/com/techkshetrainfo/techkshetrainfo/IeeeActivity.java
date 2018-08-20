package com.techkshetrainfo.techkshetrainfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class IeeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ieee);

        Toolbar toolbar=findViewById(R.id.ieee_tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("IEEE Projects");
        toolbar.setNavigationIcon(R.drawable.ic_tool_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });
        Button contact=findViewById(R.id.ieee_cnt_id);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IeeeActivity.this,ContactUsActivity.class));
            }
        });
    }
}

package com.techkshetrainfo.techkshetrainfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ComplaintmanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaintman);
        Toolbar toolbar=findViewById(R.id.complaint_tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Complaint Management");
        toolbar.setNavigationIcon(R.drawable.ic_tool_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });
    }
}

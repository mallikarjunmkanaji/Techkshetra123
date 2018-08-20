package com.techkshetrainfo.techkshetrainfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class MadActivity extends AppCompatActivity {

    private ImageView shikhsa_app,mag_app;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad);
        Toolbar toolbar=findViewById(R.id.mad_tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Mobile Applications");
        toolbar.setNavigationIcon(R.drawable.ic_tool_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });
        shikhsa_app=findViewById(R.id.shiksha_app_id);
        mag_app=findViewById(R.id.mag_app_id);

        shikhsa_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://play.google.com/store/apps/details?id=com.techkshetrainfo.tps.Kshiksha";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        mag_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.techkshetrainfo.emagazine"));
                startActivity(i2);
            }
        });
    }
}

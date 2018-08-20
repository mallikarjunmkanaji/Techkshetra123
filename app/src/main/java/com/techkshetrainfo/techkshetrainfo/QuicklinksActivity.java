package com.techkshetrainfo.techkshetrainfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class QuicklinksActivity extends AppCompatActivity {

    private CardView about,privacy,support,contact,fb,twit,ln;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quicklinks);

        about=findViewById(R.id.abt_card);
        privacy=findViewById(R.id.privacy_card);
        support=findViewById(R.id.support_card);
        contact=findViewById(R.id.contact_card);
        fb=findViewById(R.id.fb_card);
        twit=findViewById(R.id.twit_card);
        ln=findViewById(R.id.in_card);

        toolbar=findViewById(R.id.quicktool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Quick Links");
        toolbar.setNavigationIcon(R.drawable.ic_tool_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });

        //About Us click
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),AboutUsActivity.class));
                // finish();
            }
        });

        //Privacy policy click
        privacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PrivacyPolicyActivity.class));
                //finish();
            }
        });

        //support us click
        support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), SupportUsActivity.class));
            }
        });

        //contact us click
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ContactFragment.class));
            }
        });

        //social icons clicks
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Thank you for following us on facebook",Toast.LENGTH_LONG).show();
            }
        });
        twit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Thank you for following us on twitter",Toast.LENGTH_LONG).show();
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Thank you for following us on linkedIn",Toast.LENGTH_LONG).show();
            }
        });
    }
}

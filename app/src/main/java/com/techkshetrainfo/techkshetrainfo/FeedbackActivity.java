package com.techkshetrainfo.techkshetrainfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedbackActivity extends AppCompatActivity {

    private Button send;
    private EditText name_et,mail_et,msg_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        send=findViewById(R.id.send_btn);
        name_et=findViewById(R.id.name_et);
        mail_et=findViewById(R.id.email_et);
        msg_et=findViewById(R.id.msg_et);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg_et.setText("");
                name_et.setText("");
                mail_et.setText("");
                Toast.makeText(getApplicationContext(),"Thank You for your feedbak",Toast.LENGTH_LONG).show();
            }
        });
    }
}

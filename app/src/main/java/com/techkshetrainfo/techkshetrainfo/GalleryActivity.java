package com.techkshetrainfo.techkshetrainfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class GalleryActivity extends AppCompatActivity {

    private ImageView reception,conference,discussion,work1,work2,work3;
    private Toolbar toolbar;
    TextView tv1,tv2;
    private String fullScreenInd1,fullScreenInd2,fullScreenInd3,fullScreenInd4,fullScreenInd5,fullScreenInd6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        toolbar=findViewById(R.id.gal_tool);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Gallery");
        toolbar.setNavigationIcon(R.drawable.ic_tool_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });

        reception=findViewById(R.id.recep_img);
        conference=findViewById(R.id.conf_img);
        discussion=findViewById(R.id.disc_img);
        work1=findViewById(R.id.work_img);
        work2=findViewById(R.id.work2_img);
        work3=findViewById(R.id.work3_img);

        fullScreenInd1 = getIntent().getStringExtra("fullScreenIndicator");
        if ("y".equals(fullScreenInd1)) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getSupportActionBar().hide();
            reception.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
            reception.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            reception.setAdjustViewBounds(false);
            reception.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        reception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this,
                        GalleryActivity.class);

                if("y".equals(fullScreenInd1)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                GalleryActivity.this.startActivity(intent);

            }
        });

        fullScreenInd2 = getIntent().getStringExtra("fullScreenIndicator");
        if ("y".equals(fullScreenInd2)) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            conference.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
            conference.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            conference.setAdjustViewBounds(false);
            conference.setScaleType(ImageView.ScaleType.FIT_XY);
        }

        conference.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this,
                        GalleryActivity.class);

                if("y".equals(fullScreenInd2)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                GalleryActivity.this.startActivity(intent);

            }
        });
        fullScreenInd3 = getIntent().getStringExtra("fullScreenIndicator");
        if ("y".equals(fullScreenInd3)) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            discussion.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
            discussion.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            discussion.setAdjustViewBounds(false);
            discussion.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        discussion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this,
                        GalleryActivity.class);

                if("y".equals(fullScreenInd3)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                GalleryActivity.this.startActivity(intent);

            }
        });
        fullScreenInd4 = getIntent().getStringExtra("fullScreenIndicator");
        if ("y".equals(fullScreenInd4)) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            work1.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
            work1.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            work1.setAdjustViewBounds(false);
            work1.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        work1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(GalleryActivity.this,
                        GalleryActivity.class);

                if("y".equals(fullScreenInd4)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                GalleryActivity.this.startActivity(intent);

            }
        });
        fullScreenInd5 = getIntent().getStringExtra("fullScreenIndicator");
        if ("y".equals(fullScreenInd5)) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            work2.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
            work2.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            work2.setAdjustViewBounds(false);
            work2.setScaleType(ImageView.ScaleType.FIT_XY);
        }

        work2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this,
                        GalleryActivity.class);

                if("y".equals(fullScreenInd5)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                GalleryActivity.this.startActivity(intent);

            }
        });
        fullScreenInd6 = getIntent().getStringExtra("fullScreenIndicator");
        if ("y".equals(fullScreenInd6)) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            work3.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
            work3.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            work3.setAdjustViewBounds(false);
            work3.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        work3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GalleryActivity.this,
                        GalleryActivity.class);

                if("y".equals(fullScreenInd6)){
                    intent.putExtra("fullScreenIndicator", "");
                }else{
                    intent.putExtra("fullScreenIndicator", "y");
                }
                GalleryActivity.this.startActivity(intent);
            }
        });

    }
}

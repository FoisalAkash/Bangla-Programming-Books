package com.sky.coderx.programmingbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
CardView c_CV,php_CV,java_CV,android_CV,html_CV,css_CV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        c_CV=findViewById(R.id.c);
        php_CV=findViewById(R.id.php);
        java_CV=findViewById(R.id.java);
        android_CV=findViewById(R.id.android);
        html_CV=findViewById(R.id.html);
        css_CV=findViewById(R.id.css);


        c_CV.setOnClickListener(this);
        php_CV.setOnClickListener(this);
        android_CV.setOnClickListener(this);
        java_CV.setOnClickListener(this);
        html_CV.setOnClickListener(this);
        css_CV.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.c)
        {
            Intent intent= new Intent(MainActivity.this,PdfFileViewer.class);
            intent.putExtra("language","c");
            startActivity(intent);

        }
        else if(v.getId()==R.id.php)
        {
            Intent intent= new Intent(MainActivity.this,PdfFileViewer.class);
            intent.putExtra("language","php");
            startActivity(intent);

        }
        else if(v.getId()==R.id.android)
        {
            Intent intent= new Intent(MainActivity.this,PdfFileViewer.class);
            intent.putExtra("language","android");
            startActivity(intent);

        }
        else if(v.getId()==R.id.java)
        {
            Intent intent= new Intent(MainActivity.this,PdfFileViewer.class);
            intent.putExtra("language","java");
            startActivity(intent);

        }
        else if(v.getId()==R.id.html)
        {
            Intent intent= new Intent(MainActivity.this,PdfFileViewer.class);
            intent.putExtra("language","html");
            startActivity(intent);

        }
        else if(v.getId()==R.id.css)
        {
            Intent intent= new Intent(MainActivity.this,PdfFileViewer.class);
            intent.putExtra("language","css");
            startActivity(intent);

        }




    }
}

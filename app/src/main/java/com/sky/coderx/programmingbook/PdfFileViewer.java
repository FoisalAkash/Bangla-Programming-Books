package com.sky.coderx.programmingbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;

public class PdfFileViewer extends AppCompatActivity {
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_file_viewer);
        pdfView=findViewById(R.id.pdfFileViewer);
        String language= getIntent().getStringExtra("language");

        if(language.equals("c"))
        {
            getSupportActionBar().setTitle("C Bangla Book");
            Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_SHORT).show();
            pdfView.fromAsset("c.pdf").load();
        }
        else if(language.equals("php"))
        {
            getSupportActionBar().setTitle("PHP Bangla Book");
            Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_SHORT).show();
            pdfView.fromAsset("php.pdf").load();
        }
        else if(language.equals("android"))
        {
            getSupportActionBar().setTitle("Android Bangla Book");
            Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_SHORT).show();
            pdfView.fromAsset("android.pdf").load();
        }
        else if(language.equals("java"))
        {
            getSupportActionBar().setTitle("Java Bangla Book");
            Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_SHORT).show();
            pdfView.fromAsset("java.pdf").load();
        }
        else if(language.equals("html"))
        {
            getSupportActionBar().setTitle("HTML Bangla Book");
            Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_SHORT).show();
            pdfView.fromAsset("html.pdf").load();
        }
        else if(language.equals("css"))
        {
            getSupportActionBar().setTitle("CSS Bangla Book");
            Toast.makeText(getApplicationContext(),"Loading....",Toast.LENGTH_SHORT).show();
            pdfView.fromAsset("css.pdf").load();
        }



    }
}

package com.example.enggarputra.enggarputra_1202150005_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        a = (TextView) findViewById(R.id.restaurant);
        b = (TextView) findViewById(R.id.makanan);
        c = (TextView) findViewById(R.id.jumlah);
        d = (TextView) findViewById(R.id.total);

        if (getIntent().getExtras()!=null){
            Bundle bundle = getIntent().getExtras();
            a.setText(bundle.getString("restaurant"));
            b.setText(bundle.getString("makanan"));
            c.setText(bundle.getString("jumlah"));
            d.setText(bundle.getString("total"));
        }
        else{
            a.setText(getIntent().getStringExtra("restaurant"));
            b.setText(getIntent().getStringExtra("makanan"));
            c.setText(getIntent().getStringExtra("jumlah"));
            d.setText(getIntent().getStringExtra("total"));
        }

    }
}
package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DonutDetail extends AppCompatActivity {
    private TextView txtTen,txtGia,txtMoTa;
    private ImageView imgBanh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donut_detail);
        Intent intent = getIntent();
        int img = intent.getIntExtra("img",0);
        String ten = intent.getStringExtra("ten");
        String gia = intent.getStringExtra("gia");
        String mota = intent.getStringExtra("mota");
        imgBanh = findViewById(R.id.imageView);
        imgBanh.setImageResource(img);
        txtTen = findViewById(R.id.tenbanh);
        txtTen.setText(ten);
        txtGia = findViewById(R.id.giaDonut);
        txtGia.setText(gia);
        txtMoTa = findViewById(R.id.motaDetail);
        txtMoTa.setText(mota);

    }
}
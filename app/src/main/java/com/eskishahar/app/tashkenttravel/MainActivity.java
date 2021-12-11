package com.eskishahar.app.tashkenttravel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FrameLayout mosques = findViewById(R.id.mosques);
        final FrameLayout hotels = findViewById(R.id.hotels);
        final FrameLayout shopping = findViewById(R.id.shopping);
        final FrameLayout museumsZoo = findViewById(R.id.museum);

        mosques.setOnClickListener(this);
        hotels.setOnClickListener(this);
        shopping.setOnClickListener(this);
        museumsZoo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mosques:
                Intent mosques = new Intent(MainActivity.this, MosquePagerAdapter.class);
                startActivity(mosques);
                break;

            case R.id.hotels:
                Intent hotels = new Intent(MainActivity.this, HotelsPagerAdapter.class);
                startActivity(hotels);
                break;

            case R.id.shopping:
                Intent shopping = new Intent(MainActivity.this, ShoppingsPagerAdapter.class);
                startActivity(shopping);
                break;

            case R.id.museum:
                Intent museum = new Intent(MainActivity.this, MuseumZooPagerAdapter.class);
                startActivity(museum);
                break;
        }
    }
}
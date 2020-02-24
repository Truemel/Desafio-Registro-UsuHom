package com.example.desafio_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView image = findViewById(R.id.homeImg);
        Picasso.get().load("https://guide.fire-emblem-heroes.com/wp-content/uploads/myrrh_great_dragon_slide03.png").into(image);
    }
}

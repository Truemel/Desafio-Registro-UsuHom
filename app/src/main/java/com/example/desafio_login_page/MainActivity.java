package com.example.desafio_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image;
    private EditText ediNom, ediPass;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imaVi);
        Picasso.get().load("https://guide.fire-emblem-heroes.com/wp-content/uploads/myrrh_great_dragon.png").into(image);

        ediNom = findViewById(R.id.nombre);
        ediPass = findViewById(R.id.passw);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Usuario ingresado con éxito", Toast.LENGTH_SHORT).show();
    }
}

package com.example.desafio_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView image;
    private EditText ediNom, ediPass;
    private Button button, register;

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
        register = findViewById(R.id.butRegi);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent inten;
        if(v.getId() == button.getId())
            inten = actInten(Home.class);
        else
            inten = actInten(UserRegisterActivity.class);
        startActivity(inten);
        //Toast.makeText(this, "Usuario ingresado con éxito", Toast.LENGTH_SHORT).show();
    }

    private Intent actInten(Class c){
        return new Intent(this, c);
    }
}

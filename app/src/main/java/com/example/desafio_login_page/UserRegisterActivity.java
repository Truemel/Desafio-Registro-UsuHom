package com.example.desafio_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class UserRegisterActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    private Button regist;
    private EditText name, email, pass, passConf;
    private Spinner spinAge;
    private RadioButton male, fem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        regist = findViewById(R.id.regBut);
        regist.setOnClickListener(this);

        name = findViewById(R.id.nombre);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        passConf = findViewById(R.id.conPass);

        spinAge = findViewById(R.id.spinAge);
        spinAge.setOnItemClickListener(this);

        male = findViewById(R.id.radM);
        fem = findViewById(R.id.radF);
    }

    @Override
    public void onClick(View v) {
        String aux = "Registrando a ";
        if(male.isChecked())
            aux += "señor "+name.getText()+" edad: "+spinAge.getSelectedItem().toString();
        else
            aux += "señora "+name.getText()+" edad: "+spinAge.getSelectedItem().toString();

        Toast.makeText(this, aux, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}

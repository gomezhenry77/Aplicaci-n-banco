package com.example.appbanco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //instanciar cada elemento de la vista
        setContentView(R.layout.activity_main);
        EditText email=findViewById(R.id.etmail);
        EditText password=findViewById(R.id.etpassword);
        Button startsesion =findViewById(R.id.btnstartsesion);
        TextView reglink = findViewById(R.id.tvregister);

        //evento para que cuando le den clic a registrarse aquí lo lleve a la pantalla de registro
        reglink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //el método startActivity lo manda a la otra vista, Register es donde queremos ir
                //le agregamos el class para que sea el compilado
                startActivity(new Intent(getApplicationContext(),Register.class));
            }
        });
    }
}
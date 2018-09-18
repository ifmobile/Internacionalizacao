package com.example.professor.internacionalizacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtPais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPais = findViewById(R.id.btnPais);
        txtPais = findViewById(R.id.txtPais);

        btnPais.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        txtPais.setText(R.string.pais);
        txtPais.setVisibility(View.VISIBLE);
    }
}

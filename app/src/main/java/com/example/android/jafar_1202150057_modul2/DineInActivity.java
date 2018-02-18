package com.example.android.jafar_1202150057_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Jafar on 16/02/2018.
 */

public class DineInActivity extends AppCompatActivity { //membuat class untuk dine in

    Button memilihorder;
    Spinner macammeja;

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dinein);

        memilihorder = findViewById(R.id.button3);
        macammeja = findViewById(R.id.spinner2);

        memilihorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(DineInActivity.this, macammeja.getSelectedItem().toString(), Toast.LENGTH_SHORT);
                toast.show();

                Intent intent = new Intent(DineInActivity.this, DaftarMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

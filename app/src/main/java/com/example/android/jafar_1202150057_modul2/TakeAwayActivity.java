package com.example.android.jafar_1202150057_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jafar on 16/02/2018.
 */

public class TakeAwayActivity extends AppCompatActivity{

    Button memilihorder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.takeaway);

        memilihorder = findViewById(R.id.button2);

        memilihorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TakeAwayActivity.this, DaftarMenuActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
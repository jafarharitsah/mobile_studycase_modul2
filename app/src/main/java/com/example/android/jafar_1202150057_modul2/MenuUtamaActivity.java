package com.example.android.jafar_1202150057_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Jafar on 16/02/2018.
 */

public class MenuUtamaActivity extends AppCompatActivity { //membuat class pada menu utama

    RadioGroup radioGroup;
    Button button_pesan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.detail_menu);
        setContentView(R.layout.menu_utama);

        Toast toast = Toast.makeText(MenuUtamaActivity.this, "JAFARHARITSAH_1202150057", Toast.LENGTH_SHORT);
        toast.show();

        radioGroup = findViewById(R.id.radioButton_group);
        button_pesan = findViewById(R.id.button_pesan_menuUtama);

        button_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.radioButton_dine: {
                        Toast toastDineIn = Toast.makeText(MenuUtamaActivity.this, "Dine In", Toast.LENGTH_SHORT);
                        toastDineIn.show();

                        Intent intent = new Intent(MenuUtamaActivity.this, DineInActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.radioButton_take: {
                        Toast toastTakeAway = Toast.makeText(MenuUtamaActivity.this, "Take Away", Toast.LENGTH_SHORT);
                        toastTakeAway.show();

                        Intent intent = new Intent(MenuUtamaActivity.this, TakeAwayActivity.class);
                        startActivity(intent);
                        break;
                    }
                }
            }
        });
    }
}

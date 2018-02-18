package com.example.android.jafar_1202150057_modul2;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.jafar_1202150057_modul2.R;

/**
 * Created by Jafar on 16/02/2018.
 */

public class DetailMenuActivity extends AppCompatActivity { //membuat class untuk detail menu nya

    ImageView menuImage;
    TextView menuNama;
    TextView menuHarga;
    TextView menuKomposisi;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_menu);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        menuImage = findViewById(R.id.imageView_detailMenu);
        menuNama = findViewById(R.id.textView_nama_menu);
        menuHarga = findViewById(R.id.textView_harga_menu);
        menuKomposisi = findViewById(R.id.textView_komposisi);

        Bundle bundle = getIntent().getExtras();

        assert bundle != null;
        menuImage.setImageResource(bundle.getInt("imageId"));
        menuNama.setText(bundle.getString("nama"));
        menuHarga.setText(bundle.getString("harga"));
        menuKomposisi.setText(bundle.getString("komposisi"));
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

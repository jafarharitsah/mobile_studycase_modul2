package com.example.android.jafar_1202150057_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.jafar_1202150057_modul2.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jafar on 16/02/2018.
 */

public class DaftarMenuActivity extends AppCompatActivity { //membuat class untuk daftar menu nya

    RecyclerView recyclerView_daftarMenu;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daftar_menu);

        recyclerView_daftarMenu = findViewById(R.id.recyclerView_daftarMenu);

        AdapterMenu AdapterMenu = new AdapterMenu(DaftarMenuActivity.this, getMenu());
        AdapterMenu.setClickListener(new ClickListener() {
            @Override
            public void clickItem(View view, int position) {
                TextView nama = view.findViewById(R.id.textView_recyclerNamaMenu);
                TextView harga = view.findViewById(R.id.textView_recyclerHargaMenu);
                ImageView imageView = view.findViewById(R.id.imageView_recyclerMenuImage);
                Intent intent = new Intent(DaftarMenuActivity.this, DetailMenuActivity.class);

                intent.putExtra("imageId", (int) imageView.getTag());
                intent.putExtra("nama", nama.getText());
                intent.putExtra("harga", harga.getText());
                intent.putExtra("komposisi", getMenu().get(position).menuKomposisi);

                startActivity(intent);
            }
        });

        recyclerView_daftarMenu.setAdapter(AdapterMenu);
        recyclerView_daftarMenu.setLayoutManager(new LinearLayoutManager(DaftarMenuActivity.this));
    }

    public List<Menu> getMenu() {
        List<Menu> menus = new ArrayList<>();

        menus.add(new Menu(R.drawable.q, "nasi_goreng", "15.000", "nasi, minyak, telur, kecap"));
        menus.add(new Menu(R.drawable.e, "mie_goreng", "10.000", "mie, air, telur, cabai"));
        menus.add(new Menu(R.drawable.a, "mie_kuah", "10.000", "mie,air, cabai, telur, sayuran"));
        menus.add(new Menu(R.drawable.b, "sate_madura", "25.000", "daging, minyak, bumbu, kecap"));
        menus.add(new Menu(R.drawable.f, "nasi_wagyu", "30.000", "nasi, cabai, bawang, telur"));
        menus.add(new Menu(R.drawable.c, "mie_kuah_upnormal", "15.000", "mie, air, telur, daging"));
        menus.add(new Menu(R.drawable.d, "nasi_goreng_bawang", "25.000", "nasi, telur, minyak, bawang"));

        return menus;
    }
}

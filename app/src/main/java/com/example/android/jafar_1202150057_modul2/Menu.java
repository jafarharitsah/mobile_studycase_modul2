package com.example.android.jafar_1202150057_modul2;

import android.graphics.drawable.Drawable;

/**
 * Created by Jafar on 16/02/2018.
 */

public class Menu { //membuat class pada menu
    public int menuImage;
    public String menuNama;
    public String menuHarga;
    public String menuKomposisi;

    public Menu(int menuImage, String menuNama, String menuHarga, String menuKomposisi) {
        this.menuImage = menuImage;
        this.menuNama = menuNama;
        this.menuHarga = menuHarga;
        this.menuKomposisi = menuKomposisi;
    }
}

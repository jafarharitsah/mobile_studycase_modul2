package com.example.android.jafar_1202150057_modul2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jafar on 16/02/2018.
 */

public class AdapterMenu extends RecyclerView.Adapter<MenuViewHolder> {

    List<Menu> menus = new ArrayList<>();

    Context context;
    static ClickListener clickListener;
    private LayoutInflater layoutInflater;

    public AdapterMenu(Context context, List<Menu> menus) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menus = menus;
    }

    public void setClickListener(ClickListener clickListener) {
        AdapterMenu.clickListener = clickListener;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.menu_item, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        Menu currentMenu = menus.get(position);
        holder.menuNama.setText(currentMenu.menuNama);
        holder.menuHarga.setText(currentMenu.menuHarga);
        holder.menuImage.setImageResource(currentMenu.menuImage);
        holder.menuImage.setTag(currentMenu.menuImage);
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }
}

class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView menuImage;
    TextView menuNama;
    TextView menuHarga;

    public MenuViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        menuImage = itemView.findViewById(R.id.imageView_recyclerMenuImage);
        menuNama = itemView.findViewById(R.id.textView_recyclerNamaMenu);
        menuHarga = itemView.findViewById(R.id.textView_recyclerHargaMenu);
    }

    @Override
    public void onClick(View view) {
        AdapterMenu.clickListener.clickItem(view, getAdapterPosition());
    }
}

interface ClickListener {
    void clickItem(View view, int position);
}

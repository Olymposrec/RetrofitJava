package com.melihakkose.retrofitjava.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.melihakkose.retrofitjava.R;
import com.melihakkose.retrofitjava.model.CryptoModel;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    //ADAPTER' IN KULLANACAGI VERI LISTESI
    private ArrayList<CryptoModel> cryptoList;

    //ADAPTER ICIN ISTENILEN RENK HEX KODLARI
    private String[] colors={"#003049","#ff0040","#f77f00","#f4d02d","#3fe491","#97e7ee","#e372de","#ffe808","#ee7214"};

    public RecyclerViewAdapter(ArrayList<CryptoModel> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.row_layout,parent,false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoList.get(position),colors,position);
    }

    //CEKİLEN VERİ KADAR ROW OLUSTURULUR
    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    //ADAPTER YER TUTUCU
    public class RowHolder extends RecyclerView.ViewHolder {

        TextView textName;
        TextView textPrice;

        public RowHolder(@NonNull View itemView) {
            super(itemView);
        }

        //VERILERI YERLESTIRME ISLEMI
        public void bind(CryptoModel cryptoModel,String[] colors, Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position%9]));
            textName=itemView.findViewById(R.id.textView);
            textPrice=itemView.findViewById(R.id.textView2);
            textName.setText(cryptoModel.currency);
            textPrice.setText(cryptoModel.price);


        }

    }
}

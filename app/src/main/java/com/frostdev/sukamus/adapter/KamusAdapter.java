package com.frostdev.sukamus.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.frostdev.sukamus.R;
import com.frostdev.sukamus.model.ModelKamus;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class KamusAdapter extends RecyclerView.Adapter<KamusAdapter.KamusHolder> {

    private ArrayList<ModelKamus> mData = new ArrayList<>();
    private Context context;

    public KamusAdapter(Context context) {
        this.context = context;
    }

    public void addItem(ArrayList<ModelKamus> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }

    public void replaceItem(ArrayList<ModelKamus> mData) {
        this.mData = mData;
        notifyDataSetChanged();
    }

    @Override
    public KamusHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_kamus, parent, false);
        return new KamusHolder(view);
    }

    @Override
    public void onBindViewHolder(KamusHolder holder, int position) {
        holder
                .txtKata
                .setText(mData.get(position)
                        .getKata());
        holder
                .txtDeskripsi
                .setText(mData.get(position)
                        .getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class KamusHolder extends RecyclerView.ViewHolder {

        @SuppressLint("NonConstantResourceId")
        @BindView(R.id.txt_kata)
        TextView txtKata;
        @SuppressLint("NonConstantResourceId")
        @BindView(R.id.txt_deskripsi)
        TextView txtDeskripsi;

        public KamusHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

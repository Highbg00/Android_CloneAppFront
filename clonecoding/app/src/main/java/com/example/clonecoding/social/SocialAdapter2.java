package com.example.clonecoding.social;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonecoding.R;


import java.util.ArrayList;

public class SocialAdapter2 extends RecyclerView.Adapter<SocialAdapter2.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<SocialDTO> list ;

    public SocialAdapter2(LayoutInflater inflater, ArrayList<SocialDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SocialAdapter2.ViewHolder(inflater.inflate(R.layout.item_social2,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgv.setImageResource(list.get(position).getImgv());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgv = itemView.findViewById(R.id.shee);
        }

    }
}

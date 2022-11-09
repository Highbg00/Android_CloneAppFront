package com.example.clonecoding.social;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonecoding.R;


import java.util.ArrayList;

public class SocialAdapter extends RecyclerView.Adapter<SocialAdapter.ViewHolder>{
    LayoutInflater inflater;
    ArrayList<SocialDTO> list ;

    public SocialAdapter(LayoutInflater inflater, ArrayList<SocialDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SocialAdapter.ViewHolder(inflater.inflate(R.layout.item_social,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgv.setImageResource(list.get(position).getImgv());
        holder.id_id.setText(list.get(position).getId_id());
        holder.statement.setText(list.get(position).getStatement());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgv;
        TextView id_id, statement;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgv = itemView.findViewById(R.id.imgv_profile);
            id_id = itemView.findViewById(R.id.id_id);
            statement = itemView.findViewById(R.id.statement);

        }

    }
}

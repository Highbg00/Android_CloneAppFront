package com.example.clonecoding.explore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
;import com.example.clonecoding.R;

import java.util.ArrayList;

public class ExploreAdapter2 extends RecyclerView.Adapter<ExploreAdapter2.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<Explore2DTO> list;

    public ExploreAdapter2(LayoutInflater inflater, ArrayList<Explore2DTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ExploreAdapter2.ViewHolder(inflater.inflate(R.layout.item_explore2, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.exp2_image.setImageResource(list.get(position).getBroadview());
        holder.imgv_profile.setImageResource(list.get(position).getImgv());
        holder.exp2_cont.setText(list.get(position).getCont());
        holder.exp2_id.setText(list.get(position).getId());
        holder.exp2_content.setText(list.get(position).getContents());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView exp2_image, imgv_profile;
        TextView exp2_cont, exp2_id, exp2_content;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            exp2_image = itemView.findViewById(R.id.exp2_image);
            imgv_profile = itemView.findViewById(R.id.imgv_profile);
            exp2_cont = itemView.findViewById(R.id.exp2_cont);
            exp2_id = itemView.findViewById(R.id.exp2_id);
            exp2_content = itemView.findViewById(R.id.exp2_content);
        }

    }
}

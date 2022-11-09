package com.example.clonecoding.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonecoding.R;
import com.example.clonecoding.explore.ExploreDTO;

import java.util.ArrayList;

public class Search3Adapter extends RecyclerView.Adapter<Search3Adapter.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<ExploreDTO> list ;

    public Search3Adapter(LayoutInflater inflater, ArrayList<ExploreDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_search3, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.category_img.setImageResource(list.get(i).getCategory_img());
        holder.category_title.setText(list.get(i).getCategory_title());
        holder.viewers.setText(list.get(i).getViewers());
        holder.contents_category.setText(list.get(i).getContents_category());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView category_img;
        TextView category_title, viewers, contents_category;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            category_img = itemView.findViewById(R.id.category_img);
            category_title = itemView.findViewById(R.id.category_title);
            viewers = itemView.findViewById(R.id.viewers);
            contents_category = itemView.findViewById(R.id.contents_category);
        }

    }
}

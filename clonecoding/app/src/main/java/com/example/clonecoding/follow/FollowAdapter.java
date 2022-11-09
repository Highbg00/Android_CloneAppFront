package com.example.clonecoding.follow;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonecoding.R;

import java.util.ArrayList;

public class FollowAdapter extends RecyclerView.Adapter<FollowAdapter.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<FollowDTO> list ;

    public FollowAdapter(LayoutInflater inflater, ArrayList<FollowDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_follow, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.broadcast.setImageResource(list.get(i).getBroadcast());
        holder.imgv_profile.setImageResource(list.get(i).getImgv_profile());
        holder.broadcast_title.setText(list.get(i).getBroadcast_title());
        holder.broadcast_contents.setText(list.get(i).getBroadcast_contents());
        holder.contents_theme.setText(list.get(i).getContents_theme());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView broadcast, imgv_profile;
        TextView broadcast_title, broadcast_contents, contents_theme;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            broadcast = itemView.findViewById(R.id.broadcast);
            imgv_profile = itemView.findViewById(R.id.imgv_profile);
            broadcast_title = itemView.findViewById(R.id.broadcast_title);
            broadcast_contents = itemView.findViewById(R.id.broadcast_contents);
            contents_theme = itemView.findViewById(R.id.contents_theme);
        }
    }
}

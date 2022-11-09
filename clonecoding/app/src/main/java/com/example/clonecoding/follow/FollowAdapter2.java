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

public class FollowAdapter2 extends RecyclerView.Adapter<FollowAdapter2.ViewHolder> {

    LayoutInflater inflater;
    ArrayList<FollowDTO> list ;

    public FollowAdapter2(LayoutInflater inflater, ArrayList<FollowDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_off,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.imgv_profile.setImageResource(list.get(i).getImgv_profile());
        holder.off_id.setText(list.get(i).getBroadcast_title());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgv_profile;
        TextView off_id, off_new;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgv_profile = itemView.findViewById(R.id.imgv_profile);
            off_id = itemView.findViewById(R.id.off_id);
            off_new = itemView.findViewById(R.id.off_new);
        }
    }
}

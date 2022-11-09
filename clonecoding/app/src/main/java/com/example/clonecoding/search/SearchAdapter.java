package com.example.clonecoding.search;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonecoding.R;
import com.example.clonecoding.follow.FollowAdapter;
import com.example.clonecoding.follow.FollowDTO;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder>{

    LayoutInflater inflater;
    ArrayList<SearchDTO> list ;

    public SearchAdapter(LayoutInflater inflater, ArrayList<SearchDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public SearchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SearchAdapter.ViewHolder(inflater.inflate(R.layout.tiem_search1, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull SearchAdapter.ViewHolder holder, int i) {
        holder.broadcastimage.setImageResource(list.get(i).getBroadview());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView broadcastimage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            broadcastimage = itemView.findViewById(R.id.first_search);


        }
    }
}

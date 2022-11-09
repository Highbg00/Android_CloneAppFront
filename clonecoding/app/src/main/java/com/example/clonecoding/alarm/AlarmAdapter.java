package com.example.clonecoding.alarm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.clonecoding.R;


import java.util.ArrayList;

public class AlarmAdapter extends RecyclerView.Adapter<AlarmAdapter.ViewHolder>{

    LayoutInflater inflater;
    ArrayList<AlarmDTO> list ;

    public AlarmAdapter(LayoutInflater inflater, ArrayList<AlarmDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(inflater.inflate(R.layout.item_alarm, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.alarm_content.setText(list.get(position).getAlarm_content());
        holder.alarm_date.setText(list.get(position).getAlarm_date());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView alarm_content, alarm_date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            alarm_content = itemView.findViewById(R.id.alarm_content);
            alarm_date = itemView.findViewById(R.id.alarm_date);
        }
    }
}

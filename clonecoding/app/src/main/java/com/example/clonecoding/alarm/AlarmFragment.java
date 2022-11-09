package com.example.clonecoding.alarm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonecoding.R;

import java.util.ArrayList;

public class AlarmFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_alarm, container, false);
        RecyclerView rec_view = v.findViewById(R.id.alarm_rec);
        ArrayList<AlarmDTO> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(new AlarmDTO("이제 ios에서 더 지속적인 정기구독 방식을 이용할 수 있습니다.\n 앱스토어에서 이용하세요."
                    ,"2021.11.7 마케팅"));
        }
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext() , RecyclerView.VERTICAL , false
        );

        AlarmAdapter adapter = new AlarmAdapter(inflater,list);
        rec_view.setAdapter(adapter);
        rec_view.setLayoutManager(manager);
        return v;
    }
}
package com.example.clonecoding.follow;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonecoding.R;

import java.util.ArrayList;


public class FollowFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_follow, container, false);
        RecyclerView rec_view = rootview.findViewById(R.id.live_rec);
        RecyclerView rec_view2 = rootview.findViewById(R.id.recom_rec);
        RecyclerView rec_view3 = rootview.findViewById(R.id.continue_rec);
        RecyclerView rec_view4 = rootview.findViewById(R.id.off_rec);
        ArrayList<FollowDTO> list = new ArrayList<>();
        for (int i = 0; i < 3; i++ ) {
            list.add(new FollowDTO(R.drawable.broadcast,R.drawable.ambition,"앰비션_","안녕하세요 강자석입니다.",
                    "League of legends"));
        }
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext() , RecyclerView.VERTICAL , false
        );
        RecyclerView.LayoutManager manager2 = new LinearLayoutManager(
                getContext() , RecyclerView.VERTICAL , false
        );
        RecyclerView.LayoutManager manager3 = new LinearLayoutManager(
                getContext() , RecyclerView.VERTICAL , false
        );
        RecyclerView.LayoutManager manager4 = new LinearLayoutManager(
                getContext() , RecyclerView.VERTICAL , false
        );
        FollowAdapter adapter = new FollowAdapter(inflater,list);
        FollowAdapter2 adapter2 = new FollowAdapter2(inflater,list);
        rec_view.setAdapter(adapter);
        rec_view2.setAdapter(adapter);
        rec_view3.setAdapter(adapter);
        rec_view4.setAdapter(adapter2);
        rec_view.setLayoutManager(manager);
        rec_view2.setLayoutManager(manager2);
        rec_view3.setLayoutManager(manager3);
        rec_view4.setLayoutManager(manager4);
        return rootview;
    }
}
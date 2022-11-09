package com.example.clonecoding.search;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonecoding.R;
import com.example.clonecoding.explore.Explore2DTO;
import com.example.clonecoding.explore.ExploreAdapter;
import com.example.clonecoding.explore.ExploreAdapter2;
import com.example.clonecoding.explore.ExploreDTO;

import java.util.ArrayList;


public class SearchFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_search, container, false);
        RecyclerView rec_view = rootview.findViewById(R.id.search1_rec);
        RecyclerView rec_view2 = rootview.findViewById(R.id.search2_rec);
        RecyclerView rec_view3 = rootview.findViewById(R.id.search3_rec);
        ArrayList<SearchDTO> list = new ArrayList<>();
        ArrayList<Explore2DTO> list2 = new ArrayList<>();
        ArrayList<ExploreDTO> list3 = new ArrayList<>();
        for (int i = 0; i<3; i++) {
            list.add(new SearchDTO(R.drawable.broadcast));
        }
        for (int i = 0; i < 3; i++ ) {
            list2.add(new Explore2DTO("앰비션_","맵시즈 이와오의 마작","League of Legend",R.drawable.ambition, R.drawable.broadcast));
        }

        for (int i = 0; i < 10; i++) {
            list3.add(new ExploreDTO(R.drawable.justchat, "Just Chatting", "시청자 22.91만명", "리얼라이프"));
        }

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext() , RecyclerView.HORIZONTAL , false
        );
        RecyclerView.LayoutManager manager2 = new LinearLayoutManager(
                getContext() , RecyclerView.HORIZONTAL , false
        );
        RecyclerView.LayoutManager manager3 = new LinearLayoutManager(
                getContext() , RecyclerView.HORIZONTAL , false
        );
        SearchAdapter adapter = new SearchAdapter(inflater, list);
        ExploreAdapter2 adapter2 = new ExploreAdapter2(inflater, list2);
        Search3Adapter adapter3 = new Search3Adapter(inflater, list3);
        rec_view.setAdapter(adapter);
        rec_view2.setAdapter(adapter2);
        rec_view3.setAdapter(adapter3);
        rec_view.setLayoutManager(manager);
        rec_view2.setLayoutManager(manager2);
        rec_view3.setLayoutManager(manager3);
        return rootview;
    }
}
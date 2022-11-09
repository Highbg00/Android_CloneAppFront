package com.example.clonecoding.explore;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.clonecoding.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


import java.util.ArrayList;


public class ExploreFragment extends Fragment {
    TabLayout tabLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_explore, container, false);
        RecyclerView rec_view = rootview.findViewById(R.id.explore_frag);
        tabLayout = rootview.findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("카테고리"));
        tabLayout.addTab(tabLayout.newTab().setText("생방송 채널"));
        ArrayList<ExploreDTO> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new ExploreDTO(R.drawable.justchat, "Just Chatting", "시청자 22.91만명", "리얼라이프"));
        }
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.VERTICAL, false
        );
        ExploreAdapter adapter = new ExploreAdapter(inflater, list);
        rec_view.setAdapter(adapter);
        rec_view.setLayoutManager(manager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){

                    ArrayList<ExploreDTO> list = new ArrayList<>();
                    for (int i = 0; i < 20; i++) {
                        list.add(new ExploreDTO(R.drawable.justchat, "Just Chatting", "시청자 22.91만명", "리얼라이프"));
                    }
                    RecyclerView.LayoutManager manager = new LinearLayoutManager(
                            getContext(), RecyclerView.VERTICAL, false
                    );
                    ExploreAdapter adapter = new ExploreAdapter(inflater, list);
                    rec_view.setAdapter(adapter);
                    rec_view.setLayoutManager(manager);

                }else if(tab.getPosition() == 1){

                    ArrayList<Explore2DTO> list = new ArrayList<>();
                    for (int i = 0; i < 20; i++ ) {
                        list.add(new Explore2DTO("앰비션_","맵시즈 이와오의 마작","League of Legend",R.drawable.ambition, R.drawable.broadcast));
                    }
                    RecyclerView.LayoutManager manager = new LinearLayoutManager(
                            getContext() , RecyclerView.VERTICAL , false
                    );
                    ExploreAdapter2 adapter = new ExploreAdapter2(inflater,list);//어댑터 2개로 쓰기
                    rec_view.setAdapter(adapter);
                    rec_view.setLayoutManager(manager);

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return rootview;
    }
}
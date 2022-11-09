package com.example.clonecoding.social;

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
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class SocialFragment extends Fragment {
    TabLayout tabLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_social, container, false);
        RecyclerView rec_view = v.findViewById(R.id.social_frag);
        tabLayout = v.findViewById(R.id.tabs2);
        tabLayout.addTab(tabLayout.newTab().setText("친구"));
        tabLayout.addTab(tabLayout.newTab().setText("귓속말"));
        ArrayList<SocialDTO> list = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            list.add(new SocialDTO(R.drawable.ambition,"앰비션_","오프라인"));
        }
        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.VERTICAL, false
        );
        SocialAdapter adapter = new SocialAdapter(inflater, list);
        rec_view.setAdapter(adapter);
        rec_view.setLayoutManager(manager);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getPosition() == 0){

                    ArrayList<SocialDTO> list = new ArrayList<>();
                    for (int i = 0; i < 20; i++) {
                        list.add(new SocialDTO(R.drawable.ambition,"앰비션_","오프라인"));
                    }
                    RecyclerView.LayoutManager manager = new LinearLayoutManager(
                            getContext(), RecyclerView.VERTICAL, false
                    );
                    SocialAdapter adapter = new SocialAdapter(inflater, list);
                    rec_view.setAdapter(adapter);
                    rec_view.setLayoutManager(manager);

                }else if(tab.getPosition() == 1){
                    ArrayList<SocialDTO> list = new ArrayList<>();
                    list.add(new SocialDTO(R.drawable.sheee));
                    RecyclerView.LayoutManager manager = new LinearLayoutManager(
                            getContext(), RecyclerView.VERTICAL, false
                    );
                    SocialAdapter2 adapter = new SocialAdapter2(inflater, list);
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


        return v;
    }
}
package com.example.clonecoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.clonecoding.alarm.AlarmFragment;
import com.example.clonecoding.explore.ExploreFragment;
import com.example.clonecoding.follow.FollowFragment;
import com.example.clonecoding.search.SearchFragment;
import com.example.clonecoding.social.SocialFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActionBar actionBar;
    BottomNavigationView bottom_nav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setTitle("팔로우");


        bottom_nav = findViewById(R.id.bottom_nav);

        changeFragment(R.id.container,new FollowFragment());
        bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                for(int i = 0 ; i<bottom_nav.getMenu().size() ; i ++){
                    MenuItem tempItem  = bottom_nav.getMenu().getItem(i);
                    if(tempItem.getItemId() == R.id.tab1){
                        tempItem.setIcon(R.drawable.ic_outline_favorite_border_24);
                    }else if(tempItem.getItemId() == R.id.tab2){
                        //tempItem.setIcon(R.drawable.ic_ou);
                    }else if(tempItem.getItemId() == R.id.tab3){
                        tempItem.setIcon(R.drawable.ic_outline_file_copy_24);
                    }
                }
                //xplore.setIcon(R.drawable.ic_outline_file_copy_24);
                if(item.getItemId() == R.id.tab1){
                    item.setIcon(R.drawable.ic_baseline_favorite_24);
                    changeFragment(R.id.container,new FollowFragment());
                }else if(item.getItemId() == R.id.tab2){
                    changeFragment(R.id.container,new SearchFragment());
                }else if(item.getItemId() == R.id.tab3){
                    item.setIcon(R.drawable.ic_baseline_file_copy_24);
                    changeFragment(R.id.container,new ExploreFragment());

                } else {
                    return false;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu , menu);//제발 외우지 마세요. 가져다가 쓰는부분
        for(int i = 0 ; i<menu.size() ; i ++){
            Drawable drawable = menu.getItem(i).getIcon();
            if(drawable != null){
                drawable.mutate();
                drawable.setColorFilter(getResources().getColor(
                        R.color.black
                ) , PorterDuff.Mode.SRC_ATOP);
            }
        }
        //LayoutInflater<=레이아웃 붙이기 요거만 외우세요.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //어떤 아이템이 선택 되었는지 또 구분할수가있음.
        //각각의 메뉴가 눌리면 logd를 이용해서 찍어보기 진행.
        //+토스트창도 띄우기(뮤직<=)
        if(item.getItemId() == R.id.menu_social){
            changeFragment(R.id.container,new SocialFragment());
        }else if(item.getItemId() == R.id.menu_search){
            Toast.makeText(this, "서치 클릭 됨", Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.menu_alram){
            changeFragment(R.id.container,new AlarmFragment());
        }else if (item.getItemId() == R.id.menu_live){
            Intent intent = new Intent(MainActivity.this, LiveActivity.class);

            startActivity(intent);

        }
        
        return super.onOptionsItemSelected(item);
    }




    public void changeFragment(int container,Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(container,fragment).commit();
    }
}
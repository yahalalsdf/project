package org.techtown.project;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, fragment1).commit();

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("방송맛집"));
        tabs.addTab(tabs.newTab().setText("방송요리"));
        tabs.addTab(tabs.newTab().setText("주변맛집"));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Log.d("MainActivity", "선택된 탭 : " + position);
                if(position == 2){
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=mtp_hty.top&where=m&query=%EB%A7%9B%EC%A7%91\n"));
                    startActivity(myIntent);
                }
                Fragment selected = null;

                if (position == 0) {
                    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                    mRecyclerView.setHasFixedSize(true);
                    ArrayList<BImage> items = new ArrayList<>();
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));
                    items.add(new BImage(R.drawable.menu));

                    mLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
                    mRecyclerView.setLayoutManager(mLayoutManager);

                    mAdapter = new BAdapter(items, getApplicationContext());
                    mRecyclerView.setAdapter(mAdapter);
                    selected = fragment1;
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, selected).commit();

                } else if (position == 1) {
                    mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
                    mRecyclerView.setHasFixedSize(true);

                    ArrayList<BImage> items = new ArrayList<>();
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));
                    items.add(new BImage(R.drawable.heart));

                    mLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
                    mRecyclerView.setLayoutManager(mLayoutManager);

                    mAdapter = new BAdapter(items, getApplicationContext());
                    mRecyclerView.setAdapter(mAdapter);
                    selected = fragment2;
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.container, selected).commit();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });


          /*      if(position==0){
                    Intent myIntent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(myIntent);
                }
                else if(position==1){
                    Intent myIntent = new Intent(getApplicationContext(),SubActivity.class);
                    startActivity(myIntent);

                }
                else if(position==2){
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.search.naver.com/search.naver?sm=mtp_hty.top&where=m&query=%EB%A7%9B%EC%A7%91\n"));
                    startActivity(myIntent);
                }*/

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        ArrayList<BImage> items = new ArrayList<>();
        items.add(new BImage(R.drawable.gib));
        items.add(new BImage(R.drawable.menu));
        items.add(new BImage(R.drawable.menu));
        items.add(new BImage(R.drawable.menu));
        items.add(new BImage(R.drawable.menu));
        items.add(new BImage(R.drawable.menu));
        items.add(new BImage(R.drawable.menu));
        items.add(new BImage(R.drawable.menu));
        items.add(new BImage(R.drawable.menu));
        items.add(new BImage(R.drawable.menu));

        mLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new BAdapter(items, getApplicationContext());
        mRecyclerView.setAdapter(mAdapter);



    }


    public void onButtonClicked(View v){
        Toast.makeText(this,"확인1이 눌러졌습니다.",Toast.LENGTH_LONG).show();
    }
    public void onButtonClicked2(View v){
        Toast.makeText(this,"확인2이 눌러졌습니다.",Toast.LENGTH_LONG).show();
    }
    public void onButtonClicked3(View v){
        Toast.makeText(this,"확인3이 눌러졌습니다.",Toast.LENGTH_LONG).show();
    }




}

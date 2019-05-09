package org.techtown.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.techtown.project.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView =(RecyclerView)findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        ArrayList<BImage> items = new ArrayList<>();
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));
        items.add(new BImage(R.drawable.sumi1));


        mLayoutManager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter=new BAdapter(items,getApplicationContext());
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

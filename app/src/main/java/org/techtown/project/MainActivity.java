package org.techtown.project;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

import org.techtown.project.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        Fragment1 fragment1 = new Fragment1();
        adapter.addItem(fragment1);
        Fragment2 fragment2 = new Fragment2();
        adapter.addItem(fragment2);
        pager.setAdapter(adapter);

    }
    class MyPagerAdapter extends FragmentStatePagerAdapter{
        ArrayList<Fragment> items = new ArrayList<Fragment>();
        public MyPagerAdapter(FragmentManager fm){
            super(fm);
        }
        public void addItem(Fragment item){
            items.add(item);
        }
        public Fragment getItem(int position){
            return items.get(position);
        }
        public int getCount(){
            return items.size();
        }
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

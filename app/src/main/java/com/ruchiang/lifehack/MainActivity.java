package com.ruchiang.lifehack;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;


import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.mindfulness_report:
                    fragment = new MindfulnessReport();
//                    Toast.makeText(getApplicationContext(), "mindfulness report", Toast.LENGTH_LONG).show();
                    loadFragment(fragment);
                    return true;
                case R.id.track_mindfulness:
                    fragment = new TrackMindfulness();
//                    Toast.makeText(getApplicationContext(), "track mindfulness report", Toast.LENGTH_LONG).show();
                    loadFragment(fragment);
                    return true;
                case R.id.sleep_analysis:
                    fragment = new SleepAnalysis();
//                    Toast.makeText(getApplicationContext(), "sleep analysis", Toast.LENGTH_LONG).show();
                    loadFragment(fragment);
                    return true;
                case R.id.dashboard:
                    fragment = new DashBoard();
//                    Toast.makeText(getApplicationContext(), "dashboard", Toast.LENGTH_LONG).show();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }

    };

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = new DashBoard();
        loadFragment(fragment);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }




    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }



}

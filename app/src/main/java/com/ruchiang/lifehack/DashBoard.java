package com.ruchiang.lifehack;

import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class DashBoard extends Fragment {

    private static final String TAG = "DashBoardFrag";

    TextView stress_level;
    TextView heartbeat;
    TextView mood;
    TextView sleep_quality;
    int normal_max = 120;
    int normal_min = 70;
    Handler handler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_dashboard, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        stress_level = (TextView) view.findViewById(R.id.stress_level);
        heartbeat = (TextView) view.findViewById(R.id.heartbeat);
        mood = (TextView) view.findViewById(R.id.mood);
        sleep_quality = (TextView) view.findViewById(R.id.sleep_quality);

        stress_level.setText("38");
        heartbeat.setText("79 bpm");
        mood.setText("Calm");
        sleep_quality.setText("Excellent");


        handler = new Handler();
        handler.postDelayed(runnable, 2000);
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Random randomNum = new Random();
            int rand_num = normal_min + randomNum.nextInt(20);
            heartbeat.setText(Integer.toString(rand_num) + " bpm");
            handler.postDelayed(runnable, 5000);


        }
    };
}

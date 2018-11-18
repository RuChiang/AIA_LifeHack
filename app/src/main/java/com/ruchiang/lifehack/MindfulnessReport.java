package com.ruchiang.lifehack;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class MindfulnessReport extends Fragment {

    private static final String TAG = "HeartbeatFrag";
    TextView button;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aia.com.sg/en/life-matters/living-healthily/5-bedtime-habits-you-should-adopt-for-a-better-nights-sleep.html"));
                startActivity(browserIntent);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_report_mindfulness, container, false);
    }




}

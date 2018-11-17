package com.ruchiang.lifehack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Mindfulness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindfulness);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.mindfulness);
        item.setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Intent intent;
        switch (item.getItemId()) {
            case R.id.sleep_analysis:
                intent = new Intent(getApplicationContext(), SleepAnalysis.class);
                startActivity(intent);
                break;
            case R.id.current_heartbeat:
                intent = new Intent(getApplicationContext(), Heartbeat.class);
                startActivity(intent);
                break;
            case R.id.dashboard:
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
        }
        return false;
    }
}
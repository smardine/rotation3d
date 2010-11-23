package fr.smardine.rotation3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.android.apis.animation.Transition3d;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent intent = new Intent(this,Transition3d.class);
        startActivity(intent);
    }
}
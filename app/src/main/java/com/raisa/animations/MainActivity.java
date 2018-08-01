package com.raisa.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public  void fadeOut(View view){
        ImageView bart = (ImageView)findViewById(R.id.bartImage);
        ImageView homer = (ImageView)findViewById(R.id.homerImage);
        if(bart.getAlpha() == 1.0){
            bart.animate().alpha(0.0f).setDuration(5000);
            homer.animate().alpha( 1.0f ).setDuration( 5000 );
        } else {
            homer.animate().alpha( 0.0f ).setDuration( 5000 );
            bart.animate().alpha(1.0f).setDuration(5000);
        }

    }

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

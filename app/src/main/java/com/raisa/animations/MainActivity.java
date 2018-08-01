package com.raisa.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public  void fadeOut(View view){
        ImageView bart = (ImageView)findViewById(R.id.bartImage);
        bart.animate().alpha(0.0f).setDuration(5000);
        ImageView homer = (ImageView)findViewById(R.id.homerImage);
        homer.animate().alpha( 1.0f ).setDuration( 5000 );

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

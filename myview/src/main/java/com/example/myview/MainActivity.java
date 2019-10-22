package com.example.myview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout=(FrameLayout) findViewById(R.id.mylayout);
         final RabbitView rabbit=new RabbitView(this);
        rabbit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                rabbit.bitmapX= motionEvent.getX();
                rabbit.bitmapY=motionEvent.getY();
                rabbit.invalidate();
                return true;
            }
        });
        frameLayout.addView(rabbit);
    }
}

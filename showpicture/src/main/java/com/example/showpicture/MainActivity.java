package com.example.showpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    private  int[] arrayPicture={
            R.drawable.image1,R.drawable.image2,R.drawable.image3,
            R.drawable.image4,R.drawable.image5,R.drawable.image6,
            R.drawable.image7,R.drawable.image8,R.drawable.image9};
    private int index;
    private float touchDownX;
    private float touchUpX;
    private ImageSwitcher imageSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSwitcher=findViewById(R.id.imageswicher);
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView=new ImageView(MainActivity.this);
                imageView.setImageResource(arrayPicture[index]);
                return imageView;
            }
        });
        imageSwitcher.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    touchDownX=motionEvent.getX();
                    return true;
                }else if(motionEvent.getAction()==MotionEvent.ACTION_UP){
                    touchUpX=motionEvent.getX();
                    if(touchUpX-touchDownX>100){
                        index=index==arrayPicture.length-1?0:index+1;
                        imageSwitcher.setImageResource(arrayPicture[index]);
                    }else if(touchDownX-touchUpX>100) {
                        index = index == 0 ? arrayPicture.length - 1 : index - 1;
                        imageSwitcher.setImageResource(arrayPicture[index]);
                    }
                    return true;
                }
                return false;
            }
        });
    }
}

package com.example.qqalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int[] picture=new int[]{
            R.drawable.image1,R.drawable.image2,R.drawable.image3,
            R.drawable.image4,R.drawable.image5,R.drawable.image6,
            R.drawable.image7,R.drawable.image8,R.drawable.image9
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView=findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));
    }
    public class ImageAdapter extends BaseAdapter{
        private Context mContext;
        public ImageAdapter(Context c){
            mContext=c;
        }
        @Override
        public int getCount() {
            return picture.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            if(view==null){
                imageView=new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(300,270));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }else{
                imageView=(ImageView)view;
            }
            imageView.setImageResource(picture[i]);
            return imageView;
        }
    }
}

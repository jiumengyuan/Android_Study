package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText=findViewById(R.id.et);
        final CheckBox checkBox=findViewById(R.id.cb);
        Button button=findViewById(R.id.bt);
        final RatingBar ratingBar=findViewById(R.id.rb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="";
                str+="评价:"+editText.getText()+'\n';
                str+="星级:"+(int)ratingBar.getRating()+'\n';
                str+="是否匿名:"+(checkBox.isChecked()?"是":"否");
                Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
            }
        });
    }
}

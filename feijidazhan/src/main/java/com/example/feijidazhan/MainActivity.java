package com.example.feijidazhan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.denglu);
        Button button2=findViewById(R.id.quxiao);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox cb1=findViewById(R.id.cb1);
                CheckBox cb2=findViewById(R.id.cb2);
                CheckBox cb3=findViewById(R.id.cb3);
                String str="";
                if(cb1.isChecked())
                    str+='\n'+cb1.getText().toString();
                if(cb2.isChecked())
                    str+='\n'+cb2.getText().toString();
                if(cb3.isChecked())
                    str+='\n'+cb3.getText().toString();
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("应用将获取以下权限:"+str);
                builder.setPositiveButton("确定", null).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"取消",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

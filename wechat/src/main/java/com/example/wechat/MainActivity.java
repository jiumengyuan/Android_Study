package com.example.wechat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] imageid=new int[]{
                R.drawable.image1,R.drawable.image2,R.drawable.image3,
                R.drawable.image4,R.drawable.image5,R.drawable.image6,
                R.drawable.image7,R.drawable.image8,R.drawable.image9
        };
        String[] title=new String[]{"刘一","陈二","张三","李四","王五","赵六","孙七","周八","吴九"};
        ListView listView=findViewById(R.id.listview);
        List<Map<String,Object>> listitem=new ArrayList<Map<String, Object>>();
        for(int i=0;i<imageid.length;i++){
            Map<String,Object> map=new HashMap<String, Object>();
            map.put("image",imageid[i]);
            map.put("name",title[i]);
            listitem.add(map);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,listitem,R.layout.main,new String[]{"name","image"},new int[]{R.id.title,R.id.image});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Map<String,Object> map=(Map<String, Object>) adapterView.getItemAtPosition(i);
                Toast.makeText(MainActivity.this, map.get("name").toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}

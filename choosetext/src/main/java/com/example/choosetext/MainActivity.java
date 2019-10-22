package com.example.choosetext;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RadioGroup radioGroup=findViewById(R.id.aa);
        Button button=findViewById(R.id.bb);
        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                RadioButton c=findViewById(radioGroup.getCheckedRadioButtonId());
//                if(c.getText().equals("B:2"))
//                    Toast.makeText(MainActivity.this,"回答正确",Toast.LENGTH_SHORT).show();
//                else
//                    Toast.makeText(MainActivity.this,"回答错误",Toast.LENGTH_SHORT).show();
//            }
            @Override
            public void onClick(View view) {
                for (int i = 0; i <radioGroup.getChildCount() ; i++) {
                    RadioButton c=(RadioButton) radioGroup.getChildAt(i);
                    if(c.isChecked()) {
                        if (c.getText().equals("B:2"))
                            Toast.makeText(MainActivity.this, "回答正确", Toast.LENGTH_SHORT).show();
                        else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                            builder.setMessage("回答错误");
                            builder.setPositiveButton("确定", null).show();
                        }
                        break;
                    }
                }
            }
        });
    }
}

package com.example.checkboxbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox ca,cj,cp,cpy,cu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ca=findViewById(R.id.checkandroid);
        ca.setOnClickListener(this);

        cj=findViewById(R.id.checkjava);
        cj.setOnClickListener(this);

        cp=findViewById(R.id.checkphp);
        cp.setOnClickListener(this);

        cpy=findViewById(R.id.checkpython);
        cpy.setOnClickListener(this);

        cu=findViewById(R.id.checkunity);
        cu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.checkandroid:
                if(ca.isChecked())
                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkjava:
                if(cj.isChecked())
                    Toast.makeText(getApplicationContext(), "Java", Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkphp:
                if(cp.isChecked())
                    Toast.makeText(getApplicationContext(), "PHP", Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkpython:
                if(cpy.isChecked())
                    Toast.makeText(getApplicationContext(), "Python", Toast.LENGTH_SHORT).show();
                break;

            case R.id.checkunity:
                if(cu.isChecked())
                    Toast.makeText(getApplicationContext(), "Unity 3D", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}

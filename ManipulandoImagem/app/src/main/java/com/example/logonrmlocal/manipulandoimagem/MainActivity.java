package com.example.logonrmlocal.manipulandoimagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgPessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPessoa = findViewById(R.id.imgPessoa);

    }

    public void alterarPessoa(View view) {
        switch (view.getId()) {
            case R.id.btnPessoa01:
                imgPessoa.setImageResource(R.drawable.p1);
                break;
            case R.id.btnPessoa02:
                imgPessoa.setImageResource(R.drawable.p2);
                break;
            case R.id.btnPessoa03:
                imgPessoa.setImageResource(R.drawable.p3);
                break;
            case R.id.btnPessoa04:
                imgPessoa.setImageResource(R.drawable.p4);
                break;
        }
    }
/*
    public void pessoa02(View view) {
        imgPessoa.setImageResource(R.drawable.p2);
    }
    public void pessoa03(View view) {
        imgPessoa.setImageResource(R.drawable.p3);
    }
    public void pessoa04(View view) {
        imgPessoa.setImageResource(R.drawable.p4);
    }
*/
}

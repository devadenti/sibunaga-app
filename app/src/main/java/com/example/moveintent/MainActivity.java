package com.example.moveintent;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
   /* private Button btn_move_intent;*/
    private Button btn_buah_naga;
    private Button btn_cara_tanam;
    private Button btn_help_bantuan;
    private Button btn_tentang_kami;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //BUTTON BUAH NAGA
        btn_buah_naga =(Button)findViewById(R.id.btn_buah_naga);
        btn_buah_naga.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent buahnagaIntent = new Intent(MainActivity.this, BuahNagaActivity.class);
                startActivity(buahnagaIntent);
            }
        });

        //BUTTON CARA TANAM
        btn_cara_tanam =(Button)findViewById(R.id.btn_cara_tanam);
        btn_cara_tanam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent caratanamIntent = new Intent(MainActivity.this, CaraTanamActivity.class);
                startActivity(caratanamIntent);
            }
        });

        //BUTTON BAntuan
        btn_help_bantuan =(Button)findViewById(R.id.btn_help_bantuan);
        btn_help_bantuan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent scrollingbantuanIntent = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(scrollingbantuanIntent);
            }
        });

        //BUTTON Tentang Kami
        btn_tentang_kami =(Button)findViewById(R.id.btn_tentang_kami);
        btn_tentang_kami.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent tentangkamiIntent = new Intent(MainActivity.this, TentangKamiActivity.class);
                startActivity(tentangkamiIntent);
            }
        });





    }
}

        /*//BUTTON UJI COBA
        btn_move_intent =(Button)findViewById(R.id.btn_move_intent);
        btn_move_intent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent ujicobaIntent = new Intent(MainActivity.this, ScrollingActivity.class);
                startActivity(ujicobaIntent);
            }
        });*/
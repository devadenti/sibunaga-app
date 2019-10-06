package com.example.moveintent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.widget.EditText;
import android.widget.TextView;


public class TentangKamiActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_kami);

    }

    //KIRIM PESAN
    public void submitPesan (View view){
        //SUBJECT
        EditText subjectField = (EditText)findViewById(R.id.subject_field);
        String subject = subjectField.getText().toString();

        //PESAN
        EditText pesanField = (EditText)findViewById(R.id.pesan_field);
        String pesankritik = pesanField.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto: ike.devanti@gmail.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, " " + subject);
        intent.putExtra(Intent.EXTRA_TEXT, pesankritik);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }





}
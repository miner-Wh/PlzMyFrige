package gachon.myclass.plzmyfrige.Main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import gachon.myclass.plzmyfrige.R;

public class Buying extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buying);

        ImageButton onlineMall = findViewById(R.id.onlineMallButton);
        ImageButton nearMall = findViewById(R.id.nearMallButton);

        //온라인 몰로 이동
        onlineMall.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(getApplicationContext(), OnlineMall.class);
                startActivity(intent);
                finish();
            }
        });

        //주변마트로 이동
        nearMall.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
               // Intent intent = new Intent(getApplicationContext(), OnlineMall.class);
               // startActivity(intent);
                // finish();
            }
        });


    }
}
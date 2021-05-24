package gachon.myclass.plzmyfrige;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Buying extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buying);

        Button onlineMall = findViewById(R.id.onlineMall);
        Button nearMall = findViewById(R.id.nearMall);
        Button returnPage = findViewById(R.id.returnPage);

        View.OnClickListener listener = new View.OnClickListener(){

            public void onClick(View v)
            {
             switch (v.getId())
             {
                 case R.id.onlineMall:
                     //온라인몰 버튼을 눌렀을 때의 처리
                     Intent intent = new Intent(getApplicationContext(), OnlineMall.class); startActivity(intent);
                     break;

                 case R.id.nearMall:
                     //주변몰 버튼을 눌렀을 때의 처리
                     break;

                 case R.id.returnPage:
                     //돌아가기 버튼을 눌렀을 때의 처리
                     Toast.makeText(getApplicationContext(),"돌아가기버튼이 눌렸어요", Toast.LENGTH_LONG).show();
                     finish();
                     break;
             }
            }
        };

    }
}
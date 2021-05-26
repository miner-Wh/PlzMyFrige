package gachon.myclass.plzmyfrige.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import gachon.myclass.plzmyfrige.R;

public class Loginpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);
        Button button1 = findViewById(R.id.button_login);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "로그인 중 입니다.", Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
}

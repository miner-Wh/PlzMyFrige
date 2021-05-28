package gachon.myclass.plzmyfrige.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gachon.myclass.plzmyfrige.R;
import gachon.myclass.plzmyfrige.Main.RecipeRoute;


public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button1 = findViewById(R.id.goRecipe);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RecipeRoute.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button)findViewById(R.id.main_frige);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), // 현재 화면의 제어권자
                        MyFrige.class);
                startActivity(intent);
            }
        });

        Button button3 = (Button)findViewById(R.id.main_buying);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),
                        Buying.class);
                startActivity(intent);
            }
        });

    }

}
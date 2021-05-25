package gachon.myclass.plzmyfrige.Main;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

import gachon.myclass.plzmyfrige.Main.Cartpage;
import gachon.myclass.plzmyfrige.Main.FillFrige;
import gachon.myclass.plzmyfrige.Main.FillUtensil;
import gachon.myclass.plzmyfrige.R;


public class MyFrige extends AppCompatActivity{

    Fragment fillfrige, fillutensil, cartpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frige);

        fillfrige = new FillFrige();
        fillutensil = new FillUtensil();
        cartpage = new Cartpage();


        getSupportFragmentManager().beginTransaction().add(R.id.frame, fillfrige).commit();

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int position = tab.getPosition();

                Fragment selected = null;
                if(position == 0){

                    selected = fillfrige;

                }else if (position == 1) {

                    selected = fillutensil;
                }
                else if (position == 2) {

                    selected = cartpage;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.frame, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
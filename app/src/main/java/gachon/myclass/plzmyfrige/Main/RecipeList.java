package gachon.myclass.plzmyfrige.Main;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import gachon.myclass.plzmyfrige.R;


public class RecipeList extends AppCompatActivity {
    ListView exampleList;
    String[] dataSample;
    int[] R_cate;
    int[] recipein;
    int cate;
    TextView textView;
    String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_list);
        textView = findViewById(R.id.test_recipe_text);

        SharedPreferences shef = this.getSharedPreferences("frigelist", this.MODE_PRIVATE);
        Map<String,?> map = shef.getAll();
        Set<String> keys = map.keySet();
        List textc = new ArrayList(keys);
        Collections.sort(textc);
        Set<String> frigeset = new HashSet<>(textc) ;
        String val4="";
        for (int i=0;i<textc.size();i++) {
            if (map.get(textc.get(i).toString()).toString() == "true") {
                val4 +="1";
            }else{
                val4 +="0";
            }
        }
//        만든 이진수 string을 split
        String[] ten = val4.split("");

//        usten 십진법으로 변환
        int usten = 0;
        for (int i=0;i<textc.size();i++) {
            if (map.get(textc.get(i).toString()).toString() == "true") {
                usten +=Math.pow(2,i);
            }
        }
        //usten 10진수
        //num = ""+usten;
        //textView.setText(num);

        String kk = "";
        Intent secondIntent = getIntent();
        cate = secondIntent.getIntExtra("category",0);

        //Log.e("cateIs",""+cate+" true");
        dataSample = getResources().getStringArray(R.array.recipe_list);
        recipein = getResources().getIntArray(R.array.recipeToTenInt);
        R_cate = getResources().getIntArray(R.array.recipeCate);
        int nn=0;
        for(int n=0;n<dataSample.length;n++){
            if((recipein[n] & usten )== recipein[n]){
                if(R_cate[n]==cate) {
                    nn++;
                }

            }
        }
        String testS = "";
        String[] data = new String[nn];
        int[] dataPosition = new int[nn];
        nn=0;
        for(int n=0;n<dataSample.length;n++){
            if((recipein[n] & usten )== recipein[n]){
                if(R_cate[n]==cate) {
                    //Log.e("listTrue", "" + dataSample[n] + " true");
                    data[nn] = dataSample[n];
                    dataPosition[nn] = n;
                    nn++;
                }

            }
        }

        //data.length;

        boolean a = ((recipein[0] & usten )== recipein[0]);
        int k = (recipein[0] & usten );
        //if(a==true){
//
        //    textView.setText("true");
        //}
        //else
        //    textView.setText("false");

        if(data.length == 0){
            textView.setText("식재료가 부족해요");
        }
        else
            textView.setText(""+data.length);

        exampleList = findViewById(R.id.listView);
        RecipeListAdapter buttonListAdapter = new RecipeListAdapter(this, data,dataPosition);

        exampleList.setAdapter(buttonListAdapter);
    }


}


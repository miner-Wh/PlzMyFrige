package gachon.myclass.plzmyfrige.Main;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.util.ArrayList;

import gachon.myclass.plzmyfrige.R;

public class RecipeList extends AppCompatActivity {
    ListView exampleList;
    String[] dataSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_list);

        dataSample = getResources().getStringArray(R.array.recipe_list);

        exampleList = findViewById(R.id.listView);
        RecipeListAdapter buttonListAdapter = new RecipeListAdapter(this, dataSample);

        exampleList.setAdapter(buttonListAdapter);
    }

}


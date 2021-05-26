package gachon.myclass.plzmyfrige.Main;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

import gachon.myclass.plzmyfrige.R;

public class RecipeList extends AppCompatActivity {
    TextView txt;
    private StorageReference storageRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_list);
        storageRef = FirebaseStorage.getInstance().getReference();
        //gs://plzmf-ebad6.appspot.com/recipe/goldEggRice.txt




    }
}
package gachon.myclass.plzmyfrige;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

public class RecipeList extends AppCompatActivity {
    TextView txt;
    private StorageReference storageRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_list);
        storageRef = FirebaseStorage.getInstance().getReference();
//ㄴㅁㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㄴㅇㅁㅇㄴㅁ어케 하란 고ㅓ얀ㅇㅁㅇㅁㄴㅇㅁㄴㅇ




    }
}
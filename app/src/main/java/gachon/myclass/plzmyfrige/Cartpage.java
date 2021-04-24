package gachon.myclass.plzmyfrige;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

    public class Cartpage extends AppCompatActivity {
        ListView listView1;
        ArrayAdapter<String> adapter;
        ArrayList<String> listItem;

        EditText editText1;
        Button button1;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.cartpage);
            setTitle("장보기 체크리스트");

            editText1 = findViewById(R.id.editText1);
            button1 = findViewById(R.id.button1);
            listItem = new ArrayList<String>();

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listItem.add(editText1.getText().toString());
                    adapter.notifyDataSetChanged();
                    editText1.setText("");
                }

            });

            adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_multiple_choice,listItem);
            listView1 = findViewById(R.id.listView1);
            listView1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
            listView1.setAdapter(adapter);

        }
    }


package org.sample.hybridandroidapp;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class MyListActivity extends ListActivity{
    ArrayList<String> list = new ArrayList<String>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_list);

        Intent intent = this.getIntent();

        if (intent.hasExtra("items")) {
            list = intent.getExtras().getStringArrayList("items");
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);


        setListAdapter(adapter);

        setResult(RESULT_OK, intent);
    }
}


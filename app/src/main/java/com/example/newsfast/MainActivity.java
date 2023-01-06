package com.example.newsfast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
public RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<String> arrayList=new ArrayList<>();
            for(int i=0;i<100;i++)
                arrayList.add(String.valueOf(i));
        recyclerviewadapter rva=new recyclerviewadapter(this,arrayList);
        recyclerView.setAdapter(rva);

    }
}
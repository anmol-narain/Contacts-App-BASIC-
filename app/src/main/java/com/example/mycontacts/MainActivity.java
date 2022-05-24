package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Contact o1 = new Contact(1,"ANMOL","7415550939");
    Contact o2 = new Contact(1,"SAM","7415550931");
    Contact o3 = new Contact(1,"DANNY","7415550239");
    Contact o4 = new Contact(1,"JIM","7415550934");
    Contact o5 = new Contact(1,"AADI","7415550949");
    Contact o6 = new Contact(1,"JOHN","7415550939");
    Contact o7 = new Contact(1,"ANDY","7415550349");
    Contact o8 = new Contact(1,"AKSHAD","7415524939");

    Contact[] contacts = {o1,o2,o3,o4,o5,o6,o7,o8};
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(contacts);
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

    }
}
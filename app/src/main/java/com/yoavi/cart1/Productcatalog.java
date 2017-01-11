package com.yoavi.cart1;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class Productcatalog extends AppCompatActivity{

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    private String[] Title;
    private String[] Detail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productcatalog);

        Title= getResources().getStringArray(R.array.itemTitles);
        Detail=getResources().getStringArray(R.array.itemDetails);

        recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter= new RecyclerAdapter(Productcatalog.this,Title,Detail);
        recyclerView.setAdapter(adapter);

    }

}

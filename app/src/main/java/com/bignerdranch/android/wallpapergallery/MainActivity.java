package com.bignerdranch.android.wallpapergallery;

import android.app.WallpaperManager;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button btn;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.setwall);

        ArrayList<Integer> wallList = new ArrayList<>();
        wallList.add(R.drawable.wall1);
        wallList.add(R.drawable.wall2);
        wallList.add(R.drawable.wall3);
        wallList.add(R.drawable.wall4);
        RecyclerView recyclerView;



        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new WallpaperAdapter(wallList);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);


            btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WallpaperManager wallmgr= WallpaperManager.getInstance(getApplicationContext());
                try
                {

                    wallmgr.setResource(+ R.drawable.wall1);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                try
                {

                    wallmgr.setResource(+ R.drawable.wall2);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                try
                {

                    wallmgr.setResource(+ R.drawable.wall3);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                try
                {

                    wallmgr.setResource(+ R.drawable.wall4);
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }

            }
        });
    }
}
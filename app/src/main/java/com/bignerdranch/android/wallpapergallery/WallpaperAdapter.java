package com.bignerdranch.android.wallpapergallery;

/**
 * Created by akanksha on 5/1/2017.
 */

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
public class WallpaperAdapter extends RecyclerView.Adapter<WallpaperAdapter.RecyclerViewHolder> {

   List<Integer> wallList ;
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public RecyclerViewHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.img);
            img.setImageResource(R.drawable.wall1);
            img = (ImageView) view.findViewById(R.id.img);
            img.setImageResource(R.drawable.wall2);
            img = (ImageView) view.findViewById(R.id.img);
            img.setImageResource(R.drawable.wall3);
            img = (ImageView) view.findViewById(R.id.img);
            img.setImageResource(R.drawable.wall4);
        }
    }

    public WallpaperAdapter(List<Integer> wallList) {
        this.wallList = wallList;
    }
    @Override
    public WallpaperAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_row,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(WallpaperAdapter.RecyclerViewHolder viewHolder, int position) {


        Resources res = viewHolder.itemView.getContext().getResources();
    }

    @Override
    public int getItemCount() {
        return wallList.size();
    }
}

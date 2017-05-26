package com.bignerdranch.android.camtransaction;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 杨涵 on 2017/5/26.
 */

/**
 * P123
 */

public class ThingAdapter extends RecyclerView.ViewHolder{
    private List<Thing>mThingList;

    static  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView thingImage;
        TextView thingName;

        public ViewHolder(View view){
            super(view);
            thingImage= (ImageView)view.findViewById(R.id.thing_image);
            thingName=(TextView)view.findViewById(R.id.thing_name);
        }
    }

    public ThingAdapter(List<Thing> thingList){
        mThingList=thingList;
    }

    /**
     * 修改上——P166响应点击事件
     */

    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
       View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.thing_item,parent,false);
       ViewHolder holder=new ViewHolder(view);
      view.setOnClickListener(new View.OnClickListener(){
          public void onClick(View v){
              Thing thing=mThingList.get(holder.getAdapterPosition());
              IntroductionActivity.actionStart(getActivity(),thing.getImageId(),thing.getContent());
          }

      });
        return holder;
   }


    public void onBindViewHolder(ViewHolder holder,int position){
        Thing thing=mThingList.get(position);
        holder.thingImage.setImageResource(thing.getImageId());
        holder.thingName.setText(thing.getName());
    }

    public int getItemCount(){
        return mThingList.size();

    }
}


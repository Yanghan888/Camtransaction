package com.bignerdranch.android.camtransaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
P124实现瀑布流布局
 */
public class CamtransactionActivity extends AppCompatActivity {
    private List<Thing> mThingList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camtransaction);
        initThings();
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        ThingAdapter adapter=new ThingAdapter(mThingList);
        recyclerView.setAdapter(adapter);
    }

    private void initThings(){
        for(int i=0;i<2;i++){
            Thing bodycare=new Thing("Bodycare", R.drawable.bodycare);
            thingList.add(bodycare);
            Thing bowl=new Thing("Bowl", R.drawable.bowl);
            thingList.add(bowl);
            Thing counter=new Thing("Counter", R.drawable.counter);
            thingList.add(counter);
            Thing cup=new Thing("Cup", R.drawable.cup);
            thingList.add(cup);
            Thing earphone=new Thing("Earphone", R.drawable.earphone);
            thingList.add(earphone);
            Thing fan=new Thing("Fan", R.drawable.fan);
            thingList.add(fan);
            Thing globe=new Thing("Globe", R.drawable.globe);
            thingList.add(globe);
            Thing iphone=new Thing("Iphone", R.drawable.iphone);
            thingList.add(iphone);
            Thing jacket=new Thing("Jacket", R.drawable.jacket);
            thingList.add(jacket);
            Thing mirror=new Thing("Mirror", R.drawable.mirror);
            thingList.add(mirror);
            Thing mouse=new Thing("Mouse", R.drawable.mouse);
            thingList.add(mouse);
            Thing schoolbag=new Thing("Schoolbag", R.drawable.schoolbag);
            thingList.add(schoolbag);
            Thing trashcan=new Thing("Trashcan", R.drawable.trasncan);
            thingList.add(trashcan);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.camtransaction,container,false);
        RecyclerView thingImageRecyclerView=(RecyclerView)view.findViewById(R.id.thing_image_recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(LayoutManager);
        ThingAdapter adapter=new ThingAdapter(getThing());
        thingImageRecyclerView.setAdapter(adapter);
        return view;
    }

    private List<Thing>getThing(){
        List<Thing>thingList=new ArrayList<>();
        for(int i=1;i<=50;i++){
            Thing thing=new Thing();
            thing.setContent(getRandomLengthContent("This is a thing of number"+i+"."));
            thingList.add(thing);
        }
        return thingList;
    }

    private String getRandomLengthContent(String content){
        Random random=new Random();
        int length=random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<length;i++){
            builder.append(content);
        }
        return builder.toString();
    }
}

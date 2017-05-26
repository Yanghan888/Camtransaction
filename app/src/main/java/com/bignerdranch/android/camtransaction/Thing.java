package com.bignerdranch.android.camtransaction;

/**
 * Created by 杨涵 on 2017/5/26.
 */

public class Thing {
    private String name;
    private int imageId;
    private  String content;

    public Thing(String name,int imageId,String content){
        this.name=name;
        this.imageId=imageId;
        this.content=content;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content=content;
    }
}

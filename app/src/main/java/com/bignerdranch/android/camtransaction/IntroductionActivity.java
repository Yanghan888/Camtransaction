package com.bignerdranch.android.camtransaction;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * P162将物品的图片和内容显示在界面上
 */
public class IntroductionActivity extends AppCompatActivity {

    @Override
    private View view;
    protected void onCreateView(LayoutInflater inflate, ViewGroup container, Bundle savedInstanceState) {
      view=inflater.inflate(R.layout.news_content_flag,container,false);
        return view;
    }

    public void refresh(int thingImageId,String thingContent){
        View visibilityLayout=view.findViewById(R.id.visibility_layout);
        visibilityLayout.setVisibility(View.VISIBLE);
        ImageView thingImageIdImage=(ImageView)view.findViewById(R.id.thing_image);
        TextView thingContentText=(TextView)view.findViewById(R.id.thing_content);
        thingContentText.setText(thingContent);

    }

    /**
     * P163完成intent的创建
     */
    public static void actionStart(Context context, int thingImageId, String thingContent){
        Intent intent=new Intent(context,IntroductionActivity.class);
        intent.putExtra("thing_image",thingImageId);
        intent.putExtra("thing_content",thingContent);
        context.startActivity(intent);
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);
        int thingImage=getIntent().getIntExtra("thing_image");
        String thingContent=getIntent().getStringExtra("thing_content");
        /**
         * 在此活动中启动dialogActivity
         */
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(IntroductionActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });
    }
}

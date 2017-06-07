package com.bignerdranch.android.camtransaction;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
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
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.R.attr.bitmap;


public class CamtransactionActivity extends AppCompatActivity {

    View thing1;
    View thing2;
    View thing3;
    View thing4;
    View thing5;
    View thing6;
    View thing7;
    View thing8;
    Bitmap bitmap;
    TextView thing_name;
    TextView thing_price;
    String name;
    String price;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient mClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thing_item);
        thing1 = findViewById(R.id.thing1);


        thing1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CamtransactionActivity.this, IntroductionActivity.class);
                bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bodycare);
                thing_name = (TextView)findViewById(R.id.name_1);
                thing_price = (TextView)findViewById(R.id.price_1);
                name = thing_name.getText().toString();
                price = thing_price.getText().toString();
                intent.putExtra("bitmap", bitmap);
                intent.putExtra("thing_name",name);
                intent.putExtra("thing_price",price);
                startActivity(intent);
            }
        });
        thing2 = findViewById(R.id.thing2);
        thing2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CamtransactionActivity.this, IntroductionActivity.class);
                bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bodycare);
                thing_name = (TextView)findViewById(R.id.name_2);
                thing_price = (TextView)findViewById(R.id.price_2);
                name = thing_name.getText().toString();
                price = thing_price.getText().toString();
                intent.putExtra("bitmap", bitmap);
                intent.putExtra("thing_name",name);
                intent.putExtra("thing_price",price);
                startActivity(intent);
            }
        });
        thing3 = findViewById(R.id.thing3);
        thing3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CamtransactionActivity.this, IntroductionActivity.class);
                startActivity(intent);
            }
        });
        thing4 = findViewById(R.id.thing4);
        thing4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CamtransactionActivity.this, IntroductionActivity.class);
                startActivity(intent);
            }
        });
        thing5 = findViewById(R.id.thing5);
        thing5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CamtransactionActivity.this, IntroductionActivity.class);
                startActivity(intent);
            }
        });
        thing6 = findViewById(R.id.thing6);
        thing6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CamtransactionActivity.this, IntroductionActivity.class);
                startActivity(intent);
            }
        });
        thing7 = findViewById(R.id.thing7);
        thing7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CamtransactionActivity.this, IntroductionActivity.class);
                startActivity(intent);
            }
        });
        thing8 = findViewById(R.id.thing8);
        thing8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(CamtransactionActivity.this, IntroductionActivity.class);
                startActivity(intent);
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        mClient = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Camtransaction Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        mClient.connect();
        AppIndex.AppIndexApi.start(mClient, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(mClient, getIndexApiAction());
        mClient.disconnect();
    }

}

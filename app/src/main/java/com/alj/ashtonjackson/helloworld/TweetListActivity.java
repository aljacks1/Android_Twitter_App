package com.alj.ashtonjackson.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TweetListActivity extends Activity {
    private ListView tweetListView;
    private String[] stringArray;
    private ArrayAdapter tweetItemArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweet_list);

        stringArray = new String[10];
            for(int i=0; i < stringArray.length; i++ ){
                stringArray[i] = "String " + i;
            }
        tweetItemArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stringArray);
        tweetListView = (ListView) findViewById(R.id.tweetList);
        tweetListView.setAdapter(tweetItemArrayAdapter);
    }



}

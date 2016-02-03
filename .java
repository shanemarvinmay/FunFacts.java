package com.example.android.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    //declare view variables
    private TextView mFunFactsTextView;
    private Button mShowFunFactsButtons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //assign the view from layout file to coresponding variables
        mFunFactsTextView = (TextView) findViewById(R.id.factTextView);
        mShowFunFactsButtons = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String[] facts = {
                            "Ants stretch when they wake up in the morning.",
                            "Ostriches can run faster than horses.",
                            "Olympic gold medals are actually made mostly of silver.",
                            "You are born with 300 bones; by the time you are an adult you will have 206.",
                            "It takes about 8 minutes for light from the Sun to reach Earth.",
                            "Some bamboo plants can grow almost a meter in just one day.",
                            "The state of Florida is bigger than England.",
                            "Some penguins can leap 2-3 meters out of the water.",
                            "On average, it takes 66 days to form a new habit.",
                            "Mammoths still walked the earth when the Great Pyramid was being built." };
                //the button was clicked, so upate fact textview with new fact
                String fact = "";
                //reandomly select a fact
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                fact = facts[randomNumber];
                //update with our fact
                mFunFactsTextView.setText(fact);
            }
        };
        mShowFunFactsButtons.setOnClickListener(listener);
    }//end of onCreate method
}//end of class FunFactsActivity
/**xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.android.funfacts.FunFactsActivity"
    android:background="#51b46b">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Did you know?"
        android:textSize="24sp"
        android:textColor="#80ffffff" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Ants strech when they wake up?"
        android:id="@+id/factTextView"
        android:layout_centerVertical="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true"
        android:textSize="24sp"
        android:textColor="@android:color/white" />

    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Show another fun fact"
        android:id="@+id/showFactButton"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:background="@android:color/white" />

</RelativeLayout>

*/

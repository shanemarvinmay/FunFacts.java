package com.example.android.dice;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //declaring variable
    private ImageView image;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //assign variables to ui elements
        image = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.button);
        //create method for click
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] imageNumbers = {0,1,2,3,4,5};
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(imageNumbers.length);
                int imageNumber = randomNumber;
                //using if else statements to assign new dice face
                Resources resources = getResources();
                if(imageNumber == 0){
                    image.setImageDrawable(resources.getDrawable(R.drawable.one));
                }else if(imageNumber == 1){
                    image.setImageDrawable(resources.getDrawable(R.drawable.two));
                }else if(imageNumber == 2){
                    image.setImageDrawable(resources.getDrawable(R.drawable.three));
                }else if(imageNumber == 3){
                    image.setImageResource(R.drawable.four);
                }else if(imageNumber == 4){
                    image.setImageResource(R.drawable.five);
                }else{
                    image.setImageResource(R.drawable.six);
                }//end of if statement
            }//end of onClick method
        };//end of OnClickMethod
        button.setOnClickListener(listener);
    }//end of onCreate method
}//end of MainActivity class

/**xml code
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.android.dice.MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Virtual Dice"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:textSize="24sp"
        android:textIsSelectable="false"/>

    <ImageView
        android:layout_width="50dp"
        android:layout_height="50dp"
        android:id="@+id/imageView"
        android:src="@drawable/six"
        android:layout_centerVertical="true"
        android:layout_centerHorizontal="true"/>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Roll Dice"
        android:id="@+id/button"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"/>
</RelativeLayout>
*/

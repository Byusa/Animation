package com.byusa.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){

        //ViewSwitcher switchit= (ViewSwitcher) viewById.setOnClickListener();

        ImageView theSimba = (ImageView)findViewById(R.id.simba);

        ImageView fightsimba = (ImageView)findViewById(R.id.fightSimba);


        //theSimba.animate().translationYBy(1000f).setDuration(2000);//call animation method on simba, use translationYby that moves it from up to the buttom  and set the duration of 2secs

       // theSimba.animate().rotation(1800f).setDuration(1000);//call animation method on simba, use ratation that rotates it set the duration of 1secs

        theSimba.animate().scaleX(0.5f).scaleY(0.5f).setDuration(20000);//reduce it's size to a half in a sec

        theSimba.animate().alpha(1f).setDuration(2000);//
        fightsimba.animate().alpha(0f).setDuration(2000);//

        //theSimba.animate().rotation(360f).setDuration(1000);

       theSimba.animate().
                translationXBy(1000f).//move left          *
                translationYBy(1000f).//move right           *
                rotation(3600).       //rotate                  *
                setDuration(1000);    //set the duration            *


        //theSimba.animate().translationXBy(-1000f).setDuration(2000);//call animation method on simba, use translationYby that moves it from the left(-) to the right  and set the duration of 2secs

        //theSimba.animate().alpha(0f).setDuration(2000);//call animation method on simba, use alpha that shows the visibility of it from 0 to 1 and set the duration of 2secs (if it is 0.5f add f)


        //fightsimba.animate().alpha(1f).setDuration(2000);//call animation method on fightsimba, use alpha that shows the visibility of it from 0 to 1 and set the duration of 2secs


              /*  ViewSwitcher switcher = (ViewSwitcher) view;

                if (switcher.getDisplayedChild() == 0) {
                    switcher.showNext();
                } else {
                    switcher.showPrevious();
                }*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView theSimba = (ImageView)findViewById(R.id.simba);
        theSimba.animate().alpha(1f).setDuration(2000);//

        //theSimba.animate().alpha(1f).setDuration(20000);//reduce it's size to a half in a sec

        //Start at the left up side
        theSimba.setTranslationX(-1000f);//starting point use translationX that moves it from the left(-) to the right.(to make it move all the time)
        theSimba.setTranslationY(-1000f);

    }
}

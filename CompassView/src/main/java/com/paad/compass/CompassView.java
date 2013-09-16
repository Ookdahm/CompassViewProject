package com.paad.compass;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;


public class CompassView extends View {

    public CompassView (Context context){
        super(context);
        initCompassView();
    }

    public CompassView(Context context, AttributeSet attrs){
        super(context, attrs);
        initCompassView();
    }

    public CompassView(Context context, AttributeSet ats, int defaultStyle){
        super(context, ats, defaultStyle);
        initCompassView();
    }

    protected void initCompassView(){
        setFocusable(true);
    }
}

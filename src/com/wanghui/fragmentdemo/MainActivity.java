package com.wanghui.fragmentdemo;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void switchFragment(String Tag){
    	FragmentTransaction transaction = getFragmentManager().beginTransaction();
    	SecondFragment secondFragment = SecondFragment.newInstance();
    }

}

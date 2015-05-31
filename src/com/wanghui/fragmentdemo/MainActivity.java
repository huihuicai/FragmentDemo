package com.wanghui.fragmentdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

	private ArrayList<Fragment> mLists = new ArrayList<Fragment>();
	private FragmentManager mFragmentManager = getFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.swtich).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				switchFragment();
			}
		});
        
        getAllFragment();
    }
    
    private void getAllFragment(){
    	mLists.add(mFragmentManager.findFragmentById(R.id.first));
    	mLists.add(mFragmentManager.findFragmentById(R.id.second));
    }
    
    public void switchFragment(){
    	FragmentTransaction ft = mFragmentManager.beginTransaction();
    	FirstFragment firstFragment = (FirstFragment) mLists.get(0);
    	SecondFragment secondFragment = (SecondFragment) mLists.get(1);
    	if(!firstFragment.isHidden()){
    		System.out.println("影藏");
    		ft.hide(firstFragment);
    		ft.show(secondFragment);
    	}else{
    		ft.hide(secondFragment);
    		ft.show(firstFragment);
    	}
    	
    	System.out.println("提交:"+secondFragment.isHidden()+" UI是否分离:"+secondFragment.isDetached());
    	ft.commit();
    }
    
//    public void addFragment(int index){
//    	FragmentTransaction ft = mFragmentManager.beginTransaction();
//    	if(index == 0){
//    		FirstFragment fragment = new FirstFragment(); 
//    		ft.add(R.id.container, fragment);
//    	}else{
//    		SecondFragment fragment = new SecondFragment();
//    		ft.add(R.id.container, fragment);
//    	}
//    	ft.commit();
//    }

}

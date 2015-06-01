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
	private int mCurrentFragmentIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.swtich).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
//				switchFragment();
//				addFragment();
				replaceFragment();
			}
		});
        
//        getAllFragment();
//        addFragment();
        replaceFragment();
    }
    /**
     * 布局加载fragment的时候，获取全部的fragment
     */
//    private void getAllFragment(){
//    	mLists.add(mFragmentManager.findFragmentById(R.id.first));
//    	mLists.add(mFragmentManager.findFragmentById(R.id.second));
//    }
    
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

    	ft.addToBackStack(null);
    	
    	System.out.println("提交:"+secondFragment.isHidden()+" UI是否分离:"+secondFragment.isDetached());
    	ft.commit();
    }
    
    public void addFragment(){
    	FragmentTransaction ft = mFragmentManager.beginTransaction();
    	if(mCurrentFragmentIndex == 0){
    		mCurrentFragmentIndex = 1;
    		System.out.println("目的是显示第一个fragment");
    		FirstFragment fragment = (FirstFragment) mFragmentManager.findFragmentByTag(FirstFragment.class.getName());
    		if(fragment == null){
    			System.out.println("当前的fragment为null");
    			fragment = new FirstFragment();
    		}
    		
    		SecondFragment fragment2 = (SecondFragment) mFragmentManager.findFragmentByTag(SecondFragment.class.getName());
    		if(fragment2 != null && fragment2.isVisible()){
    			System.out.println("SecondFragment当前是显示状态");
    			ft.hide(fragment2);
    		}
    		if(fragment.isAdded()){
    			System.out.println("FirstFragment已经是add的，直接show出来");
    			ft.show(fragment);
    		}else{
    			System.out.println("FirstFragment直接add");
    			ft.add(R.id.container, fragment,FirstFragment.class.getName());
    		}
    	}else{
    		mCurrentFragmentIndex = 0;
    		System.out.println("目的是显示第二个fragment");
    		SecondFragment fragment = (SecondFragment) mFragmentManager.findFragmentByTag(SecondFragment.class.getName());
    		if(fragment == null){
    			System.out.println("当前的SecondFragment为null");
    			fragment = new SecondFragment();
    		}
    		
    		FirstFragment fragment2 = (FirstFragment) mFragmentManager.findFragmentByTag(FirstFragment.class.getName());
    		if(fragment2 != null && fragment2.isVisible()){
    			System.out.println("FirstFragment当前是显示状态");
    			ft.hide(fragment2);
    		}
    		if(fragment.isAdded()){
    			System.out.println("SecondFragment已经是add的，直接show出来");
    			ft.show(fragment);
    		}else{
    			System.out.println("SecondFragment直接add");
    			ft.add(R.id.container, fragment,SecondFragment.class.getName());
    		}
    	}
    	ft.addToBackStack(null);
    	ft.commit();
    }
    
    private void replaceFragment(){
    	FragmentTransaction ft = mFragmentManager.beginTransaction();
//    	ft.setCustomAnimations(0, 0);
    	if(mCurrentFragmentIndex == 0){
    		mCurrentFragmentIndex = 1;
    		FirstFragment fragment = (FirstFragment) mFragmentManager.findFragmentByTag(FirstFragment.class.getName());
    		if(fragment == null){
    			fragment = new FirstFragment();
    		}
    		ft.replace(R.id.container, fragment, FirstFragment.class.getName());
    	}else{
    		mCurrentFragmentIndex = 0;
    		SecondFragment fragment = (SecondFragment) mFragmentManager.findFragmentByTag(SecondFragment.class.getName());
    		if(fragment == null){
    			fragment = new SecondFragment();
    		}
    		ft.replace(R.id.container, fragment, SecondFragment.class.getName());
    	}
    	ft.addToBackStack(null);
    	ft.commit();
    }
    
    private void goOtherActivity(){
    	//TODO 跳转到其他的activity中去
    }

}

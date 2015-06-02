package com.wanghui.fragmentdemo;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentManager.OnBackStackChangedListener;
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
        
        findViewById(R.id.clear).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				//����ջ�ļ�������һЩ���˵Ĳ���
				mFragmentManager
						.addOnBackStackChangedListener(new OnBackStackChangedListener() {
							@Override
							public void onBackStackChanged() {
								for (int i = 0; i < mFragmentManager
										.getBackStackEntryCount(); ++i) {
									mFragmentManager.popBackStack();
								}
							}
						});
			}
		});
        
//        getAllFragment();
//        addFragment();
        replaceFragment();
        
    }
    /**
     * ���ּ���fragment��ʱ�򣬻�ȡȫ����fragment
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
    		System.out.println("Ӱ��");
    		ft.hide(firstFragment);
    		ft.show(secondFragment);
    	}else{
    		ft.hide(secondFragment);
    		ft.show(firstFragment);
    	}

    	ft.addToBackStack(null);
    	
    	System.out.println("�ύ:"+secondFragment.isHidden()+" UI�Ƿ����:"+secondFragment.isDetached());
    	ft.commit();
    }
    
    public void addFragment(){
    	FragmentTransaction ft = mFragmentManager.beginTransaction();
    	if(mCurrentFragmentIndex == 0){
    		mCurrentFragmentIndex = 1;
    		System.out.println("Ŀ������ʾ��һ��fragment");
    		FirstFragment fragment = (FirstFragment) mFragmentManager.findFragmentByTag(FirstFragment.class.getName());
    		if(fragment == null){
    			System.out.println("��ǰ��fragmentΪnull");
    			fragment = new FirstFragment();
    		}
    		
    		SecondFragment fragment2 = (SecondFragment) mFragmentManager.findFragmentByTag(SecondFragment.class.getName());
    		if(fragment2 != null && fragment2.isVisible()){
    			System.out.println("SecondFragment��ǰ����ʾ״̬");
    			ft.hide(fragment2);
    		}
    		if(fragment.isAdded()){
    			System.out.println("FirstFragment�Ѿ���add�ģ�ֱ��show����");
    			ft.show(fragment);
    		}else{
    			System.out.println("FirstFragmentֱ��add");
    			ft.add(R.id.container, fragment,FirstFragment.class.getName());
    		}
    	}else{
    		mCurrentFragmentIndex = 0;
    		System.out.println("Ŀ������ʾ�ڶ���fragment");
    		SecondFragment fragment = (SecondFragment) mFragmentManager.findFragmentByTag(SecondFragment.class.getName());
    		if(fragment == null){
    			System.out.println("��ǰ��SecondFragmentΪnull");
    			fragment = new SecondFragment();
    		}
    		
    		FirstFragment fragment2 = (FirstFragment) mFragmentManager.findFragmentByTag(FirstFragment.class.getName());
    		if(fragment2 != null && fragment2.isVisible()){
    			System.out.println("FirstFragment��ǰ����ʾ״̬");
    			ft.hide(fragment2);
    		}
    		if(fragment.isAdded()){
    			System.out.println("SecondFragment�Ѿ���add�ģ�ֱ��show����");
    			ft.show(fragment);
    		}else{
    			System.out.println("SecondFragmentֱ��add");
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
    	//TODO ��ת��������activity��ȥ
    	OnBackStackChangedListener listener = new OnBackStackChangedListener() {
			@Override
			public void onBackStackChanged() {
				//��һЩ���˵�ʱ�������
			}
		};
		
		FragmentManager fm = getFragmentManager();
		for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {    
		    fm.popBackStack();
		}
		fm.popBackStack("", FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

}

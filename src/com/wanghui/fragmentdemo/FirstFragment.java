package com.wanghui.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

	private MainActivity mActivity;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.e("FirstFragment", "onCreateView");
		View view = inflater.inflate(R.layout.first_fragment, container, false);
		return view;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		System.out.println("保存之前的参数");
	}
	
	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);
		System.out.println("现在是把view的状态restore");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.e("FirstFragment", "onActivityCreated");
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Log.e("FirstFragment", "onActivityResult");
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		mActivity = (MainActivity) activity;
		Log.e("FirstFragment", "onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("FirstFragment", "onCreate");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.e("FirstFragment", "onDestroy");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.e("FirstFragment", "onDestroyView");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.e("FirstFragment", "onDetach");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.e("FirstFragment", "onPause");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.e("FirstFragment", "onResume");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.e("FirstFragment", "onStart");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.e("FirstFragment", "onStop");
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		Log.e("FirstFragment", "onViewCreated");
	}

}

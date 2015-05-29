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

	static FirstFragment newInstance() {
		FirstFragment fragment = new FirstFragment();
		return fragment;
	}
	
	public void goToSecond(View v){
		//TODO 切换到第二个
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d("FirstFragment", "onCreateView");
		return inflater.inflate(R.layout.first_fragment, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d("FirstFragment", "onActivityCreated");
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Log.d("FirstFragment", "onActivityResult");
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d("FirstFragment", "onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("FirstFragment", "onCreate");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("FirstFragment", "onDestroy");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d("FirstFragment", "onDestroyView");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.d("FirstFragment", "onDetach");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d("FirstFragment", "onPause");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d("FirstFragment", "onResume");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d("FirstFragment", "onStart");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d("FirstFragment", "onStop");
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		Log.d("FirstFragment", "onViewCreated");
	}

}

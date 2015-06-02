package com.wanghui.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {

	static SecondFragment newInstance() {
		SecondFragment fragment = new SecondFragment();
		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.e("SecondFragment", "onCreateView");
		return inflater.inflate(R.layout.second_fragment, container, false);
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		System.out.println("执行了onSaveInstanceState");
	}
	
	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);
		System.out.println("现在view又被restore了");
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.e("SecondFragment", "onActivityCreated");
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Log.e("SecondFragment", "onActivityResult");
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.e("SecondFragment", "onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("SecondFragment", "onCreate");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.e("SecondFragment", "onDestroy");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.e("SecondFragment", "onDestroyView");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.e("SecondFragment", "onDetach");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.e("SecondFragment", "onPause");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.e("SecondFragment", "onResume");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.e("SecondFragment", "onStart");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.e("SecondFragment", "onStop");
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		Log.e("SecondFragment", "onViewCreated");
	}

}

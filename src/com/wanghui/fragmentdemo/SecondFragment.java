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
		Log.d("SecondFragment", "onCreateView");
		return inflater.inflate(R.layout.first_fragment, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d("SecondFragment", "onActivityCreated");
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Log.d("SecondFragment", "onActivityResult");
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.d("SecondFragment", "onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("SecondFragment", "onCreate");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("SecondFragment", "onDestroy");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d("SecondFragment", "onDestroyView");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.d("SecondFragment", "onDetach");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d("SecondFragment", "onPause");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d("SecondFragment", "onResume");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d("SecondFragment", "onStart");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d("SecondFragment", "onStop");
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		Log.d("SecondFragment", "onViewCreated");
	}

}

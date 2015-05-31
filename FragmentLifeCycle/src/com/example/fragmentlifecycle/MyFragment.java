package com.example.fragmentlifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onCreateView is called");
		return inflater.inflate(R.layout.activity_fragment_main, container, false);
	}
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		Log.d("DEB","Fragment - onAttach is called");
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onCreate is called");
		super.onCreate(savedInstanceState);
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onActivityCreated is called");
		super.onActivityCreated(savedInstanceState);
	}
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onStart is called");
		super.onStart();
	}
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onResume is called");
		super.onResume();
	}
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onPause is called");
		super.onPause();
	}
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onStop is called");
		super.onStop();
	}
	@Override
	public void onDestroyView() {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onDestroyView is called");
		super.onDestroyView();
	}
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onDestroy is called");
		super.onDestroy();
	}
	@Override
	public void onDetach() {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onDetach is called");
		super.onDetach();
	}
	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		Log.d("DEB","Fragment - onSaveInstanceState is called");
		super.onSaveInstanceState(outState);
	}
}

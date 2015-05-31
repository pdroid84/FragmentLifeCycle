package com.example.fragmentlifecycle;

import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        FragmentTransaction trn = fm.beginTransaction();
        MyFragment fragment = new MyFragment();
        trn.add(R.id.activity_container, fragment);
        trn.commit();
        Log.d("DEB", "Actvity - onCreate is called");
    }

    protected void onStart (){
    	super.onStart();
    	Log.d("DEB", "Actvity - onStart is called");
    }
    
    protected void onResume (){
    	super.onResume();
    	Log.d("DEB", "Actvity - onResume is called");
    }
    
    protected void onPause (){
    	super.onPause();
    	Log.d("DEB", "Actvity - onPause is called");
    }
    
    protected void onStop (){
    	super.onStop();
    	Log.d("DEB", "Actvity - onStop is called");
    }
    
    protected void onRestart (){
    	super.onRestart();
    	Log.d("DEB", "Actvity - onRestart is called");
    }
    
    protected void onDestroy (){
    	super.onDestroy();
    	Log.d("DEB", "Actvity - onDestroy is called");
    }
    protected void onSaveInstanceState(Bundle savedInstanceState){
    	Log.d("DEB", "Actvity - onSaveInstanceState is called");
    	super.onSaveInstanceState(savedInstanceState);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
    	Log.d("DEB", "Actvity - onRestoreInstanceState is called");
    	super.onRestoreInstanceState(savedInstanceState);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

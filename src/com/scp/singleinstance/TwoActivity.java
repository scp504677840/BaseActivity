package com.scp.singleinstance;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class TwoActivity extends BaseActivity implements OnClickListener {
	private Button button;
	
	public static void actionStart(Context context,String data1,String data2){
		Intent intent = new Intent(context, TwoActivity.class);
		intent.putExtra("parma1", data1);
		intent.putExtra("parma2", data2);
		context.startActivity(intent);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_layout);
		
		Log.i("TwoActivity", "TwoActivity的返回栈ID是："+getTaskId());
		
		button = (Button) findViewById(R.id.btn_2);
		
		button.setOnClickListener(this);
		
		
	}
	@Override
	public void onClick(View v) {
		Toast.makeText(this, "TwoActivity的位置是:"+this.toString(), 0).show();
		Intent intent = new Intent(TwoActivity.this, ThreeActivity.class);
		startActivity(intent);
	}
}

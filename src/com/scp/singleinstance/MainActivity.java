package com.scp.singleinstance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity implements OnClickListener {
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		Log.i("MainActivity", "MainActivity的返回栈ID是："+getTaskId());

		button = (Button) findViewById(R.id.btn_1);

		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Toast.makeText(this, "MainActivity的位置：" + this.toString(), 0).show();
		Intent intent = new Intent(MainActivity.this, TwoActivity.class);
		startActivity(intent);
	}
}

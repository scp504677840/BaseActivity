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

public class ThreeActivity extends BaseActivity implements OnClickListener {
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three_layout);
		Log.i("ThreeActivity", "ThreeActivity的返回栈ID是：" + getTaskId());

		button = (Button) findViewById(R.id.btn_3);

		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// Toast.makeText(this, "ThreeActivity的位置是："+this.toString(), 0).show();
		// Intent intent = new Intent(ThreeActivity.this, MainActivity.class);
		// startActivity(intent);
		// 退出程序
		ActivityCollector.finishAll();
	}
	
	@Override
	public void onBackPressed() {
		super.onBackPressed();
		Toast.makeText(this, "再按一次退出程序", 0).show();
	}
}

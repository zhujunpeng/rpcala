package com.example.rpcala;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button btn_rp;
    private EditText et_name;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        et_name = (EditText) findViewById(R.id.et_name);
        btn_rp = (Button) findViewById(R.id.btn_rp);
        btn_rp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String name = et_name.getText().toString().trim();
				if (TextUtils.isEmpty(name)) {
					Toast.makeText(getApplicationContext(), "请输入要测试的姓名", 0).show();
					return;
				}
				Intent intent = new Intent();
				intent.putExtra("name", name);
				intent.setClass(MainActivity.this, CalaActivity.class);
				startActivity(intent);
			}
		});
    }
}

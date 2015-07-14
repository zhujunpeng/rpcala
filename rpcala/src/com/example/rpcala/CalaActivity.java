package com.example.rpcala;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalaActivity extends Activity {
	
	private TextView tv_result;
	private TextView tv_values;
	
	private String loc2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cala_layout);
		
		 tv_result = (TextView) findViewById(R.id.tv_result);
		 tv_values = (TextView) findViewById(R.id.tv_value);
		 
		 Intent intent = getIntent();
		 String name = intent.getStringExtra("name");
		 byte[] result = name.getBytes();
		 int number = 0 ;
		 for (byte b : result) {
			number += b & 0xff;
		}
		int score = Math.abs(number) % 100;
		if (score == 0)
		{
		loc2 = "你一定不是人吧？怎么一点人品都没有？！";
		}
		else if (score > 0 && score <= 5)
		{
		loc2 = "算了，跟你没什么人品好谈的...";
		}
		else if (score > 5 && score <= 10)
		{
		loc2 = "是我不好...不应该跟你谈人品问题的...";
		}
		else if (score > 10 && score <= 15)
		{
		loc2 = "杀过人没有?放过火没有?你应该无恶不做吧?";
		}
		else if (score > 15 && score <= 20)
		{
		loc2 = "你貌似应该三岁就偷看隔壁大妈洗澡的吧...";
		}
		else if (score > 20 && score <= 25)
		{
		loc2 = "你的人品之低下实在让人惊讶啊...";
		}
		else if (score > 25 && score <= 30)
		{
		loc2 = "你的人品太差了。你应该有干坏事的嗜好吧?";
		}
		else if (score > 30 && score <= 35)
		{
		loc2 = "你的人品真差！肯定经常做偷鸡摸狗的事...";
		}
		else if (score > 35 && score <= 40)
		{
		loc2 = "你拥有如此差的人品请经常祈求佛祖保佑你吧...";
		}
		else if (score > 40 && score <= 45)
		{
		loc2 = "老实交待..那些论坛上面经常出现的偷拍照是不是你的杰作?";
		}
		else if (score > 45 && score <= 50)
		{
		loc2 = "你随地大小便之类的事没少干吧?";
		}
		else if (score > 50 && score <= 55)
		{
		loc2 = "你的人品太差了..稍不小心就会去干坏事了吧?";
		}
		else if (score > 55 && score <= 60)
		{
		loc2 = "你的人品很差了..要时刻克制住做坏事的冲动哦..";
		}
		else if (score > 60 && score <= 65)
		{
		loc2 = "你的人品比较差了..要好好的约束自己啊..";
		}
		else if (score > 65 && score <= 70)
		{
		loc2 = "你的人品勉勉强强..要自己好自为之..";
		}
		else if (score > 70 && score <= 75)
		{
		loc2 = "有你这样的人品算是不错了..";
		}
		else if (score > 75 && score <= 80)
		{
		loc2 = "你有较好的人品..继续保持..";
		}
		else if (score > 80 && score <= 85)
		{
		loc2 = "你的人品不错..应该一表人才吧?";
		}
		else if (score > 85 && score <= 90)
		{
		loc2 = "你的人品真好..做好事应该是你的爱好吧..";
		}
		else if (score > 90 && score <= 95)
		{
		loc2 = "你的人品太好了..你就是当代活雷锋啊...";
		}
		else if (score > 95 && score <= 99)
		{
		loc2 = "你是世人的榜样！";
		}
		else if (score == 100)
		{
		loc2 = "天啦！你不是人！你是神！！！";
		}
		tv_result.setText("结果：" + name+ "的人品  " + score);
		tv_values.setText("评价：" + loc2);
	}

}

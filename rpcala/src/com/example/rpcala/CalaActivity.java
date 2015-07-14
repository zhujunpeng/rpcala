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
		loc2 = "��һ�������˰ɣ���ôһ����Ʒ��û�У���";
		}
		else if (score > 0 && score <= 5)
		{
		loc2 = "���ˣ�����ûʲô��Ʒ��̸��...";
		}
		else if (score > 5 && score <= 10)
		{
		loc2 = "���Ҳ���...��Ӧ�ø���̸��Ʒ�����...";
		}
		else if (score > 10 && score <= 15)
		{
		loc2 = "ɱ����û��?�Ź���û��?��Ӧ���޶�����?";
		}
		else if (score > 15 && score <= 20)
		{
		loc2 = "��ò��Ӧ�������͵�����ڴ���ϴ��İ�...";
		}
		else if (score > 20 && score <= 25)
		{
		loc2 = "�����Ʒ֮����ʵ�����˾��Ȱ�...";
		}
		else if (score > 25 && score <= 30)
		{
		loc2 = "�����Ʒ̫���ˡ���Ӧ���иɻ��µ��Ⱥð�?";
		}
		else if (score > 30 && score <= 35)
		{
		loc2 = "�����Ʒ���϶�������͵����������...";
		}
		else if (score > 35 && score <= 40)
		{
		loc2 = "��ӵ����˲����Ʒ�뾭��������汣�����...";
		}
		else if (score > 40 && score <= 45)
		{
		loc2 = "��ʵ����..��Щ��̳���澭�����ֵ�͵�����ǲ�����Ľ���?";
		}
		else if (score > 45 && score <= 50)
		{
		loc2 = "����ش�С��֮�����û�ٸɰ�?";
		}
		else if (score > 50 && score <= 55)
		{
		loc2 = "�����Ʒ̫����..�Բ�С�ľͻ�ȥ�ɻ����˰�?";
		}
		else if (score > 55 && score <= 60)
		{
		loc2 = "�����Ʒ�ܲ���..Ҫʱ�̿���ס�����µĳ嶯Ŷ..";
		}
		else if (score > 60 && score <= 65)
		{
		loc2 = "�����Ʒ�Ƚϲ���..Ҫ�úõ�Լ���Լ���..";
		}
		else if (score > 65 && score <= 70)
		{
		loc2 = "�����Ʒ����ǿǿ..Ҫ�Լ�����Ϊ֮..";
		}
		else if (score > 70 && score <= 75)
		{
		loc2 = "������������Ʒ���ǲ�����..";
		}
		else if (score > 75 && score <= 80)
		{
		loc2 = "���нϺõ���Ʒ..��������..";
		}
		else if (score > 80 && score <= 85)
		{
		loc2 = "�����Ʒ����..Ӧ��һ���˲Ű�?";
		}
		else if (score > 85 && score <= 90)
		{
		loc2 = "�����Ʒ���..������Ӧ������İ��ð�..";
		}
		else if (score > 90 && score <= 95)
		{
		loc2 = "�����Ʒ̫����..����ǵ������׷氡...";
		}
		else if (score > 95 && score <= 99)
		{
		loc2 = "�������˵İ�����";
		}
		else if (score == 100)
		{
		loc2 = "�������㲻���ˣ������񣡣���";
		}
		tv_result.setText("�����" + name+ "����Ʒ  " + score);
		tv_values.setText("���ۣ�" + loc2);
	}

}

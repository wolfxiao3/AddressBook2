package com.caizhongming.Ericsson.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;

import com.caizhongming.Ericsson.JSON.Config;

/**
 * add������
 * 
 * @author momo
 * 
 */
public class AddComm extends ComnComn {
	public String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * ���add����ܣ�����Ҫ������һ��key�����key�Ѵ��ڣ�������Ϣ�Ѵ��ڣ��粻���ڣ�����ʾ����value��
	 * ��value������JSON��ʽ������ʾ����ʽ����ȷ�������㣬����ʾ��ӳɹ���
	 */
	public Object call() {
		ArrayList l = new ArrayList();
		Iterator iter = Config.js.keys();
		while (iter.hasNext()) {
			l.add((String) iter.next());
		}

		JSONObject jsonObj = null;
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("key: ");
		key = sc.nextLine();
		if (!l.contains(key)) {
			System.out.print("value: ");
			value = sc.nextLine();

			try {
				jsonObj = new JSONObject(value);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				System.out.println("�����ʽ����ȷ");
				return 0;
			}

			try {
				Config.js.put(key, jsonObj);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("address entry added");
		} else {
			System.out.println("��Ϣ�Ѵ��ڣ��޷����");
		}
		return 0;

	}

}

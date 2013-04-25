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
 * add命令类
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
	 * 完成add命令功能，首先要求输入一个key，如果key已存在，提升信息已存在，如不存在，则提示输入value，
	 * 如value不符合JSON格式，则提示，格式不正确，如满足，则提示添加成功。
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
				System.out.println("输入格式不正确");
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
			System.out.println("信息已存在，无法添加");
		}
		return 0;

	}

}

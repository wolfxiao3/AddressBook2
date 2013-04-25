package com.caizhongming.Ericsson.JSON;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 配置类，初始化JSON对象内容
 * 
 * @author momo
 * 
 */
public class Config {
	public static JSONObject json = new JSONObject();
	public static JSONObject js = new JSONObject();
	public static HashMap<String, String> ll = new HashMap<String, String>();
	public static HashMap<String, String> hmm = new HashMap<String, String>();

	static {
		ll.put("address", "Earth somewhere");
		ll.put("mobil", "1370000000");
		ll.put("age", "27");
		hmm.put("address", "Earth somewhere else");
		hmm.put("mobil", "1370000001");
		hmm.put("age", "26");

		try {
			json.put("hanmeimei", hmm);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			json.put("lilei", ll);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			js.put("enties", json);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

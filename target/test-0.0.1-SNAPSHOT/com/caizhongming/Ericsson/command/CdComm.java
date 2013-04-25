package com.caizhongming.Ericsson.command;

import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

import com.caizhongming.Ericsson.JSON.Config;

/**
 * cd命令类
 * 
 * @author momo
 * 
 */
public class CdComm extends ComnComn {

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 根据key，切换相应内容，当目标对象不是JSON对象时，提示无更多内容
	 */
	public Object call() {
		ArrayList l = new ArrayList();
		Iterator iter = Config.js.keys();
		while (iter.hasNext()) {
			l.add((String) iter.next());
		}
		// TODO Auto-generated method stub
		if (l.contains(key)) {
			try {
				Config.js = Config.js.getJSONObject(key);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				System.out.println("没有更多内容");
			}
		}
		if (!l.contains(key)) {
			System.out.println("无输入目标相应内容，请检查");
		}

		return 1;
	}

}

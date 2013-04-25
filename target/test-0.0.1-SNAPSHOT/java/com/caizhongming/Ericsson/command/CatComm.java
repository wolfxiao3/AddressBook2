package com.caizhongming.Ericsson.command;

import org.json.JSONException;

import com.caizhongming.Ericsson.JSON.Config;

/**
 * cat命令类
 * 
 * @author momo
 * 
 */
public class CatComm extends ComnComn {

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * 完成cat命令功能，根据key打印相应的信息
	 */
	public Object call() {
		// TODO Auto-generated method stub
		try {
			System.out.print("\"" + key + "\"" + " : " + Config.js.get(key));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}

}

package com.caizhongming.Ericsson.command;

import org.json.JSONException;

import com.caizhongming.Ericsson.JSON.Config;

/**
 * cat������
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
	 * ���cat����ܣ�����key��ӡ��Ӧ����Ϣ
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

package com.caizhongming.Ericsson.command;

import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONException;
import org.json.JSONObject;

import com.caizhongming.Ericsson.JSON.Config;

/**
 * cd������
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
	 * ����key���л���Ӧ���ݣ���Ŀ�������JSON����ʱ����ʾ�޸�������
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
				System.out.println("û�и�������");
			}
		}
		if (!l.contains(key)) {
			System.out.println("������Ŀ����Ӧ���ݣ�����");
		}

		return 1;
	}

}

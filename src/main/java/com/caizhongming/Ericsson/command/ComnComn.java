package com.caizhongming.Ericsson.command;

import java.util.concurrent.Callable;

/**
 * ���������࣬ʵ��Callable�ӿڣ���Ա����key����������Ĳ�����
 * 
 * @author momo
 * 
 */
public abstract class ComnComn implements Callable<Object> {
	public String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}

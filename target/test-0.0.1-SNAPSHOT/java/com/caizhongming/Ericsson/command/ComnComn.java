package com.caizhongming.Ericsson.command;

import java.util.concurrent.Callable;

/**
 * 抽象命令类，实现Callable接口，成员变量key来接受命令的参数。
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

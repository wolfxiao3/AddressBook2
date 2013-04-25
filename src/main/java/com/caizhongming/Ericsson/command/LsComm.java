package com.caizhongming.Ericsson.command;

import java.util.Iterator;

import com.caizhongming.Ericsson.JSON.Config;

/**
 * ls命令类
 * 
 * @author momo
 * 
 */
public class LsComm extends ComnComn {
	/**
	 * 利用Iterater输出对象的key。
	 */
	public Object call() {
		// TODO Auto-generated method stub
		Iterator iter = Config.js.keys();
		while (iter.hasNext()) {
			String name = (String) iter.next();
			System.out.print(name + " ");
		}
		return 1;
	}

}

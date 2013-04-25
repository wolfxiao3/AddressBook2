package com.caizhongming.Ericsson.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.caizhongming.Ericsson.JSON.Config;

/**
 * remove命令类
 * 
 * @author momo
 * 
 */
public class RemoveComm extends ComnComn {
	/**
	 * 首先提示输入key，如key在对象中存在，则删除相应内容，如不存在，则提示信息不存在。
	 */
	public Object call() {
		ArrayList l = new ArrayList();
		Iterator iter = Config.js.keys();
		while (iter.hasNext()) {
			l.add((String) iter.next());
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("please give the key: ");
		key = sc.nextLine();
		if (l.contains(key)) {
			Config.js.remove(key);
			System.out.print(key + " was deleted from JSON");
		} else {
			System.out.println("信息不存在，无法删除");
		}
		return 1;

	}

}

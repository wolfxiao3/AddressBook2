package com.caizhongming.Ericsson.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.caizhongming.Ericsson.JSON.Config;

/**
 * remove������
 * 
 * @author momo
 * 
 */
public class RemoveComm extends ComnComn {
	/**
	 * ������ʾ����key����key�ڶ����д��ڣ���ɾ����Ӧ���ݣ��粻���ڣ�����ʾ��Ϣ�����ڡ�
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
			System.out.println("��Ϣ�����ڣ��޷�ɾ��");
		}
		return 1;

	}

}

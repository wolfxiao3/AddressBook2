package com.caizhongming.Ericsson.comnHash;

import java.util.HashMap;

import com.caizhongming.Ericsson.command.ComnComn;
import com.caizhongming.Ericsson.command.NoComnCommand;

/**
 * ��������ַ������������Ӧ��ȡ������ʵ��
 * 
 * @author momo
 * 
 */
public class ComnHash {
	public static HashMap<String, String> comnlist = new HashMap<String, String>();
	public static NoComnCommand noComnCommand = new NoComnCommand();
	public volatile static ComnComn cc = noComnCommand;

	static {
		comnlist.put("ls", "com.caizhongming.Ericsson.command.LsComm");
		comnlist.put("cd", "com.caizhongming.Ericsson.command.CdComm");
		comnlist.put("cat", "com.caizhongming.Ericsson.command.CatComm");
		comnlist.put("add", "com.caizhongming.Ericsson.command.AddComm");
		comnlist.put("remove", "com.caizhongming.Ericsson.command.RemoveComm");
		comnlist.put("!help", "com.caizhongming.Ericsson.command.NoComnCommand");

	}

	/**
	 * ȡ�ô��в���������
	 * 
	 * @param comnStr
	 * @param param
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static ComnComn getComn(String comnStr, String param)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		if (comnlist.containsKey(comnStr)) {

			cc = (ComnComn) Class.forName((String) comnlist.get(comnStr))
					.newInstance();
			cc.setKey(param);
			return cc;
		}
		return (ComnComn) noComnCommand;
	}

	/**
	 * ȡ���޲���������
	 * 
	 * @param comnStr
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static ComnComn getComn(String comnStr)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		if (comnlist.containsKey(comnStr)) {

			cc = (ComnComn) Class.forName((String) comnlist.get(comnStr))
					.newInstance();
			return cc;
		}
		return (ComnComn) noComnCommand;
	}

}

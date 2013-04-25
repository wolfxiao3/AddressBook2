package com.caizhongming.Ericsson.command;

/**
 * 默认命令以及帮助命令
 * 
 * @author momo
 * 
 */
public class NoComnCommand extends ComnComn {
	/**
	 * 当用户输入！help时或者输入错误的命令时显示相应信息。
	 */
	public Object call() {
		// TODO Auto-generated method stub
		System.out.println("正确的命令有：ls cd cat remove !help !quit add");
		return 1;
	}

}

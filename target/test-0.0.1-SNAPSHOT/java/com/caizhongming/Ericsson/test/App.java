package com.caizhongming.Ericsson.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.caizhongming.Ericsson.command.ComnComn;
import com.caizhongming.Ericsson.command.NoComnCommand;
import com.caizhongming.Ericsson.comnHash.ComnHash;

/**
 * 
 * 
 */
public class App {
	/**
	 * 程序入口
	 * 
	 * @param args
	 * @throws Exception
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws Exception,
			IllegalAccessException, ClassNotFoundException {
		BufferedReader bufReader = new BufferedReader(new InputStreamReader(
				System.in));
		String input = null;
		System.out.print("ab> ");
		try {
			while (!(input = bufReader.readLine()).equals("!quit")) {
				System.out.print("ab> ");
				String[] str = input.split(" ");
				ComnComn cc = ComnHash.cc;
				if (str.length == 1)
					cc = ComnHash.getComn(str[0]);
				if (str.length == 2)
					cc = ComnHash.getComn(str[0], str[1]);
				if (str.length != 1 && str.length != 2)
					System.out.println("参数个数不正确");
				ArrayList al = new ArrayList<Callable<Object>>();
				al.add(cc);
				ExecutorService executorService = Executors
						.newCachedThreadPool();
				executorService.invokeAll(al);
				executorService.shutdown();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

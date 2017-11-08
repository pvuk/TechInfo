package com.techinfo.web.spring.test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
	public static void main(String[] args) {
		PrintStream out = null;
		try {
			out = new PrintStream("Hi");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.setOut(out);
	}
}

package com.cts;

import com.cts.service.SomeService;

public class Main {

	public static void main(String[] args) {
		System.out.println("My first session");
		System.out.println("In Progress");
		
		SomeService ss = new SomeService();
		System.out.println(ss.findLength("program"));
	}

}

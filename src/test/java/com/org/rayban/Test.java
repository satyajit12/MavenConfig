package com.org.rayban;

public class Test {
	private void test(String ss) {
		StringBuilder sb = new StringBuilder();
		String s = " Das";
		sb.append("manash ");
		sb.append("Kumar ");
		sb.append(s);
		sb.append(ss);
		System.out.println(sb);	
		
	}	
	public static void main(String[] args) {
		Test t = new Test();
		t.test("bangalore");
		
	}

}

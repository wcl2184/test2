package com.wl.test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TestMain {
	
	private static LinkedList[] list = new LinkedList[100];
	static class Node{
		Object key;
		Object value;
	}

	public static void main(String[] args) {
	Map<String,String> m = new HashMap<String,String>();	
		m.put("k1", "v1");
		m.put("k2", "v2");
		m.put("k3", "v3");
		for(Map.Entry<String, String> me : m.entrySet()){
			System.out.println(me.getKey()+"  "+me.getValue());
		}
		
	}
	
}

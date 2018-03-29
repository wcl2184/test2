package com.wl.test;

import java.io.FileInputStream;

public class TestReadFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("/Users/wl/Downloads/WechatIMG3.jpeg");
		byte[] bs = new byte[fis.available()];
		fis.read(bs);
		System.out.println(bs.length);
	}

}

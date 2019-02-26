package com.bj58.test;

import com.bj58.adaptor.UsbAdaptor1;
import com.bj58.service.PS2;

public class Main1 {

	public static void main(String[] args) {
          PS2 adaptor = new UsbAdaptor1();
          adaptor.isPs2();
	}

}

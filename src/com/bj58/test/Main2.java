package com.bj58.test;

import com.bj58.adaptor.UsbAdaptor2;
import com.bj58.service.PS2;
import com.bj58.service.USB;
import com.bj58.service.impl.Usber;

public class Main2 {

	public static void main(String[] args) {
		  USB usber = new Usber();
          PS2 adaptor = new UsbAdaptor2(usber);
          adaptor.isPs2();
	}

}

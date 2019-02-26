package com.bj58.adaptor;

import com.bj58.service.PS2;
import com.bj58.service.USB;

/**
 * 用于将ps2接口格式转换成为USB接口格式
 * 使用对象组合方式
 * @author yangxiaochen
 *
 */
public class UsbAdaptor2 implements PS2 {
	private USB usb;

	public UsbAdaptor2(USB usb) {
		this.usb = usb;
	}

	@Override
	public void isPs2() {
		usb.isUsb();
	}

}

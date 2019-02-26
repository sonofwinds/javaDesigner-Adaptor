package com.bj58.adaptor;

import com.bj58.service.PS2;
import com.bj58.service.impl.Usber;
/**
 * 用于将ps2接口格式转换成为USB接口格式
 * 使用继承方式
 * @author yangxiaochen
 */
public class UsbAdaptor1 extends Usber implements PS2 {

	@Override
	public void isPs2() {
		this.isUsb();
	}

}

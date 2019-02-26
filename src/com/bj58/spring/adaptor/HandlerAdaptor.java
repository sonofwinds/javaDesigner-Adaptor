package com.bj58.spring.adaptor;

import com.bj58.spring.controller.Controller;

public interface HandlerAdaptor {
	//具体业务的处理
	void handle(Controller handler);
	//建立被适配的类与对应的适配器的映射
	boolean support(Controller handler);
}

package com.bj58.spring.adaptor.impl;

import com.bj58.spring.adaptor.HandlerAdaptor;
import com.bj58.spring.controller.Controller;
import com.bj58.spring.controller.impl.SimpleController;

public class SimpleControllerAdaptor implements HandlerAdaptor {

	@Override
	public void handle(Object handler) {
		((SimpleController)handler).doSimpleHandler();
	}

	@Override
	public boolean support(Controller handler) {
		if(handler instanceof SimpleController) {
			return true;
		}
		return false;
	}

}

package com.bj58.spring.adaptor.impl;

import com.bj58.spring.adaptor.HandlerAdaptor;
import com.bj58.spring.controller.Controller;
import com.bj58.spring.controller.impl.HttpController;

public class HttpControllerAdaptor implements HandlerAdaptor {

	@Override
	public void handle(Controller handler) {
		((HttpController)handler).doHttpHandler();
	}

	@Override
	public boolean support(Controller handler) {
		if(handler instanceof HttpController) {
			return true;
		}
		return false;
	}

}

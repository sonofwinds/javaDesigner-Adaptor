package com.bj58.spring.adaptor.impl;

import com.bj58.spring.adaptor.HandlerAdaptor;
import com.bj58.spring.controller.Controller;
import com.bj58.spring.controller.impl.AnnotationController;

public class AnnotationControllerAdaptor implements HandlerAdaptor {

	@Override
	public void handle(Object handler) {
		((AnnotationController)handler).doAnnotationHandler();
	}

	@Override
	public boolean support(Controller handler) {
		if(handler instanceof AnnotationController) {
			return true;
		}
		return false;
	}

}

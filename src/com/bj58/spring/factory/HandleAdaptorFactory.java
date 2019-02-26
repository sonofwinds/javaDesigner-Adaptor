package com.bj58.spring.factory;

import java.util.ArrayList;
import java.util.List;

import com.bj58.spring.adaptor.HandlerAdaptor;
import com.bj58.spring.adaptor.impl.AnnotationControllerAdaptor;
import com.bj58.spring.adaptor.impl.HttpControllerAdaptor;
import com.bj58.spring.adaptor.impl.SimpleControllerAdaptor;
import com.bj58.spring.controller.Controller;
import com.bj58.spring.controller.impl.AnnotationController;
import com.bj58.spring.controller.impl.HttpController;
import com.bj58.spring.controller.impl.SimpleController;

public class HandleAdaptorFactory {
	List<HandlerAdaptor> handlerAdaptors = new ArrayList<HandlerAdaptor>();
	{
		handlerAdaptors.add(new HttpControllerAdaptor());
		handlerAdaptors.add(new SimpleControllerAdaptor());
		handlerAdaptors.add(new AnnotationControllerAdaptor());
	}
	private static HandleAdaptorFactory handleAdaptorFactory = new HandleAdaptorFactory();
	public HandlerAdaptor createHandleAdaptor(Controller controller) {
		if (controller instanceof HttpController) {
			return new HttpControllerAdaptor();
		} else if (controller instanceof SimpleController) {
			return new SimpleControllerAdaptor();
		} else if (controller instanceof AnnotationController) {
			return new AnnotationControllerAdaptor();
		}
		return null;
	}
	
	public HandlerAdaptor createHandleAdaptorV2(Controller controller) {
		for(HandlerAdaptor handlerAdaptor : handlerAdaptors) {
			if(handlerAdaptor.support(controller)) {//建立映射，也可采用配置文件的方式
				return handlerAdaptor;
			}
		}
		return null;
	}
	
	public static HandleAdaptorFactory getInstance() {
		return handleAdaptorFactory;
	}
}

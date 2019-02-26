package com.bj58.spring.servlet;

import com.bj58.spring.adaptor.HandlerAdaptor;
import com.bj58.spring.controller.Controller;
import com.bj58.spring.controller.impl.SimpleController;
import com.bj58.spring.factory.HandleAdaptorFactory;

public class ServeltDispatch {

	public static void main(String[] args) {
         /**
          * 第一种方式：可以采用工厂方法，但是里面会有较多的if else 语句判断，不优雅
          */
//		  Controller controller = new SimpleController();
//        HandlerAdaptor handleAdaptor = HandleAdaptorFactory.getInstance().createHandleAdaptor(controller);
//        handleAdaptor.handle(controller);
          
          /**
           * 第二种方式：同样可以采用工厂方法，只不过避免了繁杂的if else语句判断，主要是因为通过一种方式建立起了映射关系
           */
          Controller controller = new SimpleController();
          HandlerAdaptor handleAdaptor = HandleAdaptorFactory.getInstance().createHandleAdaptorV2(controller);
          handleAdaptor.handle(controller);
	}
}

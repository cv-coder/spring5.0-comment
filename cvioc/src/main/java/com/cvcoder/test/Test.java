package com.cvcoder.test;

import com.cvcoder.config.Appconfig;
import com.cvcoder.dao.QueryDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// 注解配置应用程序上下文，把spring所有前提环境准备好(bean容器工厂、实例化)
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		context.refresh();
		QueryDao queryDao = context.getBean(QueryDao.class);
		queryDao.say();
	}

}

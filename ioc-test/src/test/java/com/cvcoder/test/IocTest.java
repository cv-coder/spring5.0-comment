package com.cvcoder.test;

import com.cvcoder.bean.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description: IOC测试类
 * @author: wpc
 * @create: 2020-06-18 00:09
 **/
public class IocTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
		Student student = (Student)applicationContext.getBean("student");
		student.say();

	}


}

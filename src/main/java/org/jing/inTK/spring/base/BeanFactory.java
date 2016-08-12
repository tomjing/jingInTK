package org.jing.inTK.spring.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactory {
	private static ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	public static Object getBean(String beanName){
		return ac.getBean(beanName);
	}
}

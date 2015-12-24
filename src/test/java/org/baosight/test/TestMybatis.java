package org.baosight.test;

import org.baosight.model.Cross;
import org.baosight.service.CrossServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatis {
	@Test
	public  void main1(){
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		
		CrossServiceI crossService = (CrossServiceI) ac.getBean("crossService");
		Cross c = crossService.getCrossByID(5);
		System.out.println(c.getCrossname());
		
	}
}

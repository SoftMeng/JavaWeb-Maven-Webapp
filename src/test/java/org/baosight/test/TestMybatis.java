package org.baosight.test;



import java.util.List;

import org.apache.log4j.Logger;
import org.baosight.model.Cross;
import org.baosight.service.CrossServiceI;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;

public class TestMybatis {
	private static final Logger logger = Logger.getLogger(TestMybatis.class);
	ApplicationContext ac = 
			new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
	
	CrossServiceI crossService = (CrossServiceI) ac.getBean("crossService");
	@Test
	public  void main1(){
		
		Cross c = crossService.getCrossByID(5);
		
		logger.info(JSON.toJSON(c));
	}
	@Test
	public void test2(){
		List<Cross> l = crossService.getAll();
		logger.info(JSON.toJSON(l));
		
	}
}

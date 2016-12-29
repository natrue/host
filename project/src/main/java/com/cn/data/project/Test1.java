package com.cn.data.project;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDao;
import domain.Student;

public class Test1 {
	@Test
	public void add() throws Exception{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		StudentDao studentDao=(StudentDao) applicationContext.getBean("studentDao");
		studentDao.add(new Student(1,"王志安",23));
	}
}

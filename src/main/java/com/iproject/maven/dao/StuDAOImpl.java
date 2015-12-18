package com.iproject.maven.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.iproject.maven.model.StuVO;

@Repository
public class StuDAOImpl implements StuDAO{
	
	public List<StuVO> stulist(){
		List<StuVO> stu = new ArrayList<StuVO>();
		
		StuVO stu1 = new StuVO();
		stu1.setId(001);
		stu1.setName("小明");
		stu1.setScore(99);
		stu.add(stu1);
		
		StuVO stu2 = new StuVO();
		stu2.setId(002);
		stu2.setName("小王");
		stu2.setScore(55);
		stu.add(stu2);
		
		StuVO stu3 = new StuVO();
		stu3.setId(003);
		stu3.setName("小李");
		stu3.setScore(92);
		stu.add(stu3);
		
		return stu;
		
	}
	

}

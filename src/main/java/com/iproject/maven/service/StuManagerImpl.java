package com.iproject.maven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iproject.maven.dao.StuDAO;
import com.iproject.maven.model.StuVO;

@Service
public class StuManagerImpl implements StuManager{
	@Autowired
	StuDAO dao;
	
	public List<StuVO> stulist(){
		return dao.stulist();
	}

}

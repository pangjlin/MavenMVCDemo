package com.iproject.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iproject.maven.service.StuManager;

@Controller
public class StuController {
	
	@Autowired
	StuManager manager;
	
	@RequestMapping(value="/studentList",method=RequestMethod.GET)
	public ModelAndView stulist(Model model){
//		model.addAttribute("students", manager.stulist());
		ModelAndView mv = new ModelAndView();
		mv.addObject("students", manager.stulist());
		mv.setViewName("StuList");
		return mv;
	}

}

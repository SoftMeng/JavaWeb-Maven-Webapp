package org.baosight.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.baosight.model.Cross;
import org.baosight.service.CrossServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


//http://localhost:8080/JavaWeb/crossController/showCross.do
@Controller
@RequestMapping("/crossController")
public class CrossController {
	
	private CrossServiceI crossService;
	
	public CrossServiceI getCrossService() {
		return crossService;
	}

	@Autowired
	public void setCrossService(CrossServiceI crossService) {
		this.crossService = crossService;
	}

	@RequestMapping("/tojson/{crossid}")
	@ResponseBody
	public List tojson(@PathVariable Integer crossid){
		List<Cross> l = new ArrayList<Cross>();
		Cross c = crossService.getCrossByID(crossid);
	
		l.add(c);
		return l;
	}
	
	
	@RequestMapping("/showCross/{crossid}")
	public ModelAndView showCross(@PathVariable Integer crossid,HttpServletRequest request){
		
		Cross c = crossService.getCrossByID(crossid);		
		ModelAndView mv = new ModelAndView();
		mv.addObject("cross", c);
		mv.setViewName("showCross");
		return mv;
	}

}

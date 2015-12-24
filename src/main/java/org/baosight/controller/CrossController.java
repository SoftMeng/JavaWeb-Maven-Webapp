package org.baosight.controller;

import javax.servlet.http.HttpServletRequest;

import org.baosight.model.Cross;
import org.baosight.service.CrossServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


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

	@RequestMapping("/showCross/{crossid}")
	public String showCross(@PathVariable Integer crossid,HttpServletRequest request){
		Cross c = crossService.getCrossByID(crossid);
		request.setAttribute("cross", c);
		return "showCross";
	}

}

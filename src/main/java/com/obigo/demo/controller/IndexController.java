package com.obigo.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Model m) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index");
        return mv;
    }
	
}

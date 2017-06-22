package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * page的Controller
 * @author Administrator
 *
 */
@Controller
public class PageController {

	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	//跳转到相应的页面
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
}

package com.santosh.messageportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.santosh.messageportal.model.Message;
import com.santosh.messageportal.service.MessageManager;

@Controller
public class HomeController {

	@Autowired
	MessageManager messageManager;
	@RequestMapping({ "/", "/login", "/home" })
	public ModelAndView displayHomeWithMessages() throws Exception {
		ModelAndView model = new ModelAndView("home");
		List<Message> list = messageManager.getAllMessage();
		model.addObject("messageList", list);
		return model;
	}

		
}

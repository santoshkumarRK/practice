package com.santosh.messageportal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.santosh.messageportal.model.Message;
import com.santosh.messageportal.service.MessageManager;

@Controller
@RequestMapping("/message")
public class MessageController {
	@Autowired
	MessageManager messageManagerService;

	@RequestMapping(method=RequestMethod.GET)
	 public String displayMessage(ModelMap model,Message message){
		model.put("message", message);
		 return "MessageForm";
	 }
	
	
	 @RequestMapping(method = RequestMethod.POST,value="/add")
	public String processMessageForm(@Valid Message message, BindingResult bindingResult)throws Exception{
		 System.out.println("process Message form");
		if(bindingResult.hasErrors()){
			return "MessageForm";
		}else{
			messageManagerService.AddMessage(message.getSummary(), message.getDescription());
			return "redirect:/home";
		}
	}
	 
	 @RequestMapping(value="/edit",method=RequestMethod.GET)
	 public String editUserForm(ModelMap model, @ModelAttribute Message message) throws Exception{
		 model.put("message",  messageManagerService.getMessage(message.getId()));
		 return "MessageForm";
	 }
	 
	 
	 @RequestMapping(method=RequestMethod.POST,value="/edit")
	 public String updateMessage(@Valid Message message,BindingResult bindingResult) throws Exception{
		 if(bindingResult.hasErrors()){
			 return "edit";
		 }else{
			 messageManagerService.deleteMessage(message.getId());
			 messageManagerService.AddMessage(message.getSummary(), message.getDescription());
		 }
		 return "home";
	 }
	 
	 
}

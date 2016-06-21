package com.santosh.messageportal.dao;

import java.util.List;

import com.santosh.messageportal.model.Message;

public interface MessageDAO {
	
	

	public boolean addMessage(String summary,String description)throws Exception;
	
	public boolean deleteMessage(int messageId)throws Exception;
	
	public Message getMessage(int messageId)throws Exception;
	
	public List<Message> getAllMessage()throws Exception;
	
}

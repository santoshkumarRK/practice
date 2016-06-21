package com.santosh.messageportal.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santosh.messageportal.dao.MessageDAO;
import com.santosh.messageportal.model.Message;
import com.santosh.messageportal.service.MessageManager;

@Service
public class MessageManagerImpl  implements MessageManager{

	@Autowired
	MessageDAO messageDAO;
	
	@Override
	public boolean AddMessage(String description, String summary) throws Exception {
		return messageDAO.addMessage(summary, description);
	}

	@Override
	public Message getMessage(int messageId) throws Exception {
		return messageDAO.getMessage(messageId);
	}

	@Override
	public boolean deleteMessage(int messageId) throws Exception {
		return messageDAO.deleteMessage(messageId);
	}

	@Override
	public List<Message> getAllMessage() throws Exception {
		if(messageDAO.getAllMessage()==null){
			throw new Exception();
		}
		return new ArrayList<>(messageDAO.getAllMessage());
	}

}

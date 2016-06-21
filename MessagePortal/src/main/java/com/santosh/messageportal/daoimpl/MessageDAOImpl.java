package com.santosh.messageportal.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.santosh.messageportal.dao.MessageDAO;
import com.santosh.messageportal.model.Message;

@Repository
public class MessageDAOImpl implements MessageDAO {

	private List<Message> messageList = new ArrayList<Message>();

	public MessageDAOImpl() {
		Message m1 = new Message();
		m1.setDescription("message 1 description");
		m1.setSummary("message 1 summary");
		messageList.add(m1);
		m1 = new Message();
		m1.setDescription("message 2 description");
		m1.setSummary("message 2 summary");
		messageList.add(m1);
		m1 = new Message();

		m1.setDescription("message 3 description");
		m1.setSummary("message 3 summary");
		messageList.add(m1);
		m1 = new Message();
		m1.setDescription("message 4 description");
		m1.setSummary("message 4summary");
		messageList.add(m1);
		m1 = new Message();
		m1.setDescription("message 5 description");
		m1.setSummary("message 5 summary");
		messageList.add(m1);
	}

	@Override
	public boolean addMessage(String summary, String description) throws RuntimeException {
		Message message = new Message();
		message.setSummary(summary);
		message.setDescription(summary);
		return messageList.add(message);
	}

	@Override
	public boolean deleteMessage(int messageId) throws Exception {
		Message message = messageList.remove(messageId);
		if (message == null) {
			return false;
		}
		return true;
	}

	@Override
	public List<Message> getAllMessage() throws Exception {
		return messageList;
	}

	@Override
	public Message getMessage(int messageId) throws Exception {
		return messageList.get(messageId);
	}

}

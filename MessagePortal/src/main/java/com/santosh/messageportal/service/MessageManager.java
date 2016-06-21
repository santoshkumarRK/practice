package com.santosh.messageportal.service;

import java.util.List;

import com.santosh.messageportal.model.Message;

public interface MessageManager {
   boolean AddMessage(String description,String summary)throws Exception;
   Message getMessage(int messageId)throws Exception;
   boolean deleteMessage(int messageId)throws Exception;
   List<Message> getAllMessage()throws Exception;
}

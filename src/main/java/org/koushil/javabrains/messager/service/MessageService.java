package org.koushil.javabrains.messager.service;

import java.util.ArrayList;
import java.util.List;

import org.koushil.javabrains.messager.model.Message;

public class MessageService {
	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello", "Tien");
		Message m2 = new Message(2L, "Mangalapa", "Nguyen");
		
		List<Message> listMessages = new ArrayList<>();
		
		listMessages.add(m1);
		listMessages.add(m2);
		
		return listMessages;
		
		
		
		
		
	}
	
	
	
}

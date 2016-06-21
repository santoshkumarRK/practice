package com.santosh.messageportal.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Message {

	
	private int id;
	
	@NotNull(message="summary cann't be null")
	@NotEmpty(message="message cann't be empty")
	@Size(min=10,max=25, message="Message length should be between 10 to 25")
	private String summary;
	
	@NotNull(message="summary cann't be null")
	@NotEmpty(message="description cann't be empty")
	@Size(min=10,max=25, message="Message length should be between 10 to 25")
	private String description;
	
	public int getId() {
		return id;
	}

	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description.trim();
	}

	
	
}

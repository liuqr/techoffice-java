package com.techoffice.oracle.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.techoffice.oracle.client.service.ApplService;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

@Component
public class ApplController {
	
	@Autowired
	private ApplService applService;
	
	@FXML
	private TextArea sql;

	@FXML
	public void doSomething(){
		applService.doSomething();
	}
	
}
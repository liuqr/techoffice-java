package com.techoffice.example.controller;

import java.text.ParseException;
import java.util.Map;

import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techoffice.jc.horse.service.ResultQueueDateService;
import com.techoffice.util.exception.XmlUtilDocumentConversionException;

@Controller
@RequestMapping("ResultQueueDate")
public class ResultQueueDateController {

	@Autowired
	private ResultQueueDateService resultQueueDateService;


	@RequestMapping("pendingQueueDateList")
	@ResponseBody
	public Map<String, Object> pendingQueueDateList(){
		return resultQueueDateService.getPendingQueueDateList();
	}
	
	@RequestMapping("updateRaceResultQueueList")
	@ResponseBody
	public Map<String, Integer> updateRaceResultQueueList() throws XPathExpressionException, XmlUtilDocumentConversionException, ParseException{
		return resultQueueDateService.updateRaceResultQueueList();
	}
}

package com.techoffice.aastock.stock.crawler;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.techoffice.factory.WebDriverFactory;
import com.techoffice.util.WebDriverUtil;
import com.techoffice.util.XmlUtil;
import com.techoffice.util.exception.XmlUtilInvalidDocumentException;

/**
 * Web Crawler for http://www.aastocks.com/en/stocks/market/calendar.aspx?type=1
 * @author imben1109
 *
 */
@Service
public class ResultAnnounceCalendarCrawler {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	public static final String URL = "http://www.aastocks.com/en/stocks/market/calendar.aspx?type=1";
	
	public String retrieveXmlFromWebClient() {
		String xml = WebDriverUtil.getXml(URL);
		return xml;
	}
	
	public String retrieveResultAnnounceXmlFromWebClient(String page) {
		String xml = "";
        if (page == null){
        	WebDriverUtil.getXml(URL);
        }else {
        	WebDriverUtil.getXml(URL + page);
        }
        return xml;
	}
	
	public void parseXml(String xml){
		String xPath = "/html/body/form/div[2]/div[6]/table[2]/tbody/tr";
	}
	
	public int getPageCount(String xml) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException, XmlUtilInvalidDocumentException{
		String xPath = "/html/body/form/div[2]/div[6]/div[8]/table/tbody/tr/td[2]/a";
		NodeList tableNodeList = XmlUtil.evaluateXpath(xml, xPath);
		int pageCount = tableNodeList.getLength() + 1;
		return pageCount;
	}
}

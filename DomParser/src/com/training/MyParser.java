package com.training;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyParser extends DefaultHandler{

	@Override
	public void startDocument() throws SAXException {
//		System.out.println("Document Entered");
	}

	@Override
	public void endDocument() throws SAXException {
//		System.out.println("Document closed");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		if(localName.equals("name")){
			
//			System.out.println(localName);
		}
		
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
//		System.out.println(localName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
		for(int i=start;i<length;i++){
			System.out.print(ch[i]);
		}
		System.out.print("");
//		System.out.println(ch);
	}
	

}

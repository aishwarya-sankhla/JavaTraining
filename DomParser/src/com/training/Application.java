package com.training;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Application {

	public static void main(String[] args) {
		XMLReader parser;
		try {
			parser = XMLReaderFactory.createXMLReader();
			parser.setContentHandler(new MyParser());
			parser.parse("data.xml");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}

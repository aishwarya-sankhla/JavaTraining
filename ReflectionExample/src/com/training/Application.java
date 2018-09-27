package com.training;

import java.lang.reflect.*;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class Application {

	public static void main(String[] args) {
		
		try {
			Class<?> cls = Class.forName("com.training.Movie");
			Movie diamond = (Movie)cls.newInstance();
			diamond.setMovieId(203);
			diamond.setMovieName("titanic");
			
			System.out.println(diamond);
			
			Constructor<?>[] contList = cls.getDeclaredConstructors();
			
			for (Constructor<?> ctr:contList) {
				System.out.println("Name"+ctr.getName());
				System.out.println("Param count"+ctr.getParameterCount());
			}
			
			Method addRatingMethod = cls.getDeclaredMethod("addrating", int.class);
			System.out.println("Add Rating Method Reference"+ addRatingMethod);
			
			String result = (String) addRatingMethod.invoke(diamond, new Integer(20));
			System.out.println("=================="+result);
			
			Method[] methodList = cls.getDeclaredMethods();
			for(Method each:methodList){
				System.out.println(each.getName());
				System.out.println(each.getReturnType());
				Class[] types=each.getParameterTypes();
				for(Class eachParam:types){
					System.out.println(eachParam.getName());
				}
				
				XMLReader parser = XMLReaderFactory.createXMLReader();
				parser.parse("Name.xml");
//				parser.setContentHandler(new );
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
	}

}

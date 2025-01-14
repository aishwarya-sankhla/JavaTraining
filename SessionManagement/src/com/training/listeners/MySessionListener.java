package com.training.listeners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListener
 *
 */
public class MySessionListener implements HttpSessionListener,HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public MySessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("Inside Listener "+se.getSession().getCreationTime());
    	System.out.println("Inside Listener "+se.getSession().getId());
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("Inside Destroy Method"+se.getSession().getId()+" Destroyed");
    }

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		
		System.out.println("One Attribute in session="+se.getSession().getId());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("One attribute removed from session"+se.getSession().getId());
		String name = (String)se.getSession().getAttribute("name");
		if(name == null){
			throw new RuntimeException("Should not remove the attribute-Terminating");
		}
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		// TODO Auto-generated method stub
		HttpSessionAttributeListener.super.attributeReplaced(se);
	}
	
}

package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fact {
    private static SessionFactory factory;

    public static SessionFactory getFactory() {
        if (factory == null) {
            factory = new Configuration().configure("hib.cfg.xml").buildSessionFactory();
        }
        return factory;
    }
    
    public void closeFactory()
    {
    	if(factory.isOpen())
    	{
    		factory.close();
    	}
    }
}

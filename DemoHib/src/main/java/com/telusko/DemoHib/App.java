package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.xdevapi.SessionFactory;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Alien telusko=new Alien();
    	telusko.setAid(101);
    	telusko.setAname("Navin");
    	telusko.setColor("Green");
    	
    	
    	
    	Configuration con=new Configuration();
    	SessionFactory sf=(SessionFactory) con.buildSessionFactory();
    	Session session=((org.hibernate.SessionFactory) sf).openSession();
    	
    	session.save(telusko);
    
    }
}

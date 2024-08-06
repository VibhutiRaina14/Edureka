package com.org.MavenDemoProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.Maven_Spring.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
      //  ApplicationContext app=new class
        		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");//container
        		Manager m=(Manager) app.getBean("Manager");
        		m.doWork();
    }
}

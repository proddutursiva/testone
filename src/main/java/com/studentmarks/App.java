package com.studentmarks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
       studentBean sb=(studentBean)ctx.getBean("id1");
       detailsBean db=(detailsBean)ctx.getBean("id2");
       db.printl();
       
    }
}

package org.akshay.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Triangle triangle =new Triangle();
BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml") );
		triangle.draw();

	}

}

package com.example.demo;

import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.GroupLayout.SequentialGroup;

import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@Configuration
public class DemoApp  {

	public static void main(String[] args)
	{

		ConfigurableApplicationContext ctx =  new SpringApplicationBuilder(DemoApp.class)
		.web(WebApplicationType.NONE)
		.headless(false) //We turn off the headless mode, which is suitable for server applications.
		.run(args);
		
		/*
		SwingUtilities.invokeLater(new Runnable() {
		      @Override
		      public void run() {
		    	  DemoApp sa =  ctx.getBean(DemoApp.class);
					System.out.println("===EventQueue.invokeLater");
					
					BookRepository bookRepository = ctx.getBean(BookRepository.class);			        
					bookRepository.findAll();
										
			
					sa.setVisible(true);
		      }
		});
		*/
	}

}

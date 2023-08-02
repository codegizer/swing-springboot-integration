package com.example.demo;

import com.example.demo.controller.MainController;
import com.example.demo.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * This CommandLineRunner fires off at runtime and boots up our GUI.
 */
@Component
public class SpringBootSwingCommandLineRunner implements CommandLineRunner {
    private final MainController controller;
    
	@Autowired
    private BookRepository bookRepository;
	
    @Autowired
    public SpringBootSwingCommandLineRunner(MainController controller) {
        this.controller = controller;
        
    }


    @Override
    public void run(String... args) {
        //This boots up the GUI.
    	controller.initUI();
    	
        EventQueue.invokeLater(() -> controller.setVisible(true));
        
    }
}

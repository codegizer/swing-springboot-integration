package com.example.demo.controller;

import java.awt.Container;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

import javax.swing.GroupLayout.SequentialGroup;

@Controller
public class MainController extends JFrame {
	
	@Autowired
    private BookService bookService;
	
	public void initUI() 
	{
		//BeanFactory ctx = new ClassPathXmlApplicationContext(
        //        "/com/example/demo/applicationContext.xml");
		
		
		
		JButton quitBtn = new JButton("Quit");

		quitBtn.addActionListener((ActionEvent evt)->{

			System.exit(0);

		});

		JButton selectBtn = new JButton("Select LIMIT 10,0");

		selectBtn.addActionListener((ActionEvent evt)->{
			System.out.println(bookService);
			System.out.println(bookService.list().size());
		});

		JComponent[] jcompos = {quitBtn, selectBtn};

		createLayout(jcompos); //The child components need to be placed into containers. We delegate the task to the createLayout() method.

		setTitle("Quit app");

		setSize(300, 200);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	private void createLayout(JComponent... jcompo) 
	{

		Container pane = getContentPane();

		GroupLayout gl = new GroupLayout(pane);

		pane.setLayout(gl);


		gl.setAutoCreateContainerGaps(true);


		SequentialGroup seqGrp1 = gl.createSequentialGroup();

		SequentialGroup seqGrp2 = gl.createSequentialGroup();

		// seqGrp1.addComponent(jcompo[0]);

		// seqGrp2.addComponent(jcompo[0]);

		for(JComponent elCompo: jcompo )
		{

			seqGrp1.addComponent(elCompo);
	
			seqGrp2.addComponent(elCompo);
		
		}

		gl.setHorizontalGroup(seqGrp1);

		gl.setVerticalGroup(seqGrp2);

	}

}

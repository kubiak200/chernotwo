package com.thecherno.chernochat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private String name;
	private String address;
	private int port;
	

	/**
	 * Launch the application.
	 */



	/**
	 * Create the frame.
	 */
	public Client(String name, String address, int port) {
		this.name = name;
		this.address = address;
		this.port = port;
		
		createWindow();
		
		
		
	}
	
	private void createWindow() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(750, 450);
		 
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		System.out.println("Hola");

	}

}

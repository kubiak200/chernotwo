package com.thecherno.chernochat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddress;
	private JLabel lblAddress;
	private JTextField txtPort;
	private JLabel lblPort;
	private JLabel lbleg;
	private JLabel lbleg_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			
		}
	
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 380);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(64, 25, 166, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(124, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(64, 88, 166, 20);
		contentPane.add(txtAddress);
		
		lblAddress = new JLabel("IP Address:");
		lblAddress.setBounds(112, 74, 70, 14);
		contentPane.add(lblAddress);
		
		txtPort = new JTextField();
		txtPort.setColumns(10);
		txtPort.setBounds(64, 158, 166, 20);
		contentPane.add(txtPort);
		
		lblPort = new JLabel("Port:");
		lblPort.setBounds(124, 146, 33, 14);
		contentPane.add(lblPort);
		
		lbleg = new JLabel("(e.g. 8192)");
		lbleg.setBounds(106, 184, 76, 14);
		contentPane.add(lbleg);
		
		lbleg_1 = new JLabel("(e.g. 192.168.1.102)");
		lbleg_1.setBounds(87, 106, 119, 14);
		contentPane.add(lbleg_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = txtName.getText();
				String address = txtAddress.getText();
				int port = Integer.parseInt(txtPort.getText());
				
				
				
				login(name, address, port);
				
			}

		
		});
		btnNewButton.setBounds(102, 257, 89, 23);
		contentPane.add(btnNewButton);
	}
	
	
	/***
	 * 
	 * Login stuff here
	 */
	
	private void login(String name, String address, int port) {
		dispose();
		new Client(name, address, port);
	}
	
	
}

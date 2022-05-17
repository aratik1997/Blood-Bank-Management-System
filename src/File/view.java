package File;

import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;

public class view extends JFrame implements ActionListener
{

	
	private static final long serialVersionUID = 1L;
	private JTextField name;
	private JTextField phone;
	private JTextField email;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton back,exit,home;
	private JButton edit;
	private JLabel lblNewLabel_1,lblNewLabel_1_1,lblNewLabel_1_2,blood_gr;
	private JTextField bgrp;
	@SuppressWarnings("unused")
	private String[] sr;
	String nm;
	String nmbr;
	String eml;
	String bg;
	
	
	public view()
	{
		values value = new values();
//		System.out.println(vl.getName());
		setResizable(false);
		setTitle("NSU Blood Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("pannel logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setFocusable(false);
		contentPane.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 10), new LineBorder(new Color(255, 0, 0), 10)));;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("View Profile");
		lblNewLabel.setBackground(new Color(0, 255, 102));
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 55, 964, 67);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setFont(new Font("Calibri", Font.BOLD, 13));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setText(value.getName());
		name.setEditable(false);
		name.setToolTipText("Name");
		name.setBounds(383, 172, 269, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setEditable(false);
		phone.setHorizontalAlignment(SwingConstants.CENTER);
		phone.setText(value.getPhone());
		phone.setToolTipText("Phone no.\r\n");
		phone.setBounds(383, 228, 269, 20);
		contentPane.add(phone);
		phone.setColumns(10);
		
		
		email = new JTextField();
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setEditable(false);
		email.setToolTipText("Email");
		email.setBounds(383, 289, 269, 20);
		email.setText(value.getEmail());
		contentPane.add(email);
		email.setColumns(10);

		
		edit = new JButton("Edit Profile");
		edit.setBackground(Color.RED);
		edit.setForeground(Color.WHITE);
		edit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		edit.setAlignmentX(Component.CENTER_ALIGNMENT);
		edit.setFont(new Font("Calibri", Font.BOLD, 14));
		edit.addActionListener(this);
		edit.setBounds(421, 403, 129, 50);
		contentPane.add(edit);
		
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(246, 167, 111, 34);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Contact no.");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(246, 212, 111, 50);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("E-mail");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(246, 273, 111, 50);
		contentPane.add(lblNewLabel_1_2);
		
		back = new JButton("Back");
		back.setBounds(41, 512, 122, 23);
		back.addActionListener(this);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.RED);
		contentPane.add(back);
		
		home = new JButton("Home");
		home.setBounds(421, 512, 122, 23);
		home.setForeground(Color.WHITE);
		home.addActionListener(this);
		home.setBackground(Color.RED);
		contentPane.add(home);
		
		exit = new JButton("Exit");
		exit.setBounds(817, 512, 122, 23);
		exit.setForeground(Color.WHITE);
		exit.addActionListener(this);
		exit.setBackground(Color.RED);
		contentPane.add(exit);
		
		blood_gr = new JLabel("Blood Group");
		blood_gr.setFont(new Font("Tahoma", Font.BOLD, 11));
		blood_gr.setBounds(246, 334, 111, 50);
		contentPane.add(blood_gr);
		
		bgrp = new JTextField();
		bgrp.setHorizontalAlignment(SwingConstants.CENTER);
		bgrp.setEditable(false);
		if(value.getBlood_group().equals("1"))
		{
			bgrp.setText("A+");	
		}
		else if(value.getBlood_group().equals("2"))
		{
			bgrp.setText("A-");	
		}
		else if(value.getBlood_group().equals("3"))
		{
			bgrp.setText("B+");	
		}
		else if(value.getBlood_group().equals("4"))
		{
			bgrp.setText("B-");	
		}
		else if(value.getBlood_group().equals("5"))
		{
			bgrp.setText("O+");	
		}
		else if(value.getBlood_group().equals("6"))
		{
			bgrp.setText("O-");	
		}
		else if(value.getBlood_group().equals("7"))
		{
			bgrp.setText("AB+");	
		}
		else if(value.getBlood_group().equals("8"))
		{
			bgrp.setText("AB-");	
		}
		else
		{
			bgrp.setText(value.getBlood_group());
		}
		bgrp.setBounds(383, 349, 269, 20);
		contentPane.add(bgrp);
		bgrp.setColumns(10);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==back)
		{
			this.dispose();
			profile1 frame = new profile1();;
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
		if(e.getSource()==exit)
		{
			int ch = JOptionPane.showConfirmDialog(null, "Are you sure?","Warning",JOptionPane.YES_NO_OPTION);
			if(ch == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			else
			{
				
			}
		}
		if(e.getSource()==home)
		{
			this.dispose();
			option frame = new option();;
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
		if(e.getSource()==edit)
		{
			this.dispose();
			edit frame = new edit();;
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
	}
	
	
}
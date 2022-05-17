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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class edit extends JFrame implements ActionListener
{

	
	private static final long serialVersionUID = 1L;
	private static JTextField name;
	private static JTextField phone;
	private static JTextField email;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton back,exit,home;
	private JButton sbmt;

	private JLabel lblNewLabel_1,lblNewLabel_1_1,lblNewLabel_1_2,blood_gr;
	private static JTextField bgrp;
	private String[] sr;
	String nm;
	String nmbr;
	String eml;
	String bg;
	
	
	public edit()
	{
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
		
		try (BufferedReader BR = new BufferedReader(new FileReader("login.txt"))) 
		{
			String s;
			
			
			while((s=BR.readLine()) != null)
			{
				sr=s.split(",");
				nm=sr[0];
				nmbr=sr[1];
				eml=sr[2];
				bg=sr[3];
			}
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		lblNewLabel = new JLabel("Edit Profile");
		lblNewLabel.setBackground(new Color(0, 255, 102));
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 55, 964, 67);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setFont(new Font("Calibri", Font.BOLD, 13));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setText(sr[0]);
		name.setToolTipText("Name");
		name.setBounds(383, 172, 269, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setEditable(false);
		phone.setHorizontalAlignment(SwingConstants.CENTER);
		phone.setText(sr[1]);
		phone.setToolTipText("Phone no.\r\n");
		phone.setBounds(383, 228, 269, 20);
		contentPane.add(phone);
		phone.setColumns(10);
		
		
		email = new JTextField();
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setToolTipText("Email");
		email.setBounds(383, 289, 269, 20);
		email.setText(sr[2]);
		contentPane.add(email);
		email.setColumns(10);

		
		sbmt = new JButton("Submit");
		sbmt.setBackground(Color.RED);
		sbmt.setForeground(Color.WHITE);
		sbmt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sbmt.setAlignmentX(Component.CENTER_ALIGNMENT);
		sbmt.setFont(new Font("Calibri", Font.BOLD, 14));
		sbmt.addActionListener(this);
		sbmt.setBounds(421, 403, 129, 50);
		contentPane.add(sbmt);
		
		
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
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
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
		exit.setBackground(Color.RED);
		exit.addActionListener(this);
		contentPane.add(exit);
		
		blood_gr = new JLabel("Blood Group");
		blood_gr.setFont(new Font("Tahoma", Font.BOLD, 11));
		blood_gr.setBounds(246, 334, 111, 50);
		contentPane.add(blood_gr);
		
		bgrp = new JTextField();
		bgrp.setEditable(false);
		bgrp.setHorizontalAlignment(SwingConstants.CENTER);
		if(sr[3].equals("1"))
		{
			bgrp.setText("A+");	
		}
		else if(sr[3].equals("2"))
		{
			bgrp.setText("A-");	
		}
		else if(sr[3].equals("3"))
		{
			bgrp.setText("B+");	
		}
		else if(sr[3].equals("4"))
		{
			bgrp.setText("B-");	
		}
		else if(sr[3].equals("5"))
		{
			bgrp.setText("O+");	
		}
		else if(sr[3].equals("6"))
		{
			bgrp.setText("O-");	
		}
		else if(sr[3].equals("7"))
		{
			bgrp.setText("AB+");	
		}
		else if(sr[3].equals("8"))
		{
			bgrp.setText("AB-");	
		}
		else
		{
			bgrp.setText(sr[3]);
		}
		bgrp.setBounds(383, 349, 269, 20);
		contentPane.add(bgrp);
		bgrp.setColumns(10);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==sbmt)
		{
			editable("User.txt");
			editable("login.txt");
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
			option frame = new option();
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
		if(e.getSource()==back)
		{
			this.dispose();
			profile1 frame = new profile1();
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
	}
	public void fwrite_user(String path) 
	{
		try
		{
			if(fread().equals(phone.getText()))
			{
				BufferedWriter BF = new BufferedWriter(new FileWriter(path,true));
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+sr[3]);
				BF.newLine();
				BF.close();
			}
			
		}
		catch(IOException e)
		{
			System.out.println("File not found!");
		}
	}
	public String fread()
	{
		String num=null;
		try
		{
			
			BufferedReader BW = new BufferedReader(new FileReader("User.txt"));
			String s;
			String[] sarray;
			while((s=BW.readLine())!= null) 
			{
				sarray = s.split(",");
				num = sarray[1];
			}
			
			BW.close();
			return num;
		}
		catch(IOException e)
		{
			System.out.println("File not found!");
		}
		return num;
		
	}
	
	public static void editable(String path)
	{
		@SuppressWarnings("unused")
		values value = new values();
		Scanner x;
		File oldf = new File(path);
		File newf = new File("temp.txt");
		
		String name1 = "";
		String num1 = "";
		String email1 = "";
		String bgrp1 = "";
		
		try 
		{
			FileWriter FW = new FileWriter("temp.txt",true);
			BufferedWriter BW = new BufferedWriter(FW);
			PrintWriter PW = new PrintWriter(BW);
			x = new Scanner(new File(path));
			x.useDelimiter("[,\n]");
			
			while(x.hasNext())
			{
				name1 = x.next();
				num1 = x.next();
				email1 = x.next();
				bgrp1 = x.next();
				if(num1.equals(phone.getText()))
				{
					PW.println(name.getText()+","+phone.getText()+","+email.getText()+","+bgrp.getText());
				}
				else
				{
					PW.println(name1 + ","+num1+","+email1+","+bgrp1);
				}
				
			}
			x.close();
			PW.flush();
			PW.close();
			oldf.delete();
			File dump = new File(path);
			newf.renameTo(dump);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
}
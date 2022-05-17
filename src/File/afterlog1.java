package File;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class afterlog1 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton submit, back_rl, Exit_rl;
	private JLabel lblNewLabel;
	private JTextField phone;
	private JPasswordField pfild;
	private JCheckBox chkbox;
	private boolean check = false ;
	
	

	public afterlog1() {
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
	
		submit = new JButton("Submit");
		submit.setFont(new Font("Calibri", Font.BOLD, 14));
		submit.addActionListener(this);
		submit.setBounds(473, 390, 100, 34);
		contentPane.add(submit);
		
		back_rl = new JButton("Back");
		back_rl.addActionListener(this);
		back_rl.setForeground(Color.WHITE);
		back_rl.setBackground(new Color(255, 0, 0));
		back_rl.setBounds(41, 512, 122, 23);
		contentPane.add(back_rl);

		Exit_rl = new JButton("Exit");
		Exit_rl.addActionListener(this);
		Exit_rl.setBackground(Color.RED);
		Exit_rl.setForeground(Color.WHITE);
		Exit_rl.setBounds(817, 512, 122, 23);
		contentPane.add(Exit_rl);
		
		lblNewLabel = new JLabel("LOGIN:");
		lblNewLabel.setFont(new Font("Candara", Font.PLAIN, 58));
		lblNewLabel.setBounds(306, 87, 206, 89);
		contentPane.add(lblNewLabel);
		
		phone = new JTextField();
		phone.setBounds(309, 221, 430, 23);
		contentPane.add(phone);
		phone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Phone number:");
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(306, 187, 142, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Sitka Display", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(309, 264, 142, 23);
		contentPane.add(lblNewLabel_1_1);
		
		chkbox = new JCheckBox("Show password");
		chkbox.setBounds(460, 337, 135, 23);
		chkbox.addActionListener(     this);
		contentPane.add(chkbox);
		
		pfild = new JPasswordField();
		pfild.setEchoChar('*');
		pfild.setBounds(309, 298, 433, 23);
		contentPane.add(pfild);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==chkbox) 
		{
			if(chkbox.isSelected()) {
				pfild.setEchoChar((char)0);
			
			}
			else
			{
				pfild.setEchoChar('*');
			}
		}
		if(e.getSource()==submit)
		{
			if(user()==true)
			{
				this.dispose();
				option frame = new option();
				frame.setVisible(true);
				frame.setResizable(false);
				frame.setFocusable(false);
				user_write();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Phone no. or Password is not valid!","Warning",0);
				pfild.setText("");
				phone.setText("");
			}
		}
		if(e.getSource()==back_rl) 
		{
			this.dispose();
			login1 frame = new login1();
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setFocusable(false);
		}
		if (e.getSource()==Exit_rl) 
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
	
	}
	public boolean user()
	{
		try
		{
			
			@SuppressWarnings("resource")
			BufferedReader BW = new BufferedReader(new FileReader("Secret.txt"));
			String s;
			String[] sarray;
			String number1 = null;
			String pass = null;
			String passfi = new String(pfild.getPassword());
			while((s=BW.readLine())!= null) 
			{
				sarray = s.split(",");
				number1 = sarray[0];
				pass = sarray[1];
				if(number1.equals(phone.getText()) && pass.equals(passfi))
				{
					return true;
				}
			}
			
			BW.close();
		}
		catch(IOException e)
		{
			System.out.println("File not found!");
		}
		return check;
	}
	public void user_write()
	{
		if(user()==true)
		{
			try 
			{
				try (BufferedReader BR = new BufferedReader(new FileReader("user.txt"))) 
				{
					String s;
					String[] sarray;
					String name1 = null;
					String num1 = null;
					String email1 = null;
					String BG1 = null;
//					String passfi = new String(pfild.getPassword());
					while((s=BR.readLine())!= null)
					{
						sarray = s.split(",");
						name1 = sarray[0];
						num1 = sarray[1];
						email1 = sarray[2];
						BG1 = sarray[3];
						if(num1.equals(phone.getText()))
						{
							try (BufferedWriter BW = new BufferedWriter(new FileWriter("login.txt"))) {
								BW.append(name1+","+num1+","+email1+","+BG1);
								BW.newLine();
								BW.close();
							}
									
									
						}
					}
					BR.close();
				}
			}
			catch(IOException e)
			{
				System.out.println("File not found!");
			}
		
		}
	}
}
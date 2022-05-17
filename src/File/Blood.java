package File;

import java.awt.*;  
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Blood extends JFrame implements ActionListener,file
{

	
	private static final long serialVersionUID = 1L;
	private JTextField name;
	private JTextField phone;
	private JTextField email;
	private JPanel contentPane;
	private JLabel lblNewLabel,lblNewLabel_2;
	private JButton submit,back,Login,passcon;
	private JPasswordField pass;
	private JLabel lblNewLabel_1,lblNewLabel_1_1,lblNewLabel_1_2,lblNewLabel_1_3,blood_gr;
	private JCheckBox ckbx; 
	private JComboBox<String> bloodgroup;
	private boolean check = false ;
	private JPasswordField cpass;
	
	
	public Blood()
	{
		setResizable(false);
		setTitle("NSU Blood Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("pannel logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setFocusable(false);
		contentPane.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 10), new LineBorder(new Color(255, 0, 0), 10)));;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBackground(new Color(0, 255, 102));
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 55, 964, 67);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setToolTipText("Name");
		name.setBounds(383, 143, 269, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		phone = new JTextField();
		phone.setToolTipText("Phone no.\r\n");
		phone.setBounds(383, 181, 269, 20);
		contentPane.add(phone);
		phone.setColumns(10);
		
		
		email = new JTextField();
		email.setToolTipText("Email");
		email.setBounds(383, 224, 269, 20);
		contentPane.add(email);
		email.setColumns(10);

		
		submit = new JButton("Submit");
		submit.setBackground(Color.RED);
		submit.setForeground(Color.WHITE);
		submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		submit.setAlignmentX(Component.CENTER_ALIGNMENT);
		submit.setFont(new Font("Calibri", Font.BOLD, 14));
		submit.addActionListener(this);
		submit.setBounds(383, 419, 100, 34);
		contentPane.add(submit);
		
		pass = new JPasswordField();
		pass.setToolTipText("Password");
		pass.setActionCommand("");
		pass.setName("");
		pass.setForeground(new Color(0, 0, 0));
		pass.setEchoChar('*');
		pass.setBackground(Color.WHITE);
		pass.setBounds(383, 303, 269, 20);
		contentPane.add(pass);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(246, 138, 111, 34);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Contact no.");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(246, 165, 111, 50);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("E-mail");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(246, 208, 111, 50);
		contentPane.add(lblNewLabel_1_2);
		
		
		lblNewLabel_1_3 = new JLabel("Password");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(246, 287, 111, 50);
		contentPane.add(lblNewLabel_1_3);
		
		ckbx = new JCheckBox("Show Password");
		ckbx.setFont(new Font("Tahoma", Font.BOLD, 11));
		ckbx.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ckbx.addActionListener(this);
		ckbx.setBounds(451, 370, 130, 23);
		contentPane.add(ckbx);
		
		lblNewLabel_2 = new JLabel("Or");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(497, 426, 41, 14);
		contentPane.add(lblNewLabel_2);
		
		Login = new JButton("Log In");
		Login.setForeground(Color.WHITE);
		Login.setBackground(Color.RED);
		Login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Login.setAlignmentX(Component.CENTER_ALIGNMENT);
		Login.setFont(new Font("Calibri", Font.BOLD, 14));
		Login.setBounds(545, 419, 86, 34);
		contentPane.add(Login);
		
		back = new JButton("Back");
		back.setBackground(Color.RED);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setAlignmentX(Component.CENTER_ALIGNMENT);
		back.setFont(new Font("Calibri", Font.BOLD, 14));
		back.setBounds(470, 497, 89, 23);
		contentPane.add(back);
		
		bloodgroup = new JComboBox<String>();
		bloodgroup.setFont(new Font("Tahoma", Font.BOLD, 11));
		bloodgroup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bloodgroup.setForeground(Color.BLACK);
		bloodgroup.setModel(new DefaultComboBoxModel<String>(new String[] {"<Select your Blood group>", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"}));
		bloodgroup.setBounds(383, 263, 269, 23);
		contentPane.add(bloodgroup);
		
		blood_gr = new JLabel("Blood Group");
		blood_gr.setFont(new Font("Tahoma", Font.BOLD, 11));
		blood_gr.setBounds(246, 248, 111, 50);
		contentPane.add(blood_gr);
		
		passcon = new JButton("See password condition before put it");
		passcon.setFont(new Font("Tahoma", Font.BOLD, 11));
		passcon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		passcon.setAlignmentX(Component.CENTER_ALIGNMENT);
		passcon.addActionListener(this);
		passcon.setBounds(663, 303, 248, 62);
		contentPane.add(passcon);
		
		cpass = new JPasswordField();
		cpass.setToolTipText("Password");
		cpass.setName("");
		cpass.setForeground(Color.BLACK);
		cpass.setEchoChar('*');
		cpass.setBackground(Color.WHITE);
		cpass.setActionCommand("");
		cpass.setBounds(383, 343, 269, 20);
		contentPane.add(cpass);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Confirm Password");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_3_1.setBounds(246, 330, 111, 50);
		contentPane.add(lblNewLabel_1_3_1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String pss = new String(pass.getPassword()); 
		String pss1 = new String(cpass.getPassword());
		if(e.getSource()==Login)
		{
			this.dispose();
			login1 frame = new login1();
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setFocusable(false);
		}
		if(e.getSource()==back)
		{
			this.dispose();
			login1 frame = new login1();
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setFocusable(false);
		}
		if(e.getSource()==submit)
		{
			
			if(name.getText()==null || phone.getText()==null || pass.getPassword()==null || bloodgroup.getSelectedIndex()==0 )
			{
				JOptionPane.showMessageDialog(null,"All Field must be filled!","Warning",0);
				name.setText("");
				phone.setText("");
				email.setText("");
				bloodgroup.setSelectedIndex(0);
				pass.setText("");
				cpass.setText("");
			}
			else if(isPhoneNumValid(phone.getText())==false)
			{
				JOptionPane.showMessageDialog(null,"You've entered wrong phone number","Warning",0);
				name.setText("");
				phone.setText("");
				email.setText("");
				bloodgroup.setSelectedIndex(0);
				pass.setText("");
				cpass.setText("");
			}
			else if(isValidemail(email.getText())==false)
			{
				JOptionPane.showMessageDialog(null,"Input the correct email","Warning",0);
				name.setText("");
				phone.setText("");
				email.setText("");
				bloodgroup.setSelectedIndex(0);
				pass.setText("");
				cpass.setText("");
			}
			else if(isValidPassword(pss)==false)
			{
				JOptionPane.showMessageDialog(null,"Password condition not fulfilled!","Warning",0);
				name.setText("");
				phone.setText("");
				email.setText("");
				bloodgroup.setSelectedIndex(0);
				pass.setText("");
				cpass.setText("");
			}
			else 
				if(pss.equals(pss1)==false)
			{
				JOptionPane.showMessageDialog(null,"Password and confrim password are not same","Warning",0);
				name.setText("");
				phone.setText("");
				email.setText("");
				bloodgroup.setSelectedIndex(0);
				pass.setText("");
				cpass.setText("");
			}
			else
			{
				if(fread_User_check()==true)
				{
					JOptionPane.showMessageDialog(null,"Phone number already exist","Error",0);
					name.setText("");
					phone.setText("");
					email.setText("");
					bloodgroup.setSelectedIndex(0);
					pass.setText("");
					cpass.setText("");
				}
				else
					if(fread_User_check()==false)
				{
					if(bloodgroup.getSelectedIndex()==1)
					{
						fwrite_user("A+.txt");
						fwrite("Secret.txt");
						fwrite_user("User.txt");
						this.dispose();
						login1 frame = new login1();
						frame.setVisible(true);
					}
					else if(bloodgroup.getSelectedIndex()==2)
						{
							fwrite_user("A-.txt");
							fwrite("Secret.txt");
							fwrite_user("User.txt");
							this.dispose();
							login1 frame = new login1();
							frame.setVisible(true);
						}
					else if(bloodgroup.getSelectedIndex()==3)
					{
						fwrite_user("B+.txt");
						fwrite("Secret.txt");
						fwrite_user("User.txt");
						this.dispose();
						login1 frame = new login1();
						frame.setVisible(true);
					}
					else if(bloodgroup.getSelectedIndex()==4)
					{
						fwrite_user("B-.txt");
						fwrite("Secret.txt");
						fwrite_user("User.txt");
						this.dispose();
						login1 frame = new login1();
						frame.setVisible(true);
					}
					else if(bloodgroup.getSelectedIndex()==5)
					{
						fwrite_user("O+.txt");
						fwrite("Secret.txt");
						fwrite_user("User.txt");
						this.dispose();
						login1 frame = new login1();;
						frame.setVisible(true);
					}
					else if(bloodgroup.getSelectedIndex()==6)
					{
						fwrite_user("O-.txt");
						fwrite("Secret.txt");
						fwrite_user("User.txt");
						this.dispose();
						login1 frame = new login1();;
						frame.setVisible(true);
					}
					else if(bloodgroup.getSelectedIndex()==7)
					{
						fwrite_user("AB+.txt");
						fwrite("Secret.txt");
						fwrite_user("User.txt");
						this.dispose();
						login1 frame = new login1();;
						frame.setVisible(true);
						frame.setFocusable(false);
						frame.setResizable(false);
					}
					else if(bloodgroup.getSelectedIndex()==8)
					{
						fwrite_user("AB-.txt");
						fwrite("Secret.txt");
						fwrite_user("User.txt");
						this.dispose();
						login1 frame = new login1();;
						frame.setVisible(true);
					}
				}
			}
			
		}
		
		if(e.getSource()==ckbx)
		{
			if(ckbx.isSelected())
			{
				pass.setEchoChar((char)0);
				cpass.setEchoChar((char)0);
			}
			else
			{
				pass.setEchoChar('*');
				cpass.setEchoChar('*');
			}
		}
		if(e.getSource()==passcon)
		{
			JOptionPane.showMessageDialog(null,"Enter at least one Upper case charecter\nEnter at least one Lower case charecter\nEnter at least one Number\nYour password must be more than 8 letter\nYour password must be less than 20 letter","Condition",1);
		}
		
	}
	public void fwrite_user(String path) 
	{
		try
		{
			BufferedWriter BF = new BufferedWriter(new FileWriter(path,true));
			if(bloodgroup.getSelectedIndex()==1)
			{
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+"A+");
				BF.newLine();
			}
			else if(bloodgroup.getSelectedIndex()==2)
			{
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+"A-");
				BF.newLine();
			}
			else if(bloodgroup.getSelectedIndex()==3)
			{
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+"B+");
				BF.newLine();
			}
			else if(bloodgroup.getSelectedIndex()==4)
			{
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+"B-");
				BF.newLine();
			}
			else if(bloodgroup.getSelectedIndex()==5)
			{
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+"O+");
				BF.newLine();
			}
			else if(bloodgroup.getSelectedIndex()==6)
			{
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+"O-");
				BF.newLine();
			}
			else if(bloodgroup.getSelectedIndex()==7)
			{
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+"AB+");
				BF.newLine();
			}
			else if(bloodgroup.getSelectedIndex()==8)
			{
				BF.append(name.getText()+","+phone.getText()+","+email.getText()+","+"AB-");
				BF.newLine();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Select any blood group","Error",0);
			}
			BF.close();
		}
		catch(IOException e)
		{
			System.out.println("File not found!");
		}
	}
	public void fwrite(String path) 
	{
		try
		{
			BufferedWriter BF = new BufferedWriter(new FileWriter(path,true));
			String sr = new String(pass.getPassword());
			BF.append(phone.getText()+","+sr);
			BF.newLine();
			BF.close();
		}
		catch(IOException e)
		{
			System.out.println("File not found!");
		}
	}
	public boolean fread_User_check() 
	{ 
			try
			{
				
				@SuppressWarnings("resource")
				BufferedReader BW = new BufferedReader(new FileReader("User.txt"));
				String s;
				String[] sarray;
				String number1 = null;
				while((s=BW.readLine())!= null) 
				{
					sarray = s.split(",");
					number1 = sarray[1];
					if(number1.equals(phone.getText()))
					{
						return check = true;
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
	public static boolean isValidPassword(String pss)// Google code 
	{ 
	   
	        String regex = "^(?=.*[0-9])"
	                       + "(?=.*[a-z])(?=.*[A-Z])"
	                       + "(?=\\S+$).{8,20}$"; 

	        Pattern p = Pattern.compile(regex); 

	        if (pss == null) { 
	            return false; 
	        } 
 
	        Matcher m = p.matcher(pss); 
	  
	        return m.matches(); 
	} 
	public static boolean isValidemail(String pss) // Google code
	{ 
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$"; 
	        Pattern p = Pattern.compile(regex); 
	        if (pss == null) 
	        { 
	            return false; 
	        } 
	        Matcher m = p.matcher(pss);
	        try
	        {
	        	String[] s = pss.split("@");
	        	String s1 = s[1];
	        	int i = 1;
	        	while(i!=s1.length())
	        	{
	        		char c = s1.charAt(i);
	        		if(c=='.')
	        		{
	        			return m.matches();
	        		}
	        		i++;	
	        	}
	        }
	        catch(Exception ex)
	        {
	        	JOptionPane.showMessageDialog(null,"Email is not valid","Warning",0);
	        }
	       return false; 
	}
    public boolean isPhoneNumValid(String phone)
	{
    	String regex = "[0-9]+"; 
		// + "(?=.*[@#$%^&+=])"
		 // Compile the ReGex 
		 Pattern p = Pattern.compile(regex); 
		
		 // If the password is empty 
		 // return false 
		 if (phone == null) { 
		     return false; 
		 } 

	 // Pattern class contains matcher() method 
	 // to find matching between given password 
	 // and regular expression. 
	 Matcher m = p.matcher(phone); 

 	// Return if the password 
 	// matched the ReGex 
 	 
		if(phone.charAt(1)=='1' && phone.charAt(0)=='0' && phone.length()==11)
		{
			
			return m.matches();
		}
		else
		{
			return false;
		}
	}

	@Override
	public void fread() 
	{
	
	}
}
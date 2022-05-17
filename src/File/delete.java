package File;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
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
import javax.swing.SwingConstants;

public class delete extends JFrame implements ActionListener,file
{


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton submit, back_rl, Exit_rl,home;
	private JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_1_1;
	private static JTextField phone;
	private JPasswordField pfild;
	private JCheckBox chkbox;
	private boolean check = false ;

	public delete() 
{
		values vl = new values();
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
		
		lblNewLabel = new JLabel("Delete Profile");
		lblNewLabel.setFont(new Font("Candara", Font.PLAIN, 58));
		lblNewLabel.setBounds(306, 87, 409, 89);
		contentPane.add(lblNewLabel);
		
		phone = new JTextField();
		phone.setText(vl.getPhone());
		phone.setEditable(false);
		phone.setBounds(309, 221, 430, 23);
		contentPane.add(phone);
		phone.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Phone number");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Sitka Display", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(431, 187, 142, 23);
		contentPane.add(lblNewLabel_1);
		
		home = new JButton("Home");
		home.setBounds(421, 512, 122, 23);
		home.addActionListener(this);
		home.setForeground(Color.WHITE);
		home.setBackground(Color.RED);
		contentPane.add(home);
		
		lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Sitka Display", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(431, 265, 142, 23);
		contentPane.add(lblNewLabel_1_1);
		
		chkbox = new JCheckBox("Show password");
		chkbox.setBounds(460, 337, 135, 23);
		chkbox.addActionListener(this);
		contentPane.add(chkbox);
		
		pfild = new JPasswordField();
		pfild.setEchoChar('*');
		pfild.setBounds(309, 298, 433, 23);
		contentPane.add(pfild);
	}
	public void actionPerformed(ActionEvent e) 
	{	
		if(e.getSource()==home)
		{
			this.dispose();
			option frame = new option();;
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
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
				int ch = JOptionPane.showConfirmDialog(null, "Are you sure want to delete?","Warning",JOptionPane.YES_NO_OPTION);
				if(ch == JOptionPane.YES_OPTION)
				{
					fwrite("User.txt");
					fwrite("login.txt");
					fread();
					this.dispose();
					login1 frame = new login1();
					frame.setVisible(true);
					frame.setFocusable(false);
					frame.setResizable(false);
				}
				else
				{
					
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Phone no. or Password is not valid!","Warning",0);
				pfild.setText("");
			}
		}
		if(e.getSource()==back_rl) 
		{
			this.dispose();
			profile1 frame = new profile1();
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
	public void fwrite(String path)
	{
		String s;
		String[] sar;
		
		File oldf = new File(path);
		File newf = new File("temp.txt");
		
		try 
		{
			BufferedWriter BF = new BufferedWriter(new FileWriter("temp.txt",true));
			try (PrintWriter pw = new PrintWriter(BF)) 
			{
				try (BufferedReader BW = new BufferedReader(new FileReader(path)))
				{
					while((s=BW.readLine())!=null)
					{
						sar = s.split(",");
						if(!(sar[1].equalsIgnoreCase(phone.getText())))
						{
							pw.println(s);
						}
					}
					BW.close();
					pw.close();
					BF.close();
					
					oldf.delete();
					File dum = new File(path);
					newf.renameTo(dum);
				}
			}
			
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void fread()
	{
		
		try 
		{
			BufferedReader BW = new BufferedReader(new FileReader("Secret.txt"));
			String s;
			String[] sar;
			
			HashMap<String, String> info = new HashMap<String, String>();
			
			while((s=BW.readLine())!=null)
			{
				sar = s.split(",");
				info.put(sar[0], sar[1]);
			}
			info.remove(phone.getText());
			BW.close();
			
			BufferedWriter BF = new BufferedWriter(new FileWriter("Secret.txt"));
			for (Map.Entry<String,String> entry : info.entrySet())
			{
				BF.write(entry.getKey()+","+entry.getValue());
				BF.newLine();
			}
			BF.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
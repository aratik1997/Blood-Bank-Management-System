package Airline;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username_textField;
	private JPasswordField passwordField;

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
		setFont(new Font("Arial Black", Font.BOLD, 15));
		setTitle("FIHT Airlines");
		setBackground(new Color(0, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Downloads\\aeroplane.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 442);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel login = new JLabel("Login");
		login.setForeground(new Color(0, 0, 128));
		login.setFont(new Font("Arial Black", Font.BOLD, 30));
		login.setBounds(410, 10, 289, 54);
		contentPane.add(login);
		
		JLabel userName = new JLabel("Username");
		userName.setForeground(new Color(0, 0, 128));
		userName.setFont(new Font("Arial Black", Font.BOLD, 18));
		userName.setBounds(251, 93, 191, 63);
		contentPane.add(userName);
		
		JLabel Password = new JLabel("Password");
		Password.setForeground(new Color(0, 0, 128));
		Password.setFont(new Font("Arial Black", Font.BOLD, 18));
		Password.setBounds(251, 166, 181, 44);
		contentPane.add(Password);
		
		username_textField = new JTextField();
		username_textField.setBounds(374, 112, 300, 32);
		contentPane.add(username_textField);
		username_textField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = username_textField.getText();
				String pass = passwordField.getText();
				if(name.equals("Admin") && pass.equals("Fiht1234"))
				{
					JOptionPane.showMessageDialog(btnLogin, "Login Successful!");
					btnLogin.setVisible(false);
					PassengerRegistration PR = new PassengerRegistration();
					PR.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(btnLogin, "Username or Password doesn't match!");
			}
		});
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 102, 0));
		btnLogin.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnLogin.setBounds(396, 292, 80, 32);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int exit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit", "Warning!", JOptionPane.YES_NO_OPTION);
				
				if(exit==0)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnExit.setBounds(524, 292, 80, 32);
		contentPane.add(btnExit);
		
		JCheckBox chckbxShowPass = new JCheckBox("Show Password");
		chckbxShowPass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxShowPass.isSelected()) {
					passwordField.setEchoChar((char)0);
					
				}
				else
					passwordField.setEchoChar('*');
			}
		});
		chckbxShowPass.setBackground(new Color(102, 204, 255));
		chckbxShowPass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chckbxShowPass.setBounds(374, 216, 159, 32);
		contentPane.add(chckbxShowPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(374, 176, 300, 32);
		contentPane.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 243, 441);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Image = new JLabel("New label");
		Image.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\images.png"));
		Image.setBounds(0, -39, 243, 431);
		panel.add(Image);
		
		JLabel label = new JLabel("New label");
		label.setBounds(138, 209, 45, 13);
		panel.add(label);
		
		JLabel AirlineName = new JLabel("FIHT AIRLINES");
		AirlineName.setForeground(new Color(0, 51, 153));
		AirlineName.setFont(new Font("Cooper Black", Font.BOLD, 25));
		AirlineName.setBounds(10, 286, 223, 48);
		panel.add(AirlineName);
		

	}
}

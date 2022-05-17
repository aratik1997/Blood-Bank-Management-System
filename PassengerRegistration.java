package Airline;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class PassengerRegistration extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Fname;
	private JTextField textField_LName;
	private JTextField textField_NID_Pass;
	private JTextField textField_Mobile;
	private JLabel lblFirstName, lblLastName, lblGender, lblPass, lblMobile, lblNewLabel, lblAddress;
	private JTextField textField_Address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerRegistration frame = new PassengerRegistration();
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
	public PassengerRegistration() {

		setFont(new Font("Arial Black", Font.BOLD, 15));
		setTitle("FIHT Airlines");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Downloads\\aeroplane.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 615);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_Fname = new JTextField();
		textField_Fname.setBounds(158, 185, 241, 25);
		contentPane.add(textField_Fname);
		textField_Fname.setColumns(10);
		
		lblFirstName = new JLabel("First Name:");
		lblFirstName.setForeground(new Color(0, 0, 102));
		lblFirstName.setBounds(29, 180, 119, 31);
		contentPane.add(lblFirstName);
		lblFirstName.setFont(new Font("Arial Black", Font.BOLD, 15));
		
		textField_LName = new JTextField();
		textField_LName.setBounds(159, 220, 240, 27);
		contentPane.add(textField_LName);
		textField_LName.setColumns(10);
		
		lblLastName = new JLabel("Last Name:");
		lblLastName.setForeground(new Color(0, 0, 102));
		lblLastName.setBounds(29, 221, 100, 31);
		contentPane.add(lblLastName);
		lblLastName.setFont(new Font("Arial Black", Font.BOLD, 15));
		
		lblGender = new JLabel("Gender:");
		lblGender.setForeground(new Color(0, 0, 102));
		lblGender.setBounds(29, 262, 75, 25);
		contentPane.add(lblGender);
		lblGender.setFont(new Font("Arial Black", Font.BOLD, 15));
		
		textField_NID_Pass = new JTextField();
		textField_NID_Pass.setBounds(158, 302, 241, 26);
		contentPane.add(textField_NID_Pass);
		textField_NID_Pass.setColumns(10);
		
		lblPass = new JLabel("Passport No.");
		lblPass.setForeground(new Color(0, 0, 102));
		lblPass.setBounds(29, 297, 151, 31);
		contentPane.add(lblPass);
		lblPass.setFont(new Font("Arial Black", Font.BOLD, 15));
		
		textField_Mobile = new JTextField();
		textField_Mobile.setBounds(158, 338, 241, 26);
		contentPane.add(textField_Mobile);
		textField_Mobile.setColumns(10);
		
		lblMobile = new JLabel("Contact No.");
		lblMobile.setForeground(new Color(0, 0, 102));
		lblMobile.setBounds(29, 330, 151, 37);
		contentPane.add(lblMobile);
		lblMobile.setFont(new Font("Arial Black", Font.BOLD, 15));
		
		lblNewLabel = new JLabel("Passenger Registration");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setBounds(131, 107, 455, 52);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setForeground(new Color(0, 0, 102));
		rdbtnMale.setBackground(new Color(102, 204, 255));
		rdbtnMale.setFont(new Font("Arial Black", Font.BOLD, 14));
		rdbtnMale.setBounds(158, 259, 75, 28);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(new Color(0, 0, 102));
		rdbtnFemale.setBackground(new Color(102, 204, 255));
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 14));
		rdbtnFemale.setBounds(242, 259, 157, 28);
		contentPane.add(rdbtnFemale);
		
		lblAddress = new JLabel("Address:");
		lblAddress.setForeground(new Color(0, 0, 102));
		lblAddress.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblAddress.setBounds(29, 393, 119, 31);
		contentPane.add(lblAddress);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 749, 111);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\images.png"));
		lblNewLabel_1.setBounds(-57, 0, 218, 111);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("FIHT Airlines");
		lblNewLabel_2.setForeground(new Color(0, 51, 153));
		lblNewLabel_2.setFont(new Font("Cooper Black", Font.BOLD, 65));
		lblNewLabel_2.setBounds(202, 10, 489, 91);
		panel_1.add(lblNewLabel_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(rdbtnMale.isSelected())
						WritetoFile("Male");
					else
						WritetoFile("Female");
				}catch(IOException e1) {
					e1.printStackTrace();
				}
				TicketBooking TB = new TicketBooking();
				TB.setVisible(true);
				
			}
		});
		btnSubmit.setBackground(new Color(0, 102, 0));
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnSubmit.setBounds(210, 503, 119, 38);
		contentPane.add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnCancel.setBounds(367, 503, 119, 38);
		contentPane.add(btnCancel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(460, 179, 200, 200);
		contentPane.add(panel);
		
		JLabel UploadImg = new JLabel("Upload a photo");
		panel.add(UploadImg);
		UploadImg.setBackground(Color.BLACK);
		
		JLabel Photo = new JLabel("Photo");
		Photo.setForeground(new Color(0, 0, 128));
		Photo.setBounds(533, 154, 139, 25);
		contentPane.add(Photo);
		Photo.setFont(new Font("Arial Black", Font.BOLD, 15));
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
				       JFileChooser img = new JFileChooser();
				       img.showOpenDialog(null);
				       File F = img.getSelectedFile();       
				       FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","png","jpg","jpeg");
				       img.addChoosableFileFilter(filter);     
				       String path= F.getAbsolutePath();
				       BufferedImage image = ImageIO.read(F);
				       ImageIcon imageIcon = new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
				       UploadImg.setIcon(imageIcon); 
			}catch(Exception ex){
				System.err.println(ex);
				}
			}
		});
		btnBrowse.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnBrowse.setBounds(507, 391, 108, 34);
		contentPane.add(btnBrowse);
		
		textField_Address = new JTextField();
		textField_Address.setBounds(158, 388, 241, 65);
		contentPane.add(textField_Address);
		textField_Address.setColumns(10);
	}
	public void WritetoFile(String lblGender) throws IOException{
		BufferedWriter b = new BufferedWriter(new FileWriter("F:\\NSU\\CSE 215\\AirlineReservation\\src\\Airline\\Registration.txt",true));
		b.append(textField_Fname.getText()+"	"+textField_LName.getText()+"	"+lblGender+"	"+textField_NID_Pass.getText()+"	"+textField_Mobile.getText()+"	"+ textField_Address.getText());
		b.newLine();
		b.close();
	}
}


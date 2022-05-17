package Airline;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TicketBooking extends JFrame {

	private JPanel contentPane;
	private JTextField textField_FlightName;
	private JTextField textField_FlightDate;
	private JTextField textField_ArrivalDate;
	private JTextField textField_Price;
	private JComboBox comboBox_Source,comboBox_Destination,comboBox_Seats,comboBox_Class;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketBooking frame = new TicketBooking();
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
	public TicketBooking() {
		setTitle("FIHT Airlines");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Asus\\Downloads\\aeroplane.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 669);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 844, 136);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Asus\\Downloads\\images.png"));
		lblNewLabel.setBounds(-58, 0, 206, 136);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FIHT Airlines");
		lblNewLabel_1.setForeground(new Color(0, 51, 153));
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.BOLD, 75));
		lblNewLabel_1.setBounds(171, 10, 663, 116);
		panel.add(lblNewLabel_1);
		
		comboBox_Source = new JComboBox();
		comboBox_Source.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_Source.setModel(new DefaultComboBoxModel(new String[] {"Select", "Bangladesh", "India"}));
		comboBox_Source.setBounds(57, 226, 115, 29);
		contentPane.add(comboBox_Source);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(new Color(0, 0, 153));
		lblNewLabel_2.setBackground(new Color(0, 0, 153));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 225, 51, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ticket Booking");
		lblNewLabel_3.setForeground(new Color(0, 51, 153));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 35));
		lblNewLabel_3.setBounds(216, 146, 452, 40);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Destination");
		lblNewLabel_4.setForeground(new Color(0, 0, 102));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(189, 226, 80, 27);
		contentPane.add(lblNewLabel_4);
		
		comboBox_Destination = new JComboBox();
		comboBox_Destination.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_Destination.setModel(new DefaultComboBoxModel(new String[] {"Select", "USA", "UK", "Canada", "Australia"}));
		comboBox_Destination.setBounds(265, 225, 115, 30);
		contentPane.add(comboBox_Destination);
		
		JLabel lblNewLabel_Seats = new JLabel("Seats");
		lblNewLabel_Seats.setForeground(new Color(0, 0, 102));
		lblNewLabel_Seats.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Seats.setBounds(390, 226, 51, 29);
		contentPane.add(lblNewLabel_Seats);
		
		comboBox_Seats = new JComboBox();
		comboBox_Seats.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_Seats.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_Seats.setBounds(433, 226, 51, 30);
		contentPane.add(comboBox_Seats);
		
		JLabel lblNewLabel_5 = new JLabel("Seat Class");
		lblNewLabel_5.setForeground(new Color(0, 0, 102));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(495, 225, 80, 29);
		contentPane.add(lblNewLabel_5);
		
		comboBox_Class = new JComboBox();
		comboBox_Class.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox_Class.setModel(new DefaultComboBoxModel(new String[] {"Select", "Economy", "Premium Economy", "Business", "First Class"}));
		comboBox_Class.setBounds(573, 228, 150, 27);
		contentPane.add(comboBox_Class);
		
		JLabel lblNewLabel_6 = new JLabel("Flight Name: ");
		lblNewLabel_6.setForeground(new Color(0, 0, 102));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 371, 123, 40);
		contentPane.add(lblNewLabel_6);
		
		
		JLabel lblNewLabel_7 = new JLabel("Flight Date:");
		lblNewLabel_7.setForeground(new Color(0, 0, 102));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 276, 103, 40);
		contentPane.add(lblNewLabel_7);
		
		textField_FlightDate = new JTextField();
		textField_FlightDate.setBounds(103, 284, 166, 29);
		contentPane.add(textField_FlightDate);
		textField_FlightDate.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Arrival Date:");
		lblNewLabel_8.setForeground(new Color(0, 0, 153));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(10, 318, 123, 40);
		contentPane.add(lblNewLabel_8);
		
		textField_ArrivalDate = new JTextField();
		textField_ArrivalDate.setBounds(101, 326, 168, 29);
		contentPane.add(textField_ArrivalDate);
		textField_ArrivalDate.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					WritetoFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(btnConfirm, "Your flight is booked!");
			}
		});
		btnConfirm.setBackground(new Color(0, 102, 0));
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfirm.setForeground(new Color(255, 255, 255));
		btnConfirm.setBounds(216, 537, 115, 40);
		contentPane.add(btnConfirm);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(204, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(382, 537, 115, 40);
		contentPane.add(btnNewButton);
		
		JButton btnBookTicket = new JButton("Book Ticket");
		btnBookTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_FlightName = new JTextField();
				textField_FlightName.setBounds(103, 379, 166, 29);
				contentPane.add(textField_FlightName);
				textField_FlightName.setColumns(10);
				textField_Price = new JTextField();
				textField_Price.setBounds(101, 426, 166, 29);
				contentPane.add(textField_Price);
				int a,b;
				String f=(String)comboBox_Seats.getSelectedItem();
				b= Integer.valueOf(f) ;
				String s;
				String x=(String)comboBox_Source.getSelectedItem() ,y=(String)comboBox_Destination.getSelectedItem(),z=(String)comboBox_Class.getSelectedItem();
				if (x== "Bangladesh" &&  y == "USA" ) {
					if(z=="Economy") {
						a=80000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("BD-US 1234");
					}
					
					else if(z=="Premium Economy") {
						a=120000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("BD-US 1234");
					}
					
					else if(z=="Business") {
						a=200000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("BD-US 1234");
					}
					
					else if(z=="First Class") {
						a=300000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("BD-US 1234");
					}

				}
				 if (x== "Bangladesh" &&  y== "UK" ) {
					 if(z=="Economy") {
							a=90000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-UK 5678");
						}
						
						else if(z=="Premium Economy") {
							a=130000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-UK 5678");
						}
						
						else if(z=="Business") {
							a=210000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-UK 5678");
						}
						
						else if(z=="First Class") {
							a=320000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-UK 5678");
						}
				}
				 if (x== "Bangladesh" &&  y== "Canada" ) {
					 if(z=="Economy") {
							a=80000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-CAN 4367");
						}
						
						else if(z=="Premium Economy") {
							a=120000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-CAN 4367");
						}
						
						else if(z=="Business") {
							a=200000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-CAN 4367");
						}
						
						else if(z=="First Class") {
							a=300000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-CAN 4367");
						}
				}
				 if (x== "Bangladesh" &&  y== "Australia" ) {
					 if(z=="Economy") {
							a=85000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-AUS 9876");
						}
						
						else if(z=="Premium Economy") {
							a=125000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-AUS 9876");
						}
						
						else if(z=="Business") {
							a=215000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-AUS 9876");
						}
						
						else if(z=="First Class") {
							a=325000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("BD-AUS 9876");
						}
				}
				if (x== "India" &&  y== "USA" ) {
					if(z=="Economy") {
						a=70000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("IND-US 2352");
					}
					
					else if(z=="Premium Economy") {
						a=90000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("IND-US 2352");
					}
					
					else if(z=="Business") {
						a=180000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("IND-US 2352");
					}
					
					else if(z=="First Class") {
						a=285000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("IND-US 2352");
					}
				}
				if (x== "India" &&  y== "UK" ) {
					if(z=="Economy") {
						a=65000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("IND-UK 8634");
					}
					
					else if(z=="Premium Economy") {
						a=85000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("IND-UK 8634");
					}
					
					else if(z=="Business") {
						a=175000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("IND-UK 8634");
					}
					
					else if(z=="First Class") {
						a=275000;
						a=a*b;
						s=String.valueOf(a);
						textField_Price.setText(s);
						textField_FlightName.setText("IND-UK 8634");
					}
				}
				 if (x== "India" &&  y== "Canada" ) {
					 if(z=="Economy") {
							a=75000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("IND-CAN 3607");
						}
						
						else if(z=="Premium Economy") {
							a=95000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("IND-CAN 3607");
						}
						
						else if(z=="Business") {
							a=185000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("IND-CAN 3607");
						}
						
						else if(z=="First Class") {
							a=285000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("IND-CAN 3607");
						}
				}
				 if (x== "India" &&  y== "Australia" ) {
					 if(z=="Economy") {
							a=76000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("IND-AUS 1839");
						}
						
						else if(z=="Premium Economy") {
							a=93000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("IND-AUS 1839");
						}
						
						else if(z=="Business") {
							a=187000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("IND-AUS 1839");
						}
						
						else if(z=="First Class") {
							a=277000;
							a=a*b;
							s=String.valueOf(a);
							textField_Price.setText(s);
							textField_FlightName.setText("IND-AUS 1839");
						}
				}
	
				
				textField_Price.setColumns(10);
			}
		});
		btnBookTicket.setForeground(new Color(0, 0, 102));
		btnBookTicket.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBookTicket.setBounds(57, 500, 103, 30);
		contentPane.add(btnBookTicket);
		
		JLabel lblNewLabel_9 = new JLabel("Ticket Price:");
		lblNewLabel_9.setForeground(new Color(0, 0, 102));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(10, 422, 88, 29);
		contentPane.add(lblNewLabel_9);
	}
	public void WritetoFile() throws IOException{
		BufferedWriter b = new BufferedWriter(new FileWriter("F:\\NSU\\CSE 215\\AirlineReservation\\src\\Airline\\Registration.txt",true));
		b.append((String)comboBox_Source.getSelectedItem() +"	"+(String)comboBox_Destination.getSelectedItem()+"	"+(String)comboBox_Seats.getSelectedItem()+"	"+(String)comboBox_Class.getSelectedItem()+"	"+textField_FlightDate.getText());
		b.newLine();
		b.close();
	}
}

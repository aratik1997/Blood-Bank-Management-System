package File;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;

public class organization1 extends JFrame implements ActionListener {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblGulshanFullfill;
	private JLabel lblComillaRoktakto;
	private JLabel lblUttoraInternational;
	private JLabel lblSignboardHospital,lblOrganizations;
	private JButton back, home, exit;

	
	public organization1() {
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
		
		back = new JButton("Back");
		back.setFocusable(false);
		back.addActionListener(this);
		back.setForeground(Color.WHITE);
		back.setBackground(new Color(255, 0, 0));
		back.setBounds(41, 512, 122, 23);
		contentPane.add(back);

		home = new JButton("Home");
		home.setFocusable(false);
		home.addActionListener(this);
		home.setBackground(Color.RED);
		home.setForeground(Color.WHITE);
		home.setBounds(421, 512, 122, 23);
		contentPane.add(home);

		exit = new JButton("Exit");
		exit.setFocusable(false);
		exit.addActionListener(this);
		exit.setBackground(Color.RED);
		exit.setForeground(Color.WHITE);
		exit.setBounds(817, 512, 122, 23);
		contentPane.add(exit);
		
		lblOrganizations = new JLabel("<HTML><u>ORGANIZATIONS:</u></HTML>");
		lblOrganizations.setForeground(Color.DARK_GRAY);
		lblOrganizations.setFont(new Font("Candara", Font.PLAIN, 38));
		lblOrganizations.setBounds(361, 57, 453, 89);
		contentPane.add(lblOrganizations);
		
		lblNewLabel = new JLabel("1. Cashara BloodBank centre");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(390, 157, 424, 26);
		contentPane.add(lblNewLabel);
		
		lblGulshanFullfill = new JLabel("2. Gulshan Fullfill Hospital");
		lblGulshanFullfill.setForeground(Color.DARK_GRAY);
		lblGulshanFullfill.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGulshanFullfill.setBounds(400, 194, 424, 26);
		contentPane.add(lblGulshanFullfill);
		
		lblComillaRoktakto = new JLabel("3. Comilla Roktakto Hospital");
		lblComillaRoktakto.setForeground(Color.DARK_GRAY);
		lblComillaRoktakto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblComillaRoktakto.setBounds(390, 231, 424, 26);
		contentPane.add(lblComillaRoktakto);
		
		lblUttoraInternational = new JLabel("4. Uttora International Hospital");
		lblUttoraInternational.setForeground(Color.DARK_GRAY);
		lblUttoraInternational.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUttoraInternational.setBounds(390, 268, 424, 26);
		contentPane.add(lblUttoraInternational);
		
		lblSignboardHospital = new JLabel("5. SignBoard Hospital");
		lblSignboardHospital.setForeground(Color.DARK_GRAY);
		lblSignboardHospital.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSignboardHospital.setBounds(416, 305, 424, 26);
		contentPane.add(lblSignboardHospital);
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back)
		{
			this.dispose();
			option frame = new option();;
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
		
	}
}

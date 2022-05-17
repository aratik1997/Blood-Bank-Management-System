package File;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class option extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton back_rl, Exit_rl;
	private JButton profile;
	private JButton inventory, request, donate, org;
	private JLabel lblInvantory,lblNewLabel,lblProfile,lblRequest,lblOrganizations;
	private ImageIcon donateicon = new ImageIcon("plus.png");
	private ImageIcon requesticon = new ImageIcon("minus.png");
	private ImageIcon profileicon = new ImageIcon("profile.png");
	private ImageIcon orgicon = new ImageIcon ("org.png");
	private ImageIcon invicon = new ImageIcon("inv.png");


		public option() {
		
		
		
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

		
		back_rl = new JButton("Log out");
		back_rl.setFocusable(false);
		back_rl.addActionListener(this);
		back_rl.setForeground(Color.WHITE);
		back_rl.setBackground(new Color(255, 0, 0));
		back_rl.setBounds(41, 512, 122, 23);
		contentPane.add(back_rl);

		Exit_rl = new JButton("Exit");
		Exit_rl.setFocusable(false);
		Exit_rl.addActionListener(this);
		Exit_rl.setBackground(Color.RED);
		Exit_rl.setForeground(Color.WHITE);
		Exit_rl.setBounds(817, 512, 122, 23);
		contentPane.add(Exit_rl);
		
		request = new JButton(requesticon);
		request.setFocusable(false);
		request.addActionListener(this);
		request.setFont(new Font("Tahoma", Font.PLAIN, 17));
		request.setBackground(Color.WHITE);
		request.setForeground(Color.DARK_GRAY);
		request.setBounds(588, 163, 122, 109);
		contentPane.add(request);
		
		donate = new JButton(donateicon);
		donate.setFocusable(false);
		donate.addActionListener(this);
		donate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		donate.setBackground(Color.WHITE);
		donate.setForeground(Color.DARK_GRAY);
		donate.setBounds(250, 163, 122, 109);
		contentPane.add(donate);
		
		org = new JButton(orgicon);
		org.setFocusable(false);
		org.addActionListener(this);
		org.setFont(new Font("Tahoma", Font.PLAIN, 17));
		org.setForeground(Color.WHITE);
		org.setBackground(Color.WHITE);
		org.setBounds(335, 318, 122, 109);
		contentPane.add(org);
		
		profile = new JButton(profileicon);
		profile.setFocusable(false);
//		profile.addActionListener(this);
		profile.addActionListener(this);
		profile.setBackground(Color.WHITE);
		profile.setForeground(Color.WHITE);
		profile.setFont(new Font("Tahoma", Font.PLAIN, 17));
		profile.setBounds(421, 35, 122, 123);
		contentPane.add(profile);
		
		inventory = new JButton(invicon);
		inventory.setFocusable(false);
		inventory.addActionListener(this);
		inventory.setFont(new Font("Tahoma", Font.PLAIN, 17));
		inventory.setForeground(Color.WHITE);
		inventory.setBackground(Color.WHITE);
		inventory.setBounds(511, 318, 122, 109);
		contentPane.add(inventory);
		
		lblNewLabel = new JLabel("Donate");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(281, 283, 74, 23);
		contentPane.add(lblNewLabel);
		
		lblProfile = new JLabel("Profile");
		lblProfile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProfile.setBounds(454, 169, 74, 23);
		contentPane.add(lblProfile);
		
		lblRequest = new JLabel("Request");
		lblRequest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRequest.setBounds(614, 283, 74, 23);
		contentPane.add(lblRequest);
		
		lblOrganizations = new JLabel("Organizations");
		lblOrganizations.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOrganizations.setBounds(335, 438, 133, 23);
		contentPane.add(lblOrganizations);
		
		lblInvantory = new JLabel("Inventory");
		lblInvantory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblInvantory.setBounds(531, 438, 96, 23);
		contentPane.add(lblInvantory);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==profile) 
		{
			this.dispose();
			profile1 frame = new profile1();
			frame.setVisible(true);
			frame.setResizable(false);
		}
		if(e.getSource()==org) 
		{
			this.dispose();
			organization1 frame = new organization1();
			frame.setVisible(true);
			frame.setResizable(false);
		}
		if(e.getSource()==donate) 
		{
			this.dispose();
			Last_donate_date frame = new Last_donate_date();
			frame.setVisible(true);
			frame.setResizable(false);
		}
		if(e.getSource()==request) 
		{
			this.dispose();
			request1_p frame = new request1_p();
			frame.setVisible(true);
			frame.setResizable(false);
		}
		if(e.getSource()==inventory) 
		{
			this.dispose();
			list_inventtory frame = new list_inventtory();
			frame.setVisible(true);
			frame.setResizable(false);
		}
		if(e.getSource()==back_rl) 
		{
			int ch = JOptionPane.showConfirmDialog(null, "Are you sure want to Log out?","Warning",JOptionPane.YES_NO_OPTION);
			if(ch == JOptionPane.YES_OPTION)
			{
				this.dispose();
				login1 frame = new login1();
				frame.setVisible(true);
				frame.setResizable(false);
			}
			else
			{
				
			}
		}
		if (e.getSource()==Exit_rl)
		{
			int ch = JOptionPane.showConfirmDialog(null, "Are you sure want to Exit?","Warning",JOptionPane.YES_NO_OPTION);
			if(ch == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			else
			{
				
			}
		}
	}
}

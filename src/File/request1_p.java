package File;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class request1_p extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton back_rl;
	private JButton Home_rl;
	private JButton Exit_rl;
	private JLabel Name;
	private JTextField NamBox;
	private JLabel Relation;
	private JLabel BloodType;
	private JTextField RelBox;
	private JButton Submit;
	@SuppressWarnings("rawtypes")
	private JComboBox bgrp;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public request1_p() {
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
		
		//Button 
		
		back_rl = new JButton("Back");
		back_rl.setFont(new Font("Dialog", Font.PLAIN, 12));
		back_rl.setBounds(41, 512, 122, 23);
		back_rl.addActionListener(this);
		back_rl.setForeground(Color.WHITE);
		back_rl.setBackground(Color.RED);
		contentPane.add(back_rl);
		
		Home_rl = new JButton("Home");
		Home_rl.setFont(new Font("Dialog", Font.PLAIN, 12));
		Home_rl.setBounds(421, 512, 122, 23);
		Home_rl.addActionListener(this);
		Home_rl.setForeground(Color.WHITE);
		Home_rl.setBackground(Color.RED);
		contentPane.add(Home_rl);
		
		Exit_rl = new JButton("Exit");
		Exit_rl.setFont(new Font("Dialog", Font.PLAIN, 12));
		Exit_rl.setBounds(817, 512, 122, 23);
		Exit_rl.addActionListener(this);
		Exit_rl.setForeground(Color.WHITE);
		Exit_rl.setBackground(Color.RED);
		contentPane.add(Exit_rl);
		
		Name = new JLabel("Name");
		Name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Name.setBounds(200, 158, 168, 40);
		contentPane.add(Name);
		
		NamBox = new JTextField();
		NamBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		NamBox.setBounds(378, 161, 350, 40);
		contentPane.add(NamBox);
		NamBox.setColumns(10);
		
		Relation = new JLabel("Relation");
		Relation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Relation.setBounds(200, 222, 168, 40);
		contentPane.add(Relation);
		
		BloodType = new JLabel("Blood Type");
		BloodType.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BloodType.setBounds(200, 272, 168, 40);
		contentPane.add(BloodType);
		
		RelBox = new JTextField();
		RelBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RelBox.setColumns(10);
		RelBox.setBounds(378, 222, 350, 40);
		contentPane.add(RelBox);
		
		Submit = new JButton("Submit");
		Submit.setForeground(Color.WHITE);
		Submit.addActionListener(this);
		Submit.setFont(new Font("Dialog", Font.PLAIN, 20));
		Submit.setBackground(Color.RED);
		Submit.setBounds(421, 390, 122, 40);
		contentPane.add(Submit);
		
		bgrp = new JComboBox();
		bgrp.setToolTipText("Blood Type");
		bgrp.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bgrp.setModel(new DefaultComboBoxModel(new String[] {"<Select Your Blood Group>", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"}));
		bgrp.setBounds(378, 276, 350, 40);
		contentPane.add(bgrp);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==Home_rl)
		{
			this.dispose();
			option frame = new option();;
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
		if(e.getSource()==Exit_rl)
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
		if(e.getSource()==back_rl)
		{
			this.dispose();
			option frame = new option();;
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
		if(e.getSource()==Submit)
		{
			
			if(bgrp.getSelectedIndex()==1)
			{
				this.dispose();
				req_list frame = new req_list("A+.txt");
				frame.setVisible(true);
				frame.setFocusable(false);
				frame.setResizable(false);
			}
			else if(bgrp.getSelectedIndex()==2)
			{
				this.dispose();
				req_list frame = new req_list("A-.txt");
				frame.setVisible(true);
				frame.setFocusable(false);
				frame.setResizable(false);
			}
			else if(bgrp.getSelectedIndex()==3)
			{
				this.dispose();
				req_list frame = new req_list("B+.txt");
				frame.setVisible(true);
				frame.setFocusable(false);
				frame.setResizable(false);
			}
			else if(bgrp.getSelectedIndex()==4)
			{
				this.dispose();
				req_list frame = new req_list("B-.txt");
				frame.setVisible(true);
				frame.setFocusable(false);
				frame.setResizable(false);
			}
			else if(bgrp.getSelectedIndex()==5)
			{
				this.dispose();
				req_list frame = new req_list("O+.txt");
				frame.setVisible(true);
				frame.setFocusable(false);
				frame.setResizable(false);
			}
			else if(bgrp.getSelectedIndex()==6)
			{
				this.dispose();
				req_list frame = new req_list("O-.txt");
				frame.setVisible(true);
				frame.setFocusable(false);
				frame.setResizable(false);
			}
			else if(bgrp.getSelectedIndex()==7)
			{
				this.dispose();
				req_list frame = new req_list("AB+.txt");
				frame.setVisible(true);
				frame.setFocusable(false);
				frame.setResizable(false);
			}
			else if(bgrp.getSelectedIndex()==8)
			{
				this.dispose();
				req_list frame = new req_list("AB-.txt");
				frame.setVisible(true);
				frame.setFocusable(false);
				frame.setResizable(false);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"You have to Select blood group","Condition",1);
			}
		}
	}
		
}



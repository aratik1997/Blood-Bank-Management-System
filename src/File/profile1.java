package File;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class profile1 extends JFrame implements ActionListener {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton back_rl, Exit_rl;
	private JLabel lblProfile;
	private JButton view;
	private JButton ef;
	private JButton df;


	public profile1() {
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

		
		back_rl = new JButton("Back");
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
		
		lblProfile = new JLabel("<HTML><u>Profile</u></HTML>");
		lblProfile.setForeground(Color.RED);
		lblProfile.setFont(new Font("Candara", Font.PLAIN, 58));
		lblProfile.setBounds(435, 65, 206, 89);
		contentPane.add(lblProfile);
		
		view = new JButton("View Profile");
		view.setFocusable(false);
		view.setBackground(Color.RED);
		view.setForeground(Color.WHITE);
		view.addActionListener(this);
		view.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		view.setBounds(151, 236, 194, 66);
		contentPane.add(view);
		
		ef = new JButton("Edit Profile");
		ef.setFocusable(false);
		ef.addActionListener(this);
		ef.setForeground(Color.WHITE);
		ef.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		ef.setBackground(Color.RED);
		ef.setBounds(410, 236, 194, 66);
		contentPane.add(ef);
		
		df = new JButton("Delete Profile");
		df.setFocusable(false);
		df.addActionListener(this);
		df.setForeground(Color.WHITE);
		df.setFont(new Font("Eras Medium ITC", Font.PLAIN, 18));
		df.setBackground(Color.RED);
		df.setBounds(662, 236, 194, 66);
		contentPane.add(df);
	}


	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==view)
		{
			this.dispose();
			view frame = new view();
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
		if(e.getSource()==ef)
		{
			this.dispose();
			edit frame = new edit();
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
		if(e.getSource()==df)
		{
			this.dispose();
			delete frame = new delete();
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
		if(e.getSource()==back_rl) 
		{
			this.dispose();
			option frame = new option();
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
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
	

}



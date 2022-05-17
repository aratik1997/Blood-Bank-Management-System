package File;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login1 extends JFrame implements ActionListener 
{


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton Exit_rl, reg, login, gst;
	private JTextPane txtpnOr;
	private JLabel lblNewLabel;
	


	public login1() 
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

		Exit_rl = new JButton("Exit");
		Exit_rl.setFocusable(false);
		Exit_rl.addActionListener(this);
		Exit_rl.setBackground(Color.RED);
		Exit_rl.setForeground(Color.WHITE);
		Exit_rl.setBounds(423, 503, 122, 23);
		contentPane.add(Exit_rl);
		
		reg = new JButton("Registration");
		reg.setFocusable(false);
		reg.addActionListener(this);
		reg.setFont(new Font("Tahoma", Font.PLAIN, 17));
		reg.setBackground(Color.RED);
		reg.setForeground(Color.WHITE);
		reg.setBounds(160, 264, 233, 65);
		contentPane.add(reg);
		
		login = new JButton("LogIn");
		login.addActionListener(this);
		login.setFocusable(false);
		login.setFont(new Font("Tahoma", Font.PLAIN, 17));
		login.setBackground(Color.RED);
		login.setForeground(Color.WHITE);
		login.setBounds(580, 264, 233, 60);
		contentPane.add(login);
		
		gst = new JButton("Guest");
		gst.addActionListener(this);
		gst.setFocusable(false);
		gst.setForeground(Color.BLUE);
		gst.setBounds(438, 442, 89, 23);
		contentPane.add(gst);
		
		txtpnOr = new JTextPane();
		txtpnOr.setFocusable(false);
		txtpnOr.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtpnOr.setContentType("text/bold\r\n");
		txtpnOr.setText("OR");
		txtpnOr.setBounds(465, 363, 49, 34);
		contentPane.add(txtpnOr);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("nsu blood bank.png"));
		lblNewLabel.setBounds(334, 33, 300, 201);
		contentPane.add(lblNewLabel);
		
		
		

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==login) 
		{
			this.dispose();
			afterlog1 frame = new afterlog1();
			frame.setVisible(true);
			frame.setResizable(false);
		}
		if(e.getSource()==gst) 
		{
			this.dispose();
			req_g frame = new req_g();
			frame.setVisible(true);
			frame.setResizable(false);
		}
		if(e.getSource()==reg) 
		{
			this.dispose();
			Blood frame = new Blood();
			frame.setVisible(true);
			frame.setResizable(false);
		}
		if (e.getSource()==Exit_rl)
		{
			int ch = JOptionPane.showConfirmDialog(null, "Are you sure?","Warning",JOptionPane.YES_NO_OPTION);
			if(ch == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
		}	
		
	}

}



	
	


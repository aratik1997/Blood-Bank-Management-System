package File;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class Last_donate_date extends JFrame implements ActionListener,MouseListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton back;
	private JButton exit,submit;
	private JDateChooser dateChooser;
	private JLabel lblNewLabel;
	/**
	 * Create the frame.
	 */
	public Last_donate_date() 
	{
		setResizable(false);
		setTitle("NSU Blood Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage("pannel logo.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
//		contentPane.setFocusable(false);
		contentPane.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 10), new LineBorder(new Color(255, 0, 0), 10)));;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("MMM dd, yyyy");
		dateChooser.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, Color.GRAY, Color.BLACK, Color.BLACK));
		dateChooser.setBounds(232, 265, 281, 36);
		contentPane.add(dateChooser);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		submit.setFont(new Font("Calibri", Font.BOLD, 24));
		submit.setBounds(523, 265, 115, 36);
		contentPane.add(submit);
		
		back = new JButton("Back");
		back.addActionListener(this);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.RED);
		back.setBounds(41, 512, 122, 23);
		contentPane.add(back);
		
		exit = new JButton("Exit");
		exit.setForeground(Color.WHITE);
		exit.setBackground(Color.RED);
		exit.addActionListener(this);
		exit.setBounds(817, 512, 122, 23);
		contentPane.add(exit);
		
		lblNewLabel = new JLabel("Enter the last date of your blood donation");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(220, 300, 281, 46);
		contentPane.add(lblNewLabel);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
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
			int ch = JOptionPane.showConfirmDialog(null, "Are you sure want to exit?","Warning",JOptionPane.YES_NO_OPTION);
			if(ch == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			else
			{
				
			}
		}
		if(e.getSource()==submit)
		{
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
			String td = sdf.format(cal.getTime());
			String gd = sdf.format(dateChooser.getDate());
//			System.out.println(td);
//			System.out.println(gd);
			Date fd = null;
			try {
				fd = sdf.parse(td);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Date fl = null;
			try {
				fl = sdf.parse(gd);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			long diffInMillies = Math.abs(fl.getTime() - fd.getTime());
			long day = diffInMillies/(100*60*60*24*10);

		    long left = 120-day;
		    if(fl.compareTo(fd)>0)
		    {
		    	JOptionPane.showMessageDialog(null,"Your given date should before today's date","Error",0);
		    }
		    else if(fl.compareTo(fd)==0 || (fl.compareTo(fd)<0 && day<120))
		    {
		    	JOptionPane.showMessageDialog(null,"Your have to wait "+left+" day to donate blood again","Error",0);
		    }
		    else if(fl.compareTo(fd)<0 && day>120)
		    {
		    	JOptionPane.showMessageDialog(null,"Congratulations!\n We will inform you the date and place donate your blood","Success",1);
		    }
		}
	}
	

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		System.out.println(dateChooser.getDate());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

package File;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

public class home1 extends JFrame implements MouseListener
{


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;

	
	public home1() {
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
		
		lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(this);
		lblNewLabel.setIcon(new ImageIcon("Edit INC 1 .jpg"));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(10, 11, 966, 543);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
		this.dispose();
		login1 frame = new login1();
		frame.setVisible(true);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
}

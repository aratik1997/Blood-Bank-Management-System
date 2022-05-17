package File;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.ScrollPane;
import java.awt.Toolkit;

@SuppressWarnings("resource")
public class req_list1 extends JFrame implements ActionListener
{


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton back;
	private JButton exit;
	private JTable table;
	private JScrollPane scrollPane_1;
	private DefaultTableModel model;
	private ScrollPane scrollPane;
	

	public req_list1(String path) 
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
		contentPane.setFocusable(false);
		contentPane.setBorder(new CompoundBorder(new LineBorder(new Color(255, 255, 255), 10), new LineBorder(new Color(255, 0, 0), 10)));;
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 27, 935, 479);
		contentPane.add(scrollPane_1);
		
		table = new JTable(); 
		table.setRowMargin(2);
		table.setRowHeight(30);
		table.setAlignmentX(CENTER_ALIGNMENT);
		table.setAlignmentY(CENTER_ALIGNMENT);
		scrollPane_1.setViewportView(table);
		table.setEnabled(false);
		table.getAutoResizeMode();
		table.setFocusTraversalKeysEnabled(false);
		table.setVerifyInputWhenFocusTarget(false);
		table.setUpdateSelectionOnSort(false);
		table.setRowSelectionAllowed(false);
		table.setMaximumSize(new Dimension(10, 10));
		table.setAutoCreateRowSorter(true);
		table.setFont(new Font("Calibri", Font.BOLD, 15));
		table.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		model = (DefaultTableModel)table.getModel();
		
		back = new JButton("Back");
		back.setFocusable(false);
		back.addActionListener(this);
		back.setBounds(41, 512, 122, 23);
		back.setForeground(Color.WHITE);
		back.setBackground(Color.RED);
		contentPane.add(back);
		
		exit = new JButton("Exit");
		exit.setFocusable(false);
		exit.addActionListener(this);
		exit.setBounds(817, 512, 122, 23);
		exit.setForeground(Color.WHITE);
		exit.setBackground(Color.RED);
		exit.addActionListener(this);
		contentPane.add(exit);
		try {
            BufferedReader br = new BufferedReader(new FileReader(path));
       
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(":");
            model.setColumnIdentifiers(columnsName);
            
            
            Object[] tableLines = br.lines().toArray();
            
         
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
            
        } 
        catch (Exception ex) 
        {
            ;
        }
		
		scrollPane = new ScrollPane();
		scrollPane.setBounds(24, 27, 935, 479);
		contentPane.add(scrollPane);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
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
		if(e.getSource()==back)
		{
			this.dispose();
			req_g frame = new req_g();;
			frame.setVisible(true);
			frame.setFocusable(false);
			frame.setResizable(false);
		}
	}
}

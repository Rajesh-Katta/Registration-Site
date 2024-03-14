package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;

public class Metroticket {

	private JFrame frmAizenMetroBooking;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metroticket window = new Metroticket();
					window.frmAizenMetroBooking.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Metroticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAizenMetroBooking = new JFrame();
		frmAizenMetroBooking.setTitle("AIZEN METRO BOOKING");
		frmAizenMetroBooking.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\on line\\Downloads\\resize_image.png"));
		frmAizenMetroBooking.setBounds(100, 100, 1000, 700);
		frmAizenMetroBooking.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAizenMetroBooking.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\on line\\Downloads\\pngwing.com (1).png"));
		lblNewLabel_6.setBounds(741, 65, 175, 161);
		frmAizenMetroBooking.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("AIZEN METRO BOOKING");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setFont(new Font("MV Boli", Font.BOLD, 22));
		lblNewLabel.setBounds(113, 11, 285, 44);
		frmAizenMetroBooking.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(255, 0, 255));
		lblNewLabel_1.setBounds(60, 84, 71, 31);
		frmAizenMetroBooking.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setForeground(new Color(255, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(60, 146, 93, 14);
		frmAizenMetroBooking.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setForeground(new Color(255, 0, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(60, 198, 112, 14);
		frmAizenMetroBooking.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("No.of Tickets");
		lblNewLabel_4.setForeground(new Color(255, 0, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(60, 248, 112, 14);
		frmAizenMetroBooking.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(182, 86, 86, 20);
		frmAizenMetroBooking.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(new Color(255, 255, 255));
		cb1.setForeground(new Color(0, 0, 0));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"AREA", "SOUL SOCIETY", "EARTH", "HELL"}));
		cb1.setBounds(182, 142, 86, 22);
		frmAizenMetroBooking.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setForeground(new Color(0, 0, 0));
		cb2.setBackground(new Color(255, 255, 255));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"AREA", "SOUL SOCIETY", "EARTH", "HELL"}));
		cb2.setBounds(182, 194, 86, 22);
		frmAizenMetroBooking.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3"}));
		cb3.setBounds(186, 244, 82, 22);
		frmAizenMetroBooking.getContentPane().add(cb3);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if (source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton, "Please check station source:" );
				}
				else
				{
					int bill=nt*50;
					JOptionPane.showMessageDialog(btnNewButton,"NAME: "+name+"\nSOURCE: "+source+"\nDESTINATION: "+destination+"\nNO OF TICKETS: "+tickets+"\nAMOUNT: "+bill);
				}
				
			}
		}); 
		
		
		btnNewButton.setBounds(182, 292, 89, 23);
		frmAizenMetroBooking.getContentPane().add(btnNewButton);
		btnNewButton.setBounds(182, 292, 89, 23);
		frmAizenMetroBooking.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\on line\\Downloads\\pngwing.com (2) (1).png"));
		lblNewLabel_7.setBounds(586, 475, 217, 175);
		frmAizenMetroBooking.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\on line\\Downloads\\wallpaperflare.com_wallpaper (1).jpg"));
		lblNewLabel_5.setBounds(10, 11, 964, 639);
		frmAizenMetroBooking.getContentPane().add(lblNewLabel_5);
	}
}

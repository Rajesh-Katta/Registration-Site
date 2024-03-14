package employee;
//,jhjkkhtukyilyuo;uui
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	private JFrame frmBradPitt;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
					window.frmBradPitt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBradPitt = new JFrame();
		frmBradPitt.setTitle("FIGHT CLUB");
		frmBradPitt.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\on line\\Downloads\\800329.jpg"));
		frmBradPitt.setBounds(100, 100, 1950, 1150);
		frmBradPitt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBradPitt.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(73, 121, 46, 14);
		frmBradPitt.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(73, 204, 46, 14);
		frmBradPitt.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TYPE");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(73, 279, 70, 14);
		frmBradPitt.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LEVEL");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(73, 360, 60, 14);
		frmBradPitt.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(210, 120, 86, 20);
		frmBradPitt.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(210, 203, 86, 20);
		frmBradPitt.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "SMOKER", "DRINKER", "DRUG ADDICT", "GANJA", "PAN PARAK"}));
		cb1.setBounds(210, 277, 86, 22);
		frmBradPitt.getContentPane().add(cb1);
		;
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "BEGINNER", "INTERMIDIATE", "ADVANCE", "PRO", "LEGEND", "ULTRA-LEGEND", "GOD FATHER"}));
		cb2.setBounds(210, 358, 86, 22);
		frmBradPitt.getContentPane().add(cb2);
		
		JLabel lblNewLabel = new JLabel("FIGHT CLUB APPLICATION");
		lblNewLabel.setForeground(new Color(189, 183, 107));
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 20));
		lblNewLabel.setBounds(30, 11, 362, 100);
		frmBradPitt.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("JOIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=tb1.getText();
				String name=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String marks=(String) cb2.getSelectedItem();
				
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
					String q="insert into students values"+"('"+id+"','"+name+"','"+branch+"','"+marks+"')";
							Statement stn=con.createStatement();
							stn.executeUpdate(q);
							con.close();
							JOptionPane.showMessageDialog(btnNewButton,"inserted succesfully");
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
			}
			
		});
		btnNewButton.setBounds(207, 450, 89, 23);
		frmBradPitt.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\on line\\Downloads\\1269171.jpg"));
		lblNewLabel_5.setBounds(0, 0, 1950, 1050);
		frmBradPitt.getContentPane().add(lblNewLabel_5);
	}
}

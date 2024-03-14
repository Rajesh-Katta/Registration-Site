package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class movieapp {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieapp window = new movieapp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public movieapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BOOK YOUR TICKET");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBackground(new Color(0, 255, 0));
		lblNewLabel_1.setBounds(173, 24, 281, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("YOUR NAME");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(84, 100, 116, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("MOVIE");
		lblNewLabel_2_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_2_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_1.setBounds(127, 152, 73, 26);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("TIMING");
		lblNewLabel_2_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_2_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_2.setBounds(127, 249, 73, 26);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setBounds(283, 100, 190, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT MOVIE", "DUNE 2", "HANU-MAN", "GUNTUR KARAAM", "SALAAR", "ANIMAL"}));
		comboBox.setBounds(283, 153, 190, 27);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("THEATER NAME");
		lblNewLabel_2_2_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_2_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_2_2_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_2_1.setBounds(68, 197, 132, 26);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT THEATER", "RADHIKA", "SANDHYA", "PRASAD", "AMB", "FORUM", "NARTAKI", "PVR MAXMALL"}));
		comboBox_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		comboBox_1.setBounds(283, 202, 190, 27);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("NO OF TICKETS");
		lblNewLabel_2_2_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel_2_2_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_2_2_2.setBounds(55, 286, 145, 26);
		frame.getContentPane().add(lblNewLabel_2_2_2);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "11:00", "14:00", "18:00", "21:00"}));
		comboBox_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		comboBox_1_2.setBounds(283, 248, 190, 27);
		frame.getContentPane().add(comboBox_1_2);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		comboBox_1_1.setBounds(320, 282, 116, 27);
		frame.getContentPane().add(comboBox_1_1);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String name = textField.getText();
		        String movie = (String) comboBox.getSelectedItem();
		        String theater = (String) comboBox_1.getSelectedItem();
		        String timing = (String) comboBox_1_2.getSelectedItem(); 

		        String tickets = (String) comboBox_1_1.getSelectedItem();
		        int cost = Integer.parseInt(tickets) * 120;

		        String message = "Name: " + name + "\n" +
		                "Movie: " + movie + "\n" +
		                "Theater: " + theater + "\n" +
		                "Timing: " + timing + "\n" +
		                "No of Tickets: " + tickets + "\n" +
		                "Cost: " + cost;

		        int option = JOptionPane.showOptionDialog(frame, message, "Booking Details", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"OK", "EDIT"}, "OK");

		        if (option == JOptionPane.OK_OPTION) {
		            int payOption = JOptionPane.showOptionDialog(frame, "Please confirm to proceed with payment.", "Payment Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"PAY", "CANCEL"}, "PAY");
		            
		            if (payOption == JOptionPane.OK_OPTION) {
		                JOptionPane.showMessageDialog(frame,message,"Ticket confirmed. Payment received. Enjoy the movie!", JOptionPane.INFORMATION_MESSAGE);
		            } else {
		                JOptionPane.showMessageDialog(frame, "Payment cancelled. Your booking is not confirmed.", "Payment Cancelled", JOptionPane.WARNING_MESSAGE);
		            }
		        }
		    }
		});



		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 23));
		btnNewButton.setBounds(255, 330, 100, 36);
		frame.getContentPane().add(btnNewButton);
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\on line\\Downloads\\wallpaperflare.com_wallpaper.jpg"));
		lblNewLabel.setBounds(0, 0, 974, 700);
		frame.getContentPane().add(lblNewLabel);
	}
}
package MedOut;
import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.Toolkit;
import java.awt.Color;
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JFrame f;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection logcon;
	
	String usern;
	String passw;
	private final JLabel lblNewLabel_3 = new JLabel("New label");
	public Login(int a) {}
	public Login() throws ClassNotFoundException, SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/MedOut/check.png")));
		setForeground(Color.WHITE);
		logcon=DriverManager.getConnection("jdbc:sqlite:Database.db");
		PreparedStatement prep=logcon.prepareStatement("SELECT username FROM login");
		ResultSet r=prep.executeQuery();
		usern=r.getString("username");
		PreparedStatement prep1=logcon.prepareStatement("SELECT password FROM login");
		ResultSet r1=prep1.executeQuery();
		passw=r1.getString("password");
		System.out.println(usern+" "+passw);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-12, 0, 610, 332);
		panel.setAlignmentY(0.0f);
		panel.setAlignmentX(0.0f);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(257, 24, 80, 36);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(142, 122, 65, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(246, 119, 145, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(143, 177, 64, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(246, 174, 145, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(246, 229, 113, 33);
		panel.add(btnNewButton);
		lblNewLabel_3.setIcon(new ImageIcon(Login.class.getResource("/MedOut/3d-perspective-style-diamond-shape-white-background_1017-27557.jpg")));
		lblNewLabel_3.setBounds(0, -65, 610, 426);
		panel.add(lblNewLabel_3);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((textField.getText().equals(usern))&&(textField_1.getText().equals(passw)))
				{
					f=new JFrame(); 
						System.out.println("hi");
					}
					
					
			}
		});
	}
}

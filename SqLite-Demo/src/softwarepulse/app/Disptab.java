package softwarepulse.app;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class Disptab extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Disptab frame = new Disptab();
					frame.setVisible(true);
					frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection dbc;
	public Disptab() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WIP");
		lblNewLabel.setBounds(474, 35, 446, 47);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 87, 1330, 631);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(table);
		try {
			dbc=SQLiteTest.getConnection();
			PreparedStatement prep=dbc.prepareStatement("SELECT * FROM user");
			ResultSet r=prep.executeQuery();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{new Integer(1), "The other", "John"},
					{new Integer(2), "John", "Duke"},
					{new Integer(3), "The other", "John"},
				},
				new String[] {
					"id", "fName", "lName"
				}
			));
			table.setEnabled(false);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}

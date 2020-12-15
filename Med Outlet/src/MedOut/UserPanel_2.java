package MedOut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class UserPanel_2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public UserPanel_2() {

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setLayout(new BorderLayout());
		JPanel panel_3_1=new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3.add(panel_3_1,BorderLayout.CENTER);
		panel_3_1.setLayout(null);
		try {
			Connection con=DriverManager.getConnection("jdbc:sqlite::resource:MedOut/Database.db");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(132, 41, 185, 22);
		panel_3_1.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Select User:");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(29, 45, 73, 14);
		panel_3_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.setBounds(37, 106, 89, 23);
		panel_3_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Make Admin");
		btnNewButton_1.setBounds(202, 106, 89, 23);
		panel_3_1.add(btnNewButton_1);

	}
}

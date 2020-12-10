package MedOut;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class Main1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main1 frame = new Main1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 839, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			contentPane.setLayout(new BorderLayout(0, 0));
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.red);
			contentPane.add(panel,BorderLayout.WEST);
			panel.setLayout(null);
			panel.setPreferredSize(new Dimension(302,100));
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(88, 11, 120, 154);
			//lblNewLabel.setIcon(new ImageIcon(Main1.class.getResource("/MedOut/drug_shop-512.png")));
			lblNewLabel.setIcon(new ImageIcon(new ImageIcon(Main1.class.getResource("/MedOut/drug_shop-512.png")).getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT)));
			panel.add(lblNewLabel);
			
			JPanel panel_1_1 = new JPanel();
			panel_1_1.setBounds(0, 211, 302, 47);
			panel_1_1.setBackground(new Color(135, 206, 235));
			panel.add(panel_1_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("INVENTORY");
			//lblNewLabel_1_1.setIcon(new ImageIcon(Main1.class.getResource("/MedOut/253ad59b.png")));
			lblNewLabel_1_1.setIcon(new ImageIcon(new ImageIcon(Main1.class.getResource("/MedOut/253ad59b.png")).getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT)));
			lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1_1.setBackground(SystemColor.menu);
			panel_1_1.add(lblNewLabel_1_1);
			panel_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					panel_1_1.setBackground(new Color(100, 149, 237));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					panel_1_1.setBackground(new Color(135, 206, 235));
				}
			});
			
			JPanel panel_1_2 = new JPanel();
			panel_1_2.setBounds(0, 258, 302, 47);
			panel_1_2.setBackground(new Color(135, 206, 235));
			panel.add(panel_1_2);
			
			JLabel lblNewLabel_1_2 = new JLabel("COMPANIES");
			lblNewLabel_1_2.setIcon(new ImageIcon(Main1.class.getResource("/MedOut/companies-icon.png")));
			lblNewLabel_1_2.setForeground(Color.DARK_GRAY);
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1_2.setBackground(SystemColor.menu);
			panel_1_2.add(lblNewLabel_1_2);
			panel_1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					panel_1_2.setBackground(new Color(100, 149, 237));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					panel_1_2.setBackground(new Color(135, 206, 235));
				}
			});
			
			
			JPanel panel_1_3 = new JPanel();
			panel_1_3.setBounds(0, 302, 302, 47);
			panel_1_3.setBackground(new Color(135, 206, 235));
			panel.add(panel_1_3);
			
			JLabel lblNewLabel_1_3 = new JLabel("USERS");
			lblNewLabel_1_3.setIcon(new ImageIcon(Main1.class.getResource("/MedOut/Actions-list-add-user-icon.png")));
			lblNewLabel_1_3.setForeground(Color.DARK_GRAY);
			lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1_3.setBackground(SystemColor.menu);
			panel_1_3.add(lblNewLabel_1_3);
			panel_1_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					panel_1_3.setBackground(new Color(100, 149, 237));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					panel_1_3.setBackground(new Color(135, 206, 235));
				}
			});
			
			JPanel panel_1_4 = new JPanel();
			panel_1_4.setBounds(0, 348, 302, 47);
			panel_1_4.setBackground(new Color(135, 206, 235));
			panel.add(panel_1_4);
			
			JLabel lblNewLabel_1_4 = new JLabel("SETTINGS");
			lblNewLabel_1_4.setIcon(new ImageIcon(Main1.class.getResource("/MedOut/Apps-system-software-update-icon.png")));
			lblNewLabel_1_4.setForeground(Color.DARK_GRAY);
			lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1_4.setBackground(SystemColor.menu);
			panel_1_4.add(lblNewLabel_1_4);
			panel_1_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					panel_1_4.setBackground(new Color(100, 149, 237));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					panel_1_4.setBackground(new Color(135, 206, 235));
				}
			});
			
			
			JPanel panel_1_4_1 = new JPanel();
			panel_1_4_1.setBounds(0, 391, 302, 47);
			panel_1_4_1.setBackground(new Color(135, 206, 235));
			panel.add(panel_1_4_1);
			
			JLabel lblNewLabel_1_4_1 = new JLabel("SIGN OUT");
			lblNewLabel_1_4_1.setIcon(new ImageIcon(Main1.class.getResource("/MedOut/Apps-session-logout-icon.png")));
			lblNewLabel_1_4_1.setForeground(Color.DARK_GRAY);
			lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_1_4_1.setBackground(SystemColor.menu);
			panel_1_4_1.add(lblNewLabel_1_4_1);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 165, 302, 47);
			panel.add(panel_1);
			
				panel_1.setBackground(new Color(135, 206, 235));
				panel_1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
					}
					@Override
					public void mouseEntered(MouseEvent e) {
						panel_1.setBackground(new Color(100, 149, 237));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						panel_1.setBackground(new Color(135, 206, 235));
					}
				});
				
				JLabel lblNewLabel_1 = new JLabel("SALES");
				lblNewLabel_1.setIcon(new ImageIcon(Main1.class.getResource("/MedOut/Drug-basket-icon.png")));
				lblNewLabel_1.setForeground(Color.DARK_GRAY);
				lblNewLabel_1.setBackground(new Color(240, 240, 240));
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
				panel_1.add(lblNewLabel_1);
		panel_1_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1_4_1.setBackground(new Color(100, 149, 237));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1_4_1.setBackground(new Color(135, 206, 235));
			}
		});
		
	}
}

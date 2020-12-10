package MedOut;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/MedOut/drug_shop-512.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 458);

		
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(null);
		contentPane.setLayout(new BorderLayout(0, 2));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setPreferredSize(new Dimension(50,120));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setPreferredSize(new Dimension(200,50));
		panel.add(panel_2, BorderLayout.WEST);
		
		JLabel Medlogo = new JLabel("");
		Medlogo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(Medlogo);
		Medlogo.setBounds(0,0,200,200);
		//Medlogo.setIcon(new ImageIcon(Main.class.getResource("/MedOut/drug_shop-512.png")));
		Medlogo.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MedOut/drug_shop-512.png")).getImage().getScaledInstance(120,120, Image.SCALE_SMOOTH)));
		JPanel panel1=new JPanel();
		panel1.setBackground(Color.RED);
		panel1.setBorder(null);
		panel1.setPreferredSize(new Dimension(200,50));
		contentPane.add(panel1, BorderLayout.WEST);
		panel1.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 200, 300);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.RED);
		panel_1.setPreferredSize(new Dimension(200, 300));
		panel1.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel SalesOpt = new JPanel();
		SalesOpt.setBackground(Color.RED);
		panel_1.add(SalesOpt);
		SalesOpt.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("SALES");
		lblNewLabel.setForeground(Color.WHITE);
		//lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/MedOut/cvs-health-payor-solutions-measuring-success-main-image_0.png")));
		lblNewLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MedOut/cvs-health-payor-solutions-measuring-success-main-image_0.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH)));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		SalesOpt.add(lblNewLabel);
		
		JPanel InventoryOpt = new JPanel();
		InventoryOpt.setBackground(Color.RED);
		panel_1.add(InventoryOpt);
		InventoryOpt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("INVENTORY");
		//lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/MedOut/6639703_preview.png")));
		lblNewLabel_1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MedOut/6639703_preview.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH)));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		InventoryOpt.add(lblNewLabel_1);
		
		JPanel CompanyOpt = new JPanel();
		CompanyOpt.setBackground(Color.RED);
		panel_1.add(CompanyOpt);
		CompanyOpt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("COMPANIES");
		//lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/MedOut/building-icon-company-building-png-png-256_256.png")));
		lblNewLabel_2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MedOut/building-icon-company-building-png-png-256_256.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH)));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		CompanyOpt.add(lblNewLabel_2);
		
		JPanel UsersOpt = new JPanel();
		UsersOpt.setBackground(Color.RED);
		panel_1.add(UsersOpt);
		UsersOpt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("USERS");
		//lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/MedOut/multy-user.png")));
		lblNewLabel_3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MedOut/multy-user.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH)));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		UsersOpt.add(lblNewLabel_3);
		
		JPanel SettingsOpt = new JPanel();
		SettingsOpt.setBackground(Color.RED);
		panel_1.add(SettingsOpt);
		SettingsOpt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("SETTINGS");
		//lblNewLabel_4.setIcon(new ImageIcon(Main.class.getResource("/MedOut/settings.png")));
		lblNewLabel_4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MedOut/settings.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH)));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 20));
		SettingsOpt.add(lblNewLabel_4);
		
		JPanel Logout = new JPanel();
		Logout.setBackground(Color.RED);
		panel_1.add(Logout);
		Logout.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("LOGOUT");
		//lblNewLabel_5.setIcon(new ImageIcon(Main.class.getResource("/MedOut/25706.png")));
		lblNewLabel_5.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/MedOut/25706.png")).getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH)));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		Logout.add(lblNewLabel_5);
		InventoryPanel ip=new InventoryPanel();
		CompanyPanel cp=new CompanyPanel();
		SalesPanel sp=new SalesPanel();
		UsersPanel up=new UsersPanel();
		
		SalesOpt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				contentPane.add(sp, BorderLayout.CENTER);
				sp.setVisible(false);
				ip.setVisible(false);
				cp.setVisible(false);
				up.setVisible(false);
				sp.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				SalesOpt.setBackground(new Color(220, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SalesOpt.setBackground(Color.RED);
			}
		});
		InventoryOpt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				contentPane.add(ip,BorderLayout.CENTER);
				cp.setVisible(false);
				sp.setVisible(false);
				up.setVisible(false);
				ip.setVisible(false);
				ip.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				InventoryOpt.setBackground(new Color(220, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				InventoryOpt.setBackground(Color.RED);
			}
		});
		UsersOpt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.add(up,BorderLayout.CENTER);
				cp.setVisible(false);
				sp.setVisible(false);
				ip.setVisible(false);
				up.setVisible(false);
				up.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				UsersOpt.setBackground(new Color(220, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				UsersOpt.setBackground(Color.RED);
			}
		});
		SettingsOpt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				SettingsOpt.setBackground(new Color(220, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				SettingsOpt.setBackground(Color.RED);
			}
		});
		Logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result=JOptionPane.showConfirmDialog(null,"Are you sure you want to logout?","Logout",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(result==JOptionPane.YES_OPTION)
					System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Logout.setBackground(new Color(220, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Logout.setBackground(Color.RED);
			}
		});
		CompanyOpt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				contentPane.add(cp,BorderLayout.CENTER);
				ip.setVisible(false);
				up.setVisible(false);
				sp.setVisible(false);
				cp.setVisible(false);
				cp.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				CompanyOpt.setBackground(new Color(220, 0, 0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				CompanyOpt.setBackground(Color.RED);
			}
		});
	}

}

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class FrameHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { openHomePageFrame(); }
	 */
	public static void openHomePageFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameHomePage frame = new FrameHomePage();
					frame.setUndecorated(true);
				    frame.setLocationRelativeTo(null); // center the jframe on screen
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
	public FrameHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1296, 940);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 1303, 270);
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel logoutIcon = new JLabel("Logout");
		logoutIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				FrameLogin.main(null);
			}
		});
		logoutIcon.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 22));
		logoutIcon.setForeground(Color.WHITE);
		logoutIcon.setBounds(12, 13, 126, 56);
		try {
			logoutIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/logout_32px.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel.add(logoutIcon);
		
		JLabel lblInstitudeManager = new JLabel("INSTITUDE MANAGER");
		lblInstitudeManager.setForeground(Color.WHITE);
		lblInstitudeManager.setFont(new Font("Snap ITC", Font.BOLD, 68));
		lblInstitudeManager.setBounds(129, 56, 1008, 117);
		panel.add(lblInstitudeManager);
		
		JLabel label = new JLabel("Future developer");
		label.setBounds(952, 152, 313, 105);
		panel.add(label);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Mistral", Font.BOLD, 48));
		
		JLabel label_1 = new JLabel("Devlop What You Think");
		label_1.setBounds(979, 225, 324, 30);
		panel.add(label_1);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Rage Italic", Font.PLAIN, 24));
		
		JLabel iconClose = new JLabel("");
		try {
			iconClose.setIcon(new ImageIcon(ImageIO.read(new File("images/close_icon24px.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		iconClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(0);
			}
		});
		iconClose.setHorizontalAlignment(SwingConstants.CENTER);
		iconClose.setForeground(Color.RED);
		iconClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		iconClose.setBounds(1256, 0, 47, 39);
		panel.add(iconClose);
		
		final JPanel panel_student = new JPanel();
		panel_student.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setPanelBackgroundColor(panel_student);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetPanelBackgroundColor(panel_student);
			}
		});
		panel_student.setBounds(531, 360, 205, 205);
		panel_student.setLayout(null);
		contentPane.add(panel_student);
		
		JLabel addStudentIcon = new JLabel("");
		addStudentIcon.setBounds(60, 20, 100, 100);
		try {
			addStudentIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/add-student_96px.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel_student.add(addStudentIcon);
		
		JLabel lblAddStudent = new JLabel("ADD STUDENT");
		lblAddStudent.setForeground(new Color(52, 152, 219));
		lblAddStudent.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddStudent.setBounds(42, 133, 144, 31);
		panel_student.add(lblAddStudent);
		
		final JPanel panel_employee = new JPanel();
		panel_employee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setPanelBackgroundColor(panel_employee);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetPanelBackgroundColor(panel_employee);
			}
		});
		panel_employee.setLayout(null);
		panel_employee.setBounds(800, 360, 205, 205);
		contentPane.add(panel_employee);
		
		JLabel addEmployeeIcon = new JLabel("");
		addEmployeeIcon.setBounds(60, 20, 100, 100);
		try {
			addEmployeeIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/add-student_96px.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel_employee.add(addEmployeeIcon);
		
		JLabel lblAddEmployee = new JLabel("ADD EMPLOYEE");
		lblAddEmployee.setForeground(new Color(52, 152, 219));
		lblAddEmployee.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddEmployee.setBounds(42, 133, 144, 31);
		panel_employee.add(lblAddEmployee);
		
		final JPanel panel_enquire = new JPanel();
		panel_enquire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				setPanelBackgroundColor(panel_enquire);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetPanelBackgroundColor(panel_enquire);
			}
		});
		panel_enquire.setLayout(null);
		panel_enquire.setBounds(268, 360, 205, 205);
		contentPane.add(panel_enquire);
		
		JLabel enquireIcon = new JLabel("");
		enquireIcon.setBounds(60, 20, 100, 100);
		try {
			enquireIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/enquire_96px.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel_enquire.add(enquireIcon);
		
		JLabel lblEnquire = new JLabel("ENQUIRE");
		lblEnquire.setForeground(new Color(52, 152, 219));
		lblEnquire.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnquire.setBounds(70, 133, 100, 31);
		panel_enquire.add(lblEnquire);
		
		final JPanel panel_payment = new JPanel();
		panel_payment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setPanelBackgroundColor(panel_payment);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetPanelBackgroundColor(panel_payment);
			}
		});
		panel_payment.setLayout(null);
		panel_payment.setBounds(268, 606, 205, 205);
		contentPane.add(panel_payment);
		
		JLabel paymentIcon = new JLabel("");
		paymentIcon.setBounds(60, 20, 100, 100);
		try {
			paymentIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/payment_96px.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel_payment.add(paymentIcon);
		
		JLabel lblPayment = new JLabel("PAYMENT");
		lblPayment.setForeground(new Color(52, 152, 219));
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPayment.setBounds(60, 133, 109, 31);
		panel_payment.add(lblPayment);
		
		final JPanel panel_setting = new JPanel();
		panel_setting.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setPanelBackgroundColor(panel_setting);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetPanelBackgroundColor(panel_setting);
			}
		});
		panel_setting.setLayout(null);
		panel_setting.setBounds(531, 606, 205, 205);
		contentPane.add(panel_setting);
		
		JLabel settingIcon = new JLabel("");
		settingIcon.setBounds(60, 20, 100, 100);
		try {
			settingIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/setting_96px.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel_setting.add(settingIcon);
		
		JLabel lblSetting = new JLabel("SETTING");
		lblSetting.setForeground(new Color(52, 152, 219));
		lblSetting.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSetting.setBounds(70, 133, 100, 31);
		panel_setting.add(lblSetting);
		
		final JPanel panel_report = new JPanel();
		panel_report.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				setPanelBackgroundColor(panel_report);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				resetPanelBackgroundColor(panel_report);
			}
		});
		panel_report.setLayout(null);
		panel_report.setBounds(800, 606, 205, 205);
		contentPane.add(panel_report);
		
		JLabel reportIcon = new JLabel("");
		reportIcon.setBounds(60, 20, 100, 100);
		try {
			reportIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/report_96px.png"))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		panel_report.add(reportIcon);
		
		JLabel lblReports = new JLabel("REPORTS");
		lblReports.setForeground(new Color(52, 152, 219));
		lblReports.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblReports.setBounds(70, 133, 100, 31);
		panel_report.add(lblReports);
	}
	
	private void setPanelBackgroundColor(JPanel panel) {
		panel.setBackground(new Color(68, 67, 67));
	}
	
	private void resetPanelBackgroundColor(JPanel panel) {
		panel.setBackground(new Color(240, 240, 240));
	}
}

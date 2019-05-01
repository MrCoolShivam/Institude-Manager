package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JPasswordField passwordFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		int number = 200000000;
	//	addComa(number);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
					frame.setUndecorated(true);

				    // center the jframe on screen
				    frame.setLocationRelativeTo(null);
				    
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void addComma(int num){
		
		String number = Integer.toString(num);
		
		String start = number.substring(0, number.length()-3);
		String end = number.substring(number.length()-3);
		
		double amount = Double.parseDouble(start);
		DecimalFormat formatter = new DecimalFormat("#,##");
		
		number = formatter.format(amount)+","+end;
		
		System.out.println(number);
	}

	/**
	 * Create the frame.
	 */
 	public FrameLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 893, 624);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 455, 626);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFutureDeveloper = new JLabel("Future developer");
		lblFutureDeveloper.setFont(new Font("Mistral", Font.BOLD, 48));
		lblFutureDeveloper.setForeground(Color.WHITE);
		lblFutureDeveloper.setBounds(66, 304, 313, 105);
		panel.add(lblFutureDeveloper);
		
		JLabel lblDevelopWhichYou = new JLabel("Devlop What You Think");
		lblDevelopWhichYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevelopWhichYou.setFont(new Font("Rage Italic", Font.PLAIN, 24));
		lblDevelopWhichYou.setForeground(Color.WHITE);
		lblDevelopWhichYou.setBounds(93, 377, 324, 30);
		panel.add(lblDevelopWhichYou);
		
		Button btnLogin = new Button("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnLogin.setBackground(SystemColor.textHighlight);
		btnLogin.setBounds(506, 444, 327, 50);
		contentPane.add(btnLogin);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldUserName.setBounds(506, 230, 327, 50);
		contentPane.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		passwordFieldPassword = new JPasswordField();
		passwordFieldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordFieldPassword.setColumns(10);
		passwordFieldPassword.setBounds(506, 340, 327, 50);
		contentPane.add(passwordFieldPassword);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(506, 187, 117, 30);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(506, 297, 117, 30);
		contentPane.add(lblPassword);
		
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
		iconClose.setForeground(Color.RED);
		iconClose.setFont(new Font("Tahoma", Font.BOLD, 16));
		iconClose.setHorizontalAlignment(SwingConstants.CENTER);
		iconClose.setBounds(850, 0, 47, 39);
		contentPane.add(iconClose);
		
		JLabel loginIcon = new JLabel("");
		loginIcon.setBounds(604, 13, 186, 162);
		
		try {
			loginIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/login-icon.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		contentPane.add(loginIcon);
	}
}

package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FrameSingUp extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUserName;
	private JPasswordField passwordFieldPassword;
	private JPasswordField passwordFieldConfrimPassword;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { openSignUpFrame(); }
	 */
	public static void openSignUpFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSingUp frame = new FrameSingUp();
					frame.setUndecorated(true);
				    frame.setLocationRelativeTo(null);  // center the jframe on screen
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
	public FrameSingUp() {
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
		
		Button btnLogin = new Button("SignUp");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLogin.setBackground(new Color(255, 204, 0));
		btnLogin.setBounds(506, 457, 327, 50);
		contentPane.add(btnLogin);
		
		textFieldUserName = new JTextField();
		textFieldUserName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textFieldUserName.setBounds(506, 176, 327, 50);
		contentPane.add(textFieldUserName);
		textFieldUserName.setColumns(10);
		
		passwordFieldPassword = new JPasswordField();
		passwordFieldPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordFieldPassword.setColumns(10);
		passwordFieldPassword.setBounds(506, 279, 327, 50);
		contentPane.add(passwordFieldPassword);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(506, 133, 117, 30);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(506, 236, 117, 30);
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
		
		JLabel lblNewUserSignup = new JLabel("<html><u>Already User SignIn?</u></html>");
		lblNewUserSignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				FrameLogin.main(null);
			}
		});
		lblNewUserSignup.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewUserSignup.setBounds(604, 537, 127, 22);
		contentPane.add(lblNewUserSignup);
		
		JLabel lblConfrimPassword = new JLabel("Confirm Password");
		lblConfrimPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblConfrimPassword.setBounds(506, 344, 155, 30);
		contentPane.add(lblConfrimPassword);
		
		passwordFieldConfrimPassword = new JPasswordField();
		passwordFieldConfrimPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordFieldConfrimPassword.setColumns(10);
		passwordFieldConfrimPassword.setBounds(506, 387, 327, 50);
		contentPane.add(passwordFieldConfrimPassword);
		
		JLabel loginIcon = new JLabel("");
		loginIcon.setBounds(616, 13, 127, 107);
		
		try {
			loginIcon.setIcon(new ImageIcon(ImageIO.read(new File("images/sign-up.png"))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contentPane.add(loginIcon);
	}
}

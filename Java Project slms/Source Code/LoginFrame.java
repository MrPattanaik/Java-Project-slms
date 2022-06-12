package lms_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;

public class LoginFrame extends JFrame {
	Connection con;
    PreparedStatement pspt;
    ResultSet rs;

	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField txtpass;
	private JTextField txtSiginUpProcess;
	private JTextField txtlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		//connnection established
		con=DBManager.ConnectDatabase();
//		System.out.println(con);
		setBackground(new Color(240, 230, 140));
//		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 1400, 700);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(245, 255, 250));
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, new Color(135, 206, 250), new Color(135, 206, 250), null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel1Registration = new JPanel();
		panel1Registration.setBackground(new Color(25, 25, 112));
		panel1Registration.setBounds(10, 10, 1380, 80);
		contentPane.add(panel1Registration);
		panel1Registration.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Leave Management System");
		lblNewLabel.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(346, 10, 657, 53);
		panel1Registration.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setForeground(new Color(0, 0, 128));
		panel.setBounds(76, 10, 84, 70);
		panel1Registration.add(panel);
		panel.setLayout(null);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setIcon(new ImageIcon("D:\\MCA\\SEM2\\java\\Java Project Lms1\\Image Folder\\leave loho.png"));
		lblNewLabel_1.setBounds(10, 0, 80, 75);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(139, 0, 0));
		panel_1.setBounds(1319, 24, 51, 39);
		panel1Registration.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblcross = new JLabel("New label");
		lblcross.setIcon(new ImageIcon("D:\\MCA\\SEM2\\java\\Java Project Lms1\\Image Folder\\icons8-macos-close-30.png"));
		lblcross.setBounds(10, 0, 31, 39);
		panel_1.add(lblcross);
		
		JLabel lblNewLabel_2 = new JLabel("Leave Management System");
		lblNewLabel_2.setVerticalTextPosition(SwingConstants.TOP);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_2.setBounds(0, 0, 657, 53);
		panel_1.add(lblNewLabel_2);
		lblcross.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int dialogButton = JOptionPane.showConfirmDialog (null, "Are you sure?","WARNING",JOptionPane.YES_NO_OPTION);
				if(dialogButton == JOptionPane.YES_OPTION)
				{
					System.exit(0);
					}
				else {
					remove(dialogButton);
					}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblcross.setForeground(Color.red);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblcross.setForeground(Color.white);
			}
		});
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(176, 224, 230), null, null));
		panel_2_1.setBackground(new Color(135, 206, 250));
		panel_2_1.setBounds(394, 100, 599, 64);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(234, 8, 170, 51);
		lblLogin.setBackground(Color.BLACK);
		panel_2_1.add(lblLogin);
		lblLogin.setVerticalTextPosition(SwingConstants.TOP);
		lblLogin.setForeground(Color.BLACK);
		lblLogin.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 50));
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, new Color(176, 224, 230), null, null));
		panel_2_1_1.setBackground(new Color(135, 206, 250));
		panel_2_1_1.setBounds(184, 174, 1060, 479);
		contentPane.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lblEnterUserId = new JLabel("Enter user Id");
		lblEnterUserId.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterUserId.setBounds(433, 85, 145, 34);
		panel_2_1_1.add(lblEnterUserId);
		
		JLabel lblEnterId_1 = new JLabel("Enter Password");
		lblEnterId_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_1.setBounds(423, 171, 182, 34);
		panel_2_1_1.add(lblEnterId_1);
		
		JLabel lblEnterId_1_1 = new JLabel("Enter User Type");
		lblEnterId_1_1.setFont(new Font("Arial", Font.BOLD, 21));
		lblEnterId_1_1.setBounds(423, 269, 195, 34);
		panel_2_1_1.add(lblEnterId_1_1);
		
		txtuser = new JTextField();
		txtuser.setHorizontalAlignment(SwingConstants.CENTER);
		txtuser.setFont(new Font("Arial", Font.BOLD, 16));
		txtuser.setColumns(10);
		txtuser.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 0, 0), new Color(178, 34, 34), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtuser.setBounds(372, 117, 269, 44);
		panel_2_1_1.add(txtuser);
		
		txtpass = new JPasswordField();
		txtpass.setHorizontalAlignment(SwingConstants.CENTER);
		txtpass.setFont(new Font("Arial", Font.BOLD, 16));
		txtpass.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0), new Color(255, 0, 0)));
		txtpass.setBounds(372, 215, 269, 44);
		panel_2_1_1.add(txtpass);
		
		JComboBox<String> combouser = new JComboBox<String>();
		combouser.setModel(new DefaultComboBoxModel<String>(new String[] {"Select User Type", "Student", "Faculty", "Warden"}));
		combouser.setFont(new Font("Arial", Font.BOLD, 16));
		combouser.setEditable(true);
		combouser.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		combouser.setBounds(372, 313, 269, 49);
		panel_2_1_1.add(combouser);
		
		JLabel lblNewLabel_3 = new JLabel("l");
		lblNewLabel_3.setIcon(new ImageIcon("D:\\MCA\\SEM2\\java\\Java Project Lms1\\Image Folder\\login2.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(412, 10, 166, 76);
		panel_2_1_1.add(lblNewLabel_3);
		
		txtSiginUpProcess = new JTextField();
		txtSiginUpProcess.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			 setVisible(false);
			 RegistractionFrame obj=new RegistractionFrame();
			 obj.setVisible(true);
			}
			
		});
		txtSiginUpProcess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtSiginUpProcess.setBorder(null);
		txtSiginUpProcess.setBackground(new Color(135, 206, 250));
		txtSiginUpProcess.setFont(new Font("Arial", Font.PLAIN, 26));
		txtSiginUpProcess.setForeground(Color.RED);
		txtSiginUpProcess.setText("SigIn Up Process");
		txtSiginUpProcess.setBounds(128, 398, 213, 34);
		panel_2_1_1.add(txtSiginUpProcess);
		txtSiginUpProcess.setColumns(10);
		
		txtlogin = new JTextField();
		txtlogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String uid,pass,q1,q2;
				uid=txtuser.getText();
				pass=String.valueOf(txtpass.getPassword());
				if(combouser.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(txtlogin, " please Select User Type");
				}
				else {
					if(uid.trim().length()>0 && pass.trim().length()>0) 
					{
					              if(combouser.getSelectedIndex()==1 )
					                   {
						  ///user is student not warden
					            	  try {
					            		  q1="select * from tbl_user where UserId=? and Pass=?";
					            		  pspt=con.prepareStatement(q1);
					            		  pspt.setString(1, uid);
					            		  pspt.setString(2,pass);
					            		  rs=pspt.executeQuery();
					            		  if(rs.next()) {
					            			  JOptionPane.showMessageDialog(txtlogin, " Welcome ,You are valid user");
					            			  int iid=rs.getInt(3);
					            			  String uu_id=rs.getString(1);
					            			  Session.id=iid;
					            			  Session.u_id=uu_id;
					            			  StudentZone obj=new StudentZone();
					            			  setVisible(false);
					            			  obj.setVisible(true);
					            			  
					            		  }
					            		  else {
					            			  JOptionPane.showMessageDialog(txtlogin, " oops You are not valid User,Please sigup ");
					            		  }
					            		  
					            	  }
					            	  catch (Exception exc) {
										// TODO: handle exception
					            		  System.out.println(exc);
									}
						  
						  
						  
						  
					                    }
					                else if(combouser.getSelectedIndex()==2 )
					                    {
						  // user is faculty
					                	
					                	try {
						            		  q1="select * from tbl_user where UserId=? and Pass=?";
						            		  pspt=con.prepareStatement(q1);
						            		  pspt.setString(1, uid);
						            		  pspt.setString(2,pass);
						            		  rs=pspt.executeQuery();
						            		  if(rs.next()) {
						            			  
						            			  JOptionPane.showMessageDialog(txtlogin, " Welcome ,You are valid user");
						            			  int iid=rs.getInt(3);
						            			  String uu_id=rs.getString(1);
						            			  Session.id=iid;
						            			  Session.u_id=uu_id;
						            			  FacultyZone obj=new FacultyZone();
						            			  setVisible(false);
						            			  obj.setVisible(true);
						            		     
						            		  
						            		  }
						            		  
						            		  
						            		  
						            		  else {
						            			  JOptionPane.showMessageDialog(txtlogin, " oops You are not valid User,Please sigup ");
						            		  }
						            		  
						            	  }
						            	  catch (Exception exc1) {
											// TODO: handle exception
						            		  System.out.println(exc1);
										}
					                	
					                  }
					     
					                else 
					                {
						  //user warden
					                	 try 
					                	 {
					               	  q1="select * from tbl_user where UserId=? and Pass=?";
				            		  pspt=con.prepareStatement(q1);
				            		  pspt.setString(1, uid);
				            		  pspt.setString(2,pass);
				            		  rs=pspt.executeQuery();
				            		  if(rs.next()) 
				            		  {
				            		  JOptionPane.showMessageDialog(txtlogin, " Welcome ,You are User");
				            		  int iid=rs.getInt(3);
			            			  String uu_id=rs.getString(1);
			            			  Session.id=iid;
			            			  Session.u_id=uu_id;
			            			  WardenZone obj=new WardenZone();
			            			  setVisible(false);
			            			  obj.setVisible(true);
				            		  
				            			  
				            		  }
				            		  else 
				            		  {
				            			  JOptionPane.showMessageDialog(txtlogin, " oops You are not valid User,Please sigup ");
				            		  }
				            		  
				            		  
				            	  }
					              catch (Exception exc1) 
					              {
										// TODO: handle exception
					            		  System.out.println(exc1);
									}
					                	 
					                	 
					                	 
					                     }
					                
						
						
						
						
					}
					else {
						JOptionPane.showMessageDialog(txtlogin, " User or Password Cant be Blank");
					}
				}
			}
		});
		txtlogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		txtlogin.setText("Login");
		txtlogin.setForeground(Color.RED);
		txtlogin.setFont(new Font("Arial", Font.PLAIN, 26));
		txtlogin.setColumns(10);
		txtlogin.setBorder(null);
		txtlogin.setBackground(new Color(135, 206, 250));
		txtlogin.setBounds(851, 398, 89, 34);
		panel_2_1_1.add(txtlogin);
		
		JLabel lblNewLabel_5 = new JLabel("Only Registered User Can Login So first  Complete the Resgistraction Process then You Can Login");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\MCA\\SEM2\\java\\warnning2.png"));
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(27, 419, 1023, 64);
		panel_2_1_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("D:\\MCA\\SEM2\\java\\Java Project Lms\\warnning2.png"));
		lblNewLabel_6.setBounds(954, 442, 69, 64);
		panel_2_1_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4 = new JLabel("Credentials");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_4.setBounds(184, 151, 158, 23);
		contentPane.add(lblNewLabel_4);
		
	}
}

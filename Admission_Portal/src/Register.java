
import javax.swing.*;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.util.*;


public class Register extends JFrame implements ActionListener {
	JLabel jl0,jl1,jl2,jl3,jl4,jl5;
	JButton jb3;
	JTextField jt1,jt2,jt3,jt4;
	JPasswordField jps;
	Register(){
		JFrame jf2 = new JFrame();
		jf2.setSize(900, 750);
		jf2.setLayout(null);
		jf2.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf2.setContentPane(new JLabel(new ImageIcon("C:/Users/JenilM/Downloads/lnmiit2.jpg")));
		
		
		jl0 = new JLabel("Registration");
		jl0.setForeground(Color.BLACK);
		jl0.setFont(new Font("Serif", Font.BOLD, 40));
		
		jl1 = new JLabel("First Name");
		jl1.setForeground(Color.BLACK);
		jl1.setFont(new Font("Serif", Font.BOLD, 20));
		jl2 = new JLabel("Last Name");
		jl2.setForeground(Color.BLACK);
		jl2.setFont(new Font("Serif", Font.BOLD, 20));
		jl3 = new JLabel("EMail ID");
		jl3.setForeground(Color.BLACK);
		jl3.setFont(new Font("Serif", Font.BOLD, 20));
		jl4 = new JLabel("UserName");
		jl4.setForeground(Color.BLACK);
		jl4.setFont(new Font("Serif", Font.BOLD, 20));
		jl5 = new JLabel("Password");
		jl5.setForeground(Color.BLACK);
		jl5.setFont(new Font("Serif", Font.BOLD, 20));
		jb3 = new JButton("Register");
		jb3.setFont(new Font("Serif", Font.BOLD, 20));
		
		//jt5 = new JTextField();
		jps = new JPasswordField();
		jt1 = new JTextField();
		jt2 = new JTextField();
		jt3 = new JTextField();
		jt4 = new JTextField();
		
		jf2.add(jl5);
		jf2.add(jl4);
		jf2.add(jl3);
		jf2.add(jl2);
		jf2.add(jl1);
		jf2.add(jl0);
		jf2.add(jb3);
		//jf2.add(jt5);
		jf2.add(jt4);
		jf2.add(jt3);
		jf2.add(jt2);
		jf2.add(jt1);
		jf2.add(jt1);
		jf2.add(jps);
		jb3.addActionListener(this);
		jf2.setVisible(true);
		
		jl0.setBounds(260,30,400,60);
		jl1.setBounds(200,120,200,30);
		jl2.setBounds(200,170,200,30);
		jl3.setBounds(200,220,200,30);
		jl4.setBounds(200,270,200,30);
		jl5.setBounds(200,320,200,30);
		jb3.setBounds(320,420,200,30);
		jt1.setBounds(420, 120, 200, 30);
		jt2.setBounds(420, 170, 200, 30);
		jt3.setBounds(420, 220, 200, 30);
		jt4.setBounds(420, 270, 200, 30);
		jps.setBounds(420, 320, 200, 30);
	}
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		showdata2(str);
	}
	public void showdata2(String str){
		
		if(str.equals("Register")){
			if(!jt1.getText().equals("") && !jt2.getText().equals("") && !jt3.getText().equals("") && !jt4.getText().equals("") && !jps.getText().equals("")){
				String str2 = jt4.getText();
				char[] q = jps.getPassword();
				String pass = new String(q);
				try{
				//JOptionPane.showMessageDialog(null,"SUCCESSFULLY REGISTERED","CONGRATULATION",JOptionPane.PLAIN_MESSAGE);
				//Class.forName("com.ibm.db2.jcc.DB2Driver");
				//Connection con2 = DriverManager.getConnection("jdbc:db2://localhost:50000/ADMI","JenilM","jenil@1038");
					Connection co2 = new Connect().conn();
					PreparedStatement stmt2 = co2.prepareStatement("SELECT ID FROM LOGIN WHERE ID='"+str2+"'");
				stmt2.executeQuery();
				ResultSet rs2 = stmt2.getResultSet();
				if(!rs2.next()){
					PreparedStatement stmt3 = co2.prepareStatement("INSERT INTO LOGIN VALUES('"+str2+"', '"+pass+"')");
					PreparedStatement stmt4 = co2.prepareStatement("INSERT INTO REGISTER VALUES('"+str2+"', '"+jt1.getText()+"', '"+jt2.getText()+"', '"+jt3.getText()+"', '"+jps.getText()+"')");
					stmt3.execute();
					stmt4.execute();
					JOptionPane.showMessageDialog(null,"You have successfully Registered...Please Login to proceed");
					login l = new login();
				}
				else{
					JOptionPane.showMessageDialog(null,"THIS USERNAME ALREAY EXIST.PLEASE INSERT ANOTHER","INVALID USERNAME",JOptionPane.ERROR_MESSAGE);
				}

			}catch(Exception e){
				System.out.println(e);
			}
		}
			else{
				JOptionPane.showMessageDialog(null, "Please fill all the information");
			}
	}
}
}


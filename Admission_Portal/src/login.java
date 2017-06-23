
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class login extends JFrame implements ActionListener{
	JLabel l1,l2,l3;
	JButton jb,jb2,jb3;
	JTextField jtf;
	JPasswordField jp;
	JFrame jfr = new JFrame("Login Form");
	login(){
		//JFrame jfr = new JFrame("Login Form");
		jfr.setLayout(null);
		jfr.getContentPane().setBackground(Color.LIGHT_GRAY);
		jfr.setContentPane(new JLabel(new ImageIcon("C:/Users/JenilM/Downloads/lnmiit.jpg")));
		jfr.setSize(800, 532);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		l1 = new JLabel("LNMIIT");
		l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 50));
 
		l2 = new JLabel("User ID");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Serif", Font.BOLD, 20));
		l3 = new JLabel("Password");
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Serif", Font.BOLD, 20));
		jtf = new JTextField();
		jp = new JPasswordField();
		jb = new JButton("Sign In");
		jb2 = new JButton("Register");
		jb3 = new JButton("Status");
		
		 l1.setBounds(250, 10, 1500, 90);
	     l2.setBounds(150, 110, 200, 30);
	     l3.setBounds(150, 160, 200, 30);
	     jtf.setBounds(370, 110, 200, 30);
	     jp.setBounds(370, 160, 200, 30);
	     jb.setBounds(220, 250, 100, 30);
	     jb2.setBounds(370, 250, 100, 30);
	     jb3.setBounds(295, 290, 100, 30);
	     
	     jfr.add(l1);
	     jfr.add(l2);
	     jfr.add(jtf);
	     jfr.add(l3);
	     jfr.add(jp);
	     jfr.add(jb);
	     jb.addActionListener(this);
	     jfr.add(jb2);
	     jb2.addActionListener(this);
	     jfr.add(jb3);
	     jb3.addActionListener(this);
	     jfr.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		String str = e.getActionCommand();
		showdata(str);
	}
	
	public void showdata(String str){
		
		String str1 = jtf.getText();
		char[] p = jp.getPassword();
		String pass = new String(p);
		if(str.equals("Sign In")){
		JFrame jf1 = new JFrame();
		jf1.setLayout(null);
		JLabel l,l0;
		
		
		
		try{
			//Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = DriverManager.getConnection("jdbc:db2://localhost:50000/ADMI","JenilM","jenil@1038");
			//Connection co = new Connect().conn();
			PreparedStatement stmt = con.prepareStatement("SELECT PASSWORD FROM LOGIN where ID='"+str1+"'");
			//String st = "SELECT PASSWORD FROM LOGIN where ID='"+str1+"'";
			
			stmt.executeQuery();
			ResultSet rs = stmt.getResultSet();
			String name = null;
			while(rs.next()){
			name = rs.getString("password");
			}
		if(pass.equals(name)){
			information2 i = new information2(str1);
			//Eligibility e = new Eligibility(str1);
			//Branch b = new Branch(str1);
			/*jf1.setVisible(true);
			jf1.setSize(600, 600);
			l = new JLabel();
			l0 = new JLabel("You Have Successffully Logged In");
			l0.setForeground(Color.blue);
            l0.setFont(new Font("Serif", Font.BOLD, 20));
            l.setBounds(60, 50, 400, 30);
            l0.setBounds(60, 100, 400, 40);
            
            jf1.add(l0);
            jf1.add(l);
            l.setText("Welcome "+str1);
            l.setForeground(Color.RED);*/
			jfr.setVisible(false);
		}
		
		else
		{
			JOptionPane.showMessageDialog(null,"Incorrect email-Id or password..Try Again with correct detail");
		}
	}catch(Exception e){
		 System.out.println(e);
	}
		}
		if(str.equals("Register")){
			jfr.setVisible(false);
			Register r = new Register();
		}
		if(str.equals("Status")){
			try{
				//Class.forName("com.ibm.db2.jcc.DB2Driver");
				Connection cone = DriverManager.getConnection("jdbc:db2://localhost:50000/ADMI","JenilM","jenil@1038");
				//Connection co = new Connect().conn();
				PreparedStatement pstmt = cone.prepareStatement("SELECT PASSWORD FROM LOGIN where ID='"+str1+"'");
				//String st = "SELECT PASSWORD FROM LOGIN where ID='"+str1+"'";
				
				pstmt.executeQuery();
				ResultSet rsl = pstmt.getResultSet();
				String name2 = null;
				while(rsl.next()){
				name2 = rsl.getString("password");
				}
				
				if(pass.equals(name2)){
					jfr.setVisible(false);
					Status st = new Status(str1);
				}
				
				else{
					JOptionPane.showMessageDialog(null,"Incorrect email-Id or password..Try Again with correct detail");
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	
	public static void main(String args[]){
		new login();
	}
}



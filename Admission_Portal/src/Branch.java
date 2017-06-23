
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JSeparator;


public class Branch extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField_1st;
	private JTextField textField_2nd;
	private JTextField textField_3rd;
	private JTextField textField_4th;
	private String user3;
	private ArrayList<String> ar=new ArrayList<String>();
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Branch(String s) {
		user3=s;	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBranchPrefrence = new JLabel("Branch Prefrence:");
		lblBranchPrefrence.setFont(new Font("Serif", Font.BOLD, 15));
		lblBranchPrefrence.setBounds(10, 11, 158, 29);
		contentPane.add(lblBranchPrefrence);
		
		JLabel lblBranchesAvailable = new JLabel("Branches available: CSE/ECE/CCE/MME");
		lblBranchesAvailable.setForeground(Color.RED);
		lblBranchesAvailable.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblBranchesAvailable.setBounds(20, 54, 289, 14);
		contentPane.add(lblBranchesAvailable);
		
		JLabel lblstPrefrence = new JLabel("1st Prefrence*");
		lblstPrefrence.setBounds(30, 94, 78, 14);
		contentPane.add(lblstPrefrence);
		
		textField_1st = new JTextField();
		textField_1st.setBounds(118, 91, 86, 20);
		contentPane.add(textField_1st);
		textField_1st.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(20, 119, 46, 14);
		contentPane.add(label);
		
		JLabel lblndPrefrence = new JLabel("2nd Prefrence*");
		lblndPrefrence.setBounds(30, 133, 78, 14);
		contentPane.add(lblndPrefrence);
		
		textField_2nd = new JTextField();
		textField_2nd.setBounds(118, 130, 86, 20);
		contentPane.add(textField_2nd);
		textField_2nd.setColumns(10);
		
		JLabel lblrdPrefrence = new JLabel("3rd Prefrence*");
		lblrdPrefrence.setBounds(30, 171, 78, 14);
		contentPane.add(lblrdPrefrence);
		
		textField_3rd = new JTextField();
		textField_3rd.setBounds(118, 168, 86, 20);
		contentPane.add(textField_3rd);
		textField_3rd.setColumns(10);
		
		JLabel lblthPrefrence = new JLabel("4th Prefrence*");
		lblthPrefrence.setBounds(30, 210, 78, 14);
		contentPane.add(lblthPrefrence);
		
		textField_4th = new JTextField();
		textField_4th.setBounds(118, 207, 86, 20);
		contentPane.add(textField_4th);
		textField_4th.setColumns(10);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setBounds(244, 238, 89, 23);
		btnFinish.addActionListener(this);
		contentPane.add(btnFinish);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.RED);
		separator.setBackground(Color.YELLOW);
		separator.setBounds(0, 18, 424, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.YELLOW);
		separator_1.setForeground(Color.RED);
		separator_1.setBounds(0, 38, 424, 2);
		contentPane.add(separator_1);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(115, 238, 89, 23);
		btnChange.addActionListener(this);
		contentPane.add(btnChange);
		
		ar.add("CSE");
		ar.add("ECE");
		ar.add("MME");
		ar.add("CCE");
		
		try{
			Connection coo = new Connect().conn();
			PreparedStatement p = coo.prepareStatement("SELECT * FROM BRANCH WHERE ID='"+user3+"'");
			ResultSet r = p.executeQuery();
			if(r.next())
			{
				textField_1st.setText(r.getString("FIRST_PREF"));
				textField_2nd.setText(r.getString("SECOND_PREF"));
				textField_3rd.setText(r.getString("THIRD_PREF"));
				textField_4th.setText(r.getString("FOUTH_PREF"));
			}
		}
		catch(Exception e){
			System.out.println(e);
			}
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String aes = ae.getActionCommand();
		showdata(aes);
	}
	public void showdata(String pushed){
	 if(pushed.equals("Finish")){
		 int count = 0;
			try{
				Connection co7 = DriverManager.getConnection("jdbc:db2://localhost:50000/ADMI","JenilM","jenil@1038");
				PreparedStatement pres = co7.prepareStatement("SELECT ID FROM BRANCH WHERE ID='"+user3+"'");
				ResultSet res = pres.executeQuery();
				if(!res.next()){
				if(!textField_1st.getText().equals("") && !textField_2nd.getText().equals("") && !textField_3rd.getText().equals("") && !textField_4th.getText().equals("")){
					if(ar.contains(textField_1st.getText())){
						System.out.println(ar);
					}
					if(ar.contains(textField_1st.getText())&& ar.contains(textField_2nd.getText())&& ar.contains(textField_3rd.getText()) && ar.contains(textField_4th.getText())){
					PreparedStatement stm = co7.prepareStatement("INSERT INTO BRANCH VALUES('"+user3+"', '"+textField_1st.getText()+"', '"+textField_2nd.getText()+"', '"+textField_3rd.getText()+"', '"+textField_4th.getText()+"')");
					stm.execute();
					count++;
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Branches availabe are CSE/ECE/MME/CCE");
					}
				}
				else
				{
					
					JOptionPane.showMessageDialog(null,"Please fill all the mandatory Prefrences");
				}
				if(count==1)
				{
					this.setVisible(false);
					JOptionPane.showMessageDialog(null,"All the information has been successfully saved.");
				}
				}
				//else if(!textField_1st.getText().equals("") || !textField_2nd.getText().equals("") || !textField_3rd.getText().equals("") || !textField_4th.getText().equals("")){
					// JOptionPane.showMessageDialog(null,"You have already filled this informations....please click change to change information");
				 //}
				else{
					this.setVisible(false);
					JOptionPane.showMessageDialog(null,"All the information has been successfully saved.");
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
	  }
	 if(pushed.equals("Change")){
			try{
				Connection coec4 = new Connect().conn();
				PreparedStatement pretm1 = coec4.prepareStatement("DELETE FROM BRANCH WHERE ID='"+user3+"'");
				pretm1.execute();
			
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	
	}
}
	
	
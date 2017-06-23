

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JSeparator;
import java.sql.*;
import java.util.HashMap;


public class information2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tffn;
	private JTextField tfln;
	private JTextField tffan;
	private JTextField tfmon;
	private JTextField tfeid;
	private JTextField tfmno;
	private JTextField tfdob;
	private JTextField tfca;
	private JTextField tfcc;
	private JTextField tfcs;
	private JTextField tfcd;
	private JTextField tfcv;
	private JTextField tfcz;
	private JTextField tfpa;
	private JTextField tfpc;
	private JTextField tfpd;
	private JTextField tfpz;
	private JTextField tfps;
	private JTextField tfpv;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JRadioButton rdbtnSameAsAbove;
	String user;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public information2(String str) {
		user = str;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 649);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblApplicantsDetails = new JLabel("APPLICANT'S DETAILS");
		lblApplicantsDetails.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
		lblApplicantsDetails.setBounds(121, 11, 349, 30);
		panel.add(lblApplicantsDetails);
		
		JLabel lblNoteFields = new JLabel("Note :* Fields are mandatory");
		lblNoteFields.setForeground(Color.RED);
		lblNoteFields.setBounds(10, 52, 152, 14);
		panel.add(lblNoteFields);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setBackground(Color.ORANGE);
		lblPersonalDetails.setFont(new Font("Serif", Font.BOLD, 15));
		lblPersonalDetails.setBounds(10, 77, 561, 21);
		panel.add(lblPersonalDetails);
		
		JLabel lblFirstName = new JLabel("First Name*");
		lblFirstName.setBounds(20, 109, 89, 14);
		panel.add(lblFirstName);
		
		tffn = new JTextField();
		tffn.setBounds(137, 106, 86, 20);
		panel.add(tffn);
		tffn.setColumns(10);
		//tffn.setEditable(false);
		
		JLabel lblLastName = new JLabel("Last Name*");
		lblLastName.setBounds(337, 109, 94, 14);
		panel.add(lblLastName);
		
		tfln = new JTextField();
		tfln.setBounds(455, 106, 86, 20);
		panel.add(tfln);
		tfln.setColumns(10);
		//tfln.setEditable(false);
		
		JLabel lblFathersName = new JLabel("Father's Name*");
		lblFathersName.setBounds(20, 145, 107, 14);
		panel.add(lblFathersName);
		
		tffan = new JTextField();
		tffan.setBounds(137, 137, 86, 20);
		panel.add(tffan);
		tffan.setColumns(10);
		//tffan.setEditable(false);
		
		JLabel lblMothersName = new JLabel("Mother's Name*");
		lblMothersName.setBounds(335, 145, 110, 14);
		panel.add(lblMothersName);
		
		tfmon = new JTextField();
		tfmon.setBounds(455, 137, 86, 20);
		panel.add(tfmon);
		tfmon.setColumns(10);
		//tfmon.setEditable(false);
		
		JLabel lblEmailId = new JLabel("Email ID*");
		lblEmailId.setBounds(20, 171, 71, 14);
		panel.add(lblEmailId);
		
		tfeid = new JTextField();
		tfeid.setBounds(137, 168, 86, 20);
		panel.add(tfeid);
		tfeid.setColumns(10);
		//tfeid.setEditable(false);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setBounds(337, 171, 94, 14);
		panel.add(lblMobileNo);
		
		tfmno = new JTextField();
		tfmno.setBounds(455, 168, 86, 20);
		panel.add(tfmno);
		tfmno.setColumns(10);
		//tfmno.setEditable(false);
		
		JLabel lblDob = new JLabel("DOB(yyyy-mm-dd)*");
		lblDob.setBounds(20, 202, 107, 14);
		panel.add(lblDob);
		
		tfdob = new JTextField();
		tfdob.setBounds(137, 199, 86, 20);
		panel.add(tfdob);
		tfdob.setColumns(10);
		//tfdob.setEditable(false);
		
		JLabel lblGender = new JLabel("Gender*");
		lblGender.setBounds(335, 202, 71, 14);
		panel.add(lblGender);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(455, 198, 52, 23);
		panel.add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(509, 198, 62, 23);
		panel.add(rdbtnFemale);
		
		JLabel lblAddressDetails = new JLabel("Address Details");
		lblAddressDetails.setFont(new Font("Serif", Font.BOLD, 15));
		lblAddressDetails.setBounds(10, 247, 117, 21);
		panel.add(lblAddressDetails);
		
		JLabel lblCorrespondanceAddress = new JLabel("Correspondance Address");
		lblCorrespondanceAddress.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblCorrespondanceAddress.setBounds(20, 279, 158, 14);
		panel.add(lblCorrespondanceAddress);
		
		JLabel lblAddress = new JLabel("Address*");
		lblAddress.setBounds(20, 304, 71, 14);
		panel.add(lblAddress);
		
		tfca = new JTextField();
		tfca.setBounds(137, 304, 284, 20);
		panel.add(tfca);
		tfca.setColumns(10);
		//tfca.setEditable(false);
		
		JLabel lblCountry = new JLabel("Country*");
		lblCountry.setBounds(20, 334, 71, 14);
		panel.add(lblCountry);
		
		tfcc = new JTextField();
		tfcc.setBounds(137, 331, 86, 20);
		panel.add(tfcc);
		tfcc.setColumns(10);
		//tfcc.setEditable(false);
		
		JLabel lblState = new JLabel("State*");
		lblState.setBounds(337, 335, 69, 14);
		panel.add(lblState);
		
		tfcs = new JTextField();
		tfcs.setBounds(455, 331, 86, 20);
		panel.add(tfcs);
		tfcs.setColumns(10);
		//tfcs.setEditable(false);
		
		JLabel lblDistrict = new JLabel("District*");
		lblDistrict.setBounds(20, 359, 71, 14);
		panel.add(lblDistrict);
		
		tfcd = new JTextField();
		tfcd.setBounds(137, 356, 86, 20);
		panel.add(tfcd);
		tfcd.setColumns(10);
		//tfcd.setEditable(false);
		
		JLabel lblCityvillage = new JLabel("City/Village*");
		lblCityvillage.setBounds(335, 359, 96, 14);
		panel.add(lblCityvillage);
		
		tfcv = new JTextField();
		tfcv.setBounds(455, 356, 86, 20);
		panel.add(tfcv);
		tfcv.setColumns(10);
		//tfcv.setEditable(false);
		
		JLabel lblZippin = new JLabel("ZIP/PIN*");
		lblZippin.setBounds(20, 384, 71, 14);
		panel.add(lblZippin);
		
		tfcz = new JTextField();
		tfcz.setBounds(137, 381, 86, 20);
		panel.add(tfcz);
		tfcz.setColumns(10);
		//tfcz.setEditable(false);
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address");
		lblPermanentAddress.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblPermanentAddress.setBounds(20, 409, 142, 14);
		panel.add(lblPermanentAddress);
		
		JLabel lblAddress_1 = new JLabel("Address*");
		lblAddress_1.setBounds(20, 434, 71, 14);
		panel.add(lblAddress_1);
		
		tfpa = new JTextField();
		tfpa.setBounds(137, 431, 284, 20);
		panel.add(tfpa);
		tfpa.setColumns(10);
		//tfpa.setEditable(false);
		
		JLabel lblCountry_1 = new JLabel("Country*");
		lblCountry_1.setBounds(20, 463, 71, 14);
		panel.add(lblCountry_1);
		
		tfpc = new JTextField();
		tfpc.setBounds(137, 460, 86, 20);
		panel.add(tfpc);
		tfpc.setColumns(10);
		//tfpc.setEditable(false);
		
		JLabel lblDistrict_1 = new JLabel("District*");
		lblDistrict_1.setBounds(20, 488, 71, 14);
		panel.add(lblDistrict_1);
		
		tfpd = new JTextField();
		tfpd.setBounds(137, 485, 86, 20);
		panel.add(tfpd);
		tfpd.setColumns(10);
		//tfpd.setEditable(false);
		
		JLabel lblZippin_1 = new JLabel("ZIP/PIN*");
		lblZippin_1.setBounds(20, 513, 71, 14);
		panel.add(lblZippin_1);
		
		tfpz = new JTextField();
		tfpz.setBounds(137, 510, 86, 20);
		panel.add(tfpz);
		tfpz.setColumns(10);
		//tfpz.setEditable(false);
		
		JLabel lblState_1 = new JLabel("State*");
		lblState_1.setBounds(337, 463, 69, 14);
		panel.add(lblState_1);
		
		tfps = new JTextField();
		tfps.setBounds(455, 460, 86, 20);
		panel.add(tfps);
		tfps.setColumns(10);
		//tfps.setEditable(false);
		
		JLabel lblCityvillage_1 = new JLabel("City/Village*");
		lblCityvillage_1.setBounds(335, 488, 96, 14);
		panel.add(lblCityvillage_1);
		
		tfpv = new JTextField();
		tfpv.setBounds(455, 485, 86, 20);
		panel.add(tfpv);
		tfpv.setColumns(10);
		//tfpv.setEditable(false);
		
		JButton btnNext = new JButton("Next>>");
		btnNext.setBounds(366, 554, 89, 23);
		btnNext.addActionListener(this);
		panel.add(btnNext);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.YELLOW);
		separator.setForeground(Color.RED);
		separator.setBounds(10, 99, 571, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.YELLOW);
		separator_1.setForeground(Color.RED);
		separator_1.setBounds(10, 77, 571, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.YELLOW);
		separator_2.setForeground(Color.RED);
		separator_2.setBounds(10, 247, 561, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.YELLOW);
		separator_3.setForeground(Color.RED);
		separator_3.setBounds(10, 266, 561, 2);
		panel.add(separator_3);
		
		rdbtnSameAsAbove = new JRadioButton("Same As Above");
		rdbtnSameAsAbove.setBounds(147, 406, 109, 23);
		rdbtnSameAsAbove.addActionListener(this);
		panel.add(rdbtnSameAsAbove);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(250, 554, 89, 23);
		btnChange.addActionListener(this);
		panel.add(btnChange);
		
		try{
			Connection coo = new Connect().conn();
			PreparedStatement p = coo.prepareStatement("SELECT * FROM STUDENT WHERE ID='"+user+"'");
			ResultSet r = p.executeQuery();
			PreparedStatement p2 = coo.prepareStatement("SELECT * FROM CURRENT_ADDRESS WHERE ID='"+user+"'");
			ResultSet r2 = p2.executeQuery();
			if(r.next()){
				tffn.setText(r.getString("FNAME"));
				tfln.setText(r.getString("LNAME"));
				tfdob.setText(r.getString("DOB"));
				tffan.setText(r.getString("FATHERNAME"));
				tfmon.setText(r.getString("MOTHERNAME"));
				tfmno.setText(""+r.getLong("MOBILENO"));
				tfeid.setText(r.getString("EID"));
				}
		    
			
			if(r2.next()){
				tfca.setText(r2.getString("ADDLINE_ONE"));
				tfcv.setText(r2.getString("ADD_CITY"));
				tfcs.setText(r2.getString("ADD_STATE"));
				tfcc.setText(r2.getString("ADD_COUNTRY"));
				tfcz.setText(Integer.toString(r2.getInt("ADD_ZIP")));
				tfcd.setText(r2.getString("ADD_DISTRICT"));
			    }
		    
			PreparedStatement p3 = coo.prepareStatement("SELECT * FROM PERMANENT_ADDRESS WHERE ID='"+user+"'");
			ResultSet r3 = p3.executeQuery();
			if(r3.next()){
				tfpa.setText(r3.getString("ADDLINE_ONE"));
				tfpv.setText(r3.getString("ADD_CITY"));
				tfps.setText(r3.getString("ADD_STATE"));
				tfpc.setText(r3.getString("ADD_COUNTRY"));
				tfpz.setText(Integer.toString(r3.getInt("ADD_ZIP")));
				tfpd.setText(r3.getString("ADD_DISTRICT"));
			    }
		}
		catch(Exception e){
			System.out.println(e);
		}
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		String str = ae.getActionCommand();
		showdata(str);
	}
	
	public void showdata(String str){
		if(rdbtnSameAsAbove.isSelected()){
			tfpa.setEditable(false);
			tfpc.setEditable(false);
			tfps.setEditable(false);
			tfpd.setEditable(false);
			tfpv.setEditable(false);
			tfpz.setEditable(false);
		}
		if(!rdbtnSameAsAbove.isSelected()){
			tfpa.setEditable(true);
			tfpc.setEditable(true);
			tfps.setEditable(true);
			tfpd.setEditable(true);
			tfpv.setEditable(true);
			tfpz.setEditable(true);
		}
		if(str.equals("Next>>")){
			int count=0;
			try{
				Connection co5 = DriverManager.getConnection("jdbc:db2://localhost:50000/ADMI","JenilM","jenil@1038");
				
				PreparedStatement pst1,pst0;
				pst0 = co5.prepareStatement("INSERT INTO STUDENT VALUES('"+user+"', '"+tffn.getText()+"', '"+tfln.getText()+"', '"+tfdob.getText()+"', '"+"M"+"', '"+tffan.getText()+"', '"+tfmon.getText()+"', "+tfmno.getText()+", '"+tfeid.getText()+"')");
				pst1 = co5.prepareStatement("INSERT INTO STUDENT VALUES('"+user+"', '"+tffn.getText()+"', '"+tfln.getText()+"', '"+tfdob.getText()+"', '"+"F"+"', '"+tffan.getText()+"', '"+tfmon.getText()+"', "+tfmno.getText()+", '"+tfeid.getText()+"')");
				PreparedStatement pst2 = co5.prepareStatement("INSERT INTO CURRENT_ADDRESS VALUES('"+user+"', '"+tfca.getText()+"', '"+tfcv.getText()+"', '"+tfcs.getText()+"', '"+tfcc.getText()+"', "+tfcz.getText()+", '"+tfcd.getText()+"', "+"0"+")");				PreparedStatement pst3 = co5.prepareStatement("INSERT INTO PERMANENT_ADDRESS VALUES('"+user+"', '"+tfpa.getText()+"', '"+tfpv.getText()+"', '"+tfps.getText()+"', '"+tfpc.getText()+"', "+tfpz.getText()+", '"+tfpd.getText()+"')");		
				PreparedStatement pst4 = co5.prepareStatement("INSERT INTO CURRENT_ADDRESS VALUES('"+user+"', '"+tfca.getText()+"', '"+tfcv.getText()+"', '"+tfcs.getText()+"', '"+tfcc.getText()+"', "+tfcz.getText()+", '"+tfcd.getText()+"', "+"1"+")");
				PreparedStatement pst5 = co5.prepareStatement("SELECT ID FROM PERMANENT_ADDRESS WHERE ID='"+user+"'");
				PreparedStatement pst6 = co5.prepareStatement("SELECT ID FROM CURRENT_ADDRESS WHERE ID='"+user+"'");
				PreparedStatement pst7 = co5.prepareStatement("SELECT ID FROM STUDENT WHERE ID='"+user+"'");
				ResultSet rs1 = pst5.executeQuery();
				ResultSet rs2 = pst6.executeQuery();
				ResultSet rs3 = pst7.executeQuery();
				if(!rs1.next() && !rs2.next() && !rs3.next()){
					
				if(!tffn.getText().equals("") && !tfln.getText().equals("") && !tffan.getText().equals("") && !tfmon.getText().equals("") && !tfeid.getText().equals("") && !tfdob.getText().equals("") && !tfmno.getText().equals("")){
				if((rdbtnMale.isSelected() && rdbtnFemale.isSelected()) || (!rdbtnMale.isSelected() && !rdbtnFemale.isSelected())){
					JOptionPane.showMessageDialog(null,"Please Select any one gender");
				}
				else if(rdbtnMale.isSelected()){
				pst0.execute();
				count++;
				}
				else{
					
				pst1.execute();
				count++;
				}
				}
				else{
					JOptionPane.showMessageDialog(null,"Please fill all the mandatory information in personal details");
				}
				if(!tfca.getText().equals("") && !tfcc.getText().equals("") && !tfcs.getText().equals("") && !tfcd.getText().equals("") && !tfcv.getText().equals("") && !tfcz.getText().equals("")){
				if(rdbtnSameAsAbove.isSelected()){
				pst4.execute();
				count++;
				count++;
				}
				else{
					pst2.execute();
					count++;
				}
				}
				else{
					JOptionPane.showMessageDialog(null,"Please Fill all the mandatory information in correspondance details");
				}
				if(!rdbtnSameAsAbove.isSelected()){
				if(!tfpa.getText().equals("") && !tfpc.getText().equals("") && !tfps.getText().equals("") && !tfpd.getText().equals("") && !tfpv.getText().equals("") && !tfpz.getText().equals("")){
				
				pst3.execute();
				count++;
				}
				else{
					JOptionPane.showMessageDialog(null,"Please Fill all the mandatory information in Permanent details");	
				}
				}
				System.out.println(count);
				if(count == 3){
					this.setVisible(false);
					Eligibility e = new Eligibility(user);
				}
			}
				//else if(!tffn.getText().equals("") || !tfln.getText().equals("") || !tffan.getText().equals("") || !tfmon.getText().equals("") || !tfeid.getText().equals("") || !tfdob.getText().equals("") || !tfmno.getText().equals("") || !tfca.getText().equals("") || !tfcc.getText().equals("") || !tfcs.getText().equals("") || !tfcd.getText().equals("") || !tfcv.getText().equals("") || !tfcz.getText().equals("") || !tfpa.getText().equals("") || !tfpc.getText().equals("") || !tfps.getText().equals("") || !tfpd.getText().equals("") || !tfpv.getText().equals("") || !tfpz.getText().equals("")){
					//JOptionPane.showMessageDialog(null,"You have Already filled information....please click change to change");
				//}
				else{
					this.setVisible(false);
					Eligibility e2 = new Eligibility(user);
					//JOptionPane.showMessageDialog(null,"you have already filled all the information");
				}
				}
			catch(Exception e){
				System.out.println(e);
			}
		}
		if(str.equals("Change")){
			try{
				Connection coe2 = new Connect().conn();
				PreparedStatement pre1 = coe2.prepareStatement("DELETE FROM STUDENT WHERE ID='"+user+"'");
				PreparedStatement pre2 = coe2.prepareStatement("DELETE FROM PERMANENT_ADDRESS WHERE ID='"+user+"'");
				PreparedStatement pre3 = coe2.prepareStatement("DELETE FROM CURRENT_ADDRESS WHERE ID='"+user+"'");
				pre1.execute();
				pre2.execute();
				pre3.execute();
			
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}




import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JSeparator;
import java.sql.*; 
import java.util.HashMap;


public class Eligibility extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfjrn;
	private JTextField tfjpm;
	private JTextField tfjcm;
	private JTextField tfjmm;
	private JTextField tfjr;
	private JTextField tf10sb;
	private JTextField tf10sn;
	private JTextField tf10sa;
	private JTextField tf10c;
	private JTextField tf10s;
	private JTextField tf10d;
	private JTextField tf10v;
	private JTextField tf10p;
	private JTextField tf10mo;
	private JTextField tf10mm;
	private JTextField tf10pe;
	private JTextField tf12sb;
	private JTextField tf12sn;
	private JTextField tf12sa;
	private JTextField tf12c;
	private JTextField tf12s;
	private JTextField tf12d;
	private JTextField tf12v;
	private JTextField tf12p;
	private JTextField tf12pm;
	private JTextField tf12cm;
	private JTextField tf12mm;
	private JTextField tf12tp;
	private JButton btnNext;
	private String user2;
	HashMap<String,Integer> hm2;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Eligibility(String s) {
		user2 = s;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 744);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eligibilty Details");
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 115, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblJeemainInformaion = new JLabel("JEE(Main) Informaion");
		lblJeemainInformaion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblJeemainInformaion.setBounds(20, 46, 149, 14);
		contentPane.add(lblJeemainInformaion);
		
		JLabel lblJeemainRollNo = new JLabel("JEE(Main) Roll No.*");
		lblJeemainRollNo.setBounds(30, 71, 106, 14);
		contentPane.add(lblJeemainRollNo);
		
		tfjrn = new JTextField();
		tfjrn.setBounds(39, 96, 86, 20);
		contentPane.add(tfjrn);
		tfjrn.setColumns(10);
		
		JLabel lblPhysicsMarks = new JLabel("Physics Marks*");
		lblPhysicsMarks.setBounds(146, 71, 95, 14);
		contentPane.add(lblPhysicsMarks);
		
		tfjpm = new JTextField();
		tfjpm.setBounds(145, 96, 86, 20);
		contentPane.add(tfjpm);
		tfjpm.setColumns(10);
		
		JLabel lblChemistryMarks = new JLabel("Chemistry Marks*");
		lblChemistryMarks.setBounds(252, 71, 106, 14);
		contentPane.add(lblChemistryMarks);
		
		tfjcm = new JTextField();
		tfjcm.setBounds(252, 96, 86, 20);
		contentPane.add(tfjcm);
		tfjcm.setColumns(10);
		
		JLabel lblMathematicsMarks = new JLabel("Mathematics Marks*");
		lblMathematicsMarks.setBounds(364, 71, 123, 14);
		contentPane.add(lblMathematicsMarks);
		
		tfjmm = new JTextField();
		tfjmm.setBounds(364, 96, 86, 20);
		contentPane.add(tfjmm);
		tfjmm.setColumns(10);
		
		JLabel lblJeemainRank = new JLabel("JEE(main) Rank*");
		lblJeemainRank.setBounds(491, 71, 111, 14);
		contentPane.add(lblJeemainRank);
		
		tfjr = new JTextField();
		tfjr.setBounds(487, 96, 86, 20);
		contentPane.add(tfjr);
		tfjr.setColumns(10);
		
		JLabel lblthStandard = new JLabel("10th Standard");
		lblthStandard.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblthStandard.setBounds(20, 133, 105, 14);
		contentPane.add(lblthStandard);
		
		JLabel lblSchoolBoard = new JLabel("School Board*");
		lblSchoolBoard.setBounds(42, 154, 83, 14);
		contentPane.add(lblSchoolBoard);
		
		tf10sb = new JTextField();
		tf10sb.setBounds(145, 151, 86, 20);
		contentPane.add(tf10sb);
		tf10sb.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("School Name*");
		lblNewLabel_1.setBounds(41, 178, 84, 14);
		contentPane.add(lblNewLabel_1);
		
		tf10sn = new JTextField();
		tf10sn.setBounds(145, 175, 238, 20);
		contentPane.add(tf10sn);
		tf10sn.setColumns(10);
		
		JLabel lblSchoolAddress = new JLabel("School Address*");
		lblSchoolAddress.setBounds(41, 203, 95, 14);
		contentPane.add(lblSchoolAddress);
		
		tf10sa = new JTextField();
		tf10sa.setBounds(146, 206, 237, 20);
		contentPane.add(tf10sa);
		tf10sa.setColumns(10);
		
		JLabel lblCountry = new JLabel("Country*");
		lblCountry.setBounds(41, 236, 67, 14);
		contentPane.add(lblCountry);
		
		tf10c = new JTextField();
		tf10c.setBounds(145, 237, 86, 20);
		contentPane.add(tf10c);
		tf10c.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("State*");
		lblNewLabel_2.setBounds(356, 240, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		tf10s = new JTextField();
		tf10s.setBounds(423, 237, 86, 20);
		contentPane.add(tf10s);
		tf10s.setColumns(10);
		
		JLabel lblDistrict = new JLabel("District*");
		lblDistrict.setBounds(41, 264, 46, 14);
		contentPane.add(lblDistrict);
		
		tf10d = new JTextField();
		tf10d.setBounds(145, 261, 86, 20);
		contentPane.add(tf10d);
		tf10d.setColumns(10);
		
		JLabel lblCityvillage = new JLabel("City/Village*");
		lblCityvillage.setBounds(356, 264, 67, 14);
		contentPane.add(lblCityvillage);
		
		tf10v = new JTextField();
		tf10v.setBounds(423, 261, 86, 20);
		contentPane.add(tf10v);
		tf10v.setColumns(10);
		
		JLabel lblPinCode = new JLabel("Pin Code*");
		lblPinCode.setBounds(41, 291, 46, 14);
		contentPane.add(lblPinCode);
		
		tf10p = new JTextField();
		tf10p.setBounds(146, 288, 86, 20);
		contentPane.add(tf10p);
		tf10p.setColumns(10);
		
		JLabel lblTotalMarksObtained = new JLabel("Total Marks Obtained*");
		lblTotalMarksObtained.setBounds(78, 334, 142, 14);
		contentPane.add(lblTotalMarksObtained);
		
		tf10mo = new JTextField();
		tf10mo.setBounds(96, 360, 86, 20);
		contentPane.add(tf10mo);
		tf10mo.setColumns(10);
		
		JLabel lblMaximumMarks = new JLabel("Maximum Marks*");
		lblMaximumMarks.setBounds(236, 334, 102, 14);
		contentPane.add(lblMaximumMarks);
		
		tf10mm = new JTextField();
		tf10mm.setBounds(236, 360, 86, 20);
		contentPane.add(tf10mm);
		tf10mm.setColumns(10);
		
		JLabel lblPercentage = new JLabel("Percentage*");
		lblPercentage.setBounds(376, 334, 86, 14);
		contentPane.add(lblPercentage);
		
		tf10pe = new JTextField();
		tf10pe.setBounds(364, 360, 86, 20);
		contentPane.add(tf10pe);
		tf10pe.setColumns(10);
		
		JLabel lblthStandard_1 = new JLabel("12th Standard");
		lblthStandard_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblthStandard_1.setBounds(20, 392, 105, 14);
		contentPane.add(lblthStandard_1);
		
		JLabel lblSchoolBoard_1 = new JLabel("School Board*");
		lblSchoolBoard_1.setBounds(41, 417, 84, 14);
		contentPane.add(lblSchoolBoard_1);
		
		tf12sb = new JTextField();
		tf12sb.setBounds(146, 414, 86, 20);
		contentPane.add(tf12sb);
		tf12sb.setColumns(10);
		
		JLabel lblSchoolName = new JLabel("School Name*");
		lblSchoolName.setBounds(41, 443, 84, 14);
		contentPane.add(lblSchoolName);
		
		tf12sn = new JTextField();
		tf12sn.setBounds(145, 440, 238, 20);
		contentPane.add(tf12sn);
		tf12sn.setColumns(10);
		
		JLabel lblSchoolAddress_1 = new JLabel("School Address*");
		lblSchoolAddress_1.setBounds(41, 474, 95, 14);
		contentPane.add(lblSchoolAddress_1);
		
		tf12sa = new JTextField();
		tf12sa.setBounds(146, 471, 237, 20);
		contentPane.add(tf12sa);
		tf12sa.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Country*");
		lblNewLabel_3.setBounds(41, 503, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		tf12c = new JTextField();
		tf12c.setBounds(145, 500, 86, 20);
		contentPane.add(tf12c);
		tf12c.setColumns(10);
		
		JLabel lblState = new JLabel("State*");
		lblState.setBounds(356, 503, 46, 14);
		contentPane.add(lblState);
		
		tf12s = new JTextField();
		tf12s.setBounds(423, 500, 86, 20);
		contentPane.add(tf12s);
		tf12s.setColumns(10);
		
		JLabel lblDistrict_1 = new JLabel("District*");
		lblDistrict_1.setBounds(41, 531, 46, 14);
		contentPane.add(lblDistrict_1);
		
		tf12d = new JTextField();
		tf12d.setBounds(145, 528, 86, 20);
		contentPane.add(tf12d);
		tf12d.setColumns(10);
		
		JLabel lblCityvillage_1 = new JLabel("City/Village*");
		lblCityvillage_1.setBounds(356, 534, 67, 14);
		contentPane.add(lblCityvillage_1);
		
		tf12v = new JTextField();
		tf12v.setBounds(423, 531, 86, 20);
		contentPane.add(tf12v);
		tf12v.setColumns(10);
		
		JLabel lblPinCode_1 = new JLabel("Pin Code*");
		lblPinCode_1.setBounds(41, 564, 46, 14);
		contentPane.add(lblPinCode_1);
		
		tf12p = new JTextField();
		tf12p.setBounds(145, 561, 86, 20);
		contentPane.add(tf12p);
		tf12p.setColumns(10);
		
		JLabel lblPhysicsMarks_1 = new JLabel("Physics Marks*");
		lblPhysicsMarks_1.setBounds(65, 610, 71, 14);
		contentPane.add(lblPhysicsMarks_1);
		
		tf12pm = new JTextField();
		tf12pm.setBounds(63, 635, 86, 20);
		contentPane.add(tf12pm);
		tf12pm.setColumns(10);
		
		JLabel lblChemistryMarks_1 = new JLabel("Chemistry Marks*");
		lblChemistryMarks_1.setBounds(161, 610, 118, 14);
		contentPane.add(lblChemistryMarks_1);
		
		tf12cm = new JTextField();
		tf12cm.setBounds(174, 635, 86, 20);
		contentPane.add(tf12cm);
		tf12cm.setColumns(10);
		
		JLabel lblMathematicsMarks_1 = new JLabel("Mathematics Marks*");
		lblMathematicsMarks_1.setBounds(281, 610, 123, 14);
		contentPane.add(lblMathematicsMarks_1);
		
		tf12mm = new JTextField();
		tf12mm.setBounds(289, 635, 86, 20);
		contentPane.add(tf12mm);
		tf12mm.setColumns(10);
		
		JLabel lblPercentage_1 = new JLabel("Total Percentage*");
		lblPercentage_1.setBounds(414, 610, 115, 14);
		contentPane.add(lblPercentage_1);
		
		tf12tp = new JTextField();
		tf12tp.setBounds(423, 635, 86, 20);
		contentPane.add(tf12tp);
		tf12tp.setColumns(10);
		
		btnNext = new JButton("Next>>");
		btnNext.setBounds(329, 666, 89, 23);
		btnNext.addActionListener(this);
		contentPane.add(btnNext);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.YELLOW);
		separator.setForeground(Color.RED);
		separator.setBounds(10, 11, 592, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.YELLOW);
		separator_1.setForeground(Color.RED);
		separator_1.setBounds(10, 33, 592, 2);
		contentPane.add(separator_1);
		
		JButton btnChange = new JButton("Change");
		btnChange.setBounds(215, 666, 89, 23);
		btnChange.addActionListener(this);
		contentPane.add(btnChange);
		try{
			Connection coo = new Connect().conn();
			PreparedStatement p = coo.prepareStatement("SELECT * FROM JEE WHERE ID='"+user2+"'");
			ResultSet r = p.executeQuery();
			PreparedStatement p2 = coo.prepareStatement("SELECT * FROM TENTH_CLASS WHERE ID='"+user2+"'");
			ResultSet r2 = p2.executeQuery();
			if(r.next()){
				tfjrn.setText(""+r.getLong("ROLLNO"));
				tfjpm.setText(""+r.getLong("PHYSICS_M"));
				tfjcm.setText(""+r.getLong("CHEM_M"));
				tfjmm.setText(""+r.getLong("MATHS_M"));
				tfjr.setText(""+r.getLong("RANK"));
				}
			if(r2.next()){
				tf10sn.setText(r2.getString("S_NAME"));
				tf10sb.setText(r2.getString("S_BOARD"));
				tf10sa.setText(r2.getString("S_ADDRESS"));
				tf10v.setText(r2.getString("S_CITY"));
				tf10s.setText(r2.getString("S_STATE"));
				tf10c.setText(r2.getString("S_COUNTRY"));
				tf10p.setText(""+r2.getLong("ZIP"));
				tf10mo.setText(""+r2.getLong("MARKS_OBTAIN"));
				tf10mm.setText(""+r2.getLong("TOTAL_MARKS"));
				tf10pe.setText(""+r2.getLong("PERCENTAGE"));
				tf10d.setText(r2.getString("S_DISTRICT"));
				}
			PreparedStatement p3 = coo.prepareStatement("SELECT * FROM TWELTH_CLASS WHERE ID='"+user2+"'");
			ResultSet r3 = p3.executeQuery();
			if(r3.next()){
				tf12sn.setText(r3.getString("S_NAME"));
				tf12sb.setText(r3.getString("S_BOARD"));
				tf12sa.setText(r3.getString("S_ADDRESS"));
				tf12v.setText(r3.getString("S_CITY"));
				tf12s.setText(r3.getString("S_STATE"));
				tf12c.setText(r3.getString("S_COUNTRY"));
				tf12p.setText(""+r3.getLong("S_ZIP"));
				tf12pm.setText(""+r3.getLong("PHYSICS_M"));
				tf12cm.setText(""+r3.getLong("CHEM_M"));
				tf12mm.setText(""+r3.getLong("MATHS_M"));
				tf12tp.setText(""+r3.getLong("PERCENTAGE"));
				tf12d.setText(r3.getString("S_DISTRICT"));
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
	 if(pushed.equals("Next>>")){
		 int count = 0;
			try{
				Connection co6 = DriverManager.getConnection("jdbc:db2://localhost:50000/ADMI","JenilM","jenil@1038");
				PreparedStatement pstm1 = co6.prepareStatement("SELECT ID FROM JEE WHERE ID='"+user2+"'");
				PreparedStatement pstm2 = co6.prepareStatement("SELECT ID FROM TENTH_CLASS WHERE ID='"+user2+"'");
				PreparedStatement pstm3 = co6.prepareStatement("SELECT ID FROM TWELTH_CLASS WHERE ID='"+user2+"'");
				ResultSet rst1 = pstm1.executeQuery();
				ResultSet rst2 = pstm2.executeQuery();
				ResultSet rst3 = pstm3.executeQuery();
				if(!rst1.next() && !rst2.next() && !rst3.next()){
				if(!tfjrn.getText().equals("") && !tfjpm.getText().equals("") && !tfjcm.getText().equals("") && !tfjmm.getText().equals("") && !tfjr.getText().equals("")){
					if(Integer.parseInt(tfjpm.getText()) <= 120 && Integer.parseInt(tfjcm.getText()) <= 120 && Integer.parseInt(tfjmm.getText()) <= 120){
					PreparedStatement stm = co6.prepareStatement("INSERT INTO JEE VALUES('"+user2+"', "+tfjrn.getText()+", "+tfjpm.getText()+", "+tfjcm.getText()+", "+tfjmm.getText()+", "+tfjr.getText()+")");
					stm.execute();
					count++;
					}
					else{
						JOptionPane.showMessageDialog(null," JEE(Main) Marks of a subject cannot be more than 120");
					}
				}	
				else{
					JOptionPane.showMessageDialog(null,"Please Fill all the mandatory information in JEE(Main) details");	

				}
				if(!tf10sn.getText().equals("") && !tf10sb.getText().equals("") && !tf10sa.getText().equals("") && !tf10c.getText().equals("") && !tf10s.getText().equals("") && !tf10v.getText().equals("") && !tf10d.getText().equals("") && !tf10p.getText().equals("") && !tf10mo.getText().equals("") && !tf10mm.getText().equals("") && !tf10pe.getText().equals("")){
					if(Integer.parseInt(tf10mo.getText()) <= Integer.parseInt(tf10mm.getText())){
						PreparedStatement stm2 = co6.prepareStatement("INSERT INTO TENTH_CLASS VALUES('"+user2+"', '"+tf10sn.getText()+"', '"+tf10sb.getText()+"', '"+tf10sa.getText()+"', '"+tf10v.getText()+"', '"+tf10s.getText()+"', '"+tf10c.getText()+"', "+tf10p.getText()+", "+tf10mo.getText()+", "+tf10mm.getText()+", "+tf10pe.getText()+", '"+tf10d.getText()+"')");
						stm2.execute();
						count++;
					}
					else{
						JOptionPane.showMessageDialog(null,"maximum marks should be more than obtained marks");
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"Please Fill all the mandatory information in 10th Standard detail");
				}
				if(!tf12sn.getText().equals("") && !tf12sb.getText().equals("") && !tf12sa.getText().equals("") && !tf12c.getText().equals("") && !tf12s.getText().equals("") && !tf12v.getText().equals("") && !tf12d.getText().equals("") && !tf12p.getText().equals("") &&!tf12pm.getText().equals("") && !tf12cm.getText().equals("") && !tf12mm.getText().equals("") && !tf12p.getText().equals("")){
					if(Integer.parseInt(tf12pm.getText()) <=100 && Integer.parseInt(tf12mm.getText())<=100 && Integer.parseInt(tf12cm.getText())<=100){
						PreparedStatement stm3 = co6.prepareStatement("INSERT INTO TWELTH_CLASS VALUES('"+user2+"', '"+tf12sn.getText()+"', '"+tf12sb.getText()+"', '"+tf12sa.getText()+"', '"+tf12v.getText()+"', '"+tf12s.getText()+"', '"+tf12c.getText()+"', "+tf12p.getText()+", "+tf12pm.getText()+", "+tf12cm.getText()+", "+tf12mm.getText()+", "+tf12tp.getText()+", '"+tf12d.getText()+"')");
						stm3.execute();
						count++;
					}
					else{
						JOptionPane.showMessageDialog(null,"Marks cannot be more than 100 in any subject in 12th");
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"Please fill all the mandatory information in 12th standard");
				}
				if(count == 3){
					this.setVisible(false);
					Branch br = new Branch(user2);
				}
				}
				//else if(!tfjrn.getText().equals("") || !tfjpm.getText().equals("") || !tfjcm.getText().equals("") || !tfjmm.getText().equals("") || !tfjr.getText().equals("") || !tf10sn.getText().equals("") || !tf10sb.getText().equals("") || !tf10sa.getText().equals("") || !tf10c.getText().equals("") || !tf10s.getText().equals("") || !tf10v.getText().equals("") || !tf10d.getText().equals("") || !tf10p.getText().equals("") || !tf10mo.getText().equals("") || !tf10mm.getText().equals("") || !tf10pe.getText().equals("") || !tf12sn.getText().equals("") || !tf12sb.getText().equals("") || !tf12sa.getText().equals("") || !tf12c.getText().equals("") || !tf12s.getText().equals("") || !tf12v.getText().equals("") || !tf12d.getText().equals("") || !tf12p.getText().equals("") || !tf12pm.getText().equals("") || !tf12cm.getText().equals("") || !tf12mm.getText().equals("") || !tf12p.getText().equals("")){
					// JOptionPane.showMessageDialog(null,"You have already filled this informations....please click change to change information");
				 //}
				
				else{
					this.setVisible(false);
					Branch br2 = new Branch(user2);
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	 if(pushed.equals("Change")){
			try{
				Connection coe4 = new Connect().conn();
				PreparedStatement pret1 = coe4.prepareStatement("DELETE FROM JEE WHERE ID='"+user2+"'");
				PreparedStatement pret2 = coe4.prepareStatement("DELETE FROM TENTH_CLASS WHERE ID='"+user2+"'");
				PreparedStatement pret3 = coe4.prepareStatement("DELETE FROM TWELTH_CLASS WHERE ID='"+user2+"'");
				pret1.execute();
				pret2.execute();
				pret3.execute();
			
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}




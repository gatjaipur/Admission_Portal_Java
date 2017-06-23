

import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;

public class Connect{
	Connection con = null;
public static Connection conn()
{
	
	try{
	Connection con = DriverManager.getConnection("jdbc:db2://localhost:50000/ADMI","JenilM","jenil@1038");
	return con;
	}
	catch(Exception e){
		JOptionPane.showMessageDialog(null, e);
		return null;
	}
}
}


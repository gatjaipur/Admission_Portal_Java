
import java.util.*;
import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class Status extends JFrame{
	String user4;
	Status(String s){
		user4 = s;
		int count = 1;
		int pending = 0;
		try{
			Connection co2 = new Connect().conn();
			PreparedStatement pest = co2.prepareStatement("SELECT ID FROM JEE ORDER BY RANK");
			ResultSet rs = pest.executeQuery();
			Set<String> hs= new HashSet<String>();
			while(count!=11 && rs.next()){
				hs.add(rs.getString("ID"));
				count++;
			}
			if(pending==1){
				JOptionPane.showMessageDialog(null, "Pending....Wait Till Given Date Of Result");
			}
			else if(hs.contains(user4) && pending==0){
				JOptionPane.showMessageDialog(null, "You Are Accepted For further Counselling");
			}
			else if(pending==0){
				JOptionPane.showMessageDialog(null, "Sorry....You Are  Not Accepted For further Counselling");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
			
package database;
import java.sql.*;
import javax.swing.*;
public class data {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Connection conn;
        PreparedStatement pst;
    	
   /* try {
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","");	
    if(conn!=null) {
    	JOptionPane.showMessageDialog(null, "connected");
    	
    }	
    	
    	
    }catch(Exception e) {
    	
    	JOptionPane.showMessageDialog(null, "not connected");	
    }*/
        
        ResultSet rs;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer","root","");
            String sql ="insert into custom (username,password) values (kay,kay) ";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
        
        
        }catch(SQLException e){
        
        JOptionPane.showMessageDialog(null,"saved");
        }
      
	}

}

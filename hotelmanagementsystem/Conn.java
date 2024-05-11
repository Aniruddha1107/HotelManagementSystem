/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;
import java.sql.*;
/**
 *
 * @author aniru
 */
public class Conn {
    Connection c;
	Statement s;
	public Conn() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","");
			s=c.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
}

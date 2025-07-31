package Exceptions;
import java.io.*;
import java.sql.*;
public class Checked_SQL_Exception {
	public static void main(String[] args) {
		try {
			connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name");
		}
		catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}

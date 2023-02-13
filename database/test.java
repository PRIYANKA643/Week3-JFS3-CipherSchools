package database;
 import java.sql.*;
public class test{
public static void main(String[] args ) throws Exception {
//Connecting to Server
String connectionURL="jdbc:mysql://localhost:3306/mart";
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection(connectionURL);
System.out.println("Connected to Server !!!");
conn.close();
}
} 

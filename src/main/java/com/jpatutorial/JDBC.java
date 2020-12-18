package com.jpatutorial;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");
        String connectionUrl="jdbc:mysql://localhost:3306/workshop";
        String userName="root";
        String password="1Nellore$";
        Connection con=DriverManager.getConnection(connectionUrl,userName,password);
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from Worker");

        while(resultSet.next()){
            System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
        }

    }

}

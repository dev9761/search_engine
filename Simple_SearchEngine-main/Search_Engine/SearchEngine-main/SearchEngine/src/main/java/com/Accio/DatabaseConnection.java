package com.Accio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class DatabaseConnection {
    static Connection connection = null;
    public static Connection getConnection(){
        if(connection != null) {
            return connection;
        }
        String user = "root";
        String pwd = "#@incorrect";
        String db = "searchengineapp";
        return getConnection(user,pwd,db);
    }
    private static Connection getConnection(String user,String pwd,String db){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/searchengineapp","root","#@incorrect");
        }
        catch(SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
        return connection;
    }
}
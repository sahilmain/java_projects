  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahil
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;
    public static Connection ConnecrDb()
    {
    try
    {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sahil\\Documents\\NetBeansProjects\\Library Management System\\LibraryNew.sqlite");
        return conn;
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(null,ex);
    return null;
    }
    }
}


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pratham
 */
public class dbconnect {
     Connection conn;
    public static Connection connectdb()
    {
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aicte","root","");
            System.out.println("AICTE");
            return conn;
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}


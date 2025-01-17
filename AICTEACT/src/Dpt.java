
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.PreparedStatement;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pratham
 */
public class Dpt extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form Dpt
     */
    public Dpt() {
        initComponents();
        conn = dbconnect.connectdb();
        try {
            printdpt();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dpt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dpt.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label6 = new java.awt.Label();
        button2 = new java.awt.Button();
        textField3 = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 102, 0));
        label1.setText("Departments");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 33, -1, -1));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "DEPARTMENT_NAME", "DEPARTMENT_ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, 180));

        label6.setBackground(new java.awt.Color(91, 134, 119));
        label6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 102, 51));
        label6.setText("Delete Department");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 494, -1, -1));

        button2.setBackground(new java.awt.Color(0, 204, 204));
        button2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("delete");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(985, 594, -1, -1));

        textField3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 594, 157, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudupt.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bga.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 140, 1160, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Adminblock ad =new Adminblock();
      ad.setVisible(true);
      this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Are u sure u want to delete?", "delete", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            String sql = "delete from department where DEPARTMENT_ID=?";
            try {

                pst = conn.prepareStatement(sql);
                pst.setString(1, textField3.getText());
               
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "deleted sucessfuly");
            }
             catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println("Dpt");
                new Dpt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.Label label1;
    private java.awt.Label label6;
    private java.awt.TextField textField3;
    // End of variables declaration//GEN-END:variables
     private void printdpt() throws ClassNotFoundException, SQLException{
        String Qry = "Select * From department order by DEPARTMENT_ID";
        Statement smt = conn.createStatement();
        rs = smt.executeQuery(Qry);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
    }
}

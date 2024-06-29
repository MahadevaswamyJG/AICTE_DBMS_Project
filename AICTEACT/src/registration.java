
import java.sql.CallableStatement;
import java.sql.Connection;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pratham
 */
public class registration extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    CallableStatement cs;
    /**
     * Creates new form registration
     */
    public registration() {
        initComponents();
         conn =  dbconnect.connectdb();
        try {
            fillDept();
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
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
        label10 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        textField5 = new java.awt.TextField();
        button3 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 151, 146));
        label1.setMinimumSize(new java.awt.Dimension(450, 48));
        label1.setName(""); // NOI18N
        label1.setPreferredSize(new java.awt.Dimension(30, 50));
        label1.setText("Student Registration");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 460, 70));

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(new java.awt.Color(0, 0, 0));
        label10.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
        label10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label10.setForeground(new java.awt.Color(101, 222, 239));
        label10.setText("USN");
        getContentPane().add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, -1));

        label2.setBackground(new java.awt.Color(0, 0, 0));
        label2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(101, 222, 239));
        label2.setText("Student Name");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        label3.setBackground(new java.awt.Color(0, 0, 0));
        label3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(101, 222, 239));
        label3.setText("Phone");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        label4.setBackground(new java.awt.Color(0, 0, 0));
        label4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(101, 222, 239));
        label4.setText("Department_ID");
        getContentPane().add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        label5.setBackground(new java.awt.Color(0, 0, 0));
        label5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label5.setForeground(new java.awt.Color(101, 222, 239));
        label5.setText("Student Type");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        label6.setBackground(new java.awt.Color(0, 0, 0));
        label6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(101, 222, 239));
        label6.setText("Password");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "Regular", "Lateral", "Change of collage(5th Sem)" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, -1, -1));

        textField2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textField2.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 160, 30));

        textField3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 260, -1));

        textField4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getContentPane().add(textField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 160, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--" }));
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 160, -1));

        textField5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textField5.setMinimumSize(new java.awt.Dimension(90, 20));
        getContentPane().add(textField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, 170, -1));

        button3.setBackground(new java.awt.Color(58, 203, 213));
        button3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setLabel("submit");
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        getContentPane().add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button3MouseClicked

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
      if(textField2.getText().trim().isEmpty() && textField3.getText().trim().isEmpty() && textField3.getText().trim().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Fill Form Properly" );
      } 
      else{
      String query = "{call INSERT_STUDENT(?,?,?,?,?,?)}";
        try {
            cs = conn.prepareCall(query);
            cs.setString(1, (textField2.getText()));
                    cs.setString(2, (textField3.getText()));
                    cs.setString(3, (textField4.getText()));
                    cs.setString(4, jComboBox2.getSelectedItem().toString());
                    cs.setString(5, jComboBox1.getSelectedItem().toString());
                    cs.setString(6, (textField5.getText()));
                    cs.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Student registration successfull\n" );

                     textField2.setText("");
                     textField3.setText("");
                     textField4.setText("");
                     jComboBox2.setToolTipText("");
                     jComboBox1.setToolTipText("");
                     textField5.setText("");
                     
                     front hg = new front();
                     hg.setVisible(true);
                     this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
                    
                    //cs.setString(2, ComboItemName.getSelectedItem().toString());
                    //cs.setInt(3, Integer.parseInt(txtitemid.getText()));
//                    cs.setString(3, txtitemid.getText());
//                    cs.setString(4, ComboCustName.getSelectedItem().toString());
                    //cs.setString(5, Student Type.getText());
                    // cs.setInt(5, Integer.parseInt(txtcustid.getText()));
                    //cs.setString(6, password.getText());
                    //  cs.setInt(6, Integer.parseInt(txtqty.getText()));
                    //cs.setString(7, txtprice.getText());
                    // cs.setInt(7, Integer.parseInt(txtprice.getText()));

                  //  System.out.println("EMPID: " + txtempid.getText());
                   // cs.setInt(9, Integer.parseInt(txtempid.getText()));
                    // cs.setString(9, txtempid.getText());

                    // pst.setString(8, txttotalamt.getText());
                   // cs.registerOutParameter(8, java.sql.Types.INTEGER);

                    // cs.executeUpdate();
                    
    }//GEN-LAST:event_button3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2MouseClicked

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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    // End of variables declaration//GEN-END:variables

    private void fillDept() throws SQLException {
        String sql = "select * from department";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        while(rs.next()){
            jComboBox2.addItem(rs.getString("DEPARTMENT_NAME"));
        }
        
    }
}
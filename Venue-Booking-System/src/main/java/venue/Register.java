package venue;

/**
 *
 * @author Bhanu1776
 */

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame implements ActionListener {

        Connection C=null;
        PreparedStatement S=null;
        ResultSet R=null;
        
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LP1 = new javax.swing.JPanel();
        left_img = new javax.swing.JLabel();
        LP2 = new javax.swing.JPanel();
        RTpass = new javax.swing.JTextField();
        RTemail = new javax.swing.JTextField();
        RbCancel = new javax.swing.JButton();
        TX = new javax.swing.JLabel();
        RbRegister = new javax.swing.JButton();
        Llogin = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        RTname = new javax.swing.JTextField();
        Lroles = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 95));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LP1.setBackground(new java.awt.Color(204, 255, 255));

        left_img.setIcon(new javax.swing.ImageIcon("C:\\Users\\bunny\\OneDrive\\Documents\\NetBeansProjects\\Venue\\src\\main\\java\\Images\\S_left.png")); // NOI18N
        left_img.setPreferredSize(new java.awt.Dimension(240, 200));

        javax.swing.GroupLayout LP1Layout = new javax.swing.GroupLayout(LP1);
        LP1.setLayout(LP1Layout);
        LP1Layout.setHorizontalGroup(
            LP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LP1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(left_img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        LP1Layout.setVerticalGroup(
            LP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LP1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(left_img, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        getContentPane().add(LP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        LP2.setBackground(new java.awt.Color(0, 0, 51));

        RTpass.setBackground(new java.awt.Color(0, 0, 51));
        RTpass.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        RTpass.setForeground(new java.awt.Color(255, 255, 255));
        RTpass.setText("Enter Password...");
        RTpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));
        RTpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTpassActionPerformed(evt);
            }
        });

        RTemail.setBackground(new java.awt.Color(0, 0, 51));
        RTemail.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        RTemail.setForeground(new java.awt.Color(255, 255, 255));
        RTemail.setText("Enter Email...");
        RTemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));
        RTemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTemailActionPerformed(evt);
            }
        });

        RbCancel.setBackground(new java.awt.Color(0, 0, 51));
        RbCancel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        RbCancel.setForeground(new java.awt.Color(204, 255, 255));
        RbCancel.setText("Cancel");
        RbCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        RbCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbCancelMouseClicked(evt);
            }
        });

        TX.setBackground(new java.awt.Color(0, 0, 51));
        TX.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        TX.setForeground(new java.awt.Color(153, 255, 255));
        TX.setText("X");
        TX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXMouseClicked(evt);
            }
        });

        RbRegister.setBackground(new java.awt.Color(0, 0, 51));
        RbRegister.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        RbRegister.setForeground(new java.awt.Color(204, 255, 255));
        RbRegister.setText("Register");
        RbRegister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        RbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbRegisterActionPerformed(evt);
            }
        });

        Llogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Llogin.setForeground(new java.awt.Color(153, 255, 255));
        Llogin.setText("Signup");

        jTextField2.setBackground(new java.awt.Color(0, 0, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Confirm Password...");
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        RTname.setBackground(new java.awt.Color(0, 0, 51));
        RTname.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        RTname.setForeground(new java.awt.Color(255, 255, 255));
        RTname.setText("Enter Name...");
        RTname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));
        RTname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTnameActionPerformed(evt);
            }
        });

        Lroles.setBackground(new java.awt.Color(0, 0, 51));
        Lroles.setForeground(new java.awt.Color(204, 255, 255));
        Lroles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roles ", "Dealer", "Customer" }));
        Lroles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        Lroles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LrolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LP2Layout = new javax.swing.GroupLayout(LP2);
        LP2.setLayout(LP2Layout);
        LP2Layout.setHorizontalGroup(
            LP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LP2Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(LP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LP2Layout.createSequentialGroup()
                        .addComponent(TX)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LP2Layout.createSequentialGroup()
                        .addGroup(LP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Llogin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RTname, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lroles, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                .addComponent(RTpass, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(138, 138, 138))
                    .addGroup(LP2Layout.createSequentialGroup()
                        .addComponent(RbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(RbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        LP2Layout.setVerticalGroup(
            LP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LP2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TX)
                .addGap(28, 28, 28)
                .addComponent(Llogin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Lroles, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RTname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RTemail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RTpass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(LP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RbCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        getContentPane().add(LP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 0, 450, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RTpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTpassActionPerformed
        
    }//GEN-LAST:event_RTpassActionPerformed

    private void TXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXMouseClicked

    dispose();
    }//GEN-LAST:event_TXMouseClicked

    private void RTemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTemailActionPerformed
        
    }//GEN-LAST:event_RTemailActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void RTnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTnameActionPerformed
        
    }//GEN-LAST:event_RTnameActionPerformed

    private void LrolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LrolesActionPerformed
        
    }//GEN-LAST:event_LrolesActionPerformed

    private void RbCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbCancelMouseClicked
       
    dispose(); 
    }//GEN-LAST:event_RbCancelMouseClicked

    private void RbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbRegisterActionPerformed
           
        try{
        String str = "INSERT INTO `login`(`Name`, `Email`, `password`, `Role`) VALUES (?,?,?,?)";
        C=DriverManager.getConnection("jdbc:mysql://localhost:3308/venue","root","");
        S=C.prepareStatement(str);
        S.setString(1,RTname.getText());
        S.setString(2,RTemail.getText());
        S.setString(3,RTpass.getText());
        S.setString(4,String.valueOf(Lroles.getSelectedItem()));
        S.executeUpdate();
        JOptionPane.showMessageDialog(this,"Account Created Successfully");
        Login l = new Login();
        l.setVisible(true);
        dispose();
        }   
        
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
            
        }
    }//GEN-LAST:event_RbRegisterActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LP1;
    private javax.swing.JPanel LP2;
    private javax.swing.JLabel Llogin;
    private javax.swing.JComboBox<String> Lroles;
    private javax.swing.JTextField RTemail;
    private javax.swing.JTextField RTname;
    private javax.swing.JTextField RTpass;
    private javax.swing.JButton RbCancel;
    private javax.swing.JButton RbRegister;
    private javax.swing.JLabel TX;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel left_img;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

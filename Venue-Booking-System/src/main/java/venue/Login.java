
package venue;

/**
 *
 * @author Bhanu1776
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

        Connection C=null;
        PreparedStatement S=null;
        ResultSet R=null;
        
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LP1 = new javax.swing.JPanel();
        Limg0 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LP2 = new javax.swing.JPanel();
        Temail = new javax.swing.JTextField();
        bsignup = new javax.swing.JButton();
        TX = new javax.swing.JLabel();
        blogin = new javax.swing.JButton();
        Llogin = new javax.swing.JLabel();
        Limg2 = new javax.swing.JLabel();
        Limg3 = new javax.swing.JLabel();
        Limg1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lpass = new javax.swing.JPasswordField();
        Lroles = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(320, 95));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LP1.setBackground(new java.awt.Color(204, 255, 255));
        LP1.setAutoscrolls(true);
        LP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        LP1.add(Limg0, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\bunny\\OneDrive\\Documents\\NetBeansProjects\\Venue\\src\\main\\java\\Images\\L_left.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(240, 220));
        LP1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        getContentPane().add(LP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 316, 625));

        LP2.setBackground(new java.awt.Color(0, 0, 51));
        LP2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Temail.setBackground(new java.awt.Color(0, 0, 51));
        Temail.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        Temail.setForeground(new java.awt.Color(255, 255, 255));
        Temail.setText("Enter Email...");
        Temail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));
        Temail.setHighlighter(null);
        Temail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemailActionPerformed(evt);
            }
        });
        LP2.add(Temail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 257, 242, 50));

        bsignup.setBackground(new java.awt.Color(0, 0, 51));
        bsignup.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        bsignup.setForeground(new java.awt.Color(204, 255, 255));
        bsignup.setText("Signup");
        bsignup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        bsignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bsignupMouseClicked(evt);
            }
        });
        bsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsignupActionPerformed(evt);
            }
        });
        LP2.add(bsignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 96, 34));

        TX.setBackground(new java.awt.Color(0, 0, 51));
        TX.setFont(new java.awt.Font("Segoe UI Black", 1, 27)); // NOI18N
        TX.setForeground(new java.awt.Color(153, 255, 255));
        TX.setText("X");
        TX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TXMouseClicked(evt);
            }
        });
        LP2.add(TX, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        blogin.setBackground(new java.awt.Color(0, 0, 51));
        blogin.setFont(new java.awt.Font("Segoe UI Emoji", 0, 16)); // NOI18N
        blogin.setForeground(new java.awt.Color(204, 255, 255));
        blogin.setText("Login");
        blogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        LP2.add(blogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 96, 34));

        Llogin.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Llogin.setForeground(new java.awt.Color(153, 255, 255));
        Llogin.setText("LogIn");
        LP2.add(Llogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 102, 112, 65));
        LP2.add(Limg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 277, -1, 50));
        LP2.add(Limg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 439, 49, 44));
        LP2.add(Limg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 508, 46, 41));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\bunny\\OneDrive\\Documents\\NetBeansProjects\\Venue\\src\\main\\java\\Images\\L_Roles.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(43, 39));
        LP2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 193, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\bunny\\OneDrive\\Documents\\NetBeansProjects\\Venue\\src\\main\\java\\Images\\L_Username.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(43, 39));
        LP2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 268, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\bunny\\OneDrive\\Documents\\NetBeansProjects\\Venue\\src\\main\\java\\Images\\L_Pass.png")); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setPreferredSize(new java.awt.Dimension(43, 39));
        LP2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 34));

        Lpass.setBackground(new java.awt.Color(0, 0, 51));
        Lpass.setForeground(new java.awt.Color(255, 255, 255));
        Lpass.setText("Enter Password ...");
        Lpass.setToolTipText("");
        Lpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 255, 255)));
        Lpass.setCaretColor(new java.awt.Color(255, 255, 255));
        Lpass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        LP2.add(Lpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 242, 44));

        Lroles.setBackground(new java.awt.Color(0, 0, 51));
        Lroles.setForeground(new java.awt.Color(204, 255, 255));
        Lroles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roles", "Dealer", "Customer" }));
        Lroles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 255)));
        Lroles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LrolesMouseClicked(evt);
            }
        });
        LP2.add(Lroles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, 30));

        getContentPane().add(LP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 0, 500, 625));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TXMouseClicked

dispose();
    }//GEN-LAST:event_TXMouseClicked

    private void TemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemailActionPerformed
        
    }//GEN-LAST:event_TemailActionPerformed

    private void bsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsignupActionPerformed

    }//GEN-LAST:event_bsignupActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        
        try{
            String str="SELECT Email,password,Role FROM `login` WHERE Email=? and password=? and Role=?";
            C=DriverManager.getConnection("jdbc:mysql://localhost:3308/venue","root","");
            S=C.prepareStatement(str);
            
        S.setString(1,Temail.getText());
        S.setString(2,Lpass.getText());
        S.setString(3,String.valueOf(Lroles.getSelectedItem()));
        R=S.executeQuery();
        
        if(R.next()){
                JOptionPane.showMessageDialog(this,"Logged in successfully !!");
                if(Lroles.getSelectedIndex()==1){
                    dealer a=new dealer();
                    a.setVisible(true);
                    dispose();
                }
                
                if(Lroles.getSelectedIndex()==2){
                    Customer p=new Customer();
                    p.setVisible(true);
                    dispose();
                }
        }
        else{
                    JOptionPane.showMessageDialog(this,"Invalid Username and Password");
                }
                 
    }//GEN-LAST:event_bloginActionPerformed
    catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }    
      
        
    private void bsignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsignupMouseClicked
    Register r = new Register();
    r.setVisible(true);
    dispose();    
    }//GEN-LAST:event_bsignupMouseClicked

    private void LrolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LrolesMouseClicked
        
    }//GEN-LAST:event_LrolesMouseClicked

    
    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LP1;
    private javax.swing.JPanel LP2;
    private javax.swing.JLabel Limg0;
    private javax.swing.JLabel Limg1;
    private javax.swing.JLabel Limg2;
    private javax.swing.JLabel Limg3;
    private javax.swing.JLabel Llogin;
    private javax.swing.JPasswordField Lpass;
    private javax.swing.JComboBox<String> Lroles;
    private javax.swing.JLabel TX;
    private javax.swing.JTextField Temail;
    private javax.swing.JButton blogin;
    private javax.swing.JButton bsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

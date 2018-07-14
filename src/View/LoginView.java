/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerLogin;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author giuli
 */
public class LoginView extends javax.swing.JFrame{

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
    }
    
    public String getPasswordText() {
        return PasswordText.getText();
    }


    public String getUsernameText() {
        return UsernameText.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccediButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        PasswordText = new javax.swing.JTextField();
        UsernameText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AccediButton.setBackground(new java.awt.Color(255, 204, 104));
        AccediButton.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        AccediButton.setText("Accedi");
        AccediButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccediButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AccediButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 100, 30));

        ExitButton.setBackground(new java.awt.Color(255, 204, 104));
        ExitButton.setFont(new java.awt.Font("Dubai Medium", 1, 14)); // NOI18N
        ExitButton.setText("Exit");
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 100, 30));
        getContentPane().add(PasswordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 30));

        UsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 30));

        jLabel3.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 100, 30));

        jLabel4.setFont(new java.awt.Font("Dubai Medium", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 100, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/pgIcon.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 100, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/pastello.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 340));

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextActionPerformed

    private void AccediButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccediButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccediButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
 /*   public void accessApp(Object admin) {
           
            
            if(admin != null){
 
                this.dispose();
                GeneralView home = new GeneralView();
                home.setLocationRelativeTo(null);
                home.setVisible(true);   
            }
    }  
*/
     public void accessApp() {
           
        this.dispose();
        GeneralView home = new GeneralView();
        home.setLocationRelativeTo(null);
        home.setVisible(true);   
            
    }  
    public JButton getAccediButton() {
        return AccediButton;
    }

    public JButton getExitButton() {
        return ExitButton;
    }
    
   public JTextField JTextPassword()
   {
       return PasswordText;
   }
   public JTextField JTextUsername()
   {
       return UsernameText;
   }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccediButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField PasswordText;
    private javax.swing.JTextField UsernameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

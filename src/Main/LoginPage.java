/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Color;

/**
 *
 * @author ashra
 */
public class LoginPage extends javax.swing.JFrame {
    
    

    public LoginPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        title = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        loginid.setFont(new java.awt.Font("BlackChancery", 0, 36)); // NOI18N
        loginid.setForeground(new java.awt.Color(204, 204, 204));
        loginid.setText(" LoginID");
        loginid.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        loginid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clear(evt);
            }
        });
        jPanel1.add(loginid);
        loginid.setBounds(780, 440, 390, 60);

        password.setFont(new java.awt.Font("BlackChancery", 0, 36)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("Password");
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        password.setEchoChar((char)0);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clear2(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(780, 520, 390, 60);

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("BlackChancery", 0, 156)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("L ogin");
        title.setToolTipText("");
        jPanel1.add(title);
        title.setBounds(790, 170, 380, 170);

        jButton2.setBackground(Color.black);
        jButton2.setFont(new java.awt.Font("BlackChancery", 0, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jPanel1.add(jButton2);
        jButton2.setBounds(800, 630, 330, 70);

        jButton3.setBackground(Color.black);
        jButton3.setFont(new java.awt.Font("BlackChancery", 0, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("New User? Register Here!");
        jPanel1.add(jButton3);
        jButton3.setBounds(1430, 950, 470, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/1013479_christmas-aesthetic-wallpaper.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1965, 1080);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 2013, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clear
loginid.setText("");  
loginid.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_clear

    private void clear2(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clear2
  password.setText(""); 
  password.setForeground(Color.black);
  password.setEchoChar('*');// TODO add your handling code here:
    }//GEN-LAST:event_clear2


    /**
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
        
                title.requestFocus();
            }
       
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginid;
    private javax.swing.JPasswordField password;
    private static javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
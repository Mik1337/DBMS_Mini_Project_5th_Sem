/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import java.sql.*;
import java.awt.Color;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ashra
 */
public class LoginPage extends javax.swing.JFrame {
    
    String login_id;

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

        jPanel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        loginid = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        focus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        title.setFont(new java.awt.Font("BlackChancery", 0, 126)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("L ogin");
        jPanel2.add(title);
        title.setBounds(1320, 80, 350, 160);

        loginid.setFont(new java.awt.Font("BlackChancery", 0, 28)); // NOI18N
        loginid.setForeground(new java.awt.Color(204, 204, 204));
        loginid.setText("LoginID");
        loginid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clear(evt);
            }
        });
        jPanel2.add(loginid);
        loginid.setBounds(1280, 290, 390, 60);

        password.setFont(new java.awt.Font("BlackChancery", 0, 28)); // NOI18N
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("Password");
        password.setEchoChar((char)0);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clear2(evt);
            }
        });
        jPanel2.add(password);
        password.setBounds(1280, 390, 390, 60);

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("BlackChancery", 0, 36)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit);
        submit.setBounds(1300, 500, 350, 60);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("BlackChancery", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("New User? Register Here!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1490, 985, 370, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/1013479_christmas-aesthetic-wallpaper.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1080);

        focus.setText("jTextField1");
        jPanel2.add(focus);
        focus.setBounds(490, 250, 69, 22);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents
static final String DB_URL="jdbc:mysql://localhost:3306/resort?autoReconnect=true&useSSL=false";
static final String USER="root";
static final String PASS="ashray123";
Connection con;
ResultSet rs;
Statement stmt;
    private void clear(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clear
 loginid.setText("");
        loginid.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_clear

    private void clear2(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clear2
	
		 password.setText("");
        password.setForeground(Color.black);
        password.setEchoChar('*');        // TODO add your handling code here:
    }//GEN-LAST:event_clear2

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        login_id=loginid.getText();
        String pass=password.getText();
        String usr="",pwd="";
        
        if(login_id.substring(0,1)=="ST"){
            try{
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection(DB_URL,USER,PASS);
            String staffsql="SELECT STAFFID,PASSWORD FROM CUSTOMER WHERE STAFF='"+login_id+"'AND PASSWORD ='"+pass+"';";
            }
            catch(Exception e){
                
            }
        }
        else{
        try{
            Class.forName("java.sql.Driver");
            con=DriverManager.getConnection(DB_URL,USER,PASS);
            String sql;
            sql="SELECT CUSTOMERID,PASSWORD FROM CUSTOMER WHERE CUSTOMERID='"+login_id+"'AND PASSWORD ='"+pass+"';";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                usr=rs.getString("CUSTOMERID");
                pwd=rs.getString("PASSWORD");
            }
            if(login_id.equals(usr)&&pass.equals(pwd)){
         try{
              Files.write(Paths.get("C:\\Users\\ashra\\OneDrive\\Documents\\NetBeansProjects\\SylvanGladeResort\\src\\Main\\filename.txt"), login_id.getBytes(), StandardOpenOption.TRUNCATE_EXISTING); 
            this.setVisible(true);
            Home h = new Home();
            h.setVisible(true);
            this.setVisible(false);
            }
            catch(Exception e){
             JOptionPane.showMessageDialog(this,e.getMessage());
            }
            }
            else{
                JOptionPane.showMessageDialog(this,"INVALID USER OR PASSWORD");
                focus.requestFocus();
            }
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }  
        }// TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.setVisible(false);
        Register r = new Register();
        r.setVisible(true);
        try{
               PrintWriter out = new PrintWriter("filename.txt");
               out.println(login_id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
     
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


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
        
                focus.requestFocus();
            }
       
        });
    }
    public String getCustomer_ID(){
        return login_id;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField focus;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField loginid;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submit;
    private static javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

import java.sql.*;
public class Sign_up extends javax.swing.JFrame {

    /**
     * Creates new form Sign_up
     */
    public Sign_up() {
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

        jLabel1 = new javax.swing.JLabel();
        Textfield_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordfield_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        Passwordfield_confirm_password = new javax.swing.JPasswordField();
        Register_Button = new javax.swing.JButton();
        comment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel1.setText("Enter Username");

        Textfield_username.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        Textfield_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Textfield_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Textfield_usernameFocusLost(evt);
            }
        });
        Textfield_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Textfield_usernameKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel2.setText("Enter password");

        passwordfield_password.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        passwordfield_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordfield_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordfield_passwordFocusLost(evt);
            }
        });
        passwordfield_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordfield_passwordKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel3.setText("Confirm password");

        Passwordfield_confirm_password.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        Passwordfield_confirm_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Passwordfield_confirm_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Passwordfield_confirm_passwordFocusLost(evt);
            }
        });
        Passwordfield_confirm_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Passwordfield_confirm_passwordKeyPressed(evt);
            }
        });

        Register_Button.setBackground(new java.awt.Color(153, 255, 153));
        Register_Button.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        Register_Button.setForeground(new java.awt.Color(0, 51, 255));
        Register_Button.setText("Register");
        Register_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Register_ButtonMouseClicked(evt);
            }
        });

        comment.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        comment.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Textfield_username, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(passwordfield_password)
                            .addComponent(Passwordfield_confirm_password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(Register_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(comment)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Textfield_username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordfield_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Passwordfield_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Register_Button)
                .addGap(33, 33, 33)
                .addComponent(comment, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Register_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Register_ButtonMouseClicked
        try{
           int flag = 0;
           Connection myconn = DriverManager.getConnection("jdbc:mysql://Localhost:3306/algorithma?autoReconnect=true&useSSL=false","root","Sourabh@67");
           Statement stmt = myconn.createStatement();
           ResultSet rs = stmt.executeQuery("select * from members");
           String u= Textfield_username.getText();
           String pass = passwordfield_password.getText();
           String confirm_password = Passwordfield_confirm_password.getText();
           if(u.equals("") || pass.equals("")){
               comment.setText("( username or password can't be null )");
           }
           else{
               String sql = "INSERT INTO members(username,password) VALUES('"+u+"','"+pass+"')";
                if(pass.equals(confirm_password)){
                    while(rs.next()){
                        String user = rs.getString("username");
                        String password = rs.getString("password");
                        if(u.equals(user)){
                            flag = 1;
                        }
                    }
                   if(flag == 0){
                       stmt.executeUpdate(sql);
                       
                       this.dispose();
                   }
                   else if(flag == 1){
                   comment.setText("( user already exist with same details! )");
                   }
                }
                else if(!pass.equals(confirm_password)){
                    comment.setText(" ( password doesn't match) ");
                }
           }
           
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_Register_ButtonMouseClicked

    private void Textfield_usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Textfield_usernameKeyPressed
            comment.setText("");
    }//GEN-LAST:event_Textfield_usernameKeyPressed

    private void Passwordfield_confirm_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Passwordfield_confirm_passwordKeyPressed
            comment.setText("");
    }//GEN-LAST:event_Passwordfield_confirm_passwordKeyPressed

    private void passwordfield_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordfield_passwordKeyPressed
            comment.setText("");
    }//GEN-LAST:event_passwordfield_passwordKeyPressed

    private void Textfield_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Textfield_usernameFocusGained
            Textfield_username.setBackground(new java.awt.Color(204,204,255));
    }//GEN-LAST:event_Textfield_usernameFocusGained

    private void Textfield_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Textfield_usernameFocusLost
            Textfield_username.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Textfield_usernameFocusLost

    private void passwordfield_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfield_passwordFocusGained
            passwordfield_password.setBackground(new java.awt.Color(0, 255, 204));
    }//GEN-LAST:event_passwordfield_passwordFocusGained

    private void passwordfield_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfield_passwordFocusLost
            passwordfield_password.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_passwordfield_passwordFocusLost

    private void Passwordfield_confirm_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Passwordfield_confirm_passwordFocusGained
            Passwordfield_confirm_password.setBackground(new java.awt.Color(0, 255, 204));
    }//GEN-LAST:event_Passwordfield_confirm_passwordFocusGained

    private void Passwordfield_confirm_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Passwordfield_confirm_passwordFocusLost
            Passwordfield_confirm_password.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_Passwordfield_confirm_passwordFocusLost

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
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Passwordfield_confirm_password;
    private javax.swing.JButton Register_Button;
    private javax.swing.JTextField Textfield_username;
    private javax.swing.JLabel comment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordfield_password;
    // End of variables declaration//GEN-END:variables
}

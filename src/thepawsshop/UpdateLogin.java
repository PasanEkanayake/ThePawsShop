package thepawsshop;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

public class UpdateLogin extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "";
    private static final String dataConn = "jdbc:mysql://localhost:3306/thepawsshop";
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int n1, n2;
    
    public UpdateLogin() {
        initComponents();
        UpdateDB();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void UpdateDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("select * from users");
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            n1 = stData.getColumnCount();
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Database Connection Error:\n\n" + ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        oldUName = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        showHide1 = new javax.swing.JCheckBox();
        oldPWord = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        showHide2 = new javax.swing.JCheckBox();
        newPWord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("THE PAWS SHOP");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\ICBT Campus 2024\\Semester 02\\Object Oriented Programming\\Assignment\\Logo 2.png")); // NOI18N

        back.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Current Username:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 85, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        oldUName.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(93, 12, 0, 0);
        jPanel2.add(oldUName, gridBagConstraints);

        submit.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 225, 100, 0);
        jPanel2.add(submit, gridBagConstraints);

        showHide1.setBackground(new java.awt.Color(0, 102, 102));
        showHide1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        showHide1.setForeground(new java.awt.Color(255, 255, 255));
        showHide1.setText("Show Password");
        showHide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHide1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 6, 0, 80);
        jPanel2.add(showHide1, gridBagConstraints);

        oldPWord.setPreferredSize(new java.awt.Dimension(100, 20));
        oldPWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                oldPWordKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        jPanel2.add(oldPWord, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Current Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 88, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 110, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        showHide2.setBackground(new java.awt.Color(0, 102, 102));
        showHide2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        showHide2.setForeground(new java.awt.Color(255, 255, 255));
        showHide2.setText("Show Password");
        showHide2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHide2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 6, 0, 80);
        jPanel2.add(showHide2, gridBagConstraints);

        newPWord.setPreferredSize(new java.awt.Dimension(100, 20));
        newPWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                newPWordKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 0);
        jPanel2.add(newPWord, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("select * from users WHERE Username=? and Password=?");
            String uNameTemp = oldUName.getText();
            String pWordTemp = oldPWord.getText();
            String newPass = newPWord.getText();
            pst.setString(1, uNameTemp);
            pst.setString(2, pWordTemp);
            rs = pst.executeQuery();

            if(rs.next() == false){
                JOptionPane.showMessageDialog(this, "User not found.\n\nPlease Try again.");
                oldUName.setText("");
                oldPWord.setText("");
                newPWord.setText("");
            }
            else{
                pst = sqlConn.prepareStatement("select * from users where Password=?");
                pst.setString(1, newPass);
                rs = pst.executeQuery();
                
                if(rs.next()){
                    JOptionPane.showMessageDialog(this, "This password is already in use.\n\nPlease choose a different password.");
                    newPWord.setText("");
                }
                else{
                    pst = sqlConn.prepareStatement("update users set Password=? where Username=?");
                    pst.setString(1, newPass);
                    pst.setString(2, uNameTemp);

                    int updateCount = pst.executeUpdate();

                    if(updateCount > 0){
                        JOptionPane.showMessageDialog(this, "Password updated successfully.");
                        Login login = new Login();
                        login.setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Password update failed. Please try again.");
                        oldUName.setText("");
                        oldPWord.setText("");
                        newPWord.setText("");
                    }
                }
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Database connection failed:\n\n" + ex.getMessage());
            oldUName.setText("");
            oldPWord.setText("");
            newPWord.setText("");
        }
    }//GEN-LAST:event_submitActionPerformed

    private void showHide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHide1ActionPerformed
        if(showHide1.isSelected()){
            oldPWord.setEchoChar((char) 0);
        }
        else{
            oldPWord.setEchoChar('*');
        }
    }//GEN-LAST:event_showHide1ActionPerformed

    private void oldPWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oldPWordKeyPressed
        
    }//GEN-LAST:event_oldPWordKeyPressed

    private void showHide2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHide2ActionPerformed
        if(showHide1.isSelected()){
            newPWord.setEchoChar((char) 0);
        }
        else{
            newPWord.setEchoChar('*');
        }
    }//GEN-LAST:event_showHide2ActionPerformed

    private void newPWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPWordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{

                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("select * from users WHERE Username=? and Password=?");
                String uNameTemp = oldUName.getText();
                String pWordTemp = oldPWord.getText();
                String newPass = newPWord.getText();
                pst.setString(1, uNameTemp);
                pst.setString(2, pWordTemp);
                rs = pst.executeQuery();

                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this, "User not found.\n\nPlease Try again.");
                    oldUName.setText("");
                    oldPWord.setText("");
                    newPWord.setText("");
                }
                else{
                    pst = sqlConn.prepareStatement("select * from users where Password=?");
                    pst.setString(1, newPass);
                    rs = pst.executeQuery();

                    if(rs.next()){
                        JOptionPane.showMessageDialog(this, "This password is already in use.\n\nPlease choose a different password.");
                        newPWord.setText("");
                    }
                    else{
                        pst = sqlConn.prepareStatement("update users set Password=? where Username=?");
                        pst.setString(1, newPass);
                        pst.setString(2, uNameTemp);

                        int updateCount = pst.executeUpdate();

                        if(updateCount > 0){
                            JOptionPane.showMessageDialog(this, "Password updated successfully.");
                            Login login = new Login();
                            login.setVisible(true);
                            this.dispose();
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Password update failed. Please try again.");
                            oldUName.setText("");
                            oldPWord.setText("");
                            newPWord.setText("");
                        }
                    }
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Database connection failed:\n\n" + ex.getMessage());
                oldUName.setText("");
                oldPWord.setText("");
                newPWord.setText("");
            }
        }
    }//GEN-LAST:event_newPWordKeyPressed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newPWord;
    private javax.swing.JPasswordField oldPWord;
    private javax.swing.JTextField oldUName;
    private javax.swing.JCheckBox showHide1;
    private javax.swing.JCheckBox showHide2;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}

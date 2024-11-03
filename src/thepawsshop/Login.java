package thepawsshop;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

public class Login extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "";
    private static final String dataConn = "jdbc:mysql://localhost:3306/thepawsshop";
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int n1, n2;
    
    public Login() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        showHide = new javax.swing.JCheckBox();
        pWord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 480));

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
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(back)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 153, 0, 0);
        jPanel2.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 152, 0, 0);
        jPanel2.add(uName, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 152, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        login.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 38, 131, 0);
        jPanel2.add(login, gridBagConstraints);

        showHide.setBackground(new java.awt.Color(0, 102, 102));
        showHide.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        showHide.setForeground(new java.awt.Color(255, 255, 255));
        showHide.setText("Show Password");
        showHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 6, 0, 18);
        jPanel2.add(showHide, gridBagConstraints);

        pWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pWordKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 152, 0, 0);
        jPanel2.add(pWord, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        StartPage start = new StartPage();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn, username, password);
            pst = sqlConn.prepareStatement("select Username, Password from users WHERE Username=? and Password=?");
            String uNameTemp = uName.getText();
            String pWordTemp = pWord.getText();
            pst.setString(1, uNameTemp);
            pst.setString(2, pWordTemp);
            rs = pst.executeQuery();
            
            if(rs.next() == false){
                JOptionPane.showMessageDialog(this, "User not found.\n\nPlease Try again.");
                uName.setText("");
                pWord.setText("");
            }
            else{
                pst = sqlConn.prepareStatement("select Status from users WHERE Username=? and Password=? and Status=?");
                String stat = "Active";
                pst.setString(1, uNameTemp);
                pst.setString(2, pWordTemp);
                pst.setString(3, stat);
                rs = pst.executeQuery();
                
                if(rs.next() == true){
                    
                    pst = sqlConn.prepareStatement("select Role from users WHERE Username=? and Password=? and Role=?");
                    String role = "Cashier";
                    pst.setString(1, uNameTemp);
                    pst.setString(2, pWordTemp);
                    pst.setString(3, role);
                    rs = pst.executeQuery();
                    
                    if(rs.next() == true){
                        CashierDash cashierDash = new CashierDash();
                        cashierDash.setVisible(true);
                        this.dispose();
                    }
                    else{
                        ManagerDash managerDash = new ManagerDash();
                        managerDash.setVisible(true);
                        this.dispose();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "User no longer works at the shop.\n\nPlease Try again.");
                    uName.setText("");
                    pWord.setText("");
                }
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Database connection failed:\n\n" + ex.getMessage());
        }
    }//GEN-LAST:event_loginActionPerformed

    private void showHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideActionPerformed
        if(showHide.isSelected()){
            pWord.setEchoChar((char) 0);
        }
        else{
            pWord.setEchoChar('*');
        }
    }//GEN-LAST:event_showHideActionPerformed

    private void pWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pWordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
            
                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(dataConn, username, password);
                pst = sqlConn.prepareStatement("select Username, Password from users WHERE Username=? and Password=?");
                String uNameTemp = uName.getText();
                String pWordTemp = pWord.getText();
                pst.setString(1, uNameTemp);
                pst.setString(2, pWordTemp);
                rs = pst.executeQuery();

                if(rs.next() == false){
                    JOptionPane.showMessageDialog(this, "User not found.\n\nPlease Try again.");
                    uName.setText("");
                    pWord.setText("");
                }
                else{
                    pst = sqlConn.prepareStatement("select Status from users WHERE Username=? and Password=? and Status=?");
                    String stat = "Active";
                    pst.setString(1, uNameTemp);
                    pst.setString(2, pWordTemp);
                    pst.setString(3, stat);
                    rs = pst.executeQuery();

                    if(rs.next() == true){

                        pst = sqlConn.prepareStatement("select Role from users WHERE Username=? and Password=? and Role=?");
                        String role = "Cashier";
                        pst.setString(1, uNameTemp);
                        pst.setString(2, pWordTemp);
                        pst.setString(3, role);
                        rs = pst.executeQuery();

                        if(rs.next() == true){
                            CashierDash cashierDash = new CashierDash();
                            cashierDash.setVisible(true);
                            this.dispose();
                        }
                        else{
                            ManagerDash managerDash = new ManagerDash();
                            managerDash.setVisible(true);
                            this.dispose();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "User no longer works at the shop.\n\nPlease Try again.");
                        uName.setText("");
                        pWord.setText("");
                    }
                }
            
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Database connection failed:\n\n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_pWordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pWord;
    private javax.swing.JCheckBox showHide;
    private javax.swing.JTextField uName;
    // End of variables declaration//GEN-END:variables
}

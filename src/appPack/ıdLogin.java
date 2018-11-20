package appPack;

import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ıdLogin extends javax.swing.JFrame {

    DB db = new DB(); //database

    static String L_id = "";
    static String L_name = "";
    static String L_surName = "";
    static String L_mail = "";

    public ıdLogin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kullanıcı Giriş", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13)))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        txtName.setText("admin");

        txtPassword.setText("1234560");

        Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Login2.png"))); // NOI18N
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        jLabel1.setText("Kullanıcı Adı");

        jLabel2.setText("Şifre");

        jLabel3.setText("Giriş");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(Login)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getAccessibleContext().setAccessibleName("Su Otomasyonu");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        String userName = txtName.getText().trim();
        String password = String.valueOf(txtPassword.getPassword());
        if (userName.equals("")) {
            ImageIcon icon1 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen kullanıcı adınızı yazınız.", "Giriş Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);
            txtName.requestFocus();
        } else if (password.equals("")) {
            ImageIcon icon2 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen şifre yazınız", "Giriş Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon2);
            txtPassword.requestFocus();
        } else {
            String query = "SELECT * FROM `ıdLogin` WHERE `L_name` LIKE '" + userName + "' AND `L_password` LIKE '" + password + "'";
            try {
                ResultSet rs = db.baglan().executeQuery(query);
                if (rs.next()) {
                    L_id = rs.getString("L_id");
                    L_name = rs.getString("L_name");
                    L_surName = rs.getString("L_surName");
                    L_mail = rs.getString("L_mail");
                    Interface inf = new Interface();
                    inf.setVisible(true);
                    dispose();

                } else {
                    ImageIcon icon2 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
                    JOptionPane.showConfirmDialog(rootPane, "Kullanıcı adı veya şifre hatalı", "Giriş Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon2);
                    txtName.setText("");
                    txtPassword.setText("");
                    txtName.requestFocus();
                }
            } catch (Exception e) {
                System.err.println("KULLANICI HATASI : " + e);
            }

        }


    }//GEN-LAST:event_LoginActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ıdLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ıdLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ıdLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ıdLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ıdLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}

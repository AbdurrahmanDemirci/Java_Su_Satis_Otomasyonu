package appPack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class editCustomer extends javax.swing.JFrame {

    public editCustomer() {
        initComponents();

        String sid = Interface.id;
        lblid.setText("İD : " + sid);
        information();

    }

    public void information() {

        txtName.setText(Interface.name);
        txtSurname.setText(Interface.surname);
        txtPhone.setText(Interface.phone);
        txtAddress.setText(Interface.address);

    }

    public void editCustomers() {

        String name1 = txtName.getText().trim().toUpperCase();
        String surname1 = txtSurname.getText().trim().toUpperCase();
        String phone1 = txtPhone.getText().trim();
        String address1 = txtAddress.getText().trim().toUpperCase();
        ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
        if (name1.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen İsim yazınız", "Eksik Bilgi Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (surname1.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen Soyisim yazınız", "Eksik Bilgi Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (phone1.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen Telefon yazınız", "Eksik Bilgi Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (address1.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen Adres yazınız", "Eksik Bilgi Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {

            try {
                DB db = new DB();
                int edit = db.baglan().executeUpdate(" UPDATE `add_Customer` SET `A_name` = '" + name1 + "', `A_surName` = '" + surname1 + "', `A_address` = '" + address1 + "', `A_phone` = '" + phone1 + "' WHERE `add_Customer`.`A_id` = '" + Interface.id + "' ; ");
                if (edit > 0) {
                    ImageIcon icon1 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Okay.png");
                    JOptionPane.showConfirmDialog(rootPane, "Düzenleme işlemi başarılı", "Düzenlendi", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);
                    dispose();
                } else {
                    ImageIcon icon2 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
                    JOptionPane.showConfirmDialog(rootPane, "Düzenleme işlemi başarısız", "Düzenleme Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon2);
                }

            } catch (Exception e) {
                System.err.println("DÜZENLEME HATASI !" + e);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Bilgileri Düzenle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("İsim");

        jLabel2.setText("Soyisim");

        jLabel3.setText("Telefon");

        jLabel4.setText("Adres");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Okay.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblid.setText("ID");

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel1Layout.createSequentialGroup()
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                        .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAddress)
                                    .addComponent(txtPhone)
                                    .addComponent(lblid, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txtSurname)))))
                    .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(70, 70, 70))
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(lblid)
                .addGap(40, 40, 40)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(JPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        editCustomers();
        Interface inf = new Interface();
        inf.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(editCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}

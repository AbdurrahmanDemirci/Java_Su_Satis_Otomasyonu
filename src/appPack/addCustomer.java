package appPack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class addCustomer extends javax.swing.JFrame {

    public addCustomer() {
        initComponents();

    }

    public void addCustomers() {

        String name = txtName.getText().trim().toUpperCase();
        String surname = txtSurname.getText().trim().toUpperCase();
        String phone = txtPhone.getText().trim();
        String address = txtAddress.getText().trim().toUpperCase();
        ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
        if (name.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen İsim yazınız", "Eksik Bilgi Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
            txtName.requestFocus();
        } else if (surname.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen Soyisim yazınız", "Eksik Bilgi Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
            txtSurname.requestFocus();
        } else if (phone.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen Telefon yazınız", "Eksik Bilgi Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
            txtPhone.requestFocus();
        } else if (address.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen Adres yazınız", "Eksik Bilgi Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
            txtAddress.requestFocus();
        } else {

            try {
                DB db = new DB();
                int add = db.baglan().executeUpdate("INSERT INTO `add_Customer` (`A_id`, `A_name`, `A_surName`, `A_phone`, `A_address`) VALUES (NULL, '" + name + "', '" + surname + "', '" + phone + "', '" + address + "');");
                if (add > 0) {
                    ImageIcon icon1 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Okay.png");
                    JOptionPane.showConfirmDialog(rootPane, "Ekleme işlemi başarılı", "Eklendi", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);
                    dispose();
                } else {
                    ImageIcon icon2 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
                    JOptionPane.showConfirmDialog(rootPane, "Ekleme işlemi başarısız", "Ekleme Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon2);
                }

            } catch (Exception e) {
                System.err.println("EKLEME HATASI !" + e);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Yeni Müşteri Ekle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Okay.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("İsim");
        jLabel1.setToolTipText("");

        jLabel2.setText("Soyisim");

        jLabel3.setText("Telefon");

        jLabel4.setText("Adres");

        lblid.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblid)
                            .addGap(112, 112, 112))
                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(txtSurname)
                        .addComponent(txtPhone))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblid)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        addCustomers();
        Interface inf = new Interface();
        inf.setVisible(true);

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
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}

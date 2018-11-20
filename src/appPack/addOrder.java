package appPack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class addOrder extends javax.swing.JFrame {

    public addOrder() {
        initComponents();
        information();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        order = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        add2 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Sipariş Ekle", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("İsim");

        jLabel2.setText("Soyisim");

        jLabel3.setText("Telefon");

        jLabel4.setText("Adres");

        orderArea.setColumns(20);
        orderArea.setRows(5);
        jScrollPane1.setViewportView(orderArea);

        jLabel7.setText("Siparişler");

        order.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lütfen Sipariş Seçiniz.", "12 Adet Erikli 0,5 Lt Su =   8.00", "6   Adet Erikli    1 Lt Su =   9.00", "2   Adet Erikli    5 Lt Su = 10.00", "1   Adet Erikli  19 Lt Su =   9.00" }));

        add.setText("Ekle");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel8.setText("Tutar");

        add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Okay.png"))); // NOI18N
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        lblName.setText("İsim");

        lblSurname.setText("Soyisim");

        lblPhone.setText("Telefon");

        lblAddress.setText("Adres");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(add)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(order, 0, 1, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblName))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblSurname))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addComponent(lblAddress)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
                .addComponent(add)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void information() {

        lblName.setText(Interface.name);
        lblSurname.setText(Interface.surname);
        lblPhone.setText(Interface.phone);
        lblAddress.setText(Interface.address);

    }

    public void addOrders() {

        String name1 = lblName.getText();
        String surname1 = lblSurname.getText();
        String phone1 = lblPhone.getText();
        String address1 = lblAddress.getText();
        String Area1 = orderArea.getText();
        String total1 = txtTotal.getText();
        ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
        if (Area1.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen Sipariş Ekleyiniz", "Sipariş Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else if (total1.equals("")) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen Tutar Ekleyiniz", "Tutar Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {

            try {
                DB db = new DB();
                int addOr = db.baglan().executeUpdate(" INSERT INTO `add_Order` (`O_id`, `O_name`, `O_surname`, `O_phone`, `O_address`, `O_orders`, `O_total`, `O_statu`) VALUES "
                        + "(NULL, '" + name1 + "', '" + surname1 + "', '" + phone1 + "', '" + address1 + "', '" + Area1 + "', '" + total1 + "', 'HAZIRLANIYOR...' );  ");
                if (addOr > 0) {
                    ImageIcon icon1 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Okay.png");
                    JOptionPane.showConfirmDialog(rootPane, "Sipariş ekleme başarılı", "Sipariş", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);
                    dispose();
                } else {
                    ImageIcon icon2 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
                    JOptionPane.showConfirmDialog(rootPane, "Sipariş ekleme başarısız", "Sipariş Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon2);
                }
            } catch (Exception e) {
                System.err.println("SİPARİŞ EKLEME HATASI !" + e);
            }
        }

    }


    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed

        addOrders();
        Interface inf = new Interface();
        inf.setVisible(true);
        dispose();


    }//GEN-LAST:event_add2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
        if (order.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Lütfen sipariş seçiniz", "Sipariş Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            String selected = String.valueOf(order.getSelectedItem());
            orderArea.append(selected + System.lineSeparator());
        }

    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(addOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JComboBox<String> order;
    private javax.swing.JTextArea orderArea;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

}

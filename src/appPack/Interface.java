package appPack;

import java.text.SimpleDateFormat;
import java.sql.ResultSet;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Interface extends javax.swing.JFrame {

    DB db = new DB();

    public Interface() {
        initComponents();
        String sName = ıdLogin.L_name + " " + ıdLogin.L_surName;
        lblNameSurname.setText("Hoşgeldin " + sName);
        customerTable();
        orderList();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                SimpleDateFormat dateClock = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
                GregorianCalendar gcalender = new GregorianCalendar();
                String clock = dateClock.toString();
                dtclock.setText(dateClock.format(gcalender.getTime()));

            }
        };
        Timer tm = new Timer();
        tm.schedule(task, 0, 1000);

    }

    public void orderList() {

        DefaultTableModel ort = new DefaultTableModel();
        ort.addColumn("Id");
        ort.addColumn("İsim");
        ort.addColumn("Soyisim");
        ort.addColumn("Adres");
        ort.addColumn("Telefon");
        ort.addColumn("Durum");
        ort.addColumn("Tutar");
        ort.addColumn("Siparişler");

        try {
            String query = "SELECT * FROM `add_Order`";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                String O_id = rs.getString("O_id");
                String O_name = rs.getString("O_name");
                String O_surname = rs.getString("O_Surname");
                String O_address = rs.getString("O_address");
                String O_phone = rs.getString("O_phone");
                String O_total = rs.getString("O_total");
                String O_orders = rs.getString("O_orders");
                String O_statu = rs.getString("O_statu");

                ort.addRow(new String[]{O_id, O_name, O_surname, O_address, O_phone, O_statu, O_total, O_orders});
            }
            orderList.setModel(ort);
        } catch (Exception e) {
            System.err.println("DATA GÖNDERME HATASI !" + e);
        }
    }

    public void customerTable() {

        DefaultTableModel crt = new DefaultTableModel();
        crt.addColumn("Id");
        crt.addColumn("İsim");
        crt.addColumn("Soyisim");
        crt.addColumn("Adres");
        crt.addColumn("Telefon");

        try {
            String query = "SELECT * FROM `add_Customer`";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                String A_id = rs.getString("A_id");
                String A_name = rs.getString("A_name");
                String A_surName = rs.getString("A_Surname");
                String A_address = rs.getString("A_address");
                String A_phone = rs.getString("A_phone");

                crt.addRow(new String[]{A_id, A_name, A_surName, A_address, A_phone});
            }
            customerTables.setModel(crt);

        } catch (Exception e) {
            System.err.println("DATA GETİRME HATASI !" + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchName = new javax.swing.JTextField();
        searchSurname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTables = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        orderDelete = new javax.swing.JButton();
        orderDetails1 = new javax.swing.JButton();
        addNote1 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        dtclock = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderList = new javax.swing.JTable();
        addCustomer = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        addOrders = new javax.swing.JButton();
        orderWay = new javax.swing.JButton();
        orderOk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblNameSurname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuGo = new javax.swing.JMenu();
        nextLogin = new javax.swing.JCheckBoxMenuItem();
        nextAddCostomer = new javax.swing.JCheckBoxMenuItem();
        nextAddOrders = new javax.swing.JCheckBoxMenuItem();
        jMenu5 = new javax.swing.JMenu();
        nextrate = new javax.swing.JMenuItem();
        nextweather = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Arama", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 160));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Search.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setText("Adı");

        jLabel2.setText("Soyadı");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchSurname)
                    .addComponent(searchName))
                .addGap(40, 40, 40)
                .addComponent(jButton7)
                .addGap(40, 40, 40))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(searchSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton7))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Müşteri Listesi", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 350));

        customerTables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTables);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İşlemler", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 160));

        orderDelete.setText("Seçili Olanı Sil");
        orderDelete.setSize(new java.awt.Dimension(150, 30));
        orderDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDeleteActionPerformed(evt);
            }
        });

        orderDetails1.setText("Sipariş Detayı");
        orderDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDetails1ActionPerformed(evt);
            }
        });

        addNote1.setText("Günlük Notlar");
        addNote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNote1ActionPerformed(evt);
            }
        });

        refresh.setText("Listeyi Yenile");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jLabel11.setText("TARİH & SAAT");

        dtclock.setText("Tarih & Saat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(addNote1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(orderDetails1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(orderDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(dtclock)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(63, 63, 63))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNote1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtclock))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Siparişler", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setPreferredSize(new java.awt.Dimension(480, 350));

        orderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        orderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(orderList);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        addCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Add.png"))); // NOI18N
        addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Edit2.png"))); // NOI18N
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Delete.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        addOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/NewOrder.png"))); // NOI18N
        addOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrdersActionPerformed(evt);
            }
        });

        orderWay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Car.png"))); // NOI18N
        orderWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderWayActionPerformed(evt);
            }
        });

        orderOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Okay.png"))); // NOI18N
        orderOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderOkActionPerformed(evt);
            }
        });

        jLabel3.setText("jLabel3");

        lblNameSurname.setText("Hoşgeldin");

        jLabel4.setText("Ekle");

        jLabel5.setText("Düzenle");

        jLabel6.setText("Sil");

        jLabel7.setText("Sipariş Ekle");

        jLabel8.setText("Sipariş Yolda");

        jLabel9.setText("Sipariş Tamam");

        jMenuGo.setText("Git");

        nextLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        nextLogin.setSelected(true);
        nextLogin.setText("Kullanıcı Giriş");
        nextLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextLoginActionPerformed(evt);
            }
        });
        jMenuGo.add(nextLogin);

        nextAddCostomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        nextAddCostomer.setSelected(true);
        nextAddCostomer.setText("Müşteri Ekle");
        nextAddCostomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextAddCostomerActionPerformed(evt);
            }
        });
        jMenuGo.add(nextAddCostomer);

        nextAddOrders.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK));
        nextAddOrders.setSelected(true);
        nextAddOrders.setText("Sipariş Ekle");
        nextAddOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextAddOrdersActionPerformed(evt);
            }
        });
        jMenuGo.add(nextAddOrders);

        jMenuBar2.add(jMenuGo);

        jMenu5.setText("Yardımcı Bilgi");

        nextrate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        nextrate.setText("Kurlar");
        nextrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextrateActionPerformed(evt);
            }
        });
        jMenu5.add(nextrate);

        nextweather.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        nextweather.setText("Hava Durumu");
        nextweather.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextweatherActionPerformed(evt);
            }
        });
        jMenu5.add(nextweather);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNameSurname))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel5)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(addCustomer)
                        .addGap(40, 40, 40)
                        .addComponent(edit)
                        .addGap(40, 40, 40)
                        .addComponent(delete)))
                .addGap(174, 174, 174)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addOrders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderWay)))
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(orderOk)))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblNameSurname)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addCustomer)
                    .addComponent(edit)
                    .addComponent(delete)
                    .addComponent(orderOk)
                    .addComponent(orderWay)
                    .addComponent(addOrders))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerActionPerformed

        addCustomer ac = new addCustomer();
        ac.setVisible(true);

    }//GEN-LAST:event_addCustomerActionPerformed

    public static String id = "";
    public static String name = "";
    public static String surname = "";
    public static String phone = "";
    public static String address = "";


    private void customerTablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTablesMouseClicked

        int row = customerTables.getSelectedRow();
        id = "" + customerTables.getValueAt(row, 0);
        name = "" + customerTables.getValueAt(row, 1);
        surname = "" + customerTables.getValueAt(row, 2);
        phone = "" + customerTables.getValueAt(row, 4);
        address = "" + customerTables.getValueAt(row, 3);

    }//GEN-LAST:event_customerTablesMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        if (id.equals("")) {
            ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen seçim yapınız", "Seçim Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {

            try {
                ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
                int answer = JOptionPane.showConfirmDialog(rootPane, "Bu işlem geri alınmaz emin misiniz", "Sil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
                if (answer == 0) {
                    String query = "DELETE FROM `add_Customer` WHERE `add_Customer`.`A_id` = " + id + " ";
                    int result = db.baglan().executeUpdate(query);
                    if (result > 0) {
                        customerTable();
                        id = "";
                    } else {
                    }
                } else {

                }

            } catch (Exception e) {
                System.err.println("SİLME HATASI" + e);
            }

        }

    }//GEN-LAST:event_deleteActionPerformed


    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        if (id.equals("")) {
            ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen seçim yapınız", "Seçim Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            editCustomer ec = new editCustomer();
            ec.setVisible(true);
        }

    }//GEN-LAST:event_editActionPerformed

    private void addOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrdersActionPerformed

        if (id.equals("")) {
            ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen seçim yapınız", "Seçim Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            addOrder ao = new addOrder();
            ao.setVisible(true);
        }

    }//GEN-LAST:event_addOrdersActionPerformed

    private void nextLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextLoginActionPerformed

        ıdLogin lg = new ıdLogin();
        lg.setVisible(true);
        dispose();

    }//GEN-LAST:event_nextLoginActionPerformed

    private void nextAddCostomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextAddCostomerActionPerformed

        addCustomer ac = new addCustomer();
        ac.setVisible(true);

    }//GEN-LAST:event_nextAddCostomerActionPerformed

    private void nextAddOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextAddOrdersActionPerformed

        if (id.equals("")) {
            ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen seçim yapınız", "Seçim Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            addOrder ao = new addOrder();
            ao.setVisible(true);
        }

    }//GEN-LAST:event_nextAddOrdersActionPerformed

    private void orderWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderWayActionPerformed

        if (id.equals("")) {
            ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen seçim yapınız", "Seçim Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            try {
                DB db = new DB();
                int editOr = db.baglan().executeUpdate(" UPDATE `add_Order` SET `O_statu` = 'YOLA ÇIKTI...' WHERE `add_Order`.`O_id` = " + id + ";   ");
                if (editOr > 0) {
                    ImageIcon icon1 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Okay.png");
                    JOptionPane.showConfirmDialog(rootPane, "Sipariş düzenle başarılı", "Sipariş", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);
                    orderList();
                    id = "";
                } else {
                    ImageIcon icon2 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
                    JOptionPane.showConfirmDialog(rootPane, "Sipariş düzenleme başarısız", "Sipariş Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon2);
                }
            } catch (Exception e) {
                System.err.println("SİPARİŞ DÜZENLEME (YOLDA) HATASI !" + e);
            }
        }


    }//GEN-LAST:event_orderWayActionPerformed

    public static String name2 = "";
    public static String surname2 = "";
    public static String phone2 = "";
    public static String address2 = "";
    public static String area = "";
    public static String total = "";
    public static String statu = "";


    private void orderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderListMouseClicked

        int row = orderList.getSelectedRow();
        id = "" + orderList.getValueAt(row, 0);
        name2 = "" + orderList.getValueAt(row, 1);
        surname2 = "" + orderList.getValueAt(row, 2);
        phone2 = "" + orderList.getValueAt(row, 4);
        address2 = "" + orderList.getValueAt(row, 3);
        area = "" + orderList.getValueAt(row, 7);
        total = "" + orderList.getValueAt(row, 6);
        statu = "" + orderList.getValueAt(row, 5);

    }//GEN-LAST:event_orderListMouseClicked

    private void orderOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderOkActionPerformed

        if (id.equals("")) {
            ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen seçim yapınız", "Seçim Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            try {
                DB db = new DB();
                int editOr = db.baglan().executeUpdate(" UPDATE `add_Order` SET `O_statu` = 'SİPARİŞ TAMAM...' WHERE `add_Order`.`O_id` = " + id + ";   ");
                if (editOr > 0) {
                    ImageIcon icon1 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Okay.png");
                    JOptionPane.showConfirmDialog(rootPane, "Sipariş düzenle başarılı", "Sipariş", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon1);
                    orderList();
                    id = "";
                } else {
                    ImageIcon icon2 = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
                    JOptionPane.showConfirmDialog(rootPane, "Sipariş düzenleme başarısız", "Sipariş Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon2);
                }
            } catch (Exception e) {
                System.err.println("SİPARİŞ DÜZENLEME (TAMAM) HATASI !" + e);
            }
        }

    }//GEN-LAST:event_orderOkActionPerformed

    private void orderDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDeleteActionPerformed

        if (id.equals("")) {
            ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            JOptionPane.showConfirmDialog(rootPane, "Lütfen seçim yapınız", "Seçim Hatası", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE, icon);
        } else {

        }
        try {
            ImageIcon icon = new ImageIcon("/Users/abdurrahmandemirci/NetBeansProjects/SuSatisOtomasyonu/src/media/Error2.png");
            int answer = JOptionPane.showConfirmDialog(rootPane, "Bu işlem geri alınmaz emin misiniz", "Sil", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon);
            if (answer == 0) {
                String query = " DELETE FROM `add_Order` WHERE `add_Order`.`O_id` = " + id + " ";
                int result = db.baglan().executeUpdate(query);
                if (result > 0) {
                    orderList();
                    id = "";
                } else {

                }
            } else {

            }

        } catch (Exception e) {
            System.err.println("SİLME HATASI" + e);
        }

    }//GEN-LAST:event_orderDeleteActionPerformed


    private void orderDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDetails1ActionPerformed

        orderDetail ord = new orderDetail();
        ord.setVisible(true);

    }//GEN-LAST:event_orderDetails1ActionPerformed

    private void addNote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNote1ActionPerformed

        addNote addn = new addNote();
        addn.setVisible(true);


    }//GEN-LAST:event_addNote1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        DefaultTableModel crt = new DefaultTableModel();
        crt.addColumn("Id");
        crt.addColumn("İsim");
        crt.addColumn("Soyisim");
        crt.addColumn("Adres");
        crt.addColumn("Telefon");
        String name = searchName.getText().trim().toUpperCase();
        String surname = searchSurname.getText().trim().toUpperCase();
        try {
            String query = "SELECT * FROM `add_Customer` WHERE `A_name`= '" + name + "' OR  `A_surName`= '" + surname + "' ";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                String A_id = rs.getString("A_id");
                String A_name = rs.getString("A_name");
                String A_surName = rs.getString("A_Surname");
                String A_address = rs.getString("A_address");
                String A_phone = rs.getString("A_phone");

                crt.addRow(new String[]{A_id, A_name, A_surName, A_address, A_phone});
            }
            customerTables.setModel(crt);

        } catch (Exception e) {
            System.err.println("ARAMA GETİRME HATASI !" + e);
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed

        DefaultTableModel crt = new DefaultTableModel();
        crt.addColumn("Id");
        crt.addColumn("İsim");
        crt.addColumn("Soyisim");
        crt.addColumn("Adres");
        crt.addColumn("Telefon");

        try {
            String query = "SELECT * FROM `add_Customer`";
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {
                String A_id = rs.getString("A_id");
                String A_name = rs.getString("A_name");
                String A_surName = rs.getString("A_Surname");
                String A_address = rs.getString("A_address");
                String A_phone = rs.getString("A_phone");

                crt.addRow(new String[]{A_id, A_name, A_surName, A_address, A_phone});
            }
            customerTables.setModel(crt);

        } catch (Exception e) {
            System.err.println("DATA GETİRME HATASI !" + e);
        }


    }//GEN-LAST:event_refreshActionPerformed

    private void nextweatherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextweatherActionPerformed
        weather wr = new weather();
        wr.setVisible(true);


    }//GEN-LAST:event_nextweatherActionPerformed

    private void nextrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextrateActionPerformed
        exchangeRate wf = new exchangeRate();
        wf.setVisible(true);

    }//GEN-LAST:event_nextrateActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomer;
    private javax.swing.JButton addNote1;
    private javax.swing.JButton addOrders;
    private javax.swing.JTable customerTables;
    private javax.swing.JButton delete;
    private javax.swing.JLabel dtclock;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuGo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNameSurname;
    private javax.swing.JCheckBoxMenuItem nextAddCostomer;
    private javax.swing.JCheckBoxMenuItem nextAddOrders;
    private javax.swing.JCheckBoxMenuItem nextLogin;
    private javax.swing.JMenuItem nextrate;
    private javax.swing.JMenuItem nextweather;
    private javax.swing.JButton orderDelete;
    private javax.swing.JButton orderDetails1;
    private javax.swing.JTable orderList;
    private javax.swing.JButton orderOk;
    private javax.swing.JButton orderWay;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField searchName;
    private javax.swing.JTextField searchSurname;
    // End of variables declaration//GEN-END:variables
}

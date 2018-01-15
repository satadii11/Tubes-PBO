package io.github.golok56.ui;

import io.github.golok56.services.Navigation;
import io.github.golok56.services.Session;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author satadii11
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame
     */
    public MainMenuFrame() {
        initComponents();
        setVisible(true);
        
        btnDataObat.addActionListener(ev -> Navigation.showDataObat(this));
        
        labelWelcome.setText("Selamat datang " + Session.sAdmin.getUsername());
        
        linkLogout.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                Session.sAdmin = null;
                Navigation.showLogin(MainMenuFrame.this);
            }

            @Override
            public void mousePressed(MouseEvent me) {}

            @Override
            public void mouseReleased(MouseEvent me) {}

            @Override
            public void mouseEntered(MouseEvent me) {}

            @Override
            public void mouseExited(MouseEvent me) {}
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        labelWelcome = new javax.swing.JLabel();
        linkLogout = new javax.swing.JLabel();
        btnDataObat = new javax.swing.JButton();
        btnPemasok = new javax.swing.JButton();
        btnPenjualan = new javax.swing.JButton();
        btnPengadaan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apotik");
        setBackground(new java.awt.Color(28, 34, 54));
        setResizable(false);

        container.setBackground(new java.awt.Color(28, 34, 54));

        labelWelcome.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(254, 254, 254));
        labelWelcome.setText("Selamat Datang User");

        linkLogout.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        linkLogout.setForeground(new java.awt.Color(254, 254, 254));
        linkLogout.setText("Logout");
        linkLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnDataObat.setBackground(new java.awt.Color(8, 170, 199));
        btnDataObat.setForeground(new java.awt.Color(254, 254, 254));
        btnDataObat.setText("Data Obat");
        btnDataObat.setBorderPainted(false);
        btnDataObat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataObat.setOpaque(true);

        btnPemasok.setBackground(new java.awt.Color(8, 170, 199));
        btnPemasok.setForeground(new java.awt.Color(254, 254, 254));
        btnPemasok.setText("Pemasok");
        btnPemasok.setBorderPainted(false);
        btnPemasok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPemasok.setOpaque(true);

        btnPenjualan.setBackground(new java.awt.Color(8, 170, 199));
        btnPenjualan.setForeground(new java.awt.Color(254, 254, 254));
        btnPenjualan.setText("Penjualan");
        btnPenjualan.setBorderPainted(false);
        btnPenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPenjualan.setOpaque(true);

        btnPengadaan.setBackground(new java.awt.Color(8, 170, 199));
        btnPengadaan.setForeground(new java.awt.Color(254, 254, 254));
        btnPengadaan.setText("Pengadaan");
        btnPengadaan.setBorderPainted(false);
        btnPengadaan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPengadaan.setOpaque(true);

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(linkLogout)
                            .addComponent(labelWelcome))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addComponent(btnDataObat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(btnPenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(containerLayout.createSequentialGroup()
                                .addComponent(btnPemasok, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPengadaan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkLogout)
                .addGap(18, 18, 18)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataObat)
                    .addComponent(btnPenjualan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPengadaan)
                    .addComponent(btnPemasok))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataObat;
    private javax.swing.JButton btnPemasok;
    private javax.swing.JButton btnPengadaan;
    private javax.swing.JButton btnPenjualan;
    private javax.swing.JPanel container;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel linkLogout;
    // End of variables declaration//GEN-END:variables
}
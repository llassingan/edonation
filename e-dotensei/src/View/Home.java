/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 *
 * @author user
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        //this.setBackground(new Color(0,0,0,0));
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
        jLabel2 = new javax.swing.JLabel();
        btngalang = new javax.swing.JButton();
        btnprofil = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lihat1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lihat2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lihat = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lihatsemua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(240, 240, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("e-DOTENSEI");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        btngalang.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btngalang.setForeground(new java.awt.Color(255, 255, 255));
        btngalang.setText("Galang Dana");
        btngalang.setBorder(null);
        btngalang.setBorderPainted(false);
        btngalang.setContentAreaFilled(false);
        btngalang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngalang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngalangActionPerformed(evt);
            }
        });
        jPanel2.add(btngalang, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 80, -1));

        btnprofil.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnprofil.setForeground(new java.awt.Color(255, 255, 255));
        btnprofil.setText("Profil");
        btnprofil.setBorder(null);
        btnprofil.setBorderPainted(false);
        btnprofil.setContentAreaFilled(false);
        btnprofil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnprofil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprofilActionPerformed(evt);
            }
        });
        jPanel2.add(btnprofil, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, -1));

        btnkeluar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnkeluar.setForeground(new java.awt.Color(255, 255, 255));
        btnkeluar.setText("Keluar");
        btnkeluar.setBorder(null);
        btnkeluar.setBorderPainted(false);
        btnkeluar.setContentAreaFilled(false);
        btnkeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        jPanel2.add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 70, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 50, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 40, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 80, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Untitled-1.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 220));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/helping_hand_80px.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 70));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bantu Anak Pintar");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));

        jPanel9.setBackground(new java.awt.Color(51, 51, 255));

        lihat1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lihat1.setForeground(new java.awt.Color(255, 255, 255));
        lihat1.setText("Lihat Selengkapnya");
        lihat1.setBorder(null);
        lihat1.setContentAreaFilled(false);
        lihat1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihat1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihat1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 190, 200));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/helping_hand_80px.png"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 70));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Bojongsoang Bersuka");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 130, -1));

        jPanel10.setBackground(new java.awt.Color(51, 51, 255));

        lihat2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lihat2.setForeground(new java.awt.Color(255, 255, 255));
        lihat2.setText("Lihat Selengkapnya");
        lihat2.setBorder(null);
        lihat2.setContentAreaFilled(false);
        lihat2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihat2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihat2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 190, 200));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/helping_hand_80px.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 70));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bantu Keluarga Cemara");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jPanel8.setBackground(new java.awt.Color(51, 51, 255));

        lihat.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lihat.setForeground(new java.awt.Color(255, 255, 255));
        lihat.setText("Lihat Selengkapnya");
        lihat.setBorder(null);
        lihat.setContentAreaFilled(false);
        lihat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihat, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lihat, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, 30));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 190, 200));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Kampanye Untukmu");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 70, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 620, 40));

        lihatsemua.setForeground(new java.awt.Color(51, 51, 255));
        lihatsemua.setText("Lihat Semua >>>");
        lihatsemua.setBorder(null);
        lihatsemua.setBorderPainted(false);
        lihatsemua.setContentAreaFilled(false);
        lihatsemua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lihatsemua, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnprofilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprofilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprofilActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btngalangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngalangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btngalangActionPerformed

    public JButton getBtngalang() {
        return btngalang;
    }

    public JButton getBtnprofil() {
        return btnprofil;
    }

    public JButton getLihat() {
        return lihat;
    }

    public JButton getLihat1() {
        return lihat1;
    }

    public JButton getLihat2() {
        return lihat2;
    }

    public JButton getBtnkeluar() {
        return btnkeluar;
    }

    public JButton getLihatsemua() {
        return lihatsemua;
    }



public void addActionListener(ActionListener a){
        btngalang.addActionListener(a);
        btnprofil.addActionListener(a);
        btnkeluar.addActionListener(a);
        lihat.addActionListener(a);
        lihat1.addActionListener(a);
        lihat2.addActionListener(a);
        lihatsemua.addActionListener(a);     
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngalang;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnprofil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton lihat;
    private javax.swing.JButton lihat1;
    private javax.swing.JButton lihat2;
    private javax.swing.JButton lihatsemua;
    // End of variables declaration//GEN-END:variables

    private void setLocation(Dimension dim, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

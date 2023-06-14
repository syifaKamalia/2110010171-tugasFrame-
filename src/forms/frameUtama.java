/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

/**
 *
 * @author USER
 */
public class frameUtama extends javax.swing.JFrame {

    /**
     * Creates new form frameUtama
     */
    public frameUtama() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFormBangsal = new javax.swing.JButton();
        btnFormDiagnosa = new javax.swing.JButton();
        btnPasien = new javax.swing.JButton();
        btnFormTransaksiPasienMasuk = new javax.swing.JButton();
        btnFormTransaksiPasienPindah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFormLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnFormBangsal.setText("Form Data Bangsal");
        btnFormBangsal.setPreferredSize(new java.awt.Dimension(139, 23));
        btnFormBangsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormBangsalActionPerformed(evt);
            }
        });

        btnFormDiagnosa.setText("Form Data Diagnosa");
        btnFormDiagnosa.setPreferredSize(new java.awt.Dimension(139, 23));
        btnFormDiagnosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormDiagnosaActionPerformed(evt);
            }
        });

        btnPasien.setText("Form Data Pasien");
        btnPasien.setPreferredSize(new java.awt.Dimension(139, 23));
        btnPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienActionPerformed(evt);
            }
        });

        btnFormTransaksiPasienMasuk.setText("Form Data Transaksi Pasien Masuk");
        btnFormTransaksiPasienMasuk.setPreferredSize(new java.awt.Dimension(220, 23));
        btnFormTransaksiPasienMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormTransaksiPasienMasukActionPerformed(evt);
            }
        });

        btnFormTransaksiPasienPindah.setText("Form Data Transaksi Pasien Pindah");
        btnFormTransaksiPasienPindah.setPreferredSize(new java.awt.Dimension(220, 23));
        btnFormTransaksiPasienPindah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormTransaksiPasienPindahActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("SENSUS HARIAN RAWAT INAP");

        btnFormLogin.setText("Form Data Login");
        btnFormLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnPasien, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnFormDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnFormBangsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFormTransaksiPasienMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFormTransaksiPasienPindah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnFormLogin)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFormBangsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFormDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnFormTransaksiPasienMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnFormTransaksiPasienPindah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFormLogin)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFormDiagnosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormDiagnosaActionPerformed
        new frameDiagnosa().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormDiagnosaActionPerformed

    private void btnPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienActionPerformed
        new framePasien().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnPasienActionPerformed

    private void btnFormBangsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormBangsalActionPerformed
        new frameBangsal().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormBangsalActionPerformed

    private void btnFormTransaksiPasienMasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormTransaksiPasienMasukActionPerformed
        new frameTransaksiPasienMasuk().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormTransaksiPasienMasukActionPerformed

    private void btnFormTransaksiPasienPindahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormTransaksiPasienPindahActionPerformed
        new frameTransaksiPasienPindah().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormTransaksiPasienPindahActionPerformed

    private void btnFormLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormLoginActionPerformed
        new frameLogin().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnFormLoginActionPerformed

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
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFormBangsal;
    private javax.swing.JButton btnFormDiagnosa;
    private javax.swing.JButton btnFormLogin;
    private javax.swing.JButton btnFormTransaksiPasienMasuk;
    private javax.swing.JButton btnFormTransaksiPasienPindah;
    private javax.swing.JButton btnPasien;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
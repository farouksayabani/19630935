/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenampilgambar;

import java.awt.CardLayout;

/**
 *
 * @author ACER
 */
public class aplikasiPenampilGambar extends javax.swing.JFrame {

    /**
     * Creates new form tampilGambarButton
     */
    public aplikasiPenampilGambar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        glassfishBT = new javax.swing.JButton();
        javaeeBT = new javax.swing.JButton();
        postgreesqlBT = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        javaeeLB = new javax.swing.JLabel();
        postgreesqlLB = new javax.swing.JLabel();
        glassfishLB = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        glassfishBT.setText("GlassFish");
        glassfishBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassfishBTActionPerformed(evt);
            }
        });

        javaeeBT.setText("JavaEE");
        javaeeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaeeBTActionPerformed(evt);
            }
        });

        postgreesqlBT.setText("PostgreeSql");
        postgreesqlBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgreesqlBTActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        javaeeLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasipenampilgambar/javaee.jpeg"))); // NOI18N
        jPanel1.add(javaeeLB, "1");

        postgreesqlLB.setBackground(new java.awt.Color(204, 255, 204));
        postgreesqlLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasipenampilgambar/postgresql.jpeg"))); // NOI18N
        jPanel1.add(postgreesqlLB, "2");

        glassfishLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasipenampilgambar/glassfish.jpeg"))); // NOI18N
        jPanel1.add(glassfishLB, "0");

        jLabel1.setFont(new java.awt.Font("Vivaldi", 2, 36)); // NOI18N
        jLabel1.setText("Aplikasi Penampilan Gambar");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(javaeeBT, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(postgreesqlBT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(glassfishBT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(glassfishBT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(javaeeBT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(postgreesqlBT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void javaeeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaeeBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "1");
    }//GEN-LAST:event_javaeeBTActionPerformed

    private void glassfishBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassfishBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "0");
    }//GEN-LAST:event_glassfishBTActionPerformed

    private void postgreesqlBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgreesqlBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "2");
    }//GEN-LAST:event_postgreesqlBTActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(aplikasiPenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasiPenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasiPenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasiPenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasiPenampilGambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton glassfishBT;
    private javax.swing.JLabel glassfishLB;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton javaeeBT;
    private javax.swing.JLabel javaeeLB;
    private javax.swing.JButton postgreesqlBT;
    private javax.swing.JLabel postgreesqlLB;
    // End of variables declaration//GEN-END:variables
}

package diamond;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bsend = new javax.swing.JButton();
        btrack = new javax.swing.JButton();
        brecv = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(358, 379));
        getContentPane().setLayout(null);

        bsend.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        bsend.setText("Send");
        bsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsendActionPerformed(evt);
            }
        });
        getContentPane().add(bsend);
        bsend.setBounds(140, 30, 130, 29);

        btrack.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btrack.setText("Track");
        btrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrackActionPerformed(evt);
            }
        });
        getContentPane().add(btrack);
        btrack.setBounds(140, 70, 130, 29);

        brecv.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        brecv.setText("Recieve");
        brecv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brecvActionPerformed(evt);
            }
        });
        getContentPane().add(brecv);
        brecv.setBounds(140, 110, 130, 29);

        bexit.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit);
        bexit.setBounds(160, 260, 83, 29);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setText("Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(140, 150, 130, 29);

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton2.setText("Sell Diamond");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 190, 130, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsendActionPerformed
    
        Send s=new Send();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_bsendActionPerformed

    private void btrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrackActionPerformed

        Track t=new Track();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_btrackActionPerformed

    private void brecvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brecvActionPerformed

        Receive r=new Receive();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_brecvActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed

        dispose();
    }//GEN-LAST:event_bexitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Sell s=new Sell();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Report r=new Report();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton brecv;
    private javax.swing.JButton bsend;
    private javax.swing.JButton btrack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
package diamond;


import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Track extends javax.swing.JFrame {

    /**
     * Creates new form Track
     */
    public Track() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        tlot = new javax.swing.JTextField();
        tpacket = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 340));
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l1.setText("Lot No.");
        getContentPane().add(l1);
        l1.setBounds(73, 30, 47, 21);

        l2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l2.setText("Packet No.");
        getContentPane().add(l2);
        l2.setBounds(73, 75, 69, 21);

        tlot.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(tlot);
        tlot.setBounds(166, 27, 100, 27);

        tpacket.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tpacket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpacketActionPerformed(evt);
            }
        });
        getContentPane().add(tpacket);
        tpacket.setBounds(166, 72, 100, 27);

        b1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        b1.setText("View ");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(166, 117, 67, 29);

        b2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        b2.setText("Full Database");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(260, 260, 121, 29);

        b3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        b3.setText("Back");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(26, 260, 63, 29);

        l3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(l3);
        l3.setBounds(130, 180, 160, 20);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setText("To be received");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 260, 131, 29);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Diamond\\bg.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        String lotno=tlot.getText();
        String packno=tpacket.getText();
        String query="";
        if(lotno.equals("")&&packno.equals("")){
            l3.setText("Enter Lot No.");
        }
        else{
            if(!lotno.equals("")&&packno.equals("")){
                query="select * from main where lotno="+lotno;
            }
            else if(!lotno.equals("")&&packno!=""){
                    query="select * from main where lotno="+lotno+" and packno="+packno;
            }
            else if(lotno.equals("")&&!packno.equals("")){
                    query="select * from main where packno="+packno;
            }
            DBManager db=new DBManager();
            Vector<Vector<String>> s=db.getData(query);
            Display d=new Display(s);
            d.setVisible(true);
            dispose();
            db.close();
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void tpacketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpacketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpacketActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        DBManager db=new DBManager();
        String query="select * from main";
        Vector<Vector<String>> s=db.getData(query);
        Display d=new Display(s);
        d.setVisible(true);
        dispose();
        db.close();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        Menu m=new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DBManager db=new DBManager();
        String query="select * from main where dtrec='0'";
        Vector<Vector<String>> s=db.getData(query);
        Display d=new Display(s);
        d.setVisible(true);
        dispose();
        db.close();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Track.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Track.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Track.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Track.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Track().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField tlot;
    private javax.swing.JTextField tpacket;
    // End of variables declaration//GEN-END:variables
}

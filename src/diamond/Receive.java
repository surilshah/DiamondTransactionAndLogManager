package diamond;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Receive extends javax.swing.JFrame {

    /**
     * Creates new form Receive
     */
    public Receive() {
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

        l1 = new javax.swing.JLabel();
        rdate = new javax.swing.JTextField();
        rpacket = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        rlot = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        rwt = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        cb = new javax.swing.JComboBox();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 387));
        getContentPane().setLayout(null);

        l1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l1.setText("Date");
        getContentPane().add(l1);
        l1.setBounds(78, 18, 32, 21);

        rdate.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(rdate);
        rdate.setBounds(221, 15, 120, 27);

        rpacket.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rpacket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpacketActionPerformed(evt);
            }
        });
        getContentPane().add(rpacket);
        rpacket.setBounds(221, 60, 120, 27);

        l2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l2.setText("Packet No.");
        getContentPane().add(l2);
        l2.setBounds(78, 63, 69, 21);

        rlot.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(rlot);
        rlot.setBounds(221, 98, 120, 27);

        l3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l3.setText("Lot No.");
        getContentPane().add(l3);
        l3.setBounds(78, 101, 47, 21);

        rwt.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(rwt);
        rwt.setBounds(221, 136, 120, 27);

        l4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l4.setText("Final Wt.");
        getContentPane().add(l4);
        l4.setBounds(78, 139, 59, 21);

        b1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        b1.setText("Update");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(220, 220, 79, 29);

        l5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l5.setText("Received From");
        getContentPane().add(l5);
        l5.setBounds(78, 177, 97, 21);

        b2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        b2.setText("Back");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(10, 310, 63, 29);

        cb.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Grant Road", "Andheri", "Dahisar" }));
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        getContentPane().add(cb);
        cb.setBounds(221, 174, 120, 27);

        l6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(l6);
        l6.setBounds(130, 270, 260, 20);

        l7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l7.setText("dd/mm/yyyy");
        getContentPane().add(l7);
        l7.setBounds(360, 20, 80, 21);

        l8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        l8.setText("in Cents");
        getContentPane().add(l8);
        l8.setBounds(360, 140, 60, 21);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Diamond\\bg.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        String date=rdate.getText();
        String packno=rpacket.getText();
        String lotno=rlot.getText();
        String finalwt=rwt.getText();
        String recfrom=cb.getSelectedItem().toString();
        DBManager d=new DBManager();
        if(date.equals("")||packno.equals("")||lotno.equals("")||finalwt.equals("")||recfrom.equals("")){
            l6.setText("Enter all fields");
        }
        else{
            if(d.isPresent(packno, lotno)){
                String query="update main set dtrec='"+date+"',finalwt="+finalwt+",recvdfrom='"+recfrom+"' where lotno="+lotno+" and packno="+packno;
                d.addData(query);
                l6.setText("Data Updated");
                rdate.setText("");
                rpacket.setText("");
                rlot.setText("");
                rwt.setText("");
                cb.setSelectedIndex(0);
            }
            else{
                l6.setText("Enter valid Lot No. or Packet No.");
            }
        }
        d.close();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        Menu m=new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_b2ActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbActionPerformed

    private void rpacketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpacketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpacketActionPerformed

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
            java.util.logging.Logger.getLogger(Receive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JComboBox cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JTextField rdate;
    private javax.swing.JTextField rlot;
    private javax.swing.JTextField rpacket;
    private javax.swing.JTextField rwt;
    // End of variables declaration//GEN-END:variables
}
